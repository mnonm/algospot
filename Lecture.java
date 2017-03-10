import java.util.Scanner;
public class Lecture {
	static Scanner scan = new Scanner(System.in);
	public static void main( String[] args )
	{
		int T = scan.nextInt();
		
		for( int i = 0; i < T; i++ )
		{
			String str = scan.next();
			int length = str.length();
			String[] strArr = new String[length/2];
			
			for( int j = 0; j < length/2; j++ )
			{
				strArr[j] = str.substring(j*2, 2 + j*2);
			}
			
			for( int m = 0; m < strArr.length; m++ )
			{
				for( int n = m+1; n < strArr.length; n++ )
				{
					if( strArr[m].compareTo(strArr[n]) > 0 )
					{
						String temp = strArr[m];
						strArr[m] = strArr[n];
						strArr[n] = temp;
					}
				}
			}
			for( int p = 0; p < strArr.length; p++ )
			{
				System.out.print(strArr[p]);
			}
			System.out.println();
		}
	}
}
