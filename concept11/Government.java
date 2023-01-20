class Government{
	static String politics(String country,String state1,String state2,String state3,String state4,String state5)
	{
		System.out.println("country:"+country);
	    System.out.println("state1:"+state1);
		System.out.println("state2:"+state2);
		System.out.println("state3:"+state3);
		System.out.println("state4:"+state4);
		System.out.println("state5:"+state5);
		if(country=="india" && state1=="karnatak" && state2=="bihar" && state3=="goa" && state4=="delhi" && state5=="odisha")
		{
			return "state1 =basavaraj bommai,state2 =nitish k,state3 =pramod,state4=arvind,state5=naveen";
		}
		return"null";
	}
}