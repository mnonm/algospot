import java.util.Scanner;
public class Hotsummer {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int T = scan.nextInt();
		for( int i = 0; i < T; i++ )
		{
			int w = scan.nextInt();
			int sum = 0;
			for( int j = 0; j < 9; j++ )
			{
				sum = sum + scan.nextInt();
			}
			if( w >= sum )
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
