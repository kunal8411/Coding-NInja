Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
true or false
Constraints :
1 <= N <= 10^3
Sample Input :
3
9 8 10
8
Sample Output :
true

+++++++++++++++++++++++++++++++++++++++++++++++++++

public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		
		 return check(input, 0, x);
	}
    public static boolean check(int[] input, int startIndex, int x) {
        if (startIndex == input.length) {
            return false;
        }

        if (input[startIndex] == x) {
            return true;
        }
        return check(input, startIndex + 1, x);

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
		int x = s.nextInt();
		System.out.println(Solution.checkNumber(input, x));
	}
}
