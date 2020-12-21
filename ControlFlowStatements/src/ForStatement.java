public class ForStatement {
    public static void main(String[] args) {
        for (int i = 0;  i<5 ; i++) {
            System.out.println(calculateInterest(10000, i));
        }

        sum3and5(1,1000);

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount*(interestRate/100));
    }

    public static void sum3and5(int firstNum, int lastNum){
        int sum = 0;
        int count = 5;
        for (int i = firstNum; i < lastNum+1; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum += i;
                count -= 1;
            }
            if (count == 0){
                break;
            }
        }
        System.out.println(sum);
    }

}

