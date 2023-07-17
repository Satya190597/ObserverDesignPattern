package Subscriber;

public class WebsiteMembers implements Subscriber {
    @Override
    public boolean update() {
        System.out.println("Notify All Website Members");
        return true;
    }
}
