import java.util.Random;

public class Dice {
	
	Random random = new Random();
	int number = random.nextInt();
	
	Dice(int initialNumber){
		this.number = initialNumber;
	}
	
	Dice(){
		this.number = 0;
	}
	
	void roll() {
		this.number = this.random.nextInt(6) + 1;
		System.out.printf("You rolled %d\n", this.number);
	}

}
