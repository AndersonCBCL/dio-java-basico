public class Operadores7 {
    public static void main(String[] args){
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao);


        //No caso de nomes ao invés de números:
        String nomeUm = "ANDERSON";
        String nomeDois = "ANDERSON";
        
        System.out.println(nomeUm == nomeDois);

        String nomeTres = "ANDERSON";
        String nomeQuatro = new String("ANDERSON");
        // o resultado é false, pois está comparando um valor com um new String que é um objeto.. Diferença entre Stack e Rip (??)
        System.out.println(nomeTres == nomeQuatro);

        String nomeCinco = "ANDERSON";
        String nomeSeis = new String("ANDERSON");
        //Usando o metodo equals que compara os conteudos
        System.out.println(nomeCinco.equals(nomeSeis));

    }
    
}
