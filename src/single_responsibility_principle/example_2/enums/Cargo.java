package single_responsibility_principle.example_2.enums;

import single_responsibility_principle.example_2.utility.DezOuVintePorCento;
import single_responsibility_principle.example_2.utility.QuinzeOuVinteCincoPorCento;
import single_responsibility_principle.example_2.utility.RegraDeCalculo;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTER(new QuinzeOuVinteCincoPorCento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
