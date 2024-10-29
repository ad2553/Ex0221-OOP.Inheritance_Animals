public class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("the cat made a sound");
    }
    @Override
    public void move()
    {
        System.out.println("The cat moved");
    }
    @Override
    public void eat()
    {
        System.out.println("the cat likes fish");
    }
}
