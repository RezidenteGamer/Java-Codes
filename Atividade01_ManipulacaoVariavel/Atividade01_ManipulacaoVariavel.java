package Atividade01_ManipulacaoVariavel;
public class Atividade01_ManipulacaoVariavel{
public static void main(String[] args) {

   int idade1 = 18;
   int idade2 = 26;
   double altura = 1.79;
   String nome = "Bruno";
   boolean estudante = true;

   int somaIdade = idade1 + idade2;
   double multAltura = altura * 2;

   System.out.println("Olá " + nome);
   System.out.println("Idade 1: " + idade1);
   System.out.println("Idade 2: " + idade2);
   System.out.println("Altura: " + altura);
   System.out.println("Estudante?: " + estudante);
   System.out.println("Soma das idades: " + somaIdade);
   System.out.println("Sua altura se fosse o dobro: " + multAltura);
  
  }
}