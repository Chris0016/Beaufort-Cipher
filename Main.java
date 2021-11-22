public class Main{
	
	public static void main(String[] args){
		String plaintext = "MASTERKEY";
		String key = "FORT";
		Beaufort bFort = new Beaufort(plaintext, key);
		bFort.encrypt();

		System.out.println("Encrypted Text: " + bFort.getEncryptedText());
	}
}