 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Iterator;

 public class Azulejo{
 
Scanner ler = new Scanner(System.in);
AzulejoP azulejop = new AzulejoP();
AzulejoG azulejog = new AzulejoG();


public ArrayList buscarProd(int x){
 
 if(x == 40) {
   return azulejop.CadastraProd();
   }

if(x == 41){
  return azulejog.CadastraProd();
}   

   return new ArrayList();

}
}