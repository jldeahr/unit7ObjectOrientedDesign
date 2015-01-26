

/**
 * Write a description of class ComboLockTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLockTester
{
    public void TestComboLockPass()
    {
        ComboLock combo = new ComboLock(25,30,14);
        combo.turnRight(25);
        combo.turnLeft(30);
        combo.turnRight(14);
        boolean out = combo.open();
        System.out.println(out);
    }
    public void TestComboLockFail1()
    {
        ComboLock combo = new ComboLock(25,30,14);
        combo.turnRight(22);
        combo.turnLeft(30);
        combo.turnRight(14);
        boolean out = combo.open();
        System.out.println(out);
    }
    public void TestComboLockFail2()
    {
        ComboLock combo = new ComboLock(25,30,14);
        combo.turnRight(25);
        combo.turnLeft(31);
        combo.turnRight(14);
        boolean out = combo.open();
        System.out.println(out);
    }
    public void TestComboLockFail3()
    {
        ComboLock combo = new ComboLock(25,30,14);
        combo.turnRight(25);
        combo.turnLeft(30);
        combo.turnRight(15);
        boolean out = combo.open();
        System.out.println(out);
    }
}
