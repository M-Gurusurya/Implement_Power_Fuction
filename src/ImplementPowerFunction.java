import java.util.Scanner;

public class ImplementPowerFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int C=scanner.nextInt();

        System.out.println(findPower(A,B,C));
    }

    public static int findPower(int A,int B,int C)
    {
        if(A==0)
        {
            return 0;
        }
        if(B==0)
        {
            return 1;
        }
        long result;
        if(B%2==0)
        {
            result=findPower(A,B/2,C);
            result=(result*result)%C;
        }
        else
        {
            result=A%C;
            result=(result*findPower(A,B-1,C)%C)%C;
        }
        return (int)((result+C)%C);
    }
}
