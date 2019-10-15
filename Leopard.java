public class Leopard implements Animal {


    @Override
    public int getAgeRequiredToBuy(){
        return 20;
    }

    @Override
    public void callSound() {
        System.out.println("Rooooar!!");
    }

    @Override
    public void tellThemHowDangerousIam() {
        System.out.println("Dont come near me otherwise I eat you!");
    }

    @Override
    public String getAnimalType() {
        return "Leopard";
    }

    @Override
    public int getPriceForTheAnimal(){
        return 50000;
    }

}