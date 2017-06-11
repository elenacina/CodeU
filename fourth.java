/**
 * @(#)fourth.java
 *
 *
 * @author Elena Cina
 * @version 1.00 2016/5/10
 */


public class fourth
{
	static void sparseMatrix (int [][] input)
	{
		for (int i = 0; i< input.length; i++)
		{
			for(int j = 0; j<input[i].length; j++)
			{
				if(input[i][j] != 0)
					System.out.println ("[" +i+", "+j+"]: " +input[i][j] +" \n");
			}
		}
	}

	public static void main (String [] args)
	{
		int[][] input = {{0, 0, 0, 0},
							{0, 6, 0, 0},
								{8, 0, 0, 4}};
	 sparseMatrix(input);

		int[][] input1 = {{0,2,3,0},
		{0,0,0,0},
		{ 1,0,0,0},
		{3,0,0,5}
		};
    //System.out.print("input1 result: " + sparseMatrix(input1));
	}
}
