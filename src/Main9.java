import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {

      //vetores
      
      String[] letras = new String[4];
      letras[0] = "a";
      letras[1] = "b";
      letras[2] = "c";
      letras[3] = "d";

      for(int i = 0; i < letras.length; i++){
        System.out.println(letras[i]);
      }

      String teste[] = {"f","j","k","l","m"};
      for(int i = 0; i < teste.length; i++){
        System.out.println(teste[i]);
      }

      System.out.println(Arrays.toString(letras));

    }
}