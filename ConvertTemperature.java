import java.util.*;
class Solution {
    public double[] convertTemperature(double c) {
        double kelvin=c+273.15;
        double fahrenheit=c*1.80+32.0;
        double arr[]={kelvin,fahrenheit};
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		double a=36.5;
		System.out.println(Arrays.toString(ob.convertTemperature(a)));
	}
}
