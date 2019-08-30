
public class StringTask
{
  private static int x;
  private static int countyahoo;
  private static int countgmail;
      
  public static void main(String arg[]) 
  {
	  String[] email= {"sadiyak688@gmail.com","info.sadiyakhan@gmail.com","0308sadiyakhan@gmail.com","saniya@yahoo.com","anjali12@yahoo.com,kiran1234@gmail.com"};
	  for(int i=0;i<email.length;i++) 
	  { 
		  String domain="yahoo.com";
		  x=email[i].lastIndexOf("@");
		  if(email[i].substring(x+1).equalsIgnoreCase(domain))
		  {
			  countyahoo++;
		  }
		  else
			  countgmail++;
		  
	  }
	  System.out.println("no of gmail domain "+" : "+countgmail);
	  System.out.println("no of yahoo domain "+" : "+countyahoo);
  }
  
  }
  

