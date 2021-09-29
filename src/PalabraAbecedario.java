import java.util.Scanner;

public class PalabraAbecedario {
    static String cadena1="Defino", cadena2="cebos",texto;
    static Scanner in=new Scanner(System.in);
    //static int valor1,valor2;
    public static void main(String[] args) {
      //abecedario(cadena1);
        abecedario();
    }
    public static void abecedario(){
        do {
            System.out.println("Escriba la palabra a evaluar: ");
            texto = in.nextLine();
        }while(!texto.matches("[a-zA-Z\\s]*"));
            int valorMax = texto.codePointAt(0), valorSiguiente;
            for (int i = 0; i < texto.length() - 1; i++) {
                //System.out.println(texto.charAt(i) + " = " + texto.codePointAt(i));
                valorSiguiente = texto.codePointAt(i + 1);
                if (valorMax > valorSiguiente) {
                    System.out.println("La cadena no es una palabra abecedario");
                    return;
                } else {
                    valorMax = valorSiguiente;
                }
            }
            System.out.println("La cadena si es una palabra abecedario");

    }

}

