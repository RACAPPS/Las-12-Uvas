/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class romanceEnElPalomar{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    int num = in.nextInt();
    in.nextLine();
    String inpt;
    String[] numbers;
    int palomas;
    int cajas;
    for (; num > 0; num--) {
      inpt = in.nextLine();
      numbers = inpt.split(" ");
      palomas = Integer.parseInt(numbers[0]);
      cajas = Integer.parseInt(numbers[1]);
      if(palomas <= cajas){
        System.out.println("ROMANCE");
      }else{
        System.out.println("PRINCIPIO");
      }
    }
  }//ENDOF: main()

}//ENDOF: class romanceEnElPalomar
