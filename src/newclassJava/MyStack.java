package newclassJava;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args){
        Stack stack = new Stack();

        System.out.print("Please ENter A list of what you like");
        Scanner likes = new Scanner(System.in);

        for(int i = 1; i <= 10 ;i++){
            String entry = likes.nextLine();
            stack.push(entry);
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
            System.out.println(",");
        }
        System.out.println("Loops Finished");
    }
}
