public class kyu7_Movie {
    public static void main(String[] args) {
        int card = 500;
        int ticket = 15;
        double perc = 0.9;
        movie(card,ticket,perc);
    }

    public static int movie(int card, int ticket, double perc) {
        int n = 0;
        double priceTicket;
        double priceCard;
        double temp = 0;
        double roundPriceCard;

        do {
            n++;
            priceTicket = ticket * n;
            temp = temp + (ticket * Math.pow(perc, n));
            priceCard = card + temp;
            roundPriceCard = Math.ceil(priceCard);
        } while (priceTicket <= roundPriceCard);
        System.out.printf("How many times I have to go to the cinema: " + n);
        return n;
    }
}
