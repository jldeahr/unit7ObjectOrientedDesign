public class ComboLock
{
    private int num1, num2, num3;
    private boolean first, second, third;

    public ComboLock( int secret1, int secret2, int secret3 )
    {
        num1 = secret1;
        num2 = secret2;
        num3 = secret3;
        first = false;
        second = false;
        third = false;
    }

    public void reset() 
    {
        first = false;
        second = false;
        third = false;
    }

    public void turnLeft( int ticks )
    {
        if (first && ticks == num2 && !second)
        {
            second = true;
        }
        else
        {
            reset();
        }
    }

    public void turnRight( int ticks ) 
    {
        if (ticks == num1)
        {
            first = true;
        }
        else if (second && ticks == num3)
        {
            third = true;
        }
        else
        {
            reset();
        }
    }

    public boolean open() 
    {
        if (first && second && third)
        {
            return true;
        }
        else
        {
            reset();
            return false;
        }
    }
}