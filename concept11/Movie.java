class Movie{
	
	static String name;
	static float budget;
	static String director;
	static String hero;
    static String heroin;
	static int numofsongs;
	
	
	static void initvarible(String arg1,float arg2,String arg3,String arg4,String arg5,int arg6)
	{
		name=arg1;
		budget=arg2;
		director=arg3;
		hero=arg4;
		heroin=arg5;
		numofsongs=arg6;
	}
	static void display()
	{
	System.out.println("start to display");
	
		System.out.println(name);
		System.out.println(budget);
		System.out.println(director);
		System.out.println(hero);
		System.out.println(heroin);
		System.out.println(numofsongs);
		System.out.println("end to display");
		
	}
 
}