import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
			int[] anArray;
            anArray= new int[n];
            for (int j=0;j<n;j++){
				if (j>0)
                anArray[j]=anArray[j-1]+((int)Math.pow(2, j)*b);
			    else if (j==0)
				anArray[j]=(a+(int)Math.pow(2, j)*b);
            }
			//System.out.println(Arrays.toString(anArray));
			int k=anArray.length;
			for (int j=0;j<k;++j){
			System.out.print(anArray[j]+" ");
			}
			System.out.print("\n");
		}
		in.close();
        
    }
}
