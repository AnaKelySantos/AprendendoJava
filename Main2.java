
public class Main2 {
    public static void main(String[] args) {

        //System.out.println("olá,
        //boolean res = false;
       // System.out.println(res);

        //boolean res2 = true;
        //System.out.println(res2);

        boolean fimDeSemana = true;
        boolean fazendoSol = false;

        //operadores lógicos

        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println("sol"+vamosAPraia);

 boolean shopping = fimDeSemana || fazendoSol;
 System.out.println(shopping);

 //operador ternario

 String sms = fimDeSemana?"é fim de semana":"não é";
 System.out.println(sms);
    }
}