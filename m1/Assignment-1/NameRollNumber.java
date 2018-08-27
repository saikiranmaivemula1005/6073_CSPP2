import java.util.*;
public class NameRollNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int rollnumber = scan.nextInt();
		String name = scan.nextLine();
		System.out.print("Roll number: ",rollnumber);
		System.out.print("Name: ",name);
	}
}