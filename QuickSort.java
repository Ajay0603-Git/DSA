import java.util.Scanner;

public class QuickSort 
{
    public static int partition(int A[],int low,int high)
    {
        int pivot = A[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(A[j]<pivot)
            {
                i++;
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }    
        i++;
        int temp=A[i];
        A[i]=pivot;
        A[high]=temp;
        return i;
    }

    public static void quickSort(int A[],int low,int high)
    {
        if (low<high)
        {
            int pidx=partition(A,low,high);
            quickSort(A,low,pidx-1);
            quickSort(A,pidx+1,high);
        }
    }
    public static void main(String s[])
    {
         Scanner sc =new Scanner(System.in);
         int A[]=new int[5];
         int n=A.length;
         for(int k=0;k<n;k++) 
         {
            A[k]=sc.nextInt();
         }

         quickSort(A,0,n-1);

          for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");    
        }
    }
}
