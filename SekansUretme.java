import java.util.*;


public class SekansUretme {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sekans uzunlugu nedir?");
		int sekans_uzunlugu = scan.nextInt();
		
		String[] sekans2 = random(sekans_uzunlugu);
		
		for (int i=0;i<sekans2.length;i++) {
			System.out.print(sekans2[i]);
			
		}
		
		scan.close();
		
	}
	
	public static String[] random(int y) {
		
		
		String alfabe = "ACGT";
		Random random = new Random();
		String[] sekans = new String[y];
		
		
		for(int i=0; i<y;i++) {
		String a = Character.toString(alfabe.charAt(random.nextInt(alfabe.length())));
		sekans[i] = a;
		}
		
		return sekans ;
	}

}
