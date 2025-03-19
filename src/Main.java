import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll(); // returns the first customer in the que and also removes them from the queue
        c.serve();
    }

    public static class Customer{
        public boolean hasBeenServed ;
        private String name ;
        public   Customer(String name ){
            hasBeenServed = false;
            this. name = name ;
        }

        public void serve(){
            hasBeenServed = true;
            System.out.println(name + " Has been Served");
        }
        public String toString(){
            return name;
        }

    }
}