package Subscriber;

public class PatreonMembers implements Subscriber {
    @Override
    public boolean update() {
        System.out.println("Notify All Patreon Members");
        return true;
    }
}
