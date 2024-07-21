import java.util.Scanner;
class Cal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<5)
        System.out.println("the square of the number is"+(a*a));
        else
        System.out.println("the cude of the number is"+(a*a*a));
    }
}