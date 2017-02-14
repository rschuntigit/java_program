import java.util.*;
class ifelseif
{
	final String ans="";
public static void main (String [] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
if (n%2==1)
{
	ans="Wiered";
}
else if (n>=2 && n<=5)
{
	ans="Not Weird";
	}
else if(n>=6 && n<=20)
{
	ans="Weird";
}
else ans="Not Weird";
System.out.println(ans);
}



}