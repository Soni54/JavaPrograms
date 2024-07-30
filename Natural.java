import java.util.*;
class Natural{
    public static void main(String[]args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            sum=sum+i;
        }
        System.out.println("sum of natural number is"+sum);
    }
}