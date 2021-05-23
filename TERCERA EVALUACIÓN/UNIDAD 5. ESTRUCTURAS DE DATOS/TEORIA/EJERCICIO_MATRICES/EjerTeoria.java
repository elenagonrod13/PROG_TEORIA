package matrices;

public class EjerTeoria {
	final int TAM=2;
	public EjerTeoria() {
		int[][] m=new int[TAM][TAM];
		cargarMatriz(m);
		visualizar(m);
	}
	public void cargarMatriz(int[][]m) {
		int valor=0;
		for(int fila=0; fila<m.length;fila++)
			for(int col=0; col<m[fila].length;col++) {
				m[fila][col]=valor;
				valor++;
			}
	}
	public void visualizar(int[][]m) {
		for(int fila=0; fila<m.length;fila++) {
			for(int col=0; col<m[fila].length;col++) 
				System.out.print(m[fila][col]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new EjerTeoria();

	}

}
