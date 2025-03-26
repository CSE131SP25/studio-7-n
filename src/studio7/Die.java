package studio7;

public class Die {

	int sides;
	
	// Constructor
    public Die(int sides) {
        this.sides = sides;
    }

    // Method to return random roll of die
    public int rollDie() {
        return (int) (Math.random() * sides) + 1;
    }

}