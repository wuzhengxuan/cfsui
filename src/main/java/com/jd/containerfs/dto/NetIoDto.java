package com.jd.containerfs.dto;

import java.io.Serializable;

/**
 * Created by lixiaoping3 on 17-11-17.
 */
public class NetIoDto implements Serializable{

    private static final long serialVersionUID = -5809563961546785454L;

    private String name;
    private Long bytesSent;
    private Long bytesRecv;
    private Long packetsSent;
    private Long packetRecv;
    private Long errIn;
    private Long errOut;
    private Long dropIn;
    private Long dropOut;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBytesSent() {
        return bytesSent;
    }

    public void setBytesSent(Long bytesSent) {
        this.bytesSent = bytesSent;
    }

    public Long getBytesRecv() {
        return bytesRecv;
    }

    public void setBytesRecv(Long bytesRecv) {
        this.bytesRecv = bytesRecv;
    }

    public Long getPacketsSent() {
        return packetsSent;
    }

    public void setPacketsSent(Long packetsSent) {
        this.packetsSent = packetsSent;
    }

    public Long getPacketRecv() {
        return packetRecv;
    }

    public void setPacketRecv(Long packetRecv) {
        this.packetRecv = packetRecv;
    }

    public Long getErrIn() {
        return errIn;
    }

    public void setErrIn(Long errIn) {
        this.errIn = errIn;
    }

    public Long getErrOut() {
        return errOut;
    }

    public void setErrOut(Long errOut) {
        this.errOut = errOut;
    }

    public Long getDropIn() {
        return dropIn;
    }

    public void setDropIn(Long dropIn) {
        this.dropIn = dropIn;
    }

    public Long getDropOut() {
        return dropOut;
    }

    public void setDropOut(Long dropOut) {
        this.dropOut = dropOut;
    }
}
