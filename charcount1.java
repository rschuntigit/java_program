import java.util.*;
class charcount1 {

public static void main(String [] args){
String inputstring;
Scanner sc=new Scanner(System.in);
int countx=0;

inputstring=sc.next();

//Converting given string to char array
	char[] strArray = inputstring.toCharArray();
	System.out.println(Arrays.toString(strArray));
	int n=strArray.length;
	boolean found=false;
	for(int j=0;j<n;j++){
	if (strArray[j]=='x' && found==false){
		countx++;
		found=true;
		}
		else if (strArray[j]!='x'){
		found=false;
		}
}	
System.out.print(countx);	
}

}