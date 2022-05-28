package state;

public class Human {
    State mood;

    public Human(State mood) {
        this.mood = mood;
    }

    void changeMood(State mood) {
        this.mood = mood;
    }

    void haveConversation() {
        System.out.println(mood.conversation());
    }
}
