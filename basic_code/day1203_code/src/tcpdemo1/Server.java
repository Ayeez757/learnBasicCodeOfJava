package tcpdemo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议，接收数据

        //1.创建对象ServerSocker
        ServerSocket ss = new ServerSocket(8888);

        //2.监听客户端的链接
        Socket socket = ss.accept();

        //3.从链接通道中获取输入流读取数据
        InputStream is = socket.getInputStream();
        int b;
        while((b = is.read()) != -1) {
            System.out.print((char)b);

        }
    }
}
