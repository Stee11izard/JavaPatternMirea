package state;

public class Test {
    public static void main(String[] args) {
        Human human = new Human(new HappyState());
        human.haveConversation();
        human.changeMood(new SadState());
        human.haveConversation();
        human.changeMood(new AngryState());
        human.haveConversation();
    }
}
