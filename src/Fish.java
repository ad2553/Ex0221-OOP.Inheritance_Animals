public class Fish extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("the fish made a sound");
    }

    @Override
    public void move()
    {
        System.out.println("The fish is swimming");
    }
    @Override
    public void eat()
    {
        System.out.println("the fish likes cornflakes");
    }
}
