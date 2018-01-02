/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class retoSuperado{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    String inpt;
    String[] numbers;
    int grosor, edificio, res;
    while(in.hasNext()){
      inpt = in.nextLine();
      numbers = inpt.split(" ");
      grosor = Integer.parseInt(numbers[0]);
      edificio = Integer.parseInt(numbers[1]) * 1000000;
      res = (int)Math.ceil(Math.log(edificio/grosor)/Math.log(2));
      if((grosor * Math.pow(2, res)) > edificio){
        System.out.println(res);
      }else{
        System.out.println(res + 1);
      }
    }
  }//ENDOF: main()

}//ENDOF: class retoSuperado
