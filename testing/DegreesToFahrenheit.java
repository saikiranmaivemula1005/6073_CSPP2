import java.util.*;
public class DegreesToFahrenheit
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float c = scan.nextFloat();
		float f = 1.8f;
		float celcius = 32;
		f = f*c;
		f = f + celcius;
		System.out.format("%.2f",f);
	}
}