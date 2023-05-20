package Day1RecursionAndMemoization;

import java.util.*;

public class IterativeAppraoch {

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
        for(int i=0;i<numRows;i++)
        {
            List<Integer> temp=new ArrayList<>();
            
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                    temp.add(1);
                else
                {
                    temp.add(factorial(i)/(factorial(i-j)*factorial(j)));
                }
                
            }
            ans.add(temp);
        }
        return ans;
    }
    public static int factorial(int num)
    {
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        return f;
    }
}
