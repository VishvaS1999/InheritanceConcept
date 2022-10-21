public class InheritanceConcept
{
    public static void main(String[] args)
    {
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.i);
        childClass.i = 16;
        System.out.println(childClass.i);

    }
}
class ParentClass
{
    public int i; // global variable

    public void m1()
    {
        int j = 0;
        System.out.println(this.i);
    }
}

class ChildClass extends ParentClass
{

}

/**
 * create one parent class take 3 methods and 3 global variables with public access modifier
 * and create one Main class with main method
 * and implement child and parent relation using inheritance feature of java
 */

