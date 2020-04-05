Given an integer n, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer n
Output Format :
No. of 0s
Sample Input :
10204
Sample Output
2

+++++++++++++++++++++++++++++++++++++++++++++++++++


public class solution {

	
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        if(input==0)
        {
            return 1;
        }
        if(input<10 && input>-10)
        {
            return 0;
        }
        return countZerosRec(input/10)+countZerosRec(input%10);
	}
     public static void main(String[] args )
     {
         int no=1020202;
         System.out.println(countZerosRec(no));
     }
}
