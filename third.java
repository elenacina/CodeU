/**
 * @(#)third.java
 *
 *
 * @author Elena Cina
 * @version 1.00 2016/5/8
 */

public class third {

	static int loopCount(int x)
	{
		int n = 1;
		while(x !=1)
		{
			if(x%2 == 0)
				x = x/2;
			else
				x = (x*3)+1;
			n++;
		}
		return n;
	}

	static int maxLoop(int x, int y)
	{
		//create an array to store the values of the length of the sequence for each int between x and y
        int [] values = new int [y-x];
		int k = 0;
		for (int i = x; i< y; i++)
		{
			values[k++] = loopCount(i);
		}
		int max = 0;
		for(int j = 1; j<y-x; j++)
		{
			max = values[0];
			if (values[j]>max)
			max = values[j];
		}
		return max;
	}

	public static void main(String [] args)
	{
		System.out.println(maxLoop(1,50));
	}
}
