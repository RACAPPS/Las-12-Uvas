/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class esgritura{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    String inpt;
    int exclamaciones, letras;
    while(in.hasNext()){
      letras = 0;
      exclamaciones = 0;
      inpt = in.nextLine();
      for (int i = 0; i < inpt.length(); i++) {
        if (Character.isLetter(inpt.charAt(i))){
          letras++;
        }
      }
      for (int i = 0; i < inpt.length(); i++) {
        if (inpt.charAt(i) == '!'){
          exclamaciones++;
        }
      }
      if(exclamaciones > letras){
        System.out.println("ESGRITO");
      }else{
        System.out.println("escrito");
      }
    }
  }//ENDOF: main()

}//ENDOF: class esgritura
