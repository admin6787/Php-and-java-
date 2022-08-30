import java.util.Scanner;
public class Whilet {
 public static void main(String[] args) {
    int n,c;
    System.out.print("Enteery a Number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    c=n;
       int j=1;
       while(j<=n)
       {
           System.out.println(j);
           j=j+2;
           
       }
       if(c==j)
       System.out.print("This is armstrong number");
        else
        System.out.print("This Is not armstrong number");
    }
    }
