/**
 * @(#)second.java
 *
 *
 * @author Elena Cina
 * @version 1.00 2016/5/7
 */


public class second {
	public static int[] evens(int[] input)
   	{
   		int count = 0;
   		for(int i = 0; i < input.length; i++)
   		{
   			if(input[i] %2 == 0)
   				count++;
   		}
		int j = 0;
   		int [] result = new int [count];
		for(int i = 0; i<input.length; i++)
		{
			if(input[i]%2 == 0)
				result[j++] = input[i];
		}
   	return result;
   	}

//testing
    public static void main (String[] args)
    {
   		int[] test1 = {8,6,7,5,3,0,9,2};
    	int[] ans = evens(test1);
    	System.out.println("test1 results:");
        for (int i = 0; i < ans.length; ++i){
     		System.out.println(ans[i]);
   		}

   		int [] test2 = {2,7,18,28,18,28,45,90,45};
   		ans = evens(test2);
   		System.out.println("test2 results:");
    	for (int i = 0; i < ans.length; ++i) {
      	System.out.println(ans[i]);
    	}

    	int [] test3 = {0, 13, 34, 53, 1, 1, 0, 10};
    	ans = evens(test3);
   		System.out.println("test3 results:");
    	for (int i = 0; i < ans.length; ++i) {
      	System.out.println(ans[i]);
    	}

    	int [] test4 = {10, 14, 34, 54, 13, 15, 0, 10,17};
    	ans = evens(test4);
   		System.out.println("test4 results:");
    	for (int i = 0; i < ans.length; ++i) {
      	System.out.println(ans[i]);
    	}
    }
}
