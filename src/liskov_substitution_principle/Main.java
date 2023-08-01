package liskov_substitution_principle;

public class Main {

    public static void main(String[] args) throws Exception {
//        CrediCard card = new CrediCard();
//        DebitCard card = new DebitCard();
        NubankRewards card = new NubankRewards();

        card.validate();
        card.collectPayment();
    }
}
