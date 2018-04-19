package excelColumnNameToNumber;

import java.util.HashMap;

/**
 * Created by aditya.jagtiani on 4/18/18.
 */
public class ExcelColumnNameToNumber {

    public static int excelNameToNumber(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);
        map.put('G', 7);
        map.put('H', 8);
        map.put('I', 9);
        map.put('J', 10);
        map.put('K', 11);
        map.put('L', 12);
        map.put('M', 13);
        map.put('N', 14);
        map.put('O', 15);
        map.put('P', 16);
        map.put('Q', 17);
        map.put('R', 18);
        map.put('S', 19);
        map.put('T', 20);
        map.put('U', 21);
        map.put('V', 22);
        map.put('W', 23);
        map.put('X', 24);
        map.put('Y', 25);
        map.put('Z', 26);

        int result = 0; int j = 0;

        for(int i = s.length() - 1; i >= 0; i --) {
            result += Math.pow(26, j) * map.get(s.charAt(i));
            j++;
        }
        return result;
    }
}
