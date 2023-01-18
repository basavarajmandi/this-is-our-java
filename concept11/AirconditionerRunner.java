class AirconditionerRunner{
	
	public static void main(String[] args)
	{
	int speed=5;
	Airconditioner.increaseSpeed(speed);
	
	int speed1=10;
	Airconditioner.decreaseSpeed(speed1);
	
	String program="winter";
	Airconditioner.changeprogram(program);
	
	double temp=55.5d;
	Airconditioner.increasetemp(temp);
	
	double temp1=-16.2d;
	Airconditioner.decreasetemp(temp1);
	}
	
}
