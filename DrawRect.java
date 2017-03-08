import java.util.Scanner;
public class DrawRect {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int testCase = scan.nextInt();
		for( int i = 0; i < testCase; i++ )
		{
			int x[] = {0,0};
			int y[] = {0,0};

			int outX = 0, outY = 0;
			for( int j = 0; j < 3; j++)
			{
				int tX = scan.nextInt();
				int tY = scan.nextInt();
				if( j == 0 )
				{
					x[0] = tX;
					y[0] = tY;
				}
				else if( j == 1 )
				{
					if( x[0] != tX )
						x[1] = tX;
					if( y[0] != tY )
						y[1] = tY;
				}
				else
				{
					if( x[1] == 0 )
						outX = tX;
					if( y[1] == 0 )
						outY = tY;
					if( outX == 0 )
					{
						if( x[0] == tX )
							outX = x[1];
						else
							outX = x[0];
					}
					if( outY == 0 )
					{
						if( y[0] == tY )
							outY = y[1];
						else
							outY = y[0];
					}
				}
			}
			System.out.println(outX + " " + outY);
		}
	}
}
