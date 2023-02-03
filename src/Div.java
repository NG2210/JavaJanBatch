import java.util.Scanner;

public class Div {
    public static void main(String[] args) {

//        double x=9.0;
//        int y=2;
//
//        double div = x/y;
//        System.out.println("Div is "+1000);
//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value for a : ");
        int a = sc.nextInt();
        System.out.println("Enter the Value for b : ");
        int b = sc.nextInt();

        if(a == b){

             System.out.println("a & b are same.... ");
        }else{
            System.out.println("a & ---b are not same...");
        }


    }
}
