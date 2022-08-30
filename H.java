import java.util.Scanner;
Class H{
     public static void main(String[] args){
       int a,b, g;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Two Number ");
       a =sc.nextInt();
       b =sc.nextInt(); 

        g= 0;
       for(int i=1;i<=a;i++)

        if(a%i==0&&b%i==0){
        g=i;
        }
       System.out.print("HCD = "+g);
}
}