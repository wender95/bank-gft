package bank.gft;

import java.util.*;

public class Agencia {

    public static final int NUMERO = 123;
    Set<Conta> contas = new LinkedHashSet<>();


    public Set<Conta> getContas() {
        return contas;
    }

    public int getNumero() {
        return NUMERO;
    }



    @Override
    public String toString() {
        return "Agencia{" +
                "contas=" + contas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return Objects.equals(contas, agencia.contas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contas);
    }
}
