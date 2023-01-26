package college;

public class Food {
	
	static String[] ingredients(String name) 
	{
		System.out.println("name:"+name);
	   if(name=="baji")
	{
		 String[]ingredients={"water","ginger","salt","greenchili","oil"};
		
		 
		 return ingredients;
	}
	   
	  return null;
	}
	


	public static void main(String[] args) 
	{
		String[]ref=Food.ingredients("baji");
		
		 for(int i=0;i<ref.length;i++)
			{
			 System.out.println(ref[i]);
			}
	}
  
}