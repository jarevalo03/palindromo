import java.util.Objects;
import java.util.Scanner;

public class palindromo111 {




    public static void main(String[] args) {
        String palabra;
        Scanner Teclado = new Scanner(System.in);
        char [] palindromo1 ;
        int izq;
        int der;
        System.out.println("ingrese la palabra");
        palabra = Teclado.nextLine();
        while (Objects.equals(palabra, "")){
            System.out.println("no ha ingresado ninguna palabra");
            break;
        }
        palabra= palabra.toLowerCase();
        palabra= palabra.replace(" ","");
        palindromo1= palabra.toCharArray();
        izq=0;
        der = palindromo1.length - 1;
        while (izq<der){
            if(palindromo1[izq]== palindromo1[der]) {
                der --;
                izq ++;
            }
            else {
                System.out.println("la palabra no es un palindromo");
            break;
            }

        }
        if(izq== der){
            System.out.println("la palabra es un palindromo");
        }
    }
}
