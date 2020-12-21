import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        boolean first = true;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter Number:");


            boolean isInt = sc.hasNextInt();


            if (isInt) {
                int number = sc.nextInt();

                if(first){
                    first = false;
                    min = number;
                    max = number;
                }

                if (number>max){
                    max = number;
                }
                if (number<min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid Entry");
                break;
            }

            sc.nextLine();

        }
        System.out.println("Min = " + min + " Max = " + max);
        sc.close();

    }
}
