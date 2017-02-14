import java.util.*;
class insort_test {
long start;
long finish;
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

start = System.currentTimeMillis();
for (int i=1; i<n;i++){
    int key=a[i];
	int pos=binarySearch(0,i-1,key); //finds where the element will be stored
 for(int j=i;j>pos;j--)
 { //shifts the other elements by 1 position to the right
 a[j]=a[j-1];
 a[pos]=key; 
 }//places the key element in the pos position
	 
}
}
int binarySearch(int low, int high,int key){
 int mid;
 while(low<=high){
 mid=(low+high)/2;
 if(key>arr[mid])
 low=mid+1;
 else if(key<arr[mid])
 high=mid-1;
 else
 return mid;
 }
 return low;
 }
finish = System.currentTimeMillis();
long result=finish-start;
// System.out.println("Time to sort="+result+" Start time= "+start+" finish time="+finish);
}