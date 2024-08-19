package Atividade03_ManipulacaoVariavel;

import java.text.DecimalFormat;

public class Atividade03_ManipulacaoVariavel {
    public static void main(String[] args) {
        
        String nomeProduto = "salgadinho Doritos 160g";
        double precoProduto = 5.39;
        int produtosComprados = 67;
        double impostoProduto = 0.55;
        double margemLucro = 0.50;

        double quantiaComprada = precoProduto * produtosComprados;
        double impostoSobreProduto = precoProduto * impostoProduto;
        double lucroVenda = precoProduto * margemLucro;

        double precoVenda = precoProduto + impostoSobreProduto + lucroVenda;

        DecimalFormat df = new DecimalFormat("#.00");
        DecimalFormat df2 = new DecimalFormat("#.00");

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Preço do produto: R$" + precoProduto);
        System.out.println("produtos comprados: " + produtosComprados);
        System.out.println("Imposto em % do produto: %" + df2.format(impostoProduto * 100));
        System.out.println("Imposto sobre o produto: R$" + df2.format(impostoSobreProduto));
        System.out.println("Margem de lucro em % : %" + df2.format(margemLucro * 100));
        System.out.println("Lucro sobre a venda: R$" + df2.format(lucroVenda));
        

        System.out.println("Preço de venda de " + nomeProduto + ": R$" + df2.format(precoVenda));

    }
    
}
