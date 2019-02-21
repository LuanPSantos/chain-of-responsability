package br.luan.handler;

import br.luan.SalarioDetalhe;

public class PrimeiraFaixaSalarioHandler implements FaixaSalarioHandler {

    @Override
    public SalarioDetalhe calculaSalario(double salarioBruto, FaixaSalarioHandler next) {
        if(salarioBruto <= 1_903.98d){
            return new SalarioDetalhe(salarioBruto, 0);
        }

        return next.calculaSalario(salarioBruto, new SegundaFaixaSalarioHandler());
    }
}
