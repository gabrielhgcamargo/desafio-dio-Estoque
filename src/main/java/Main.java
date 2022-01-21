import io.github.gabrielhgcamargo.domain.Endereco;
import io.github.gabrielhgcamargo.domain.Fornecedor;
import io.github.gabrielhgcamargo.domain.Mercado;
import io.github.gabrielhgcamargo.domain.NotaFiscal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Instanciação de um Mercado
        Endereco endereco = new Endereco("Rua Bem-te-vi",120,"Jd Dos Anjos","São Paulo","SP");
        Mercado mercado = new Mercado("MercadinDuZé","364458458785",endereco);

        // Intanciação de um Fornecedor
        Fornecedor fornecedor = new Fornecedor("Atacadista","744454546566");

        // Emissão da Nota Fiscal
        NotaFiscal notaFiscal = new NotaFiscal("A12", LocalDate.now(),"Bolacha Nestle",100);
        fornecedor.getNotasAtivas().add(notaFiscal);

        // Vinculando todas as Notas Fiscais ativas com o Mercado
        fornecedor.vincularNotaFornecedorMercado(mercado, fornecedor);

        // Print Notas de Pedidos não entregues e Notas Finalizadas
        System.out.println("Notas em aberto = " + fornecedor.getNotasAtivas());
        System.out.println("Notas finalizadas (Notas Entregues) = " + fornecedor.getNotasEntregues());

        //Finalizando uma nota fiscal
        fornecedor.entregaFinalizada();
        System.out.println("Notas finalizadas (Notas Entregues) = " + fornecedor.getNotasEntregues());

        // Exibir os Fornecedores vinculados ao Mercado e suas Notas Fiscais
        System.out.println(mercado.getFornecedoresAtivos());


    }

}
