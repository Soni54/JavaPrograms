import java.util.Scanner;
class Lar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.close();
        
        if(x>y){
            System.out.println("the largest nuber is"+x);

        }
        else{
            System.out.println("the largest number is"+y);
        }

    }
}