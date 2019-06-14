package structural.dependencyinjection.ex1;

public class Client {

    public static void main(String args[]){

        String popcorn1 = ShoppingMall.getPopCorn("butterpopcorn",2);
        System.out.println("I got "+popcorn1);

        String popcorn2 = ShoppingMall.getPopCorn("chocopopcorn",5);
        System.out.println("I got "+popcorn2);
    }
}
