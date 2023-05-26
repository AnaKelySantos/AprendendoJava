import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {

      //vetores
      

      int numTeste[] = {5,8,6,7,7,6,4,8,9};
     
      int maior = numTeste[0];
      int menor = numTeste[0];
      int media= 0;

      for(int i=0; i < numTeste.length; i++){
        if (numTeste[i]>maior) {

          maior = numTeste[i];
          
        }

        if (numTeste[i]< menor) {

          menor = numTeste[i];
          
        }

        media+= numTeste[i];

      }

      System.out.println("Maior: " + maior);
      System.out.println("Menor: " + menor);
      System.out.println("Media: " + media/numTeste.length);

    }
}