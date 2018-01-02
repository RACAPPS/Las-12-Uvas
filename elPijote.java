/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class elPijote{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    String inpt;
    int[] cifras = new int[10];
    boolean subnormal;
    while(in.hasNext()){
      for (int i = 0; i < cifras.length; i++) {
        cifras[i] = 0;
      }
      inpt = in.nextLine();
      subnormal = true;
      for (int i = 0; i < inpt.length(); i++) {
        cifras[Character.getNumericValue(inpt.charAt(i))] += 1;
      }
      for (int i = 1; i < cifras.length; i++) {
        if(cifras[i] != cifras[i - 1]){
          subnormal = false;
        }
      }
      if(subnormal){
        System.out.println("subnormal");
      }else{
        System.out.println("no subnormal");
      }
    }
  }//ENDOF: main()

}//ENDOF: class elPijote
