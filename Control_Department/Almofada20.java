 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class Almofada20{
 public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

 }
 Descontos desconto = new Descontos();

   ArrayList CadastraProd(){
   ArrayList<String> almofada20 = new ArrayList();
   /*Nome*/ almofada20.add ("Almofada"); 
   /*Tamanho*/ almofada20.add ("Tamanho 29x20cm"); 
   float valor = 25;
   valor = desconto.calculaPreco(valor);
   String z = String.valueOf(valor);
   /*valor*/ almofada20.add (z+" R$");


   return almofada20;
   }
 

}