package cards;

import java.util.Scanner;

public class CardsTest {

	public static void main(String[] args) {
		
		Cards cards1=new Cards("of Spades","red" ,5);
		System.out.println(cards1.color + " " + cards1.number + " " + cards1.suit  );
		Cards cards2=new Cards("of Clubs","black", 7);
		System.out.println(cards2.color + " " + cards2.number + " " + cards2.suit  );
		Cards cards3=new Cards("of Diamonds","red", 2);
		System.out.println(cards3.color + " " + cards3.number + " " + cards3.suit  );
		Cards cards4=new Cards("of Hearts","black", 3);
		System.out.println(cards4.color + " " + cards4.number + " " + cards4.suit  );
		Cards cards5=new Cards("of Hearts","red", 6);
		System.out.println(cards5.color + " " + cards5.number + " " + cards5.suit  );
		Cards cards6=new Cards("of Diamonds","black", 4);
		System.out.println(cards6.color + " " + cards6.number + " " + cards6.suit  );
		Cards cards7=new Cards("of Clubs","red", 10);
		System.out.println(cards7.color + " " + cards7.number + " " + cards7.suit  );
		Cards cards8=new Cards("of Spades","black", 9);
		System.out.println(cards8.color + " " + cards8.number + " " + cards8.suit  );
		Cards Lucky=new Cards("Jack of Spades","red", 11);
		System.out.println(Lucky.color + " " + Lucky.number + " " + Lucky.suit  );
		
		System.out.println("what suit did you draw?");
		Scanner scanner = new Scanner (System.in);
		String UsrCard = scanner.nextLine();
		System.out.println("what number did you draw?");
		Scanner scanner2 = new Scanner (System.in);
		int UsrNumber =scanner.nextInt();
		if( UsrCard.equals(Lucky.suit)&& UsrNumber == Lucky.number){
			System.out.println("You win!");
			
		}else{
			System.out.println("you lose...");
		}
			
		
		
scanner.close();
scanner2.close();
	}

}
