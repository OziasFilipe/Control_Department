 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class Canecas{
 
Scanner ler = new Scanner(System.in);
CPolimero cpolimero = new CPolimero();
CPorcelana cporcelana = new CPorcelana();


public ArrayList buscarProd(int x){
 
 if(x == 10) {
   return cpolimero.CadastraProd();
   }

if(x == 11){
  return cporcelana.CadastraProd();
}   

   return new ArrayList();

}
}
