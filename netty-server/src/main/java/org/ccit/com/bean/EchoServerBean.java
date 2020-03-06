package org.ccit.com.bean;

public class EchoServerBean {

    private int port;

    public EchoServerBean(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
