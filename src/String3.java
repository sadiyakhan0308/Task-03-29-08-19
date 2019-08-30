
public class String3 {
	// Sorting the string array in ascending order 
	static String temp;
    static int count;

	public static void main(String[] args) 
	{
		String cities[] = { "bhilai", "ahmedabad", "mumbai", "chennai", "patna", "durg" };
		count=cities.length;
		for (int i = 0; i <count; i++) 
		{
			for (int j = i + 1; j < count; j++) 
			{
				if (cities[i].compareTo(cities[j]) > 0) 
				{
					temp = cities[i];
					cities[i] = cities[j];
					cities[j] = temp;

				}
			}
			
		}
		System.out.println("String in sorted Order");
		for(int i=0;i<=count - 1;i++)
		{
			System.out.println(cities[i]+"");
		}
	}

}
