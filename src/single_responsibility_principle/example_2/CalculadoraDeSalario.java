package single_responsibility_principle.example_2;

import static single_responsibility_principle.example_2.Cargo.*;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new DezOuVintePorCento().calcula(funcionario);
        }

        if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            return new QuinzeOuVinteCincoPorCento().calcula(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }
}
