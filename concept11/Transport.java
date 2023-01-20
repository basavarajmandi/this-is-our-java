class Transport{
	
	static int ticket(String busRoute)
	{
		System.out.println("busRoute:"+busRoute);
		if(busRoute=="bagalkot")
		{
		return 570;
		}
		if(busRoute=="bashyam circle")
		{
			return 10;
		}
		if(busRoute=="huballi")
		{
			return 470;
		}
		if(busRoute=="badami")
		{
			return 480;
		}
		if(busRoute=="hyderabad")
		{
			return 980;
		}
		if(busRoute=="belagavi")
		{
			return 600;
		}
		if(busRoute=="kalburgi")
		{
			return 500;
		}
		if(busRoute=="bidar")
		{
			return 360;
		}
		if(busRoute=="vijapur")
		{
			return 660;
		}
		if(busRoute=="bellary")
		{
			return 700;
		}
		if(busRoute=="raichur")
		{
			return 320;
		}
		if(busRoute=="gadag")
		{
			return 390;
		}
		if(busRoute=="dharwad")
		{
			return 420;
		}
		if(busRoute=="haveri")
		{
			return 415;
		}
		if(busRoute=="koppal")
		{
			return 610;
		}
		if(busRoute=="mysore")
		{
			return 320;
		}
		if(busRoute=="hassan")
		{
			return 461;
		}
		if(busRoute=="goa")
		{
			return 501;
		}
		if(busRoute=="tumkur")
		{
			return 200;
		}
		if(busRoute=="udapi")
		{
			return 540;
		}
		if(busRoute=="shivamogga")
		{
			return 560;
		}
		if(busRoute=="vijapur")
		{
			return 567;
		}
	    if(busRoute=="chikkaballapur")
		{
			return 681;
		}
		if(busRoute=="chikkamagaluru")
		{
			return 632;
		}
		if(busRoute=="south kannda")
		{
			return 608;
		}
		return 0;
	}
}