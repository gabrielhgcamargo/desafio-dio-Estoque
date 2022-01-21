package io.github.gabrielhgcamargo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class NotaFiscal {

    private String lote;
    private LocalDate previsaoEntrega;
    private String nomeProduto;
    private int quantidade;

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "lote='" + lote + '\'' +
                ", previsaoEntrega=" + previsaoEntrega +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}


