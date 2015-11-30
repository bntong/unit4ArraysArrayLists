public class ArrayOperations2
{
    private int[] values;
    private int currentSize;
    
    public ArrayOperations2()
    {
        this.values = new int[10];
        for( this.currentSize = 0;
            this.currentSize < 10;
            this.currentSize++ )
        {
            this.values[this.currentSize] = 
                this.currentSize * this.currentSize;
        }
    }
    
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[ 0 ] = this.values[ values.length-1 ];
        this.values[ values.length-1 ] = temp;
    }
    
    public void shiftRight()
    {
        for(int i = 0;
            i < this.currentSize-1;
            i++)
        {
            this.values[i+1] = this.values[i];  
        }
        
        
    }
}