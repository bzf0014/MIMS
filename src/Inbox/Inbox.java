package Inbox;
import java.util.ArrayList;

public class Inbox {

    ArrayList inbox = new ArrayList<String>();

    public void addToInbox(String message) {
        inbox.add(message);
    }

    public boolean clearInbox() {
        inbox.clear();
        return true;
    }
}
