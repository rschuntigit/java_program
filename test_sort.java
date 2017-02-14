import java.util.*;
class test_sort {
Scanner sc= new Scanner(System.in);
public static void main (String [] args) {
	test_sort ts_s = new test_sort();
	// Scanner sc= new Scanner(System.in);
	System.out.println ("Enter size of array");
	int n=ts_s.sc.nextInt();
	int[] a = new int[n];
	for (int k=0; k<n; k++)
	{
		a[k]=ts_s.sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	for (int i=1;i<n; i++)
		{
		int key=a[i];
	    int j=i-1;
		while (j>=0 && key<a[j])
		{
			a[j+1]=a[j];
			a[j]=key;
			key=a[j];
			j--;
		}
	
		System.out.println(Arrays.toString(a));
	}
	
}

}