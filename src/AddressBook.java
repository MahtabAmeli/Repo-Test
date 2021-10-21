import java.util.ArrayList;

public class AddressBook {


    private BuddyInfo buddy1 = new BuddyInfo("b1", "a1", "n1");
    private BuddyInfo buddy2 = new BuddyInfo("b2", "a2", "n2");
    private BuddyInfo buddy3 = new BuddyInfo("b3", "a3", "n3");
    private BuddyInfo buddy4 = new BuddyInfo("b4", "a4", "n4");

    public ArrayList<BuddyInfo> buddyList = new ArrayList();

    public AddressBook() {
        this.buddyList.add(buddy1);
        this.buddyList.add(buddy2);
        this.buddyList.add(buddy3);
        this.buddyList.add(buddy4);
    }


    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyList.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book_ changed1");
        BuddyInfo buddy5 = new BuddyInfo("b5","a5","n5");
        AddressBook ab1 = new AddressBook();
        ab1.addBuddy(buddy5);
        ab1.removeBuddy(buddy5);
    }
}
