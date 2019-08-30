public class StringTask6 
{
 //program to count no. of alphabates,symbols,digits,spaces
	public static void countNumber(String s) 
	{
		 int countalphabates = 0;
		 int  countdigits = 0;
		 int countsymbols = 0;
		 int countspaces = 0;
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (Character.isLetter(ch[i])) 
			{
				countalphabates++;

			}else if(Character.isDigit(ch[i]))
			{
				countdigits++;
			}else if(Character.isWhitespace(ch[i]))
			{
				countspaces++;
			}else 
			{
				countsymbols++;
			}
			
		}
		System.out.println("ALPHABATES PRESENT IN THE STRING ARE  :"+countalphabates);
		System.out.println("DIGITS PRESENT IN THE STRING ARE  :"+countdigits);
		System.out.println("SPACES PRESENT IN THE STRING ARE  :"+countspaces);
		System.out.println("SYMBOLS PRESENT IN THE STRING ARE  :"+countsymbols);
	}

	public static void main(String[] args) 
	{
		String s = "hello user123,you can mail me @xyz4343@gmail.comwith # tag java!";
		countNumber(s);

	}

}
