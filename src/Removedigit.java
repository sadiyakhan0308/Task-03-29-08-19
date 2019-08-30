//remove digits from given string
public class Removedigit 
{
    public static void main(String[] args) 
    {
        String s = "ad3daddfd5443dfsfss";
        s = s.replaceAll("[0-9]","");
        System.out.println(s);
    }
        
}