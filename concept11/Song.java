class Song
{
	static String songName;
	static String singer;
	static String language;
	static float duration;
	
	static void intivariable(String arg1,String arg2,String arg3,float arg4)
	{
		songName=arg1;
		singer=arg2;
		language=arg3;
		duration=arg4;
	}
	 static void display()
	 {
		 System.out.println("START TO DISPLAY");
		 System.out.println(songName);
		 System.out.println(singer);
		 System.out.println(language);
		 System.out.println(duration); 
		 System.out.println("END TO DISPLAY");
	 }
}