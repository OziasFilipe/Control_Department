 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class Almofadas{
 
Scanner ler = new Scanner(System.in);
Almofada30 a30 = new Almofada30();
Almofada20 a20 = new Almofada20();


public ArrayList buscarProd(int x){
 
 if(x == 30) {
   return a30.CadastraProd();
   }

if(x == 20){
  return a20.CadastraProd();
}   

   return new ArrayList();

}
}