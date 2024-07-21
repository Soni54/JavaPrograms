import java.util.*;
class Grade{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>=91 && a<=100)
    System.out.println("Grade is A+");
    else if(a>=81 && a<=90)
    System.out.println("Grade is A");
    else if(a>=61 && a<=80)
    System.out.println("Grade is+B+");
    else if(a>=41 && a<=60)
    System.out.println("Grade is B");
    else if(a>=31 && a<=40)
    System.out.println("Grade is C");
    else 
    System.out.println("Fail");

}
}