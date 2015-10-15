import javax.swing.JOptionPane;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int answer = 1 + (int)(Math.random()*7);
		int guess;
		int count = 0;
		int wins = 0;
		int losses = 0;
												
		guess = Integer.parseInt(JOptionPane.showInputDialog("Guess if an even or odd number will be rolled. even/odd"));
		switch(answer)
		{case "even":
			break;}
		{case "odd":
			break;
		}
		if(guess == (1)||guess == (3)||guess == (5))
			JOptionPane.showMessageDialog(null, "You guessed correctly!");
		else
			JOptionPane.showMessageDialog(null, "Wrong answer.");
		do{
			JOptionPane.showInputDialog("Play again? Y/N");
			boolean play = true;
			String repeat;
			
			if(repeat == ("Y")||repeat == ("y"))
			{play = true;}
			
			else
			{play = false;}
			
		}while(play = true);
	}

}
