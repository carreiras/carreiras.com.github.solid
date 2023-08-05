package dependency_inversion_principle;

import dependency_inversion_principle.payment.Payment;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("250");
    }
}
