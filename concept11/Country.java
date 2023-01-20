class Country{
	static String politic(String countryname,String state)
	{
		System.out.println("countryname:"+countryname);
		System.out.println("state:"+state);
		if(countryname=="pakistan" && state=="balochistan")
		{
			return "abdul quddus bizenjo";
		}
		if(countryname=="pakistan" && state=="khyber pakhtunkhwa")
		{
			return "mahmoodkhan";
		}
		if(countryname=="pakistan" && state=="punjab")
		{
			return "chaudhry pervaiz";
		}
		if(countryname=="pakistan" && state=="sindh")
		{
			return "murad ali shah";
		}
		if(countryname=="pakistan" && state=="gilgit baltistan")
		{
			return "khalid khurshid";
		}
		return "null";
	}
}