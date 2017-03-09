
public class BlackJackGameBoard {

	    private BlackJackGameBoard board;
		private Player player1;
		private Player player2;
		private Scanner input;
		public BlackJackGameBoard()
		{
			input = new Scanner(System.in);
			this.board = new BlackJackGameBoard();
			this.player1 = new Player("Player 1", 'X');
			this.player2 = new Player("Player 2", 'O');
		}

		public void play()
		{
			Player currPlayer = this.player1;
			do
			{
				this.board.display();
				this.getMove(currPlayer);
				if(currPlayer == this.player1)
				{
					currPlayer = this.player2;
				}
				else
				{
					currPlayer = this.player1;
				}
			}
			while(this.board.isWinner() == false);
			if(currPlayer == this.player1)
			{
				System.out.println("The Winner of this game is: " + this.player2.getName());
			}
			else
			{
				System.out.println("The Winner of this game is: " + this.player1.getName());
			}
		}

		private void getMove(Player player)
		{
			int row = -1;
			do
			{
				System.out.print("Please enter a row: ");
				row = this.input.nextInt();
			}
			while(this.board.makeMove(player.getMove(),BlackJackGameBoard.gettheBoard(), row) == false);
		}
}
