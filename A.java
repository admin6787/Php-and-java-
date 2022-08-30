import java.util.Scanner;
class A
{
    public static void main(String[] args){
        int n, arm=0,rem,c ;
        System.out.print("Enter any number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm)
        System.out.print("This is armstrong number");
        else
        System.out.print("This Is not armstrong number");
    }

}