public class Operadores6 {
    public static void main(String[] args) throws Exception {
        int a, b;

        a = 5;
        b= 6;

        //String resultado = "";
        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";

        String resultado = a==b ? "verdadeiro" : "falso";
        //a==b -> Expressão booleana
        //true ou false

        System.out.println(resultado);

        //outra opção:
        int resultado1 = a == b ? 1 : 0;

        System.out.println(resultado1);

    }
}
