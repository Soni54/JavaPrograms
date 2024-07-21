import java.util.*;
class Between{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1 && a<=10)
        System.out.println("number lies between 1 to 10");
        else if(a>=11 && a<=20)
        System.out.println("number lies between 11 to 20");
        else if(a>=21 && a<=30)
        System.out.println("number lies between 21 to 30");
        else
        System.out.println("number is greater than 30");
    }
}