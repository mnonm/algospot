import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class Weird {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for( int i = 0; i < T; i++ )
		{
			ArrayList<Integer> List = new ArrayList<Integer>();
			int input = sc.nextInt();
			int sum = 0;

			for( int j = 1; j <= input/2; j++ )
			{
				if( input % j == 0 )
				{
					List.add(j);
					sum += j;
				}
			}

			if( sum <= input )
			{
				System.out.println("not weird");
				continue;
			}

			if( !checkSubSum( input, List.size()-1, List, 0 ) )
				System.out.println("weird");
			else
				System.out.println("not weird");
		}
		
		sc.close();
	}
	
	public static boolean checkSubSum( int n, int depth, ArrayList<Integer> List, int sum )
	{
		if( n == sum )
			return true;
		if( n < sum || depth < 0 )
			return false;

		int v = List.get(depth);
		return ( checkSubSum( n, depth-1, List, sum + v ) || checkSubSum( n, depth-1, List, sum ) );
	}
}
