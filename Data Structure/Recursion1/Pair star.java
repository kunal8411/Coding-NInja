Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
xxyy
Sample Output 2:
x*xy*y
Sample Input 3 :
aaaa
Sample Output 3:
a*a*a*a

+++++++++++++++++++++++++++++++++++++++++++++++++++


public class solution {

	// Return the updated string
	public static String addStars(String s) {

      if(s.length()==1){
        return s;
      }
      char arr1[]=s.toCharArray();
      char arr2[]=new char[arr1.length-1];
      for(int index=0;index<arr1.length-1;index++){
        arr2[index]=arr1[index];
      }
      String temp2=new String(arr2);
      String actual=addStars(temp2);
      String s3=Character.toString(arr1[arr1.length-1]);
      if(actual.charAt(actual.length()-1)==arr1[arr1.length-1]){
        return actual+"*"+s3;
      }
      return actual+s3;
	}
        

	}


