package adapter;

public class Adapter implements Converter{
    private SpecificConverter converter;

    public Adapter() {
        converter = new SpecificConverter();
    }

    @Override
    public String reverse(String line) {
        return converter.specificReverse(line);
    }
}
