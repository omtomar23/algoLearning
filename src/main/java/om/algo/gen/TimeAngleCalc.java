package om.algo.gen;

public class TimeAngleCalc 
{
	public static double calAngle(int hours, int mins)
	{
		if(hours > 12 || mins > 60)
			throw new IllegalArgumentException("Hours and Mins input not valid.");
		int h = hours == 12 ? 0 : hours;
		int m = mins == 60 ? 0 : mins;
		double hAngle = (h * 60 + m)*.5;
		double mAngle = m*6;
		double angle = Math.abs(mAngle - hAngle);
		return min(360 - angle, angle);
	}
	
	private static double min(double val1, double val2)
	{
		return val1 > val2? val2: val1;
	}
	
	public static void main(String[] args) {
		System.out.println(calAngle(9, 60));
		System.out.println(calAngle(12, 30));
		System.out.println(calAngle(3, 30));
	}
}
