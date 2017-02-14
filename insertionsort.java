import java.util.*;
class insertionsort {

public static void main (String [] args) {
int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
		int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }

// for (int j=0;j<n;++j){
// System.out.print(a[j]);}
System.out.println("Un-sorted array "+Arrays.toString(a));
for (int i=0; i<n;i++){
  for (int j=i+1;j<n; j++){
    
	if(a[i]>a[j]) 
	{
	   temp=a[i];
	   a[i]=a[j];
	   a[j]=temp;   
	
	}
	
  
  }


}
// for (int j=0;j<n;++j){
// System.out.print(a[j]);
System.out.println("Sorted Array "+Arrays.toString(a));
}
}