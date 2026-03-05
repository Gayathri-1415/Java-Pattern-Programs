import java.util.*;
public class Pattern10_HollowSquareStar
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter no of rows");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        
    }
}