import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem Vindo(a) à Calculadora de IMC\nAntes de Começar, Forneça algumas informações:  ");

        System.out.print("Digite seu nome: ");
        pessoa.setNome(scan.nextLine());

        System.out.print("Digite seu idade: ");
        pessoa.setIdade(scan.nextInt());

        System.out.print("Digite sua Altura: ");
        pessoa.setAltura(scan.nextDouble());

        System.out.print("Digite seu peso: ");
        pessoa.setPeso(scan.nextDouble());


        System.out.println("ok, Estou executando os Cálculos...\n");
        pessoa.calculaImc();

        System.out.println("O IMC de "+pessoa.getNome() + " com " +pessoa.getIdade()+ " é de: " + pessoa.getImc());

        System.out.println(pessoa.classificaImc());

        System.out.println(pessoa);
    }
}