class Cricket{
	public static void main(String[] args)
	{
		String[] players={"basu","rock","veeresh","santu","sachin","ponda","mandi","trupti","veeru","harii"};
		int[] bollno={12,11,20,12,45,13,14,15,16,17,18};
		char[] batcode={'b','c','d','e','f','g','h','i','j'};
		float[] over={10.5f,11.5f,6.5f,3.5f,5.5f,3.5f,6.5f};
		double[] padnumber={2.5d,3.2,8.2,7.1,4.5,6.5,1.1,9.7};
		
		System.out.println("players name");
		for (int i=0;i<players.length;i++)
		{
			System.out.println(players[i]);	
		}
		for (int i=0;i<bollno.length;i++)
		{
			System.out.println(bollno[i]);
		}
	 for (int i=0;i<batcode.length;i++)
	 {
		 System.out.println(batcode[i]);
		 
	 }
	 for (int i=0;i<padnumber.length;i++)
	 {
		 System.out.println(padnumber[i]);
		
	 }
	 for (int i=0;i<over.length;i++)
	 {
		 System.out.println(over[i]);
	 }
	 	
	}
}