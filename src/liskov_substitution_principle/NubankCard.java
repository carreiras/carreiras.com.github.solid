package liskov_substitution_principle;

public abstract class NubankCard implements PaymentInstrument {

    @Override
    public void validate() throws Exception {
        // validação básica
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado");
    }
}
