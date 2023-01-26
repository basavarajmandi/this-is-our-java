package polymorphism;

public class Box {
	
	public static void store(int money)
	{
		
		System.out.println("int money:"+money);
	}
	public static void store(String bangleName)
	{
		System.out.println(" String bangleName:"+bangleName);
	}
	public static void store(String powderbrand,String creambrand)
	{
		System.out.println("String powderbrand:"+powderbrand+" "+ "String creambrand:"+creambrand);
	}
	public static void store(int chargerPrice,String mobile)
	{
		System.out.println("int chargerPrice:"+chargerPrice+"  "+ "String mobile:"+mobile);
	}
	public static void store(int money,float hppendrive,String card)
	{
		System.out.println("int money:"+money +" "+ "float hppendrive:"+hppendrive +" "+ "String card:"+card);
	}
}
