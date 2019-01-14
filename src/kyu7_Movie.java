/*My friend John likes to go to the cinema. He can choose between system A and system B.

System A : buy a ticket (15 dollars) every time
System B : buy a card (500 dollars) and every time
    buy a ticket the price of which is 0.90 times the price he paid for the previous one.

#Example: If John goes to the cinema 3 times:

System A : 15 * 3 = 45
System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90 ( = 536.5849999999999, no rounding for each ticket)

John wants to know how many times he must go to the cinema so that the final result of System B, when rounded up to the next dollar, will be cheaper than System A.

The function movie has 3 parameters: card (price of the card), ticket (normal price of a ticket), perc (fraction of what he paid for the previous ticket) and returns the first n such that

ceil(price of System B) < price of System A.

More examples:

movie(500, 15, 0.9) should return 43
    (with card the total price is 634, with tickets 645)
movie(100, 10, 0.95) should return 24
    (with card the total price is 235, with tickets 240)
*/

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
