// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  private char[][] grid;

  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    this.grid = new char[rows][cols];
    
    for( int i = 0; i < this.grid.length; i++)
    {
        for(int j = 0; j < this.grid[i].length; j++)
        {
            this.grid[i][j] = ' ';
        }
    }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill character
  public CharMatrix(int rows, int cols, char fill)
  {
     this.grid = new char[rows][cols];
     
     for(int i = 0; i < this.grid.length; i++)
     {
         for(int j = 0; j < this.grid[i].length; j++)
         {
             this.grid[i][j] = fill; 
         }
     }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
     int numRows = this.grid.length;
     return numRows;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
     return this.grid[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
     char charAt = this.grid[row][col];
     return charAt;
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    this.grid[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    char value = this.grid[row][col];
    if(value == ' ')
    {
        return true;
    }
    else
    {
        return false;
    }
  }

  // Fills the given rectangle with fill characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for( int i = 0; i < this.grid.length; i++)
    {
        for( int j = 0; i < this.grid[i].length; j++)
        {
            if( i <= row0 && i >= row1 && j <= col0 && j >= col1)
            {
                this.grid[i][j] = fill;
            }
        }
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    for( int i = 0; i < this.grid.length; i++)
    {
        for( int j = 0; i < this.grid[i].length; j++)
        {
            if( i <= row0 && i >= row1 && j <= col0 && j >= col1)
            {
                this.grid[i][j] = ' ';
            }
        }
    }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int count = 0;
    
    for( int i = 0; i < this.grid[row].length; i++)
    {
        if( this.grid[row][i] != ' ')
        {
            count++;
        }
    }
    
    return count;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int count = 0;
    
    for( int i = 0; i < this.grid[i].length; i++)
    {
        if( this.grid[i][col] != ' ')
        {
            count++;
        }
        
    }
    return count;
  }
}
