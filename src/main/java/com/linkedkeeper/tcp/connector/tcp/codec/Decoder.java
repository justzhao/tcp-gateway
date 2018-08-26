package com.linkedkeeper.tcp.connector.tcp.codec;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;


public class Decoder extends ByteToMessageDecoder {
    private Class<?> genericClass;

    public Decoder(Class<?> genericClass) {
        this.genericClass = genericClass;
    }
    @Override
    public final void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        if (in.readableBytes() < 4) {
            return;
        }
        in.markReaderIndex();
        int dataLength = in.readInt();
        if (in.readableBytes() < dataLength) {
            in.resetReaderIndex();
            return;
        }
        byte[] data = new byte[dataLength];
        in.readBytes(data);
        Object obj = ProtostuffUtil.deserialize(data, genericClass);
        out.add(obj);
    }
}