Given a random integer array A and an element x. You need to search this element x in the given array using linear search. Return the index of element in the input.
Linear search means, we need to compare elements from the array A one by one with the element x, till we found the match or we reach the end of array. If match found, return its index, and if not return -1.
Indexing in the array starts from 0.
Input format :
Line 1 : Integer n, Array Size
Line 2 : Array elements (separated by space)
Line 3 : Element to be searched (i.e. x)
Constraints :
1 <= n <= 10^5
Sample Input 1:
7
2 13 4 1 3 6 28
3
Sample Output 1:
4
Sample Input 2:
7
2 13 4 1 3 6 28
9
Sample Output 2:
-1

+++++++++++++++++++++++++++++++++++++++++++++++++++

public class LinearSearch{	
	
	public static int linearSearch(int[] arr, int num){
		
		for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
            
           
        }
        return -1;
	}
}

public class Main {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		System.out.print(LinearSearch.linearSearch(arr, num));
	}
}
