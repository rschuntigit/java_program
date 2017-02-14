import java.util.*;
class insort_test {

public static void main (String [] args) {
int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
		int a[] = new int[n];
		int data=n;
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = data;
			data=data-1;
        }
// for (int j=0;j<n;++j){
// System.out.print(a[j]);}
// System.out.println("Un-sorted array "+Arrays.toString(a));
long start;
long finish;
start = System.currentTimeMillis();
for (int i=1; i<n;i++){
    int j = i-1;
	int key=a[i];
	while (j>=0 && a[j]>key){
	a[j+1]=a[j];
	a[j]=key;
	j--;
	
	}
  
}
// for (int j=0;j<n;++j){
// System.out.print(a[j]);
// System.out.println("Sorted Array "+Arrays.toString(a));
finish = System.currentTimeMillis();
long result=finish-start;
System.out.println("Time to sort="+result+" Start time= "+start+" finish time="+finish);
}
}