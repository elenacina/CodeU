/**
 * @(#)First.java
 *
 * First application
 *
 * @author Elena Cina
 * @version 1.00 2016/5/7
 */
public class First
{
    static boolean[] join(int[] y, int[] z){
		boolean[] result;
		if(y.length>z.length)
		{
			result = new boolean[z.length];
   			for(int i = 0; i<z.length; i++)
   			{
   				if(z[i]==0 || y[i] % z[i] != 0)
   					result[i] = false;
   				else
   					result[i] = true;
   			}
		}
		else
		{
		    result = new boolean[y.length];
   			for(int i = 0; i<y.length; i++)
   			{
   				if(y[i] % z[i] != 0 || z[i]==0)
   					result[i] = false;
   				else
   					result[i] = true;
   			}
		}
   		return result;
  	}

    //testing
    public static void main(String[] args)
    {
        int array1[] = {0, 0, 18, 28, 18, 28, 45, 90, 45};
        int array2[] = {0, 6, 7, 5, 3, 0, 9};
        boolean	divisibles[] = join(array1, array2);
        for (int i = 0; i < divisibles.length; ++i)
        {
        System.out.println( divisibles[i]);
        }
    }
}
