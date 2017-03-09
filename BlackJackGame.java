import java.util.Scanner;

public class BlackJackGame {
	private static char[][] theBoard;

    public BlackJackGame()
    {
        this.theBoard = new char[6][7];
        this.clearBoard();
    }
public static char[][] gettheBoard() {
    return theBoard;
}

public boolean makeMove(char moveChar, char[][] theBoard, int row)
{
    if (theBoard[row][0] != '_')
        return false;


    for (int col = 0; col < 3; ++col) {

        if (theBoard[row][col] != '_') {

            theBoard[row-1][col] = moveChar;
            return true;
        }
    }
    theBoard[row][2] = moveChar;
    return true;
}

private void clearBoard()
{
    for(int i = 0; i < this.theBoard.length; i++)
    {
        for(int j = 0; j < this.theBoard[i].length; j++)
        {
            this.theBoard[i][j] = '_';
        }
    }
}

public boolean isWinner()
{
    //row winners

    boolean row1WinnerA = this.Newboard[0][0] == 'X' && 
				this.Newboard[0][1] == 'X' && 
				this.Newboard[0][2] == 'X';
		boolean row1WinnerB = this.Newboard[0][0] == 'O' && 
				this.Newboard[0][1] == 'O' && 
				this.Newboard[0][2] == 'O';

		boolean row2WinnerA = this.Newboard[1][0] == 'X' && 
				this.Newboard[1][1] == 'X' && 
				this.Newboard[1][2] == 'X';
		boolean row2WinnerB = this.Newboard[1][0] == 'O' && 
				this.Newboard[1][1] == 'O' && 
				this.Newboard[1][2] == 'O';

		boolean row3WinnerA = this.Newboard[2][0] == 'X' && 
				this.Newboard[2][1] == 'X' && 
				this.Newboard[2][2] == 'X';
		boolean row3WinnerB = this.Newboard[0][0] == 'O' && 
				this.Newboard[2][1] == 'O' && 
				this.Newboard[2][2] == 'O';
		
		return row1WinnerA || row1WinnerB || 
				row2WinnerA || row2WinnerB ||
				row3WinnerA || row3WinnerB ;
}

public void display()
{
    System.out.println("--------------------------");
    for(int i = 0; i < this.theBoard.length; i++)
    {
        for(int j = 0; j < this.theBoard[i].length; j++)
        {
            System.out.print(this.theBoard[i][j] + "\t");
        }
        System.out.println("");
    }
} 
}
