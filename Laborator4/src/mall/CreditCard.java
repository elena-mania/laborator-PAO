package mall;

public record CreditCard(String name) implements BankCard{
    private static double spentAmount=0;
    @Override
    public void doTransaction(double amount){
            System.out.println( "Utilizator " + name + " a cheltuit " + amount);
            spentAmount+=amount;
        System.out.println( "Suma totala cheltuita cu carduri de debit este " + spentAmount);
    }
}
