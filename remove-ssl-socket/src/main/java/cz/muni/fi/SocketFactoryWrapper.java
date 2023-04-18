package cz.muni.fi;

import javax.net.SocketFactory;
import java.io.IOException;
import java.net.Socket;

public class SocketFactoryWrapper {

    public static Socket createSocket(String host, int port) throws IOException {
        return SocketFactory.getDefault().createSocket(host, port);
    }
}