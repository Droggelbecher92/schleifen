public class Schleifen {

    public static void main(String[] args) {
        drinkBeer(5);
    }

    public static void drinkBeer(int amountOfBeer){
        for (int i = 0; i < amountOfBeer;i += 2) {
            System.out.println("Ich trinke ein Bier, Prost "+i);
        }
        System.out.println("Bier leer");
    }

}
