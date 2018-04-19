package convertNumberToWords;

/**
 * Created by aditya.jagtiani on 4/18/18.
 */
public class NumberToWords {

    private static final String[] thousands = {
            "",
            " Thousand",
            " Million",
            " Billion",
            " Trillion",
            " Quadrillion",
            " Quintillion"
    };

    private static final String[] tens = {
            "",
            " Ten",
            " Twenty",
            " Thirty",
            " Forty",
            " Fifty",
            " Sixty",
            " Seventy",
            " Eighty",
            " Ninety"
    };

    private static final String[] units = {
            "",
            " One",
            " Two",
            " Three",
            " Four",
            " Five",
            " Six",
            " Seven",
            " Eight",
            " Nine",
            " Ten",
            " Eleven",
            " Twelve",
            " Thirteen",
            " Fourteen",
            " Fifteen",
            " Sixteen",
            " Seventeen",
            " Eighteen",
            " Nineteen"
    };

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String prefix = "";
        if (num < 0) {
            num = -num;
            prefix = "minus";
        }
        String output = "";
        int place = 0;

        do {
            int current = num % 1000;
            if (current != 0) {
                String s = convertNumbersLessThanThousand(current);
                output = s + thousands[place] + output;
            }
            place++;
            num = num / 1000;
        }
        while (num > 0);

        return (prefix + output).trim();
    }

    private static String convertNumbersLessThanThousand(int num) {
        String current = "";
        if (num % 100 < 20) {
            current = units[num % 100];
            num = num / 100;
        } else {
            current = units[num % 10];
            num = num / 10;

            current = tens[num % 10] + current;
            num = num / 10;
        }
        if (num == 0) {
            return current;
        }
        return units[num] + " Hundred" + current;
    }
}
