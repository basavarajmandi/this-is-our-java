class Theater
{
	static String name;
	static int ticketPrice;
	static String ownerName;
	static String location;
	static String type;
	
	static void intivariable(String arg1,int arg2,String arg3,String arg4,String arg5)
	{
		name=arg1;
		ticketPrice=arg2;
		ownerName=arg3;
		location=arg4;
		type=arg5;
	}
	static void Display()
	{
		System.out.println("start to display");
		
		System.out.println(name);
		System.out.println(ticketPrice);
		System.out.println(ownerName);
		System.out.println(location);
		System.out.println(type);
		
		System.out.println("end to display");
	}
}