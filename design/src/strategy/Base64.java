package strategy;


public class Base64 implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return java.util.Base64.getEncoder().encodeToString(text.getBytes());
    }

}
