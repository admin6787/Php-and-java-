import java.util.Scanner;
class reverse
{
    public static void main(String[] args){
        int n, a;
        System.out.print("Enter any Number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while(n>0)
        {
            a=n%10;
            System.out.print(a);
            n=n/10;
        }
    }
}