class ShopRunner
{
	public static void main(String[] args)
	{
		System.out.println("executing main Start");
		
        String item="shirt";
        double price=1500d;
        String brand="nike";
  
        Shop.buy(item,price,brand);
    
        String itemname1="cheair";
        String brand1="mrf";
   
   
        Shop.exchange(itemname1,brand1);
        System.out.println("executing main End");	
	}
}