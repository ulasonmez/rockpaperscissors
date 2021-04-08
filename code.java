import java.util.*;
import java.util.Random;
public class Main{
	public static void main(String[] Args) {
Scanner giris = new Scanner(System.in);
Random rand = new Random();
int score=0,bscore=0;
while(true) {
	int random = rand.nextInt(3);
	// rock = 0
	// paper = 1
	// scissors = 2
	System.out.println("Please choose one");
	System.out.println("1-Rock  2-Paper  3-Scissors");
	int a = giris.nextInt();
	if(random==0) {
		if(a==2) {
			System.out.println("Your choice : Paper\nBot's choice : Rock");
			System.out.println("You won.");
			score++;
		}
		else if(a==1) {
			System.out.println("Your choice : Rock\nBot's choice : Rock");
			System.out.println("Draw");
		}
		else if(a==3) {
			System.out.println("Your choice : Scissors\nBot's choice : Rock");
			System.out.println("You lost.");
			bscore++;
		}
	}
	if(random==1) {
		if(a==1) {
			System.out.println("Your choice : Rock\nBot's choice : Paper");
			System.out.println("You lost");
			bscore++;
		}
		else if(a==2) {
			System.out.println("Your choice : Paper\nBot's choice : Paper");
			System.out.println("Draw");
		}
		else if(a==3) {
			System.out.println("Your choice : Scissors\nBot's choice : Paper");
			System.out.println("You won");
			score++;
		}
	}
	if(random==2) {
		if(a==1) {
			System.out.println("Your choice : Rock\nBot's choice : Scissors");
			System.out.println("You won");
			score++;
		}
		else if(a==2) {
			System.out.println("Your choice : Paper\nBot's choice : Scissors");
			System.out.println("You lost");
			bscore++;
		}
		else if(a==3) {
			System.out.println("Your choice : Scissors\nBot's choice : Scissors");
			System.out.println("Draw");
		}
	}
	System.out.println("For quit press 0 to keep playing press 1");
	int b = giris.nextInt();
	if(b==0) {
		if(score>bscore) {
			System.out.println("You won\nYour score : "+score+"\nBot's score : "+bscore);
		}
		else if(score<bscore) {
			System.out.println("You lost\nYour score : "+score+"\nBot's score : "+bscore);
		}
		else {
			System.out.println("Draw\nYour score : "+score+"\nBot's score : "+bscore);
		}
		break;
	}
	if(b==1) {
		System.out.println("Your score : "+score+"\nBot's score: "+bscore);
			}
		}
	}
}
