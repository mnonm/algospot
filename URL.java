import java.util.Scanner;
public class URL {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int T = scan.nextInt();
		  String[] e = {"%20", "%21", "%22","%23","%24", "%26","%27","%28", "%29", "%2a", "%2b", "%2c", "%2d", "%2e", "%2f", "%25"};
		    String[] s = { " ", "!", "\"", "#", "\\$", "&", "\'", "(", ")", "*", "+", ",", "-", ".", "/", "%"};
		
		for( int i = 0; i < T; i++ )
		{
			String str = scan.next();
			for( int j = 0; j < e.length; j++ )
				str = str.replaceAll(e[j], s[j]);

			System.out.println(str);
		}
	}
}
