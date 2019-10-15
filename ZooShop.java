import java.util.ArrayList;

public class ZooShop {

    public int moneyInTheBank = 0;

    public String name;

    private ArrayList<Animal> collectionOfAnimals;


    public ZooShop() {
        name = "Vlori`s shop";
        collectionOfAnimals = new ArrayList<>();
    }


    public void addAnimalToCollection(Animal animal) {
        collectionOfAnimals.add(animal);
    }


    public void removeAnimalByIndex(int index) {
        collectionOfAnimals.remove(index);
    }


    public int howManyAnimalsAreForSale() {
        System.out.println("There are currently " + collectionOfAnimals.size() + " Animal for sale");
        whatTypeOfAnimals();
        return collectionOfAnimals.size();
    }

    public void whatTypeOfAnimals() {
        System.out.println("Type of animals we have available: ");
        for (Animal animal : collectionOfAnimals) {
            System.out.println(animal.getAnimalType());

        }
        showPriceofAnimals();
    }

    public void ProvideCustomerWithChoices() {
        System.out.println("Do you want to buy? a dog or a leopard?");
    }

    public void AskCustomerIfHeWantsToBuyAdog() {
        System.out.println("Since you can not buy a leopard, do you want to buy a dog instead?");
    }

    public boolean checkIfUserHasMoneyToBuyAnimal(Animal animal, Human human) {
        System.out.println("Ok lets check how much money you have");
        int priceOfTheAnimal = animal.getPriceForTheAnimal();

        int budgetOfCustomer = human.showAmountOfMoneyInWallet();
        if (priceOfTheAnimal > budgetOfCustomer) {
            System.out.println("Sorry, you dont have enough money!");

            return false;

        } else {
            sellAnimal(animal, human);
            return true;
        }
    }



    public void removeAnimalFromZooShop(Animal animal) {
        collectionOfAnimals.remove(animal);
        System.out.println();
    }

    public void sellAnimal(Animal animal, Human human) {
        System.out.println();
        System.out.println("Starting the cash process");
        System.out.println();
        int priceOfTheAnimal = animal.getPriceForTheAnimal();

        int receiveMoneyFromCustomer = human.payPriceForTheAnimal(priceOfTheAnimal);
        addMoneyToBank(priceOfTheAnimal);


        human.addAnimalToPrivateBasket(animal);

        removeAnimalFromZooShop(animal);

        ThankCustomerForTheDeal(animal, human);
    }


    public void showMoneyFromBank() {
        System.out.println("Money in the bank: " + moneyInTheBank);
    }

    public int addMoneyToBank(int money) {
        moneyInTheBank += money;
        System.out.println("ZooShop received " + money);
        System.out.println();
        System.out.println("Money in the bank now: " + moneyInTheBank);
        return moneyInTheBank;
    }






    public void greetCustomer(String human) {
        System.out.println("Welcome to the shop " + human + "!");
        howManyAnimalsAreForSale();

    }

    public void ThankCustomerForTheDeal(Animal animal, Human human) {
        System.out.println();
        System.out.println("Thanks for the deal " + human.getHumanName() + ", take care of your " + animal.getAnimalType());
        SayByeToCustomer();
    }

    public void SayByeToCustomer() {
        System.out.println("Have a nice day, bye!");
        System.exit(0);

    }


    public void showPriceofAnimals() {
        System.out.println();
        System.out.println("Price of an Leopard is: 50000 Euro`s");
        System.out.println("Price of an Leopard is: 1000  Euro`s");
        System.out.println();

    }


    public boolean startTheBuyingProcess(Animal animal, Human human) {
        if(animal.getAnimalType() == "Leopard"){
            System.out.println("You want to buy a leopard? Damn, you have balls of steel!");
        }
        if(animal.getAnimalType()== "Dog"){
            System.out.println("Having dog as a pet is more comfortable than having a leopard");
        }
        System.out.println("Ok lets check if your old enough");
        int requiredAgeForThisAnimal = animal.getAgeRequiredToBuy();
        int humanAge = human.getAgeOfTheHuman();

        System.out.println();

        if (humanAge >= requiredAgeForThisAnimal) {
            System.out.println("Yes, you are old enough, thats good!");

            return true;
        } else  {
            System.out.println("Sorry, you are not old enough");
            return false;
        }

    }

}


















