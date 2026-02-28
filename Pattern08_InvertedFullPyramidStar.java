import java.util.*;
class Pattern08_InvertedFullPyramidStar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter no of rows");
        int n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}