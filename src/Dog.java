public class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("the dog made a sound");
    }

    @Override
    public void move()
    {
        System.out.println("The dog moved");

    }
    @Override
    public void eat()
    {
        System.out.println("the dog likes meat");
    }
}
