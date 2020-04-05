Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1

+++++++++++++++++++++++++++++++++++++++++++++++++++

public class Solution {

	public static int firstIndex(int input[], int x) {
		
        return firstIndex_1( input,0, x);
    }  
        
        public static int firstIndex_1(int input[], int startIndex,int x)
        {
            if(input[startIndex]==x)
            {
                return startIndex;
                
            }
            if(startIndex>= input.length-1)
            {
                
                return -1;
            }
            return firstIndex_1(input,startIndex+1,x);
            
            
            
        }
		
	}
	
  
  
  
  import java.util.Scanner;

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
		int x = s.nextInt();
		System.out.println(Solution.firstIndex(input, x));
	}
}
