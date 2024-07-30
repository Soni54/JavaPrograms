import java .util.Scanner;
class Prime{
    public static void main(String[]args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");

        }
    }
}