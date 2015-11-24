public class ArrayOperations2
{
    private int[] values = {0 , 4 , 6 , 4 , 2 , 10 , 15};
    
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[ 0 ] = this.values[ values.length-1 ];
        this.values[ values.length-1 ] = temp;
    }
    
    public void shiftRight()
    {
        
    }
}