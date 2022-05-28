package state;

public class SadState implements State{
    @Override
    public String conversation() {
        return "I am sad";
    }
}
