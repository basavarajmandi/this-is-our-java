class Fish{
	static void sell(double price){
		
		System.out.println("start sell");
	
		if(price<0)
		{
			return;
		}
		if(price>500 && price<1000)
		{
			System.out.println("i will not buy");
		}
		if(price==80)
		{
		    System.out.println("i will buy");
		}
		if(price>80 && price<500)
		{
			System.out.println("i will think");
		}
		if(price>1000)
		{
			System.out.println("i will not eat fish only");
		}
		System.out.println("end sell");
	} 
	
	
	static void cook(String fish,String[] ingredients)
	{
		System.out.println("start cook");
		System.out.println("fish:"+fish);
		if(ingredients==null)
		{
			return;
		}
		
		if(fish==null)
		{
			return;
		}
		for(int i=0;i<ingredients.length;i++)
		{
			System.out.println( ingredients[i]);
			
			System.out.println("end cook");
		
		}
		
		
	}  
	
	static void die(int year,int month,int date)
	{
		System.out.println("start die");
		if(year<0 || month<0 ||date<=0)
		{
			return;
		}
		if(year>2023 || year<2000)
		{
			return;
		}
		if(month>12)
		{
			return;
		}
		if(date>31)
		{
			return;
		}
		System.out.println("end die");
	}
	
}