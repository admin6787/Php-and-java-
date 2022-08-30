import java.util.Scanner;
class P{
    public static void main(String[] args){
        int n, count=0;
        System.out.print("Enter any number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); 

        for(int i=1; i<=n; i++)
        {
            if(n%i==0){
                count++;
            }
        }
            if(count==2){
            System.out.print(" The number is Prime ");
            }
            else{
            System.out.print("The number is not Prime ");
            }
        }
    }
