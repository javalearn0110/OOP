package main.java.ru.sibintek.oop.examples.initialization;

class Blocks {
    private int amount = 4;
    {
        System.out.println("Inside Anonymous Block2");
    }

    //creating an anonymous blocks
    {
        System.out.println("Inside Anonymous Block");
        amount += 1;
        System.out.println("Amount value " + amount);
    }

    //creating a static block
    static {
        System.out.println("Inside Static Block");
    }

    //creating constructor of class
    Blocks() {
        System.out.println("Inside Constructor");
    }
}

class OrderOfExecution {
    //creating an object of class blocks
    public static void main(String args[]) {
        Blocks obj = new Blocks();
        System.out.println("**************");
        //creating another object of class Blocks
        Blocks obj1 = new Blocks();
    }
}
