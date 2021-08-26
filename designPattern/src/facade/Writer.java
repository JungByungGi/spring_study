package facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s로 연결합니다.", fileName);
        System.out.println(msg);
    }

    public void fileWrite(){
        String msg = String.format("Writer %s의 내용을 읽어옵니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s로 연결 종료합니다.", fileName);
        System.out.println(msg);
    }
}
