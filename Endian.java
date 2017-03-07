import java.util.Scanner;
public class Endian {
	
	static Scanner scan = new Scanner( System.in );
	public static void main( String[] args )
	{
//		System.out.print("test case : ");
		int caseNumber = scan.nextInt();
		Long[] outputArray = new Long[caseNumber];
		
		for( int i = 0; i < caseNumber; i++ )
		{
//			System.out.print("input : ");
			long inputInteger = scan.nextLong();
			long outputInteger = 0;
			
			for( int j = 0 ; j < 4; j++ )
			{
				long tempInteger =  inputInteger & 0xFF;
				tempInteger = tempInteger << (3 - j) * 8;
				outputInteger = outputInteger | tempInteger;
				inputInteger = inputInteger >> 8;
			}
			outputArray[i] = outputInteger;
		}
		for( int i = 0; i < caseNumber; i++ )
		{
			System.out.println( outputArray[i] );
		}
	}
}
