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
            long val=1;
            int upper=i;
            long cumulativeUpper=i;
            int lower=1;
            long cumulativeLower=1;
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                    temp.add(1);
                else
                {
                    int mid=(i+1)/2;
                    if(j>(mid))
                    temp.add(temp.get(i-j));
                    else
                    {
                    val=cumulativeUpper/cumulativeLower;
                    lower++;
                    upper--;
                    cumulativeUpper*=upper;
                    cumulativeLower*=lower;
                    temp.add((int)val);
                    }
                }
                
            }
            ans.add(temp);
        }
        return ans;
    }
    
}
