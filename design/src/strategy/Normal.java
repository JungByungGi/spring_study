package strategy;

public class Normal implements EncodingStrategy{
    @Override
    public String encode(String text){
        return text;
    }
}
