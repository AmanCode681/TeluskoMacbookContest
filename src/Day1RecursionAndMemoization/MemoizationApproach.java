package Day1RecursionAndMemoization;

import java.util.*;
public class MemoizationApproach {

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
        List<Integer> row1=new ArrayList<>();
        row1.add(1);
        ans.add(row1);
        if(numRows<=1)
        return ans;
        for(int i=1;i<numRows;i++)
        {
        	List<Integer> temp=new ArrayList<>();
            temp.add(1);
            temp.add(1);
            ans.add(temp);
        }
        for(int i=2;i<numRows;i++)
        {
            for(int j=1;j<i;j++)
            {
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                ans.get(i).add(j,val);
            }
        }
        return ans;
    }

}
