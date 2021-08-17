package While_Do_Loop_Stirng;
//Assignment-3
//        Write a program to make a digital tasbih where the program counts each time user press enter until press 0
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter number of counted tasbih:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num=scanner.nextInt();
            sum+=num;
            System.out.println("Total count for tasbih "+sum);
            if(num==0){
                break;
            }
        }
    }
}
