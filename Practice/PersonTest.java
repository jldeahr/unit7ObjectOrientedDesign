import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

public class PersonTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class PersonTest
     */
    public static Person firstPerson(Person [] people)
    {
        Person first = people[0];
        for (int i = 1; i < people.length; i++)
        {
            if (people[i].compareTo(first) < 0)
            {
                first = people[i];
            }
        }
        return first;
    }
    
    public static void main(String [] args)
    {
        Person [] people = new Person[10];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 names: ");
        for (inti = 0; i < 10 && scanner.hasNext(); i++)
        {
            people[i] = new Person(scanner.next());
        }
        
        System.out.println("First: " + firstPerson(people).getName);
        System.out.println("Last: " + lastPerson(people).getname);
    }
}
