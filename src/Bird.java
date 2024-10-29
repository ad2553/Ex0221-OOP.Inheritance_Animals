public class Bird extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("the bird made a sound");
    }

    @Override
    public void move()
    {
        System.out.println("The bird moved");
    }
    @Override
    public void eat()
    {
        System.out.println("the bird likes bread");
    }
}
