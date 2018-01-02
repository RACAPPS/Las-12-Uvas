/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class digestionSerpientes{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    boolean ended = false;
    String inpt;
    int live;
    String[] medidasS;
    int[] medidas;
    int max, deadTime, count;
    while(!ended){
      inpt = in.nextLine();
      if(inpt.equals("0 0")){
        ended = true;
      }else{
        max = 0;
        deadTime = 0;
        count = 0;
        live = Integer.parseInt(inpt.split(" ")[1]);
        inpt = in.nextLine();
        medidasS = inpt.split(" ");
        inpt = null;
        medidas = new int[medidasS.length];
        for (int i = 0; i < medidasS.length; i++) {
          medidas[i] = Integer.parseInt(medidasS[i]);
        }
        medidasS = null;
        for (int i = 0; i < medidas.length; i++) {
          if(medidas[i] == 0){
            deadTime++;
            if(deadTime > live){
              count = 0;
            }else{
              count++;
            }
          }else{
            count++;
            deadTime = 0;
            if (count > max) {
              max = count;
            }
          }
        }
        System.out.println(max);
      }
    }
  }//ENDOF: main()

}//ENDOF: class digestionSerpientes
