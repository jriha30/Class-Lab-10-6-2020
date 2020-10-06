public class Driver
{
	public static void main(String[] args)
	{
		int[] list = new int[5];
		list[0] = 64;
		list[1] = 25;
		list[2] = 12;
		list[3] = 22;
		list[4] = 11;
		int counter = 0;
		int selection = 0;
		while(counter < list.length)
		{
			int counter2 = counter;
			selection = list[counter];
			for(int i = counter; i < list.length; i++)
			{
				if(selection > list[i])
				{
					selection = list[i];
					counter2 = i;
				}
				
			}
			int storedNum = list[counter];
			list[counter] = selection;
			list[counter2] = storedNum;
			counter++;
		}
		for(int s : list)
		{
			System.out.println(s);
		}
	}
}