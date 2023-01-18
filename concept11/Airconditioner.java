class Airconditioner{
	
	static void  increaseSpeed(int speed)
{
	System.out.println("execucating  start to check speed");
	System.out.println("speed:"+speed);
	if (speed==5)
	{
		System.out.println("cannot increase more");
	}
}
   static void decreaseSpeed(int speed1)
{
	System.out.println("speed1:"+speed1);
    if(speed1<=0 || speed1>5)
	{
		System.out.println("invalid speed");
	}
}
   
    static void changeprogram(String program)
{
	System.out.println("program:"+program);
	if (program==null | program!="summer" | program!="winter"  | program!="rain")
	{
		System.out.println("invalid");
	}

}
    static void increasetemp(double temp)
{
	System.out.println("temp:"+temp);
	if (temp>32)
	{
		System.out.println("invalid temp");
	}
}
    static void decreasetemp(double temp1)
{
	System.out.println("temp1:"+temp1);
	if (temp1<0)
	{
		System.out.println("invalid temp1");

	}
	    System.out.println("execucating end");
}	
}