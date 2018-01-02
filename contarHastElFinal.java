/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;
import java.math.BigInteger;

public class contarHastElFinal{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    String inpt, outp;
    BigInteger nSol, pos;
    while(in.hasNext()){
      outp = "";
      pos = BigInteger.valueOf(0);
      inpt = in.nextLine().replace(".", "");
      nSol = new BigInteger(inpt);
      nSol = nSol.add(BigInteger.ONE);
      inpt = nSol + "";
      for (int i = inpt.length() - 1; i >= 0; i--) {
        if(pos.mod(BigInteger.valueOf(3)) == BigInteger.valueOf(0) && pos != BigInteger.valueOf(0)){
          outp = inpt.charAt(i) + "." + outp;
        }else{
          outp = inpt.charAt(i) + outp;
        }
        pos = pos.add(BigInteger.ONE);
      }
      System.out.println(outp);
    }
  }//ENDOF: main()

}//ENDOF: class contarHastElFinal
