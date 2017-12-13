package com.jd.containerfs.dto;

import java.io.Serializable;

/**
 * Created by lixiaoping3 on 17-11-17.
 */
public class NodeInfoParamDto implements Serializable{

    private static final long serialVersionUID = -7213513858821203151L;
    private String ip;
    private int port;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
