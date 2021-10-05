 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class Almofada30{
 public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

 }
 Descontos desconto = new Descontos();

   ArrayList CadastraProd(){
   ArrayList<String> almofada30 = new ArrayList();
   /*Nome*/ almofada30.add ("Almofada"); 
   /*Tamanho*/ almofada30.add ("Tamanho 30x30cm"); 
   float valor = 25;
   valor = desconto.calculaPreco(valor);
   String z = String.valueOf(valor);
   /*valor*/ almofada30.add (z+" R$");


   return almofada30;
   }
 

}