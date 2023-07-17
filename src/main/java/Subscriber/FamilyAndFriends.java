package Subscriber;

public class FamilyAndFriends implements Subscriber {
    @Override
    public boolean update() {
        System.out.println("Notify All Friends And Family Members");
        return true;
    }
}
