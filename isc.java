import java.util.*;
class isc
{
public static void main(String [] args){
String inputstring;
Scanner sc=new Scanner(System.in);

inputstring=sc.next();

//Converting given string to char array
	char[] strArray = inputstring.toCharArray();
	System.out.println(Arrays.toString(strArray));
int count=0;	
for (int i=0; i<strArray.length;i++)
{
	// System.out.println("i="+i+strArray[i]);
	if(strArray[i]=='x'){
		count++;
	}
	else if (strArray[i+1]=='x'){
		count--;
	}
}
System.out.print(count);
}
}