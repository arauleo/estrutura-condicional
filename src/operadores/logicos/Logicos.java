package operadores.logicos;

public class Logicos {
    public static void main(String[] args){
        //  && -> and, || -> or ou, ! -> not não.

        boolean resultadott = !true && true;
        boolean resultadotf = !true && false;
        boolean resultadoft = !false && true;
        boolean resultadoff = !false && false;

        System.out.println(resultadott);
        System.out.println(resultadotf);
        System.out.println(resultadoft);
        System.out.println(resultadoff);


    }
}
