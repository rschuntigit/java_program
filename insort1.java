import java.util.*;
class insort1 {

public static void main (String [] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Size of array=");
int size=sc.nextInt();
int[] array1=new int[size];
for(int k=0;k<size;k++){
array1[k]=sc.nextInt();
}
System.out.println("Unsorted array"+Arrays.toString(array1));

for(int i=1;i<array1.length;i++)
{
int key=array1[i];
int j=i-1;
System.out.print("Key="+key);
while(j>=0 && key<array1[j]){
	System.out.print("j+1="+array1[j+1]+"j="+array1[j]);
array1[j+1]=array1[j];
array1[j]=key;
j--;
}
}
System.out.println("Sorted array"+Arrays.toString(array1));
}

}