package JavaBasics;

public class TwoDArrayConcept {

	public static void main(String[] args) {
		String s[][] = new String[2][3];
		System.out.println(s.length);  //print total number of rows
		System.out.println(s[0].length);  //print total number of column
		s[0][0] = "A";
		s[0][1] = "B";
		s[0][2] = "C";
		
		s[1][0] = "A1";
		s[1][1] = "B1";
		s[1][2] = "C1";
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<=s.length;j++) {
				System.out.println(s[i][j]);
			}
		}
	}
}
