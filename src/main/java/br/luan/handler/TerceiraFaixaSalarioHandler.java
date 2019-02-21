package br.luan.handler;

import br.luan.SalarioDetalhe;

public class TerceiraFaixaSalarioHandler implements FaixaSalarioHandler{
    @Override
    public SalarioDetalhe calculaSalario(double salarioBruto, FaixaSalarioHandler next) {
        if(salarioBruto > 2_826.65d && salarioBruto <=  3_751.05){
            return new SalarioDetalhe(salarioBruto * 0.85, salarioBruto * 0.15);
        }

        return next.calculaSalario(salarioBruto);
    }
}
