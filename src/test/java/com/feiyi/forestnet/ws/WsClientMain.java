package com.feiyi.forestnet.ws;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import java.io.IOException;
import java.net.URI;

/**
 * @author shaogz
 */
public class WsClientMain {

    private static final String uri = "ws://localhost:8080/feiyi/aaaaddddd/ws/server?a=acdcd";

    public static void main(String[] args) throws DeploymentException, IOException {
        WebSocketContainer webSocketContainer = ContainerProvider.getWebSocketContainer();
        URI uriObj = URI.create(WsClientMain.uri);
        Session session = webSocketContainer.connectToServer(WsClient.class, uriObj);
        session.getBasicRemote().sendText("haha");
        session.close();
    }

}
