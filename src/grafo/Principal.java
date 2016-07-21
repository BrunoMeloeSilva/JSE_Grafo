package grafo;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		
		//Entrada: Numero de vertices e definicao das arestas.
		int nV = 7; //Dizemos apenas as quantidades de vertices, pois sao sempre representados de forma numerica sequencial
		int E[][] = new int[][]{{1,2},{1,3},{2,3},{3,4},{5,6}};//Defininos as relacoes entre as arresta, de forma identica a matematica
		
		//Processamento: Montagem da Matriz de adjacencias
		int l = 0 ,c = 0;
		int Matriz[][] = new int[nV][nV];//Matriz de adjacencias que contera o resultado
		for (int i = 0; i < E.length; i++) {
			for (int j = 0; j < E[i].length; j++) {
				if(j==0) l = E[i][j]-1; else c = E[i][j]-1;//Uma aresta é formada sempre por dois vertices, por isso essa logica se aplica
			}
			//Devido ser um grafo nao direcionado, devemos conteplar as duas direcoes
			Matriz[l][c] = 1;
			Matriz[c][l] = 1;
		}
		
		//Saída: Impressao da Matriz de Adjacencias
		//Desenha o Grafo em teoria de conjuntos G = (V,E)
		System.out.print("G = ({");
		for (int i = 0; i < nV-1; i++) {
			System.out.print(i+1+",");
		}
		System.out.print(nV+"},  {");
		for (int i = 0; i < E.length; i++) {
			System.out.print("{");
			for (int j = 0; j < E[i].length; j++) {
				System.out.print(E[i][j]);
				if(j==0) System.out.print(","); else System.out.print("}");
			}
			if(i+1 < E.length)
				System.out.print(",");
			else
				System.out.println("})");
		}
		//Desenha a Matriz de Adjacencias
		System.out.print("\n |");
		for (int i = 0; i < Matriz.length; i++) {
			System.out.print(" "+(i+1));
		}
		System.out.println("  ");
		for (int i = 0; i < Matriz.length; i++) {
			System.out.print("--");
		}
		System.out.print("---\n");
		for (int i = 0; i < Matriz.length; i++) {
			System.out.print(""+(i+1)+"| ");
			for (int j = 0; j < Matriz.length; j++) {
				System.out.print(Matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
