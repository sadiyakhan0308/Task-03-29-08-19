
public class StringTask2 
{
	  private static int countCS;
	  private static int countIT;
	  private static int countMech;
	  private static int countCivil;
	  
	  public static void main(String args[])
	  {
           String rollno[]= {"123","121","122","341","342","567","789","788"};
           for(int i=0;i<rollno.length;i++) 
     	  { 
     		  if(rollno[i].contains("12"))
     		  {
     			 countCS++;
     		  }
     		  
     		 else if(rollno[i].contains("34"))
     		  {
     			 
     			 countIT++;
     		 }
     		  
     		 else if(rollno[i].contains("56"))
    		  {
    			 
    			 countMech++;
    		 }
    		  
     		else if(rollno[i].contains("78"))
  		    {
  			 
  			 countCivil++;
  		    }
  		  
         }
	      
           System.out.println("Students of CS branch  : "+countCS);
           System.out.println("Students of IT branch  : "+countIT);
           System.out.println("Students of Mechanical branch  : "+countMech);
           System.out.println("Students of Civil branch  : "+countCivil);
      	  
	  }
}
     	  
	
