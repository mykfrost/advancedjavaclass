package newclassJava;

import com.sun.corba.se.impl.oa.toa.TOA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQue {
    public static void main(String[] args){
        Queue<String> myQue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter Your list of Que");
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Value Number "+(i+1));
            String lists = input.nextLine();
            myQue.add(lists);
        }
        System.out.print(myQue);
        String top = myQue.peek();
        System.out.print("TOP OF THE LIST IS "+ top);


    }
}
