import java.util.*;
public class Pattern02_FloydTriangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n=sc.nextInt();
        int i,j,k;
        k=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
