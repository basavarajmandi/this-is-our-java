class SweetRunner{
	public static void main(String[] args){
		
	System.out.println(Sweet.name);

	System.out.println(Sweet.price);
 System.out.println("ther are verious type of colour");
 
 for(int i=0;i<Sweet.colour.length;i++)
{
	System.out.println(Sweet.colour[i]);
}	
System.out.println("thar are verious type of ingredients");

for(int i=0;i<Sweet.ingredients.length;i++)
{
	System.out.println(Sweet.ingredients[i]);
}
    System.out.println(Sweet.shape);
	
Sweet.shape="square";
System.out.println(Sweet.shape);
	}
}
