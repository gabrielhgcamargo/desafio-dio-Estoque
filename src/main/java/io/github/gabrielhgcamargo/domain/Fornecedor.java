package io.github.gabrielhgcamargo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Data
public class Fornecedor {
    private String nome;
    private String cnpj;
    private Set<NotaFiscal> notasAtivas = new LinkedHashSet<>();
    private Set<NotaFiscal> notasEntregues = new LinkedHashSet<>();

    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void entregaFinalizada(){
        Optional<NotaFiscal> notaFiscal = this.notasAtivas.stream().findFirst();
        if(notaFiscal.isPresent()){
            this.notasEntregues.add(notaFiscal.get());
            this.notasAtivas.remove(notaFiscal.get());
        }
        else{
            System.out.println("A sua empresa não tem nenhuma nota ativa com nosso Mercado!");
        }
    }

    public void vincularNotaFornecedorMercado(Mercado mercado, Fornecedor fornecedor){
        this.notasAtivas.addAll(mercado.getNotasFiscais());
        mercado.getFornecedoresAtivos().add(this);
        mercado.getNotasFiscais().addAll(fornecedor.getNotasAtivas());
    };

}
