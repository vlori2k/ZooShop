import java.util.ArrayList;

public class Human {

    private String HumanName;

    public int AgeOfTheHuman;

    public int MoneyBudget;

    public ArrayList<Animal> humansCollectionOfAnimals;

    public Human(){
        HumanName = "vlori";
        AgeOfTheHuman = 20;
        MoneyBudget = 5555;
        humansCollectionOfAnimals = new ArrayList<>();
    }


    public Human(String NameOfTheMan, int howOld, int howMuchMoney) {

        HumanName = NameOfTheMan;
        AgeOfTheHuman = howOld;
        MoneyBudget = howMuchMoney;

    }

    public void setNameOfHuman(String Name) {
        this.HumanName = Name;
    }

    public void setAgeOfTheHuman(int age) {
        this.AgeOfTheHuman = age;
    }

    public void setMoneyBudget(int howMuchMoney) {
        this.MoneyBudget = howMuchMoney;
    }

    public String getHumanName() {
        return HumanName;
    }

    public int getAgeOfTheHuman() {
        return AgeOfTheHuman;
    }

    public int showAmountOfMoneyInWallet() {
        return MoneyBudget;
    }

    public int payPriceForTheAnimal(int priceForAnimal){
    MoneyBudget = MoneyBudget - priceForAnimal;
    System.out.println(HumanName+"`s budget is now : " + MoneyBudget);
    return MoneyBudget;
    }


    public void NotScaredAtAll(){
        System.out.println();
        System.out.println("I want to buy a Leopard!");
    }

    public void addAnimalToPrivateBasket(Animal animal) {
        humansCollectionOfAnimals.add(animal);
    }

    public void showMyAnimals(){
        System.out.println(HumanName+"`s animals:");
        for (Animal animal : humansCollectionOfAnimals) {
            System.out.println(animal.getAnimalType());
        }

    }


}