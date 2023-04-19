import java.io.*;
public class Eslestirme {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dosya_eslestirme.txt");
		PrintWriter output = new PrintWriter(file);
		int N = 20;
		String[][] skor_matris = new String[N][N];
		
		for (int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				skor_matris[i][j]= " ";
			}
		}
		for(int i=0;i<N;i++) {
			skor_matris[i][i] = "*";
		}	
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(skor_matris[i][j]);
			}
			System.out.println();
			}
		
		
		
		
		output.close();
	}

}
