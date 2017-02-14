import java.util.*;
class islandcount {

public static void main(String [] args){
String inputstring;
Scanner sc=new Scanner(System.in);
int countx=0;

inputstring=sc.next();

//Converting given string to char array
	char[] strArray = inputstring.toCharArray();
	System.out.println(Arrays.toString(strArray));
	int n=strArray.length;
	for(int j=0;j<n;j++){
	// while (j<n && strArray[j]=='x'){
		//	j++;
		// }
		if (n==1)
		{
			if (strArray[j]=='x') countx++;
		}
		else if (strArray[j]=='x' && j+1<n && strArray[j+1]!='x'){
		countx++;
		j++;
		}
		else if (strArray[j]!='x' && j+1<n && strArray[j+1]=='x'){
		countx++;
		j++;
		}
		else if (strArray[j]=='x' && j+1>n && j-1>0 && strArray[j-1]!='x') {
		countx++;
		j++;
        }
}	
System.out.print(countx);	
}

}
