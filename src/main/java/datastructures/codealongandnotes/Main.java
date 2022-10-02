package datastructures.codealongandnotes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //arrays are a fixed size...size cannot be changed once initialized
        //deleting arrays is tricky as there is no built in method to remove elements from an array
        //indexes start at 0
        String[] icecreamFlavors = new String[5];
        icecreamFlavors[0] = "Chocolate";
        icecreamFlavors[1] = "Vanilla";
        icecreamFlavors[2] = "Cookies and Cream";
        icecreamFlavors[3] = "Strawberry";
        System.out.println(icecreamFlavors[2]);
        //use Arrays.toString to print array as string
        System.out.println(Arrays.toString(icecreamFlavors));
        //index position 4 is null because I have not assigned it a value yet

        //once array has been initialized/defined, size cannot be changed
        //.length is a property of arrays
        int[] numbers = {0, 9, 30, 80, 4};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        for (String icecreams : icecreamFlavors) {
            System.out.println(icecreams);
        }

        //::println is method reference
        Arrays.stream(icecreamFlavors).forEach(System.out::println);


        //2D ARRAYS
        //syntax: [row size] [column size]
        //this is called nested for loop
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '-';
            }
        }
        //Arrays.deepToString for 2D arrays
        System.out.println(Arrays.deepToString(board));

        //replacing only first column
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][0] = 'X';
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
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //unchangedable list if using List.of
        //immutable
        List<String> fruitsUnmodifiable = List.of("Mango", "Peach");
        //gives immutable error:
        //fruitsUnmodifiable.add("banana");


        //stack uses last in first out for methods
        //current method running is on the top of the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //peek method allows u to see the method at the top of the stack
        System.out.println(stack.peek());
        //pop will remove it from the stack
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        //queue uses first in first out method
        Queue<String> candy = new LinkedList<>();
        candy.add("KitKat");
        candy.add("Dots");
        candy.add("Hersheys");
        candy.add("Skittles");
        //peek shows first element added
        System.out.println(candy.peek());
        //poll removes first element
        candy.poll();
        System.out.println(candy.peek());


        //linkedlist head has nodes to next element...uses alot of memory even tho memory is usually not an issue these days
        //add element adds a new node to the tail
        //has addFirst and addLast methods
        //duplicates are allowed
    LinkedList<String> animals = new LinkedList<>();
    animals.add("Bunny");
    animals.add("Bird");
    animals.add("Cat");
    //iterator method
    ListIterator<String> animalsIterator = animals.listIterator();
    //loop from begining to end
    while (animalsIterator.hasNext()){
        System.out.println(animalsIterator.next());
    }
        System.out.println("========");
    //loop from end to beginning
    while (animalsIterator.hasPrevious()){
        System.out.println(animalsIterator.previous());
    }

        System.out.println("==========");
    //sets: order is not guaranteed, therefore no duplicates allowed
        //treeset has order
        Set<String> colors = new HashSet<>();
    colors.add("Pink");
    colors.add("Yellow");
    colors.add("Blue");
    colors.add("Orange");
    colors.add("Green");
    //size is still 5 because duplicates are not allowed
    colors.add("Green");
    //after ::, write a method/action
    colors.forEach(System.out::println);
    System.out.println(colors.size());
    colors.remove("Blue");
    colors.forEach(System.out::println);


    System.out.println("=================");

    //map is a collection of key-value pairs
    //nulls are only allowed in hashmaps and linked hashmaps
    //a map cannot contain duplicate keys
    //each key can map to ONLY 1 value
    Map<String, Integer> people = new HashMap<>();
    people.put("Tayyaba", 20);
    people.put("Palwasha", 20);
    people.put("Saera", 19);
    //overrides original value
    people.put("Palwasha", 1);
    System.out.println(people);
    System.out.println(people.keySet());
    //nulls allowed in hashmap
    System.out.println(people.get("Aisha"));



    }
}




