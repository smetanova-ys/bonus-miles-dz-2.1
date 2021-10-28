public class Main {
    public static void main(String[] args) {
        int ticketPrice = 37525;
        int amountPerMile = 20;

        int amountBonusMiles = ticketPrice / amountPerMile;
        System.out.println("Количество бонусных миль: " + amountBonusMiles);
    }
}
