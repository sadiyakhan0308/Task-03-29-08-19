import java.util.Scanner;

public class StringTask5 {
private static Scanner sc;

	//program to check palindrome without using string buffer
	public static void main(String[] args) 
	{
		String Reverse = "";
		sc = new Scanner(System.in);
		System.out.println("please enter the string");
		String s = sc.next();
		for (int i = s.length() - 1; i >= 0; i--) 
		{
			Reverse = Reverse + s.charAt(i);
		}
		if (Reverse.equals(s)) 
		{
			System.out.println(s + "   Is a Pallindrom");
		} else 
		{
			System.out.println(s + "   Is not  Pallindrom");
		}

	}
}

