package shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int distance;
    private List<String> messages = new ArrayList();

    public void setLocation(int distance) {
        this.distance = distance;
    }

    public String shout(String message) {
        return message;
    }

    public List<String> getMessageHeard() {
        return messages;
    }

    public void hearMessage(String message) {
        this.messages.add((message));
    }
}
