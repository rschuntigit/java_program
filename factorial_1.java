import java.util.*;
class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        sc.close();
        int p=factorial(i);
        if (p==0)
            {
            System.out.println("Invalid Input"+i);
        }
        else
            {
            System.out.println(p);
        }
        }     
   
     static int factorial(int n){
        if (n<=1)
        {
            return 1;
        }
        else if (n>=2 && n<=12)
            {
              return n*factorial(n-1);
        }
        else return 0;
}
 }