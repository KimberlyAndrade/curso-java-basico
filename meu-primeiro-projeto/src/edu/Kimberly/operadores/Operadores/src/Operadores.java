public class Operadores {
    public static void main(String[] args) throws Exception {
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = numero*-1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(variavel);
        variavel = !true;
        System.out.println(variavel);

        //ternarios

        int a, b;
        a = 3;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);

        //relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        String nomeUm = "KIMBERLY";
        String nomeDois = "KIMBERLY";

        System.out.println(nomeUm.equals(nomeDois));

        //lógicos

        boolean condicao1 = true;
        boolean condicao2 = true;
        
        if (condicao1 && condicao2) {
            System.out.println("as duas condicoes sao verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("uma das condicoes sao verdadeiras");
        }
    }
}
