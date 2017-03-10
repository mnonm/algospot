import java.util.Scanner;
public class Conversion {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int T = scan.nextInt();
		for( int i = 0; i < T; i++ )
		{
			float f = scan.nextFloat();
			String unit = scan.next();
			
			switch(unit)
			{
			case "kg":
				f = f * 2.2046f;
				unit = "lb";
				break;
			case "lb":
				f = f * 0.4536f;
				unit = "kg";
				break;
			case "l":
				f = f * 0.2642f;
				unit = "g";
				break;
			case "g":
				f = f * 3.7854f;
				unit = "l";
				break;
			default :
				break;
			}
			System.out.print(i+1 + " ");
			System.out.printf("%.4f", f);
			System.out.println(" " + unit);
			
		}
	}
}
