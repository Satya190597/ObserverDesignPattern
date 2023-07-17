package Subscriber;

public class YoutubeMembers implements Subscriber {
    @Override
    public boolean update() {
        System.out.println("Notify All Youtube Members");
        return true;
    }
}
