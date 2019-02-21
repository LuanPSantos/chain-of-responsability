package br.luan;

import br.luan.handler.PrimeiraFaixaSalarioHandler;
import br.luan.handler.SegundaFaixaSalarioHandler;

public class CalculadoraSalarioLiquido {

    public SalarioDetalhe calcula(double salarioBruto){
        return new PrimeiraFaixaSalarioHandler().calculaSalario(salarioBruto, new SegundaFaixaSalarioHandler());
    }
}
