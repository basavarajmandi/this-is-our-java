class FishRunner{
	public static void main(String[] args)
	{
		System.out.println("start FishRunner");
	
		double price=600d;
		Fish.sell(price);
		
		String fish="star fish";
		String ingredients[]={"oil","water"};
		
		Fish.cook(fish,ingredients);
		
		int year=2021;
		int month=11;
		int date=30;
		Fish.die(year,month,date);
		
		
		System.out.println("end FishRunner");
	}
}
