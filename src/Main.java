public class Main {
    public static void main(String[] args) {
        int ticketPrice = 23_500;
        int bonusTrack = 20;
        int MilesBonus = ticketPrice / bonusTrack;

        System.out.println("При покупке билета стоимостью " + ticketPrice + "руб., Ваш бонус составит " +MilesBonus + " бонусных миль.");
    }
}