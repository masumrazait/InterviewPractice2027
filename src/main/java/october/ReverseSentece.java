package october;

public class ReverseSentece {
	public static void main(String[] args) {
		String str = "antap si latipac fo rahib";
		String words[] = str.split(" ");
		String revSen = "";
		for (String word : words) {
			int len = word.length();
			String revWord = "";
			for (int i = len - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revSen = revSen + revWord + " ";
		}
		System.out.println(revSen);
	}

}
