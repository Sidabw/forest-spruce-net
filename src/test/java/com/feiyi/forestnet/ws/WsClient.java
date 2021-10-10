package com.feiyi.forestnet.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.*;

/**
 * @author shaogz
 */
@ClientEndpoint
public class WsClient {

    private static final Logger logger = LoggerFactory.getLogger(WsServer.class);

    private Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
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
