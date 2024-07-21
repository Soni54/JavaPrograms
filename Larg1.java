import java.util.Scanner;
class Larg1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    if(x>y&& x>z){
        System.out.println("the largest number among three is "+x);
    }
    else if(y>z&& y>x){
    System.out.println("the largest among three number is"+y);
    }
    else{
    System.out.println("the largest number is"+z);
    }
  }
}