 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class CPolimero{
 public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

 }
 Descontos desconto = new Descontos();

   ArrayList CadastraProd(){
   ArrayList<String> cpolimero = new ArrayList();
   /*Nome*/ cpolimero.add ("Caneca"); 
   /*Tipo*/ cpolimero.add ("Polimero"); 
   float valor = 15;
   valor = desconto.calculaPreco(valor);
   String z = String.valueOf(valor);
   /*valor*/ cpolimero.add (z+" R$");


   return cpolimero;
   }
 

}