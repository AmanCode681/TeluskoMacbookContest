package Day1RecursionAndMemoization;

import java.util.*;
// breaks for higher value of n
public class NaiveAproachTLE {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		List<List<Integer>> pascalTriangle=generate(rows);
		
		for(List<Integer> r:pascalTriangle)
		{
			for(int val:r)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int[][] dp=new int[numRows][numRows];
        for(int i=0;i<numRows;i++)
        {
            List<Integer> temp=new ArrayList<>();
            
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                    temp.add(1);
                else
                {
                    int fact1=factorial(i);
                    int fact2=factorial(j);
                    int fact3=factorial(i-j);
                    temp.add(fact1/(fact2*fact3));
                }
                
            }
            ans.add(temp);
        }
        return ans;
    }
    private static int factorial(int n)
    {
    	int f=1;
    	for(int i=1;i<=n;i++)
    	{
    		f=f*i;
    		
    	}
    	return f;
    }
	
}
