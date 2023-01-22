class Singer
{
	static String singerName;
	static  float salary;
	static String type;
	static boolean alive;
	static String voice;
	
	static void intivariable(String arg1,float arg2,String arg3,boolean arg4,String arg5)
	{
		singerName=arg1;
		salary=arg2;
		type=arg3;
		alive=arg4;
		voice=arg5;
	}
	
	static void display()
	{
		System.out.println("start to display");
		
		System.out.println("Singer:"+singerName);
		System.out.println("salary:"+salary);
		System.out.println("type:"+type);
		System.out.println("alive:"+alive);
		System.out.println("voice:"+voice);
		System.out.println("end to display");
	}
}