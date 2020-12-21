import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true){
            int order = counter + 1;
            System.out.println("enter number " + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if(isAnInt){
                int number = sc.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("invalid Number");
            }

            sc.nextLine();
        }

        System.out.println("sum = " + sum);
        sc.close();
    }

}
