class Shop{
	
	static void buy(String item,double price,String brand)
	{
		System.out.println("execution buy item start");	
		 
		if(price>1000)
		{
			System.out.println("item is costly");
		}
		 else if(price<1000 & price>500)
		{
			System.out.println("item is expensive");
		}
		else if(price<500)
		{
			System.out.println("item is ok");
		}
		
		     System.out.println("item:"+item);
			 System.out.println("price:"+price);
			 System.out.println("brand:"+brand);
			 
			 
		System.out.println("execition bye item end");
	}
	static void exchange(String itemname1,String brand1)
	{
		System.out.println("execution  in start to exchange ");
		
		
		System.out.println("item:"+itemname1);
		System.out.println("brand:"+brand1);
		
		System.out.println("execution in end to exchange");
		
		
	}

}