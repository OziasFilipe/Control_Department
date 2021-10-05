 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class AzulejoP{
 public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

 }
 Descontos desconto = new Descontos();

   ArrayList CadastraProd(){
   ArrayList<String> azulejop = new ArrayList();
   /*Nome*/ azulejop.add ("Azulejo"); 
   /*Tamanho*/ azulejop.add ("Tamanho 15x15cm"); 
   float valor = 25;
   valor = desconto.calculaPreco(valor);
   String z = String.valueOf(valor);
   /*valor*/ azulejop.add (z+" R$");


   return azulejop;
   }
 

}