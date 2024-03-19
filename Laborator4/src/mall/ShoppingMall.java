package mall;

public class ShoppingMall {
    BankCard card;

    public void initializareCard(BankCard card) {
        this.card = card;
    }

    public void achizitie(double amount){
        card.doTransaction(amount);
    }
}
