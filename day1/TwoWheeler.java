package week1.day1;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors=1;
	long chassisNumber=9876543219L;
	boolean isPunctured=false;
	String bikeName="SuperSplendor";
	double runningKM=723456;
	

	public static void main(String[] args)
	{
		TwoWheeler tw=new TwoWheeler();
		
		System.out.println("Details of my Bike are "+"\n"+
		"BikeName="+tw.bikeName +"\n"+
		"chassisNumber ="+tw.chassisNumber+"\n"+
		"runningKm="+tw.runningKM+"\n"+
		"noOfWheels="+tw.noOfWheels+"\n"+
		"noOfMirrors="+tw.noOfMirrors+"\n"+
		"TyrePuncture="+tw.isPunctured);
		

	}

}
