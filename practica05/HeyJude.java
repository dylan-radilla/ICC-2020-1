/**
  *Programa que imprime la letra de Hey Jude de The Beatles.
  *@author Radilla Maldonado Dylan Emmanuel
  *@version 03/08/2019
 */

public class HeyJude{

	public static void main(String[] args) {

		//Definición de Strings con la letra de la canción.

		String JUDE = "Hey Jude";

		String DONT = ", don't ";

		String MAKEBAD = "make it bad";
		String AFRAID = "be afraid";
		String DOWN = "let me down";

		String SAD = "Take a sad song and make it better";
		String WERE = "You were made to go out and get her";
		String FOUND = "You have found her, now go and get her";

		String REMEMBER = "Remember to ";

		String HEART = "let her into your heart";
		String SKIN = "let her under your skin";

		String THEN = "Then you ";

		String START = "can start ";
		String BEGIN = "begin ";

		String MAKEBETTER = "to make it better";

		String BETTER = "better ";

		String WAAAA = "waaaa";

		String NA = "na ";

		int j = 0;
		int n = 1;
		int b = 0;
		while (j < 7){
			if (j == 2 || j == 4 || j == 6){
					while (n < 11){
						System.out.print(NA);
						n++;
					}
				n = 1;
				if (j == 2 || j == 4){
				System.out.println();
				}
			}
			if (j == 0 || j == 1 || j == 3 || j == 5 || j == 6){
				System.out.print(JUDE);
			}
			if (j == 0 || j == 1 || j == 3 || j == 5){
				System.out.print(DONT);
			}
			if (j == 0 || j == 5){
				System.out.println(MAKEBAD);
				System.out.println(SAD);
			}
			if (j == 1){
				System.out.println(AFRAID);
				System.out.println(WERE);
			}
			if (j == 3){
				System.out.println(DOWN);
				System.out.println(FOUND);
			}
			if (j == 0 || j == 1 || j == 3 || j == 5){
				System.out.print(REMEMBER);
			}
			if (j == 0 || j == 3){
				System.out.println(HEART);
			}
			if (j == 1 || j == 5){
				System.out.println(SKIN);
			}
			if (j == 0 || j == 1 || j == 3 || j == 5){
				System.out.print(THEN);
			}
			if (j == 0 || j == 3){
				System.out.print(START);
			}
			if (j == 1 || j == 5){
				System.out.print(BEGIN);
			}
			if (j == 0 || j == 1 || j == 3 || j == 5){
				System.out.println(MAKEBETTER);
			}
			if (j == 5){
				while (b<5){
					System.out.print(BETTER);
					b++;
				}
				System.out.println(WAAAA);
			}
			System.out.println();
			j++;
		}
	}
}