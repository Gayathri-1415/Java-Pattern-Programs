import java.util.*;
public class Pattern06_InvertedStarHalfPyramid {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter no of rows: ");
        int n=sc.nextInt();
        for(i=n;i>=1;i--) 
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }       
    }
}
