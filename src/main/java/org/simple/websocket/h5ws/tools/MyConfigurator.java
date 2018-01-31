package org.simple.websocket.h5ws.tools;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

public class MyConfigurator extends ServerEndpointConfig.Configurator {
    @Override
    public void modifyHandshake(ServerEndpointConfig config, HandshakeRequest request, HandshakeResponse response) {
        HttpSession httpSession = (HttpSession) request.getHttpSession();
        System.out.println("httpSession:" + httpSession + request.getHeaders() + "\n" + response.getHeaders() + "\n" + request.getRequestURI() + "\n" + request.getParameterMap());
        System.out.println("httpsession: " + httpSession);
        if (httpSession != null) {
            config.getUserProperties().put("ClientIP", httpSession.getAttribute("ClientIP"));
        }
    }
}
