package singleton;

public class SocketTest {
    public static void main(String[] args) {
        Aclazz aclazz = new Aclazz();
        Bclazz bclazz = new Bclazz();
        
        SocketClient aclient = aclazz.getSocketClient();
        SocketClient bclient = bclazz.getSocketClient();
        
        if (aclient.equals(bclient)){
            System.out.println("두 객체는 동일하다");
        }else{
            System.out.println("두 객체는 동일하지 않다");
        }
    }
}
