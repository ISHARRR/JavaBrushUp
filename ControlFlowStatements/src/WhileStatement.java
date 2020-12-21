public class WhileStatement {
    public static void main(String[] args) {

//        int num = 4;
//        int finishNumber = 20;
//
//        while (num <= finishNumber){
//            num++;
//            if(!isEvenNumber(num)){
//                continue;
//            }
//            System.out.println("Even Number" + num);
//        }

        System.out.println(sumDigits(125));

    }

    public static boolean isEvenNumber(int num){
        if((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits(int num) {
        if(num < 10){
            return -1;
        }

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;

            num /= 10;
        }
        return sum;
    }

}
