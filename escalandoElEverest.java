/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class escalandoElEverest{

  public static void proccess(String personas){
    String[] speedsS = personas.split(" ");
    int[] speeds = new int[speedsS.length];
    for (int i = 0; i < speedsS.length; i++) {
      speeds[i] = Integer.parseInt(speedsS[i]);
    }
    int groups = 1;
    int minlen = speeds.length;
    int maxlen = 0;
    int len = 1;
    int vel = speeds[0];
    for (int i = 1; i < speeds.length; i++) {
      if(speeds[i] < vel){
        groups ++;
        if(len > maxlen){
          maxlen = len;
        }
        if(len < minlen){
          minlen = len;
        }
        len = 1;
        vel = speeds[i];
      }else{
        len++;
      }
    }
    if(len > maxlen){
      maxlen = len;
    }
    if(len < minlen){
      minlen = len;
    }
    System.out.println(groups + " " + minlen + " " + maxlen);
  }//ENDOF: proccess()

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    boolean ended = false;
    String inpt, inpt2;
    while(!ended){
      inpt = in.nextLine();
      if(Integer.parseInt(inpt) == 0){
        ended = true;
      }else{
        inpt = in.nextLine();
        proccess(inpt);
      }
    }
  }//ENDOF: main()

}//ENDOF: class escalandoElEverest
