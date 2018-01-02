/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class elAnuncioMasCaroDelAno{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    int num = in.nextInt();
    in.nextLine();
    String inpt;
    int h, m, s;
    for (; num > 0; num--) {
      inpt = in.nextLine();
      h = 24 - Integer.parseInt(inpt.substring(0,2));
      m = -Integer.parseInt(inpt.substring(3,5));
      s = -Integer.parseInt(inpt.substring(6,8));
      if(s < 0){
        s += 60;
        m--;
      }
      if(m < 0){
        m += 60;
        h--;
      }
      System.out.println(String.format ("%02d", h) + ":" + String.format ("%02d", m) + ":" + String.format ("%02d", s));
    }
  }//ENDOF: main()

}//ENDOF: class elAnuncioMasCortoDelAno
