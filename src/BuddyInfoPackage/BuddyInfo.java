package BuddyInfoPackage;

public class BuddyInfo {
	private String name;
	private String address;
	private String phonenumber;
	public BuddyInfo(String budName, String homeAddress, String phoneNumber)
	{
		super();
		this.name = budName;
		this.address = homeAddress;
		this.phonenumber = phoneNumber;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return this.address;
	}
	public String getNumber()
	{
		return this.phonenumber;
	}
	public void setNumber(String number)
	{
		this.phonenumber = number;
	}
}
