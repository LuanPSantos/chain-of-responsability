package br.luan.handler;

import br.luan.SalarioDetalhe;

public class SegundaFaixaSalarioHandler implements FaixaSalarioHandler{
    @Override
    public SalarioDetalhe calculaSalario(double salarioBruto, FaixaSalarioHandler next) {
        if(salarioBruto > 1_903.98d && salarioBruto <=  2_826.65d){
            return new SalarioDetalhe(salarioBruto * 0.925, salarioBruto * 0.075);
        }

        return next.calculaSalario(salarioBruto, new TerceiraFaixaSalarioHandler());
    }
}
