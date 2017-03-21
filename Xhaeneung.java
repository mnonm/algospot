import java.util.Scanner;
public class Xhaeneung {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] strNumber = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for( int i = 0; i < T; i++ )
		{
			String str1 = sc.next();
			String op = sc.next();
			String str2 = sc.next();
			sc.next();
			String ans = sc.next();
			int n1 = -1;
			int n2 = -1;
			int answer = -1;
			int ret = -1; // -1 : init, 0 : incorrect, 1 : correct
			
			for( int j = 0; j < 11; j++ )
			{
				if( n1 == -1 && str1.compareTo(strNumber[j]) == 0 )
					n1 = number[j];
				if( n2 == -1 && str2.compareTo(strNumber[j]) == 0 )
					n2 = number[j];
				if( n1 != -1 && n2 != -1 )
				{
					switch(op)
					{
					case "+":
						answer = n1 + n2;
						break;
					case "-":
						answer = n1 - n2;
						break;
					case "*":
						answer = n1 * n2;
						break;
					}
					if( answer < 0 || answer > 10 )
						ret = 0;
					else
					{
						if( ans.compareTo(strNumber[answer]) == 0 )
							ret = 1;
						else if( strNumber[answer].length() == ans.length() )
						{
							int cnt = 0;
							for( int k = 0; k < ans.length(); k++ )
							{
								for( int l = 0; l < ans.length(); l++ )
								{
									if( ans.charAt(k) == strNumber[answer].charAt(l) )
									{
										cnt++;
										break;
									}
								}
								if( cnt != k + 1 )
								{
									ret = 0;
									break;
								}
							}
							if( cnt == ans.length() )
								ret = 1;
						}
						else
							ret = 0;					
					}
				}
			}
			
			if( ret == 1 )
				System.out.println("Yes");
			else
				System.out.println("No");
			
		}
	}
}
