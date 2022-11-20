package Exercício01;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        System.out.println("Exercício Mensagem");
        Mensagens.obterMensagem(9);
        Mensagens.obterMensagem(14);
        Mensagens.obterMensagem(2);

        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
    
}
