public class Interface_Example {
    public static void main(String[] args){
        Animal myDog = new Dog();
        myDog.makeSound();
    }

    interface Animal{
        void makeSound();
    }

    public static class Dog implements Animal{
        public void makeSound(){
            System.out.println("Woof Woof");
        }
    }

}
