package state;

public class HappyState implements State {
    @Override
    public String conversation() {
        return "I am happy";
    }
}
