public class Dog implements Animal {

    @Override
    public int getAgeRequiredToBuy(){
        return 15;
    }

    @Override
    public void callSound() {
        System.out.println("Woff Woff!");
    }

    @Override
    public void tellThemHowDangerousIam() {
        System.out.println("I am not dangerous at all :)");
    }

    @Override
    public String getAnimalType() {
        return "Dog";
    }

    @Override
    public int getPriceForTheAnimal(){

        return 1000;
    }


}