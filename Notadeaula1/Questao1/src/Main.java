import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a nota 1:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3:");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;


        if(media >= 7){
            System.out.println("Parabéns, você foi APROVADO! média:" + media);

        } else if (media < 4) {
            System.out.println("Parabéns você foi REPROVADO! media:" + media );

        }else{
            System.out.println("FINAL! média:" + media);
        }

        sc.close();

    }
}