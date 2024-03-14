package ua.nure.jfm.task1;

public class Part1 {

    public static void main(String[] args) {
    	//args = new String[] {"P4", "R8", "40", "1"};
        int numberSum = 0;
        int digitSum = 0;
        String lastNumber = "";

        for(String arg : args) {
            for(char ch : arg.toCharArray()) {
                if(ch >= '0' && ch <= '9') {
                    digitSum += parseInt(ch);
                    lastNumber += ch;
                } else {
                    if(lastNumber.isEmpty())
                        continue;
                    numberSum += parseInt(lastNumber);
                    lastNumber = "";
                }
            }
            if(!lastNumber.isEmpty())
                numberSum += parseInt(lastNumber);
            lastNumber = "";
        }

        System.out.printf("%d %d", numberSum, digitSum);
    }

    private static int parseInt(char ch) {
        return ch - '0';
    }

    private static int parseInt(String str) {
        int result = 0;
        for(char ch : str.toCharArray()) {
            result *= 10;
            result += ch - '0';
        }

        return result;
    }

}
