import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ZooShop shop = new ZooShop();
        Animal[] animals = new Animal[4];

        animals[0] = new Leopard();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();

        for (Animal animal : animals) {
            shop.addAnimalToCollection(animal);
        }
        System.out.println("Hello and welcome to the store!");
        System.out.println();


        Human human1 = new Human();
        System.out.println(("My name is " + human1.getHumanName() + ", I am  " + human1.getAgeOfTheHuman() + ", And I have " + human1.showAmountOfMoneyInWallet() + " Euros"));
        System.out.println();
        shop.greetCustomer(human1.getHumanName());

        shop.ProvideCustomerWithChoices();


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("leopard") || input.equals("Leopard")) {

            human1.NotScaredAtAll();

            if (shop.startTheBuyingProcess(animals[0], human1) == false || shop.checkIfUserHasMoneyToBuyAnimal(animals[0],human1) == false) {

                shop.AskCustomerIfHeWantsToBuyAdog();
                sc = new Scanner(System.in);
                input = sc.nextLine();

                if (input.equals("yes")) {
                    if(shop.startTheBuyingProcess(animals[1], human1) == false || shop.checkIfUserHasMoneyToBuyAnimal(animals[1],human1) == false){

                        shop.SayByeToCustomer();
                    }

                }
                else if(input.equals("no")){
                    shop.SayByeToCustomer();
                }

            }
        }

        else if(input.equals("dog") || input.equals("Dog")){
            if(shop.startTheBuyingProcess(animals[1], human1) == false || shop.checkIfUserHasMoneyToBuyAnimal(animals[1],human1) == false){

                shop.SayByeToCustomer();
            }
        }
    }
}
