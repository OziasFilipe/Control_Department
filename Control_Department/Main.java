import java.util.Scanner;

class Main {
public static void main(String[] args) {
int codDep;
int codProd;
int codtema;

Canecas canecas = new Canecas();
Almofadas almofadas = new Almofadas();
Azulejo azulejo = new Azulejo();


Scanner leia = new Scanner(System.in);
//Código de Departamento 
System.out.println("\n\n\nDepartamentos \n 1-Canecas 2-Almofadas \n 3-Azulejo  \n ");

System.out.println("Digite o código do departamento:  ");
codDep = leia.nextInt();

//Buscar Produto
if(codDep == 1){
System.out.println("\nProdutos: \n 10-Caneca de Porcelana 11-Caneca de Polimero \n ");
System.out.println("Digite o código do produto: ");
codProd  = leia.nextInt();
System.out.println("\n"+canecas.buscarProd(codProd));
} 

if(codDep == 2){
System.out.println("\nProdutos \n 30-Almofada 30x30cm 20-Almofada 29x20cm \n ");
System.out.println("Digite o código do produto: ");
codProd  = leia.nextInt();
System.out.println("\n"+almofadas.buscarProd(codProd));

} 

if(codDep == 3){
System.out.println("\nProdutos \n 40-Azulejo Pequeno 41-Azulejo Grande \n ");
System.out.println("Digite o código do produto: ");
codProd  = leia.nextInt();
System.out.println("\nTema: \n 1-Super Heroi \n 2-Dia das maes  \n ");
System.out.println("Digite o código do tema: ");
codtema  = leia.nextInt();
System.out.println("\n"+azulejo.buscarProd(codProd)+(codtema));
}

}



  }

