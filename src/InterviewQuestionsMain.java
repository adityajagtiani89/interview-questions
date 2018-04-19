/**
 * Created by aditya.jagtiani on 4/18/18.
 */
import convertNumberToWords.*;
import maxOccurringUnbannedWord.*;
import excelColumnNameToNumber.*;

public class InterviewQuestionsMain {

    public static void main(String [] args) {
        System.out.println(NumberToWords.numberToWords(1234));

        String [] banned = {"hit"};
        System.out.println("Most Common Unbanned Word = " + MostCommonUnbannedWord.mostCommonWord("Bob hit a " +
                "ball, the hit BALL flew far after it was hit.", banned));

        System.out.println("Corresponding Excel Column Number = " + ExcelColumnNameToNumber.excelNameToNumber("AA"));
    }
}
