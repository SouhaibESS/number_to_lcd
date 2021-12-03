import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    private static final Map<Integer, String[]> numbers = new HashMap<Integer, String[]>();

    static {
        /** numbers repreensation in LCD
             _      _  _      _   _   _   _   _  
            | | |  _| _| |_| |_  |_   | |_| |_|  
            |_| | |_  _|   | _| |_|  | |_|  _| 

         *  */ 
        String[] zeroInLCD = {" _ ", "| |", "|_|"};
        String[] oneInLCD = {"   ", "  |", "  |"};
        String[] twoInLCD = {" _ ", " _|", "|_ "};
        String[] threeinLCD = {" _ ", " _|", " _|"};
        String[] fourInLCD = {"   ", "|_|", "  |"};
        String[] fiveInLCD = {" _ ", "|_ ", " _|"};
        String[] sixInLCD = {" _ ", "|_ ", "|_|"};
        String[] sevenInLCD = {" _ ", "  |", "  |"};
        String[] eightInLCD = {" _ ", "|_|", "|_|"};
        String[] nineInLCD = {" _ ", "|_|", " _|"};
        numbers.put(0, zeroInLCD);
        numbers.put(1, oneInLCD);
        numbers.put(2, twoInLCD);
        numbers.put(3, threeinLCD);
        numbers.put(4, fourInLCD);
        numbers.put(5, fiveInLCD);
        numbers.put(6, sixInLCD);
        numbers.put(7, sevenInLCD);
        numbers.put(8, eightInLCD);
        numbers.put(9, nineInLCD);

    }

    /**
     * Returns the digits of a given number in a list
     * @param number integer
     * @return number digits list
     */
    private static List<Integer> numberTOArrayOfDigits(Integer number) {
        Integer digit;
        List<Integer> numberDigits = new ArrayList<Integer>(); 
        while(number >= 10) {
            digit = number % 10;
            // add to the front of the list 
            numberDigits.add(0, digit);
            number -= digit;
            number /= 10;
        }
        numberDigits.add(0, number);
        return numberDigits;
    }

    public static void main(String[] args) throws Exception {
        List<Integer> number = numberTOArrayOfDigits(1234567809);
        
        for (int i = 0; i < 3; i++) {
            for (Integer n : number) {
                // print each line caracters of the different digits
                System.out.print(numbers.get(n)[i]);
            }
            System.out.print("\n");
        }
        
    }
}
