package strategy;

public class Test {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        EncodingStrategy base64 = new Base64();

        EncodingStrategy normal = new Normal();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }
}
