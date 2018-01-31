package org.simple.websocket.h5ws.tools;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebListener
public class MyServletListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        HttpSession session = request.getSession();
        System.out.println("attributes:" + session.getAttributeNames());
        System.out.println("ClientIP:" + sre.getServletRequest().getRemoteAddr());
        session.setAttribute("ClientIP", sre.getServletRequest().getRemoteAddr());
    }
}