package datastructures.codealongandnotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //arrays are a fixed size...size cannot be changed once initialized
        //deleting arrays is tricky as there is no built in method to remove elements from an array
        //indexes start at 0
    String[] icecreamFlavors = new String[5];
    icecreamFlavors[0]= "Chocolate";
    icecreamFlavors[1] = "Vanilla";
    icecreamFlavors[2] = "Cookies and Cream";
    icecreamFlavors[3]= "Strawberry";
    System.out.println(icecreamFlavors[2]);
        //use Arrays.toString to print array as string
        System.out.println(Arrays.toString(icecreamFlavors));
        //index position 4 is null because I have not assigned it a value yet

        //once array has been initialized/defined, size cannot be changed
        //.length is a property of arrays
        int [] numbers = {0,9,30,80,4};
        for (int i = numbers.length-1; i >=0; i--){
            System.out.println(numbers[i]);
        }

        for (String icecreams : icecreamFlavors){
            System.out.println(icecreams);
        }

        //::println is method reference
        Arrays.stream(icecreamFlavors).forEach(System.out::println);


        //2D ARRAYS
        //syntax: [row size] [column size]
        //this is called nested for loop
        char[][] board = new char [3][3];
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col<board[row].length; col++){
                board[row][col] = '-';
            }
        }
        //Arrays.deepToString for 2D arrays
        System.out.println(Arrays.deepToString(board));

        //replacing only first column
        for(int row = 0; row< board.length; row++){
            for (int col = 0; col<board[row].length; col++){
                board[row][0]='X';
            }
        }
        System.out.println(Arrays.deepToString(board));


        //another way of creating 2D arrays
        char[][] boardTwo = new char[][]{
                new char[]{'O', '-', '-'},
                new char[]{'O', '-', '-'},
                new char[]{'O', '-', '-'}};

        System.out.println(Arrays.deepToString(boardTwo));



        //lists are dynamic (not fixed) and have methods to remove any index at any element
        //needs to be imported
        //List is an interface which extends Collection
        //between the diamond brackets should be generic class type
        List<String> fruits = new ArrayList<>();
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Peach");
        fruits.add("Watermelon");
        System.out.println(fruits);
        System.out.println(fruits.contains("Peach"));
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        //unchangedable list if using List.of
        //immutable
        List<String> fruitsUnmodifiable = List.of("Mango", "Peach");
        //gives immutable error:
                //fruitsUnmodifiable.add("banana");


        //continue from 37:20
        //https://www.youtube.com/watch?v=8MmMm2-kJV8
    }
}
