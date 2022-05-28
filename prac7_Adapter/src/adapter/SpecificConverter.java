package adapter;

public class SpecificConverter {
    public String specificReverse(String specificLine){
        return new StringBuilder(specificLine).reverse().toString();
    }
}