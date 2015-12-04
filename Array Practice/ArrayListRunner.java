import java.util.ArrayList;

/**
 * Write a description of class ArrayListRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println(names);
        String firstName = names.get(0);
        String lastName = names.get(7);
        System.out.println(firstName + " " + lastName);
        int size = names.size();
        System.out.println(size);
        String last = names.get(size-1);
        System.out.println(last);
        names.set(0 , "Alice B. Toklas");
        System.out.println(names);
        names.add(4 , "Doug");
        System.out.println(names);
        for(String name : names)
        {
            System.out.println(name);
        }
        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println(names2);
        names.remove(0);
        System.out.println(names);
        System.out.println(names2);
    }   
}
