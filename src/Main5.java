
public class Main5 {
    public static void main(String[] args) {

        String nome = "Ana";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "ana"; //como se fosse o idêntico
        System.out.println(nome.equals(nomeOutro));

        System.out.println(nome.equalsIgnoreCase(nomeOutro)); // como se foss o ==

    }
}