import mall.CreditCard;
import mall.DebitCard;
import mall.ShoppingMall;

public class Application {
    public static void main(String[] args) {
        ShoppingMall mall= new ShoppingMall();
        DebitCard card1 = new DebitCard("Maria",999.9);
        CreditCard card2 = new CreditCard("Ana");

        System.out.println("Exemplu plata cu card de Debit: \n");
        mall.initializareCard(card1);
        mall.achizitie(45.90);
        mall.achizitie(100);

        System.out.println("\n");

        System.out.println("Exemplu plata cu card de Credit: \n");
        mall.initializareCard(card2);
        mall.achizitie(70.48);
        mall.achizitie(129.9);


    }
}