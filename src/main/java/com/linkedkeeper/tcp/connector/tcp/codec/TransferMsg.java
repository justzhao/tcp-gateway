package com.linkedkeeper.tcp.connector.tcp.codec;

import java.io.Serializable;
import java.util.Arrays;

public class TransferMsg implements Serializable {

    private static final long serialVersionUID = 392541130087842270L;

    /**
     * 接口版本
     */
    private String version;

    /**
     * 设备uuid
     */
    private String deviceId;

    /**
     * 请求接口命令
     */
    private int cmd;

    /**
     * 请求序列号
     */
    private long seq;

    /**
     * 请求1，应答2，通知3，响应4
     */
    private int format;
    /**
     * 1 rsa加密 2aes加密
     */
    private int flag;
    /**
     * mobile-ios mobile-android pc-windows pc-mac
     */
    private String platform;
    /**
     * 客户端版本号
     */
    private String platformVersion;

    /**
     * 客户凭证
     */
    private String token;
    /**
     * appkey
     */
    private String appKey;
    /**
     * 时间戳
     */
    private String timeStamp;
    /**
     * 签名
     */
    private String sign;
    /**
     * 请求数据
     */
    private byte[] body;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "TransferMsg{" +
            "version='" + version + '\'' +
            ", deviceId='" + deviceId + '\'' +
            ", cmd=" + cmd +
            ", seq=" + seq +
            ", format=" + format +
            ", flag=" + flag +
            ", platform='" + platform + '\'' +
            ", platformVersion='" + platformVersion + '\'' +
            ", token='" + token + '\'' +
            ", appKey='" + appKey + '\'' +
            ", timeStamp='" + timeStamp + '\'' +
            ", sign='" + sign + '\'' +
            ", body=" + Arrays.toString(body) +
            '}';
    }
}
