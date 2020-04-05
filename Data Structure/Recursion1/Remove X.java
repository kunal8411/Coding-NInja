Given a string, compute recursively a new string where all 'x' chars have been removed.
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:
--
+++++++++++++++++++++++++++++++++++++++++++++++++++


public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        String ans="";
        if (input.length()==0)
        {
            return input;
        }
        if(input.charAt(0)!='x')
        {
            ans=ans+input.charAt(0);
        }
        String smallans=removeX(input.substring(1));
        return ans+smallans;
	}
}
