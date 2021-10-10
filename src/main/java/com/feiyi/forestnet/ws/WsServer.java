package com.feiyi.forestnet.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.Base64;

/**
 * @author shaogz
 */

@ServerEndpoint(value = "/feiyi/{pathParams}/ws/server")
@Component
public class WsServer {

    private static final Logger logger = LoggerFactory.getLogger(WsServer.class);

    private Session session;


    @OnOpen
    public void onOpen(Session session, @PathParam("pathParams") String params) {
        this.session = session;
        System.out.println(params);
        System.out.println(session.getQueryString());
        logger.info("ws onOpen, this instance : {}", this);
    }

    @OnClose
    public void onClose() {
        logger.info("ws onClose, this instance : {}", this);
    }

    @OnError
    public void onError(Session session, Throwable error) {
        logger.info("ws onError, this instance : {}", this);
    }

    @OnMessage
    public void onMessage(String message, Session session) throws InterruptedException {
        logger.info("ws onMessage, this instance:{}", this);
    }


}
