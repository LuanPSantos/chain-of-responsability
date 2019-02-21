package br.luan.handler;

import br.luan.SalarioDetalhe;

public class UltimaFaixaSalarioHandler implements FaixaSalarioHandler {
    @Override
    public SalarioDetalhe calculaSalario(double salarioBruto, FaixaSalarioHandler next) {
        return new SalarioDetalhe(salarioBruto, 0);
    }
}
