package liskov_substitution_principle;

import javax.sound.midi.Soundbank;

public class DebitCard extends NubankCard{

    @Override
    public void validate() throws Exception {
        System.out.println("Verificando saldo!");
        System.out.println("Saldo disponível!");
    }
}
