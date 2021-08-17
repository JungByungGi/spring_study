package singleton;

public class SocketClient {
    private static SocketClient socketClient = null;

    private SocketClient() {

    } // 생성자를 private으로 막아준다. public으로 하면 싱글톤 방식이 아니게 됨/

    public static SocketClient getInstance(){
        if(socketClient == null){
           socketClient = new SocketClient();
        }
        return socketClient;
    }


    public void connect(){
        System.out.println("connect");
    }
}
