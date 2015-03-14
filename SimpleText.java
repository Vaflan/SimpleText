import static org.lwjgl.opengl.GL11.*;
/**
 * Created by Vaflan on 14.03.2015.
 * saucecode's text rendering in opengl 1.1, edited by Vaflan.
 */

public class SimpleText {
	public static void drawString(String s, int x, int y) {
		int startX = x;
		glLoadIdentity();
		glBegin(GL_POINTS);
		for(char c : s.toLowerCase().toCharArray()) {
			switch(c) {
				case 'a':
					for(int i=0; i<8; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 7, y + i);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 8);
						glVertex2f(x + i, y + 4);
					}
					x += 8;
					break;

				case 'b':
					for (int i=0; i<8; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=1; i<7; i++) {
						glVertex2f(x + i, y);
						glVertex2f(x + i, y + 4);
						glVertex2f(x + i, y + 8);
					}
					glVertex2f(x + 7, y + 5);
					glVertex2f(x + 7, y + 7);
					glVertex2f(x + 7, y + 6);

					glVertex2f(x + 7, y + 1);
					glVertex2f(x + 7, y + 2);
					glVertex2f(x + 7, y + 3);
					x += 8;
					break;

				case 'c':
					for(int i=1; i<8; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y);
						glVertex2f(x + i, y + 8);
					}
					glVertex2f(x + 6, y + 1);
					glVertex2f(x + 6, y + 2);

					glVertex2f(x + 6, y + 6);
					glVertex2f(x + 6, y + 7);

					x += 8;
					break;

				case 'd':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y);
						glVertex2f(x + i, y + 8);
					}
					glVertex2f(x + 6, y + 1);
					glVertex2f(x + 6, y + 2);
					glVertex2f(x + 6, y + 3);
					glVertex2f(x + 6, y + 4);
					glVertex2f(x + 6, y + 5);
					glVertex2f(x + 6, y + 6);
					glVertex2f(x + 6, y + 7);

					x += 8;
					break;

				case 'e':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=1; i<7; i++) {
						glVertex2f(x + i, y + 0);
						glVertex2f(x + i, y + 8);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y + 4);
					}
					x += 8;
					break;

				case 'f':
					for(int i=0; i <9; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=1; i<7; i++) {
						glVertex2f(x + i, y + 8);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y + 4);
					}
					x += 8;
					break;

				case 'g':
					for(int i=1; i<8; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y);
						glVertex2f(x + i, y + 8);
					}
					glVertex2f(x + 6, y + 1);
					glVertex2f(x + 6, y + 2);
					glVertex2f(x + 6, y + 3);
					glVertex2f(x + 5, y + 3);
					glVertex2f(x + 7, y + 3);

					glVertex2f(x + 6, y + 6);
					glVertex2f(x + 6, y + 7);

					x += 8;
					break;

				case 'h':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 7, y + i);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 4);
					}
					x += 8;
					break;

				case 'i':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 3, y + i);
					}
					for(int i=1; i<6; i++) {
						glVertex2f(x + i, y + 0);
						glVertex2f(x + i, y + 8);
					}
					x += 7;
					break;

				case 'j':
					for(int i=1; i<9; i++) {
						glVertex2f(x + 6, y + i);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y + 0);
					}
					glVertex2f(x + 1, y + 3);
					glVertex2f(x + 1, y + 2);
					glVertex2f(x + 1, y + 1);
					x += 8;
					break;

				case 'k':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
					}
					glVertex2f(x + 6, y + 8);
					glVertex2f(x + 5, y + 7);
					glVertex2f(x + 4, y + 6);
					glVertex2f(x + 3, y + 5);
					glVertex2f(x + 2, y + 4);
					glVertex2f(x + 2, y + 3);
					glVertex2f(x + 3, y + 4);
					glVertex2f(x + 4, y + 3);
					glVertex2f(x + 5, y + 2);
					glVertex2f(x + 6, y + 1);
					glVertex2f(x + 7, y);
					x += 8;
					break;

				case 'l':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=1; i<7; i++) {
						glVertex2f(x + i, y);
					}
					x += 7;
					break;

				case 'm':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 7, y + i);
					}
					glVertex2f(x + 3, y + 6);
					glVertex2f(x + 2, y + 7);
					glVertex2f(x + 4, y + 5);

					glVertex2f(x + 5, y + 6);
					glVertex2f(x + 6, y + 7);
					glVertex2f(x + 4, y + 5);
					x += 8;
					break;

				case 'n':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 7, y + i);
					}
					glVertex2f(x + 2, y + 7);
					glVertex2f(x + 2, y + 6);
					glVertex2f(x + 3, y + 5);
					glVertex2f(x + 4, y + 4);
					glVertex2f(x + 5, y + 3);
					glVertex2f(x + 6, y + 2);
					glVertex2f(x + 6, y + 1);
					x += 8;
					break;

				case 'o':
				case '0':
					for(int i=1; i<8; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 7, y + i);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 8);
						glVertex2f(x + i, y + 0);
					}
					x += 8;
					break;

				case 'p':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y + 8);
						glVertex2f(x + i, y + 4);
					}
					glVertex2f(x + 6, y + 7);
					glVertex2f(x + 6, y + 5);
					glVertex2f(x + 6, y + 6);
					x += 8;
					break;

				case 'q':
					for(int i=1; i<8; i++) {
						glVertex2f(x + 1, y + i);
						if(i != 1) glVertex2f(x + 7, y + i);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 8);
						if(i != 6) glVertex2f(x + i, y + 0);
					}
					glVertex2f(x + 4, y + 3);
					glVertex2f(x + 5, y + 2);
					glVertex2f(x + 6, y + 1);
					glVertex2f(x + 7, y);
					x += 8;
					break;

				case 'r':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y + 8);
						glVertex2f(x + i, y + 4);
					}
					glVertex2f(x + 6, y + 7);
					glVertex2f(x + 6, y + 5);
					glVertex2f(x + 6, y + 6);

					glVertex2f(x + 4, y + 3);
					glVertex2f(x + 5, y + 2);
					glVertex2f(x + 6, y + 1);
					glVertex2f(x + 7, y);
					x += 8;
					break;

				case 's':
					for(int i=2; i<8; i++) {
						glVertex2f(x + i, y + 8);
					}
					glVertex2f(x + 1, y + 7);
					glVertex2f(x + 1, y + 6);
					glVertex2f(x + 1, y + 5);
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 4);
						glVertex2f(x + i, y);
					}
					glVertex2f(x + 7, y + 3);
					glVertex2f(x + 7, y + 2);
					glVertex2f(x + 7, y + 1);
					glVertex2f(x + 1, y + 1);
					glVertex2f(x + 1, y + 2);
					x += 8;
					break;

				case 't':
					for(int i=0; i<9; i++) {
						glVertex2f(x + 4, y + i);
					}
					for(int i=1; i<8; i++) {
						glVertex2f(x + i, y + 8);
					}
					x += 7;
					break;

				case 'u':
					for(int i=1; i<9; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 7, y + i);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 0);
					}
					x += 8;
					break;

				case 'v':
					for(int i=2; i<9; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 6, y + i);
					}
					glVertex2f(x + 2, y + 1);
					glVertex2f(x + 5, y + 1);
					glVertex2f(x + 3, y);
					glVertex2f(x + 4, y);
					x += 7;
					break;

				case 'w':
					for(int i=1; i<9; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 7, y + i);
					}
					glVertex2f(x + 2, y);
					glVertex2f(x + 3, y);
					glVertex2f(x + 5, y);
					glVertex2f(x + 6, y);
					for(int i=1; i<7; i++) {
						glVertex2f(x + 4, y + i);
					}
					x += 8;
					break;

				case 'x':
					for(int i=1; i<8; i++) {
						glVertex2f(x + i, y + i);
					}
					for(int i=7; i>=1; i--) {
						glVertex2f(x + i, y + 8 - i);
					}
					x += 8;
					break;

				case 'y':
					glVertex2f(x + 4, y);
					glVertex2f(x + 4, y + 1);
					glVertex2f(x + 4, y + 2);
					glVertex2f(x + 4, y + 3);
					glVertex2f(x + 4, y + 4);

					glVertex2f(x + 3, y + 5);
					glVertex2f(x + 2, y + 6);
					glVertex2f(x + 1, y + 7);
					glVertex2f(x + 1, y + 8);

					glVertex2f(x + 5, y + 5);
					glVertex2f(x + 6, y + 6);
					glVertex2f(x + 7, y + 7);
					glVertex2f(x + 7, y + 8);
					x += 8;
					break;

				case 'z':
					for(int i=1; i<7; i++) {
						glVertex2f(x + i, y);
						glVertex2f(x + i, y + 8);
						glVertex2f(x + i, y + i);
					}
					glVertex2f(x + 6, y + 7);
					x += 8;
					break;

				case '1':
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y);
					}
					for(int i=1; i<9; i++) {
						glVertex2f(x + 4, y + i);
					}
					glVertex2f(x + 3, y + 7);
					x += 8;
					break;

				case '2':
					for(int i=1; i<7; i++) {
						glVertex2f(x + i, y);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y + 8);
					}
					glVertex2f(x + 1, y + 7);
					glVertex2f(x + 1, y + 6);

					glVertex2f(x + 6, y + 7);
					glVertex2f(x + 6, y + 6);
					glVertex2f(x + 6, y + 5);
					glVertex2f(x + 5, y + 4);
					glVertex2f(x + 4, y + 3);
					glVertex2f(x + 3, y + 2);
					glVertex2f(x + 2, y + 1);
					x += 8;
					break;

				case '3':
					for(int i=1; i<6; i++) {
						glVertex2f(x + i, y + 8);
						glVertex2f(x + i, y);
					}
					for(int i=1; i<8; i++) {
						glVertex2f(x + 6, y + i);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y + 4);
					}
					x += 8;
					break;

				case '4':
					for(int i=2; i<9; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=2; i<8; i++) {
						glVertex2f(x + i, y + 1);
					}
					for(int i=0; i<5; i++) {
						glVertex2f(x + 4, y + i);
					}
					x += 8;
					break;

				case '5':
					for(int i=1; i<8; i++) {
						glVertex2f(x + i, y + 8);
					}
					for(int i=4; i<8; i++) {
						glVertex2f(x + 1, y + i);
					}
					glVertex2f(x + 1, y + 1);
					glVertex2f(x + 2, y);
					glVertex2f(x + 3, y);
					glVertex2f(x + 4, y);
					glVertex2f(x + 5, y);
					glVertex2f(x + 6, y);

					glVertex2f(x + 7, y + 1);
					glVertex2f(x + 7, y + 2);
					glVertex2f(x + 7, y + 3);

					glVertex2f(x + 6, y + 4);
					glVertex2f(x + 5, y + 4);
					glVertex2f(x + 4, y + 4);
					glVertex2f(x + 3, y + 4);
					glVertex2f(x + 2, y + 4);
					x += 8;
					break;

				case '6':
					for(int i=1; i<8; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y);
					}
					for(int i=2; i<6; i++) {
						glVertex2f(x + i, y + 4);
						glVertex2f(x + i, y + 8);
					}
					glVertex2f(x + 7, y + 1);
					glVertex2f(x + 7, y + 2);
					glVertex2f(x + 7, y + 3);
					glVertex2f(x + 6, y + 4);
					x += 8;
					break;

				case '7':
					for(int i=0; i<8; i++) {
						glVertex2f(x + i, y + 8);
					}
					glVertex2f(x + 7, y + 7);
					glVertex2f(x + 7, y + 6);

					glVertex2f(x + 6, y + 5);
					glVertex2f(x + 5, y + 4);
					glVertex2f(x + 4, y + 3);
					glVertex2f(x + 3, y + 2);
					glVertex2f(x + 2, y + 1);
					glVertex2f(x + 1, y);
					x += 8;
					break;

				case '8':
					for(int i=1; i<8; i++) {
						glVertex2f(x + 1, y + i);
						glVertex2f(x + 7, y + i);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 8);
						glVertex2f(x + i, y + 0);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 4);
					}
					x += 8;
					break;

				case '9':
					for(int i=1; i<8; i++) {
						glVertex2f(x + 7, y + i);
					}
					for(int i=5; i<8; i++) {
						glVertex2f(x + 1, y + i);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 8);
						glVertex2f(x + i, y + 0);
					}
					for(int i=2; i<7; i++) {
						glVertex2f(x + i, y + 4);
					}
					glVertex2f(x + 1, y + 0);
					x += 8;
					break;

				case '.':
					glVertex2f(x + 1, y);
					x += 2;
					break;

				case ',':
					glVertex2f(x + 1, y);
					glVertex2f(x + 1, y + 1);
					x += 2;
					break;

				case '!':
					for(int i=2; i<9; i++) {
						glVertex2f(x + 3, y + i);
					}
					glVertex2f(x + 3, y + 0);
					x += 7;
					break;

				case '?':
					for(int i=2; i<5; i++) {
						glVertex2f(x + i, y + 8);
					}
					for(int i=5; i<8; i++) {
						glVertex2f(x + 5, y + i);
					}
					glVertex2f(x + 1, y + 7);
					glVertex2f(x + 4, y + 4);

					glVertex2f(x + 3, y + 3);
					glVertex2f(x + 3, y + 2);
					glVertex2f(x + 3, y + 0);
					x += 8;
					break;

				case '\n':
					y -= 10;
					x = startX;
					break;

				default:
					x += 8;
					break;
			}
		}
		glEnd();
	}
}
