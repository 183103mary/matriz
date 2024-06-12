package Exemplomatriz;

public class Atividade1 {

	public static void main(String[] args) {

		int m[][] = new int [5][5];
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				m[i][j] = (int) Math.round(Math.random()*100);
				if (i %2 == 0)
					System.out.println("Os valores são " + m[i][j]);



			}
		}
		




	}

}
