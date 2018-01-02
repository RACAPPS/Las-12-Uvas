/*
  Código escrito por Rubén Aguado Cosano
  Fecha: 31-12-2017
*/
import java.util.Scanner;

public class camellosSerpientesKebabs{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    in.useLocale(java.util.Locale.UK);
    String inpt, var, destType;
    String[] parts;
    int it;
    while(in.hasNext()){
      inpt = in.nextLine();
      parts = inpt.split(" ");
      var = parts[0];
      destType = parts[1];
      it = 0;
      var = var.replace("-", " ");
      var = var.replace("_", " ");
      while(it < var.length()){
        if(Character.isUpperCase(var.charAt(it)) && it != 0){
          var = var.substring(0,it) + " " + Character.toLowerCase(var.charAt(it)) + var.substring(it + 1);
          it++;
        }
        it++;
      }
      var = var.toLowerCase();
      switch(destType){
        case "snake_case":
          var = var.replace(" ", "_");
          break;
        case "kebab-case":
          var = var.replace(" ", "-");
          break;
        case "CamelCase":
          it = 0;
          while(it < var.length()){
            if(var.charAt(it) == ' '){
              var = var.substring(0,it) + Character.toUpperCase(var.charAt(it + 1)) + var.substring(it + 2);
            }
            it++;
          }
          var = Character.toUpperCase(var.charAt(0)) + var.substring(1);
          break;
      }
      System.out.println(var);
    }
  }//ENDOF: main()

}//ENDOF: class camellosSerpientesKebabs
