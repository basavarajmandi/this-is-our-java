package college;

public class Food {
	
	static String[] ingredients(String name) 
	{
		System.out.println("name:"+name);
	if(name=="baji")
	{
		 String[]ingredients={"water","ginger","salt","greenchili","oil"};
		 for(int i=0;i<ingredients.length;i++)
			{
			 System.out.println(ingredients[i]);
			}
		 return ingredients;
	}
	
	  return null;
	}
	


	public static void main(String[] args) 
	{
		Food.ingredients("vada");
		Food.ingredients("baji");
	}
  
}