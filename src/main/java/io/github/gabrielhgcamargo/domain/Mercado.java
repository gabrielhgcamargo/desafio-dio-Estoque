package io.github.gabrielhgcamargo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class Mercado {
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private Set<Fornecedor> fornecedoresAtivos = new HashSet<>();
    private Set<NotaFiscal> notasFiscais = new LinkedHashSet<>();

    public Mercado(String nome, String cnpj, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

}
