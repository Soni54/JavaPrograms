import java.util.*;
class Fact1{
    public static void main(String[]args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
          System.out.println("The factorial of a number is" +fact);
    }
}