import java.util.Scanner;
public class BubbleSort {
    public static void main (String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[5];
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }

        for(int k=0;k<A.length;k++)
        {
            for(int j=k+1;j<A.length;j++)
            {
                if(A[k]>A[j])
                {
                    int temp=A[k];
                    A[k]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is:")
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+"\t");
        }
    }
    
}

