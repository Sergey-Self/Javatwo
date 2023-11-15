public class main {
    public static void main(String[] args) {

        int amountTicket = 15_677; // Стоимость билета в рублях
        int amountOneMile = 20; // Количество рублей для получения одной бонусной мили

        int totalBonusMiles = amountTicket / amountOneMile; // Количество бонусных миль

        System.out.println("Количество бонусных миль: " + totalBonusMiles + ". Летайте с нами!");

    }
}
