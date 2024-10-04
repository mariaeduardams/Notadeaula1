import java.util.Scanner;
public class Produto {

    private String nome;
    private double codigo;
    private double tamanhooupeso;
    private String cor;
    private double valor;
    private int estoque;
    private int pagamento;
    private int VerificarEstoque;
    private double ValorRecebido;


    public double getValorRecebido() {
        return ValorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        ValorRecebido = valorRecebido;
    }


    public int getVerificarEstoque() {
        return VerificarEstoque;
    }

    public void setVerificarEstoque(int verificarEstoque) {
        VerificarEstoque = verificarEstoque;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public double getTamanhooupeso() {
        return tamanhooupeso;
    }

    public void setTamanhooupeso(double tamanhooupeso) {
        this.tamanhooupeso = tamanhooupeso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void VerificarEstoque() {
        if (estoque > 0) {
            System.out.println("Produto disponivel em estoque");
        } else {
            System.out.println("Produto em falta");
        }
    }

    public void venda() {
        estoque -= 1;
        System.out.println("Estoque da produto: " + estoque);
    }

    public void exibirProduto() {
        venda();

        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Tamanhooupeso: " + tamanhooupeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: " + valor);
        System.out.println("Estoque: " + estoque);
    }

    public void Pagamento() {
        double troco = 0;
        Scanner sc = new Scanner(System.in);
        switch (pagamento) {
            case 1:
                System.out.println("Pagamento no Pix realizado com sucesso!");
                System.out.println("Valor do desconto foi de: " + valor * 0.05);
                break;
            case 2:
                System.out.println("Pagamento no Débido realizado com sucesso!");
                System.out.println("Valor do desconto foi de: " + valor * 0.05);
                break;
            case 3:
                System.out.println("Pagamento em Transferência realizado com sucesso!");
                System.out.println("Valor do desconto foi de: " + valor * 0.05);
                break;
            case 4:
                System.out.println("Qual o valor em espécie? ");
                double recebido = sc.nextDouble();
                troco = recebido - valor;
                System.out.println("O troco foi de: " + troco);
                System.out.println("Pagamento em Espécie realizado com sucesso!");
                System.out.println("Valor do desconto foi de: " + (valor * 0.05));
                break;
            case 5:
                System.out.println("Deseja parcelar em 3x? (sim ou não?)");
                char parcelar = sc.next().charAt(0);
                if (parcelar == 's' || parcelar == 'S') {
                    double valorParcela = valor / 3;
                    System.out.printf("Valor de cada parcela: %.2f\n", valorParcela);
                    System.out.println("Total a pagar em 3x: " + valor);
                    System.out.println("Pagamento no crédito realizado com sucesso!");
                    break;
                }
        }
    }
}
