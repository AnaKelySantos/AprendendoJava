
public class Main4 {
    public static void main(String[] args) {
        String grad = "G";
        int nota = 75;
if (nota>= 80) {
         grad = "A";
    System.out.println("A");
    
} else if(nota>=70){
     grad = "B";
    System.out.println("B");
    
}else if (nota>=60) {
     grad = "C";
    System.out.println("c");
}else {
     grad = "D";
System.out.println("d");    
}

switch (grad) {
    case "A":
    case "B":
    case "C":

    System.out.println("aprovado");
        
        break;

        case "D":
        System.out.println("reprovado");
    default:
        break;
}
    }
}