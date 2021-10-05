 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class AzulejoG{
 public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

 }
 Descontos desconto = new Descontos();

   ArrayList CadastraProd(){
   ArrayList<String> azulejog = new ArrayList();
   /*Nome*/ azulejog.add ("Azulejo Grande"); 
   /*Tamanho*/ azulejog.add ("Tamanho 20x20cm");
   
   float valor = 30;
   valor = desconto.calculaPreco(valor);
   String z = String.valueOf(valor);
   /*valor*/ azulejog.add (z+" R$");


   return azulejog;
   }
 

}