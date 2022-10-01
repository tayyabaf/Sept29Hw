package methodspractice20questions;
import java.util.Arrays;

public class Main {
    //Question 1
    public static int getLastIndex(String[] fruits) {
        return fruits.length - 1;
    }


    //Question 2
    public static int getSecondToLastIndex(String[] fruits) {
        return fruits.length - 2;
    }


    //Question 3
    public static String getFirstElement(String[] fruits) {

        return fruits[0];
    }


    //Question 4
    public static String getLastElement(String[] fruits) {

        return fruits[fruits.length - 1];
    }


    //Question 5
    public static String getSecondToLastElement(String[] fruits) {

        return fruits[fruits.length - 2];
    }


    //Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int x = 0; x < ints.length; x++) {
            sum = sum + ints[x];
        }
        return sum;
    }


    //Question 7
    public static int getAverage(int[] ints) {
        int avg = 0;
        int sum = 0;
        for (int x = 0; x < ints.length; x++) {
            sum += ints[x];
            avg = sum / ints.length;
        }
        return avg;
    }


    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNumbers = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbers += numbers[i] + ", ";
            }
        }
        return oddNumbers;
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNumbers = " ";

      for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] % 2 == 0) {
              evenNumbers += numbers[i] + ", ";
          }
      }
        return evenNumbers;
    }


    //Question 10
    public static boolean contains(String[] names, String element) {
        for (int i = 0; i < names.length; i++) {
            if (element == names[i]) {
                return true;
            }
        }
        return false;
    }

    //Question 11
    public static int getIndexByElement(String[] fruits, String element) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == element) {
                return i;
            }
        }
        return -1; //-1 is default if element does not exist
    }


    // Question 12
    public static void printOddNumbersInRange(int start, int end) {
        System.out.print("#12: ");
        for (int x = start; x <= end; x++) {
            if (x % 2 != 0) {
                System.out.print(x + ", ");
            }
        }
        System.out.print("\n");
    }


    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String result = "";
        int x;
        for (x = 0; x < n; x++) {
            result += str+ " ";
        }
        return result;
    }


    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThree = "";
        for (int x = 0; x < n; x++){
            char letters = str.charAt(x);
            firstThree += letters;
        }
        return firstThree;
    }

    //Question 15
    public static int countWordsInString(String str){
        String [] strArray = str.split(" ");
        return strArray.length;
    }


    //Question 16
    public static int vowelsCounter(String str){
        int counter = 0;
        for (int x = 0; x < str.length() ; x++){
            char letter =str.charAt(x);
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U' ){
                counter++;
            }
        }
        return counter;
    }


    //Question 17
    public static String[] swap(String[] fruits){
        String [] swappedArray=fruits;
        String firstElementInSwappedArray = fruits[fruits.length-1];
        String lastElementInSwappedArray = fruits[0];
        swappedArray[0] = firstElementInSwappedArray;
        swappedArray[swappedArray.length - 1] = lastElementInSwappedArray;
        return swappedArray;
    }

    //question 18
    public static String replaceCharacters(String str) {
        str = str.replace('f', '7');
        str = str.replace('F', '7');
        str = str.replace('s', '$');
        str = str.replace('S', '$');
        str = str.replace('1', '!');
        str = str.replace('a', '@');
        str = str.replace('A', '@');

        return str;

    }


    //question 19
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String [] listOfWordsFromInput =  stringInput.split(" ");
        String stringResult = "";
        for (int i = 0; i<listOfWordsFromInput.length; i++){
            if((i+1) % 2 == 0){
                listOfWordsFromInput[i] = "Wu";
            }else if (((i+1) % 3 == 0)){
                listOfWordsFromInput[i] = "Tang";
            }
            stringResult += listOfWordsFromInput[i] + " ";
        }

        return stringResult;
    }


    //question 20
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        int number1 = 0;
        int number2 = 1;
        String listOfNums = number1 + " " + number2 + " ";

        int x = 0;
        while (x<maxnumber ){
            int number3 = number1+number2;
            number1 = number2;
            number2=number3;
            if(number3 >= maxnumber){
                break;
            }
            listOfNums += number3 + " ";
            x++;
        }
        return listOfNums;
    }


    public static void main(String[] args) {
        String []fruits = {"Apple", "Orange", "Banana", "Grapes", "Pineapple", "Mango", "Watermelon"};
        int []ints = {1,2,3,4,5,6};
        int []numbers = {11, 14, 23, 29, 55, 66, 100,};
        String str = "Hello my name is Tayyaba";
        System.out.println("#1: " + getLastIndex(fruits));
        System.out.println("#2: " + getSecondToLastIndex(fruits));
        System.out.println("#3: " + getFirstElement(fruits));
        System.out.println("#4: " + getLastElement(fruits));
        System.out.println("#5: " + getSecondToLastElement(fruits));
        System.out.println("#6: " + getSum(ints));
        System.out.println("#7: " + getAverage(ints));
        System.out.println("#8: " + extractAllOddNumbers(numbers));
        System.out.println("#9: " + extractAllEvenNumbers(numbers));
        System.out.println("#10: " + contains(fruits, "Apple"));
        System.out.println("#11: " + getIndexByElement(fruits, "Orange"));
        printOddNumbersInRange(3,9);
        System.out.println("#13: " + printGivenStringTimesNumberGiven("hey", 5));   ;
        System.out.println("#14: " + repeatFirstThreeLetters(str, 3));
        System.out.println("#15: " + countWordsInString(str));
        System.out.println("#16: " + vowelsCounter(str));
        System.out.println("#17: " + Arrays.toString(swap(fruits)));
        System.out.println("#18: " + replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
        System.out.println("#19: " + replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        System.out.println("#20: " + createStringOfFibonnaciUpToMax(30));
    }
}
