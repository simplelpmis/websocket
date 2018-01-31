package org.simple.websocket.server;

import org.java_websocket.WebSocketImpl;

public class Main {
    public static void main(String[] args) {
        WebSocketImpl.DEBUG = false;
        int port = 8887; // 端口
        WsServer s = new WsServer(port);
        s.start();
        System.out.println("web socket start!");
    }
}
