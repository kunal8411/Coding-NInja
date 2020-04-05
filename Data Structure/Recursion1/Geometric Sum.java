Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion. Return the answer.
Sample Input :
3
Sample Output :
1.875

+++++++++++++++++++++++++++++++++++++++++++++++++++

public class solution{
    public static double findGeometricSum(int k){
        if(k==0)
        {
            return 1;
        }
        return 1+ 0.5*(findGeometricSum(k-1));
	}
	
        
    public static void main(String [] args )
    {
    	int no=3;
    	System.out.println(findGeometricSum(no));
    	
    }
}
