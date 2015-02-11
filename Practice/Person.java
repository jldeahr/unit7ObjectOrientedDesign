
public class Person implements Comparable
{
    private String name;
    public Person(String name)
    {
        // initialise instance variables
        this.name = name;
    }
    
    public int compareTo(Person name)
    {
        Person otherPerson = (Person) other;
        String myName = this.name;
        String otherName = otherPerson.name;
        
        return myName.compareTo(otherName);
    }
    
    public String accessorMethod()
    {
        return name;
    }
}
