import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class CPorcelana{
 public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

 }
 Descontos desconto = new Descontos();

   ArrayList CadastraProd(){
   ArrayList<String> cporcelana = new ArrayList();
   /*Nome*/ cporcelana.add ("Caneca"); 
   /*Tipo*/ cporcelana.add ("Porcelana"); 
   float valor = 25;
   valor = desconto.calculaPreco(valor);
   String z = String.valueOf(valor);
   /*valor*/ cporcelana.add (z+" R$");


   return cporcelana;
   }
 

}