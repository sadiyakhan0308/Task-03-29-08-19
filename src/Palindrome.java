//program to check a palindrome using StringBuffer
public class Palindrome 
{
	public static void main(String args[])
	  {
	     String str1 = "madam";
	     StringBuffer sb = new StringBuffer(str1);
       
	      sb.reverse();
	      if(str1.equals(sb.toString()))
	      {
	          System.out.println("String is palindrome");
	      } else 
	      {
	          System.out.println("String is not palindrome");
	      }
	 }

}
