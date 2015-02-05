

/**
 * Subclass of Card that holds an ID
 * 
 * @author Matt Wright w/ Joe Deahr
 * @version January 28, 2015
 */
public class IDCard extends Card
{
    /** Holds the ID of the card */
    private String idNumber;

    
    /**
     * Secondary constructor for objects of class IDCard, accepting a name
     */
    public IDCard(String n, String id )
    {
        super(n);
        idNumber = id;
    }
    
    public boolean equals(Object otherObject)
    {
        if(this.getClass() == otherObject.getClass())
        {
            IDCard other = (IDCard) otherObject;
            return this.getName().equals(other.getName())
                && this.idNumber.equals(other.idNumber);
        }
        
        return false;
    }

    /**
     * Returns the formatted version of this class's description
     *
     * @return    description of this card
     */
    public String format()
    {
        return super.format() + "\nID: " + this.idNumber;
    }
    
    public String toString(){
        return "IDCard[Name:\""+getName()+"\"][idNumber:"+idNumber;
    }

}
