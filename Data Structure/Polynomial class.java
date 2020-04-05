Polynomial class
Send Feedback
Implement a polynomial class, that contains following functions -
1. setCoefficient -
This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value
2. add -
Adds two polynomials and returns a new polynomial which has result
3. subtract -
Subtracts two polynomials and returns a new polynomial which has result
4. print -
Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree. **
Print pattern for a single term : "x"
And multiple terms should be printed separated by space. For more clarity, refer sample test cases
Note : Only keep those terms which have non - zero coefficients.
Sample Input 1 :
P1 : 1x2 2x3 4x6 
P2 : 3x4 1x2
Sample Output 1 :
P1 + P2 = 2x2 2x3 3x4 4x6
