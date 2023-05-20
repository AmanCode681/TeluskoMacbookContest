package Day1RecursionAndMemoization;

import java.util.*;

public class RecursiveApproach {

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
                    temp.add(calculateiCjUsingRecursion(i,j));
                }
                
            }
            ans.add(temp);
        }
        return ans;
    }
    private static int calculateiCjUsingRecursion(int n, int r) {
		if(r==0)
			return 1;
		if(n==0)
			return 0;
		
		
		int takeN=calculateiCjUsingRecursion(n-1,r-1);
		int dontTakeN=calculateiCjUsingRecursion(n-1,r);
		
		return takeN+dontTakeN;
		
		
		
	}
	
}
