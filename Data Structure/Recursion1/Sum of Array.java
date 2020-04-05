Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input :
3
9 8 9
Sample Output :
26

+++++++++++++++++++++++++++++++++++++++++++++++++++

public class Solution {

	public static int sum(int input[]) {
        
        if(input.length==1){
          return input[0];
        }
		int smallerInput[]=new int[input.length-1];
      	for(int i=1;i<input.length;i++){
          smallerInput[i-1]=input[i];
        }
     	int total=sum(smallerInput);
      	total+=input[0];
      	return total;
	}
        
		
	}



import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(Solution.sum(input));
	}
}
