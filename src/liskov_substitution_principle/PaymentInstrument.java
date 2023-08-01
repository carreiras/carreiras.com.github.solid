package liskov_substitution_principle;

public interface PaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
