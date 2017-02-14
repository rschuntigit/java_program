class RotateArray
{
   /*Function to left rotate arr[] of size n by d*/
   void leftRotate(int arr[], int d, int n)
   {
        int i;
        for (i=0; i<d; i++)
             leftRotatebyOne(arr,n);
    }
    
    void leftRotatebyOne(int arr[], int n)
    {
         int i, temp;
         temp= arr[0];
         for (i=0;i<n-1; i++)
             arr[i] = arr[i+1];
         arr[i] = temp;
     }
     /* utility function to print original array */
     void printArrayOrig (int arr[], int size)
     {
          int i;
          for (i=0; i< size; i++)
               System.out.print(arr[i]+"\n");
      }
     /* utility function to print an array */
     void printArray (int arr[], int size)
     {
          int i;
          for (i=0; i< size; i++)
               System.out.print(arr[i]+" ");
      }
      /* Driver program to test above functions */
      public static void main (String[] args)
      {
            RotateArray rotate = new RotateArray();
            int arr []= {1,2,3,4,5,6,7,8,9,10,11,12};
            rotate.printArrayOrig(arr,12);
            rotate.leftRotate(arr,1,12);
            rotate.printArray(arr,12);
       }
}