import java.util.Scanner;
class factr{
public static void main(String[] args)
{
int n, factr=1;
System.out.print("Enter any number ");
Scanner s= new Scanner(System.in);
n=s.nextInt();
for(int i=1; i<=n; i++)
{
factr=factr*i;
}
System.out.print("Factoial "+ factr);
}
}