package college;

public class medicin {
	
	static float amount(String name)
	{
		System.out.println("medicin:"+name);
		if(name=="abacavir")
		{
			float amount=200f;
			return amount;
		}
		if(name=="acebrofyline")
		{
			float amount=250f;
			return amount;
		}
		if(name=="abciximab")
		{
			float amount=350.5f;
			return amount;
		}
		if(name=="acacia")
		{
			float amount=460.2f;
			return amount;
		}
		if(name=="acamprosate")
		{
			float amount=210.2f;
			return amount;
		}
		if(name=="baclofen")
		{
			float amount=140.1f;
			return amount;
		}
		if(name=="cabenuv")
		{
			float amount=110.2f;
			return amount;
		}
		if(name=="dolo65")
		{
			float amount=502.2f;
			return amount;
		}
		if(name=="doxapram")
		{
			float amount=100f;
			return amount;
		}
		if(name=="cipla")
		{
			float amount=50f;
			return amount;
		}
		if(name=="antibiotic")
		{
			float amount=60f;
			return amount;
		}
		if(name=="ebility")
		{
			float amount=12.5f;
		   return amount;
		}
	   if(name=="paracetamal")
		{
			float amount=60f;
			return amount;
		}
	   if(name=="bengelgel")
	   {
		   float amount=102;
		   return amount;
	   }
	   if(name=="andriol")
	   {
		   float amount =260.1f;
		   return amount;
	   }
		  return -500;
		 
	}

	public static void main(String[] args)
	{
		float ref=medicin.amount("abacavir");
		System.out.println("amount:"+ref);
		float ref12=medicin.amount("ebility");
		System.out.println("amounr:"+ref12); 

	}

}
