package com.Inheritance;

 class Animal
{
    public void eat()
    {

        System.out.println("animal is eating...");
    }

    public void run()
    {
        System.out.println("Animal is running...");
    }
}
class Dog extends Animal
{
    void sound() {

        System.out.println("Dog sounds is barking...");
    }
}

class main
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();
        d.run();
        d.sound();
    }
}