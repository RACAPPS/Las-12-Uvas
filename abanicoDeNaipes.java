/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;
import java.util.Arrays;

public class abanicoDeNaipes{

  public static int getMinValue(int[] arr, int skip, boolean pos, boolean moved){
    int[] sorted = new int[arr.length];
    System.arraycopy(arr, 0, sorted, 0, arr.length );
    Arrays.sort(sorted);
    int min = sorted[skip];
    if(!pos){
      return min;
    }else{
      int posi = 0;
      for (int i = 1; i < arr.length; i++) {
        if(min == arr[i]){
          posi = i;
        }
      }
      if(posi == arr.length - 1){
        return -1;
      }
      if(posi == 0 && arr[0] == sorted[0]){

      }
      if(arr[posi] == sorted[posi]){
        boolean doe = true;
        for (int i = 0; i < posi && doe; i++) {
          if(arr[i] != sorted[i]){
            doe = false;
          }
        }
        if(doe){
          return -1;
        }
      }
      return posi;
    }
  }//ENDOF: getMinValue()

  public static boolean check(int[] arr){
    boolean ordered = true;
    for (int i = 1; i < arr.length && ordered; i++) {
      if(arr[i] < arr[i - 1]){
        ordered = false;
      }
    }
    return ordered;
  }//ENDOF: check()

  public static int ordenar(String data){
    int steps = 0;
    int skipSize = 0;
    int pos, min;
    boolean moved = false;
    String[] cardsS = data.split(" ");
    int[] cards = new int[cardsS.length];
    for (int i = 0; i < cards.length; i++) {
      cards[i] = Integer.parseInt(cardsS[i]);
    }
    while(!check(cards)){
      min = getMinValue(cards, skipSize, false, moved);
      pos = getMinValue(cards, skipSize, true, moved);
      if(pos != -1){
        for(int i = pos; i < cards.length - 1; i++){
          cards[i] = cards[i + 1];
        }
        cards[cards.length - 1] = min;
        steps++;
        moved = true;
      }
      skipSize++;
    }
    return steps;
  }//ENDOF: ordenar()

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    boolean ended = false;
    String inpt;
    while(!ended){
      inpt = in.nextLine();
      if(Integer.parseInt(inpt) == 0){
        ended = true;
      }else{
        inpt = in.nextLine();
        System.out.println(ordenar(inpt));
      }
    }
  }//ENDOF: main()

}//ENDOF: class abanicoDeNaipes
