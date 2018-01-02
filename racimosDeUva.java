/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class racimosDeUva{

  public static int fibbo(int n){
    int serie = 0;
    int num = 1;
    while(serie < n){
      serie += num;
      num++;
    }
    return num - 1;
  }//ENDOF: fibbo()

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    boolean end = false;
    int num;
    while(!end){
      num = in.nextInt();
      if(num == 0){
        end = true;
      }else{
        System.out.println(fibbo(num));
      }
    }
  }//ENDOF: main()

}//ENDOF: class racimosDeUva
