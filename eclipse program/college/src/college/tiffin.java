package college;

public class tiffin {

	
	static String[] item(String name)
	{
		System.out.println("name:"+name);
		
		if(name=="vada")
		{
			String[]item={"oil","water"};
		
			return item;
	    }	
		return null;

	}
	
	public static void main(String[] args) {
		 String[]ref=tiffin.item("vada");
		 
   for (int i=0;i<ref.length;i++)
   {
	   System.out.println(ref[i]);
   }
	}

}
