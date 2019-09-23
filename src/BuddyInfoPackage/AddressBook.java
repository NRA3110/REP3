package BuddyInfoPackage;



import java.util.ArrayList;



public class AddressBook

{
	public ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();

	

	void addBuddy(BuddyInfo buddy)

	{

		buddies.add(buddy);

	}

	void removeBuddy(BuddyInfo buddy)

	{

		buddies.remove(buddy);

	}

	

	

	public static void main(String[] args)

	{

		BuddyInfo Jeff = new BuddyInfo("Jeff", "123 Street", "111111111");

		AddressBook buddyBook = new AddressBook();

		buddyBook.addBuddy(Jeff);

		System.out.println("Words and things");

	}

}