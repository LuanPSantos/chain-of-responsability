package br.luan.handler;

import br.luan.SalarioDetalhe;

public interface FaixaSalarioHandler {

    SalarioDetalhe calculaSalario(double salarioBruto, FaixaSalarioHandler next);

    default SalarioDetalhe calculaSalario(double salarioBruto){
        return calculaSalario(salarioBruto, new UltimaFaixaSalarioHandler());
    }

}
