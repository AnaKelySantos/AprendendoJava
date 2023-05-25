import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main6 {
    public static void main(String[] args) {

       String nome = "Ana";
        LocalDate hoje = LocalDate.now();
        System.out.println("Olá, "+nome+" hoje é " +hoje+" bom dia.");
        Locale brasil = new Locale("pt","br");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

    }
}