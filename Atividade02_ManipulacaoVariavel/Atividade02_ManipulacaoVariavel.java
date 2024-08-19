package Atividade02_ManipulacaoVariavel;

public class Atividade02_ManipulacaoVariavel {
    public static void main(String[] args) {
        

        //Informações primarias
    String nome = "Pedro";
    int idade = 21;
    int mesesTrbalhados = 13;
    int produtosComprados = 26;
    int valorProdutosMedio = 400;
    double salarioBruto = 2100.50;
    double descontoMensal = 600;

    //Operações com base nas informações primarias obtidas
    double salarioAnualBruto = salarioBruto * 12;
    double descontoAnual = descontoMensal * 12;
    double salarioAnualLiquido = salarioAnualBruto - descontoAnual;
    int produtosGastos = produtosComprados * valorProdutosMedio;
    double sobra = salarioAnualLiquido - produtosGastos;

    //Exibe as informações ao usuario
    System.out.println("Seja bem vindo ao seu controle de gastos " + nome + "!");
    System.out.println("Seu salario anual líquido é R$" + salarioAnualLiquido + "!");
    System.out.println("Você gastou R$" + produtosGastos + " com produtos nesse periodo");
    System.out.println("Por isso sobrou apenas R$" + sobra + " do seu salario líquido anual!");
    System.out.println("Salário Bruto R$" + salarioBruto);
    System.out.println("Desconto Mensal R$" + descontoMensal);
    System.out.println("Desconto anual R$" + descontoAnual);
    System.out.println("Salário anual Bruto R$" + salarioAnualBruto);
    System.out.println("Gasto médio com produtos R$" + valorProdutosMedio);
    System.out.println("Quantidade de produtos comprados: " + produtosComprados);


    
     }


}
