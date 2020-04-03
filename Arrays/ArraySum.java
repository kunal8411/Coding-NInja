Given an array/list of length N, you need to find and return the sum of all elements of the array/list.
Input Format :
Line 1 : An Integer N i.e. size of array/list
Line 2 : N integers which are elements of the array/list, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^6
Sample Input :
3
9 8 9
Sample Output :
26
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class Solution {

	public static int sum(int[] input){
		
        int sum=0;
        
        for(int i=0;i<input.length;i++)
        {
            sum=sum+input[i];
        }
             
        return sum;
       
	}
	
}

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		
	
		int[] input = takeInput();
		
		System.out.println(Solution.sum(input));
		
	}

}

