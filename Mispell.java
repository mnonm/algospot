import java.util.Scanner;
public class Mispell {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int T = scan.nextInt();
		for( int i = 0; i < T; i++ )
		{
			int pos = scan.nextInt();
			String str = scan.next();
			System.out.print(i+1 + " ");
			for( int j = 0; j < str.length(); j++ )
			{
				if( j == pos - 1 )
					continue;
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
