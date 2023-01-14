class CarRunner{
	public static void main(String[] args)
	{
		System.out.println(Car.name);
		System.out.println(Car.price);
		System.out.println(Car.tyre);
		
		Car.tyre="tube";
		System.out.println(Car.tyre);
		
	System.out.println("there are so many colour like");	
	    for(int i=0;i<Car.colour.length;i++)
		{
			System.out.println(Car.colour[i]);
		}
	System.out.println("there are three size");
		for(int i=0;i<Car.size.length;i++)
		{
			System.out.println(Car.size[i]);
		}
		
		
	}
}