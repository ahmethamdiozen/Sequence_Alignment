import java.util.*;
import java.io.*;

public class DosyayaFragmanYazdirma {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("dosya.txt");
		PrintWriter output = new PrintWriter(file);

		Scanner scan = new Scanner(System.in);
		System.out.println("Kac adet sekans istiyorsunuz?");
		final int N = scan.nextInt();
		System.out.println("Sekanslar kac nükleotit uzunlugunda olacak?");
		final int L = scan.nextInt();
		
		Random random = new Random();
		String alfabe = "ACGT";
		String[][] fragmanlar = new String[N][L];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<L;j++) {
				fragmanlar[i][j]  = Character.toString(alfabe.charAt(random.nextInt(alfabe.length())));
		}
		}
		output.println("Read");
		for (int i = 0; i<N; i++) {
			output.print("[");
		    for (int j = 0; j<L; j++) {
		    	output.print(fragmanlar[i][j]);
		    }
		    output.print("]");
		    output.println();
		}
		output.println();
		String[][] ters_fragmanlar = new String[N][L];
		for(int i=0;i<N;i++) {
			for(int j=0;j<L;j++) {
				switch(fragmanlar[i][j]) {
				case "A":
					ters_fragmanlar[i][j] = "T";
					break;
				case "C":
					ters_fragmanlar[i][j] = "G";
					break;
				case "G":
					ters_fragmanlar[i][j] = "C";
					break;
				case "T":
					ters_fragmanlar[i][j] = "A";
					break;
				}
			}
		}		
		String[][] tumleyen_fragmanlar = new String[N][L];
		for(int i=0;i<N;i++) {
			for(int j=0;j<L;j++) {
				tumleyen_fragmanlar[i][j] = ters_fragmanlar[i][L-j-1]; 
			}
		}
		output.println("Read*");
		for (int i = 0; i<N; i++) {	
			output.print("[");
		    for (int j = 0; j<L; j++) {
		    	output.print(tumleyen_fragmanlar[i][j]);
		    }
		    output.print("]");
		    output.println();
		}
		
		scan.close();
		output.close();

	}

}
