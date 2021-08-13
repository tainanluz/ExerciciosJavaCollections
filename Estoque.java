/*
3- Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */

package PackagePolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque 
{
    public static void main (String args [])
    {
    	Scanner input = new Scanner (System.in);
    	int op;
    	ArrayList<String> estoque = new ArrayList();
    	
    	do
    	{
    		
			System.out.println("\n*****MENU DE OP��ES DO ESTOQUE*****");
			System.out.println("-------------------------------------");
			System.out.println("\n(1) Adicionar produto ao estoque"
					+ "\n(2) Remover produto do estoque"
					+ "\n(3) Atualizar dado de produto"
					+ "\n(4) Mostrar todos os produtos do estoque"
					+ "\n(0) ***Sair do estoque***");
			System.out.println("-------------------------------------");
			System.out.println("\n ***Digite a op��o: ***");
			op = input.nextInt();
			
			switch(op)
			{
			case 1:
				input.nextLine();
				System.out.println("\n---Entrada de estoque---");
				System.out.println("\n Digite o nome do produto:  ");
				String entrada = input.nextLine();
				estoque.add(entrada);
				break;
			case 2:
				input.nextLine();
				System.out.println("\n---Sa�da de estoque---");
				System.out.println("\n Digite o nome do produto:  ");
				String saida = input.nextLine();
				if(estoque.contains(saida))
				{
					estoque.remove(saida);
				}
				else
				{
					System.out.println("\n***Produto n�o est� em estoque***");
				}
				break;
			case 3:
				input.nextLine(); 
				System.out.println("\n---Altera��o de estoque---");
				System.out.println("\n Digite o nome do produto que ser� alterado:  ");
				String prodAlterado = input.nextLine();
				System.out.println("\n Digite o nome do novo produto que substituir� "+ prodAlterado+": ");
				String prodNovo = input.nextLine();
				
				if(estoque.contains(prodAlterado))
				{
					estoque.remove(prodAlterado);
					estoque.add(prodNovo);
				}
				else
				{
					System.out.println("\n***Produto n�o est� em estoque*** ");
				}
				//System.out.println("\n"+estoque);
				break;
			case 4:
				System.out.println("\n***Lista de produtos em estoque: ***");
				System.out.println("\n"+estoque);
				break;
				default:
					System.out.println("\n***Sistema finalizado***");					
			}
			
    		
    	}while (op!=0);
    	

    }
}
