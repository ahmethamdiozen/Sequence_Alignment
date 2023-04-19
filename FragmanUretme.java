import java.util.*;

public class FragmanUretme {

	public static void main(String[] args){
	
		Scanner girdi = new Scanner(System.in);
		System.out.println("Kac adet sekans istiyorsunuz?");
		final int N = girdi.nextInt();
		System.out.println("Sekanslar kac nükleotit uzunlugunda olacak?");
		final int L = girdi.nextInt();
		
		Random random = new Random();
		String alfabe = "ACGT";
		String[][] fragmanlar = new String[N][L];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<L;j++) {
				fragmanlar[i][j]  = Character.toString(alfabe.charAt(random.nextInt(alfabe.length())));
		}
		}
		
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
		for(int i=1;i<((fragmanlar[0].length)/2);i++) {
		System.out.print(" ");	
		}
		System.out.print("Read");
		
		for(int i=0;i<fragmanlar[0].length;i++) {
		System.out.print(" ");
		}
		System.out.println("Read*");
		for (int i = 0; i<N; i++) {
			System.out.print("[");
		    for (int j = 0; j<L; j++) {
		        System.out.print(fragmanlar[i][j]);
		    }
		    System.out.print("] ");
		    System.out.print(" [");
		    for (int j = 0; j<L; j++) {
		        System.out.print(tumleyen_fragmanlar[i][j]);
		    }
		    System.out.print("]");
		    System.out.println();
		}
		System.out.println();
		
		girdi.close();

	}

}
