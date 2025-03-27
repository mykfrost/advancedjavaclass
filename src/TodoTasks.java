import java.util.LinkedList;
import java.util.Scanner;

public class TodoTasks {
    public static void main(String[] args){
        LinkedList tasks = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n To-Do List Options");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3.View All Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an Option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 : // add a task
                    String task = scanner.nextLine();
                    tasks.add(task);// Add this task to our linked list
                    System.out.println("Task Added");
                    break;
                case 2: //Remove task
                    if(tasks.isEmpty()){
                        System.out.println("No Tasks to Remove. List is Empty");
                    }else {
                        System.out.println("Enter the task Number to complate (1 to"+tasks.size()+"):");
                        int index = scanner.nextInt() - 1 ;// task removed or completed
                        if(index >= 0 && index < tasks.size() ){
                            System.out.println("Task '"+ tasks.remove(index)+"'completed");
                        }else {
                            System.out.println("Invalid Task Number");
                        }
                    }break;
                case 3 : //View Tasks
                    if(tasks.isEmpty()){
                        System.out.println("No tasks Available. Empty List");
                    }else {
                        System.out.println("\n Your Tasks");
                        for(int  i = 0 ; i < tasks.size(); i++){
                            System.out.println((i+1)+"."+tasks.get(i));
                        }
                    }break;
                case 4 : // Exit
                    System.out.println("Exiting ...");
                    scanner.close();
                default:
                    System.out.println("Invalid Choice , Please try again");
            }
        }



    }
     public void  print(){
         System.out.println();
     }
}
