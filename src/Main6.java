import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main6 {
    public static void main(String[] args) {

       String nome = "Ana";
        LocalDate hoje = LocalDate.now();
        System.out.println("Olá, "+nome+" hoje é " +hoje+" bom dia.");
        Locale brasil = new Locale("pt","br");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String dia = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        if(agora.getHour() >= 0 && agora.getHour() < 12){

            saudacao = "bom dia";
        }else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        }else{
            saudacao = "boa noite";
        }

        System.out.printf("olá, %s. hoje é %s, %s.", nome, dia, saudacao.toLowerCase());

    }
}