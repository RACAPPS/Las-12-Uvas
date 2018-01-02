/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class velocidad{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    int num = in.nextInt();
    in.nextLine();
    String inpt;
    String[] datos;
    int v, d, t;
    for (; num > 0; num--) {
      inpt = in.nextLine();
      datos = inpt.split(" ");
      v = 0;
      d = 0;
      t = 0;
      for (int i = 0; i < datos.length; i++) {
        switch(datos[i].charAt(0)){
          case 'D':
            d = Integer.parseInt(datos[i].substring(2));
            break;
          case 'T':
            t = Integer.parseInt(datos[i].substring(2));
            break;
          case 'V':
            v = Integer.parseInt(datos[i].substring(2));
            break;
        }
      }
      if(v == 0){
        System.out.println("V=" + d/t);
      }else if(d == 0){
        System.out.println("D=" + v*t);
      }else if(t == 0){
        System.out.println("T=" + d/v);
      }
    }
  }//ENDOF: main()

}//ENDOF: class velocidad
