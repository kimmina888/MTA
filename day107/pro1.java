package day107;

public class pro1 {

	public static void main(String[] args) {
		String[] str = {"home","zzzzzzzzzzzzzz"};
		validateEntries(str );
	}
	public static boolean validateEntries(String[] string) {
		boolean allValidEntries = true;
		for(String entry : string) {
			if(entry.length()>10) {
				allValidEntries = false;
				break;
			}
		}
		return allValidEntries;
	}

}
