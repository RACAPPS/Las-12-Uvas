/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class digestionSerpientes2{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    boolean ended = false;
    String inpt;
    int live, max, count;
    String[] medidas;
    while(!ended){
      inpt = in.nextLine();
      if(inpt.equals("0 0")){
        ended = true;
      }else{
        max = 0;
        live = Integer.parseInt(inpt.split(" ")[1]);
        inpt = in.nextLine();
        medidas = inpt.split(" ");
        inpt = null;
        for (int i = 0; i < medidas.length; i++) {
          count = 0;
          if(Integer.parseInt(medidas[i]) == 1){
            for (int j = i + 1; j < medidas.length; j++) {
              if(Integer.parseInt(medidas[j]) == 0){
                count++;
              }else{
                if(count <= live){
                  if(j - i > max){
                    max = j - i;
                  }
                }else{
                  j = medidas.length;
                }
                count = 0;
              }
            }
          }
        }
        System.out.println(max);
      }
    }
  }//ENDOF: main()

}//ENDOF: class digestionSerpientes2
