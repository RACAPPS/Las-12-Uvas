/*
  Código escrito por Rubén Aguado Cosano
  Grupo 2M-B
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class laFiestaAburrida{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    int num = in.nextInt();
    in.nextLine();
    String inpt;
    String name;
    for (; num > 0; num--) {
      inpt = in.nextLine();
      name = inpt.substring(4);
      System.out.println("Hola, " + name + ".");
    }
  }//ENDOF: main()

}//ENDOF: class laFiestaAburrida
