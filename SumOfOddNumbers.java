import java.util.Scanner;
public class SumOfOddNumbers{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the start value");
        int start=snr.nextInt();	
	System.out.println("Enter the end value");
        int end=snr.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
	System.out.println("The sum of all the odd numbers between "+ start +" and " + end +" is: (inclusive) ");
        System.out.println(sum);
    }
}