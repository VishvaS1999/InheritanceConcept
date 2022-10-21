class A
{
    int a;
    void display()
    {
        System.out.println("this is Base class A");
    }
}
class B extends A
{
    int b;
    void show()
    {
        System.out.println("This is Derived class B");
    }
}
public class InheritanceDemo
{
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.show();
    }
}
