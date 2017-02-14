import java.util.*;
class multiples1{
public static void main (String [] args) {
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
sc.close();
for (int j=1; j<=10;j++)
   System.out.printf("%s%d\n",i+"x"+j+" = ",i*j);
}


}