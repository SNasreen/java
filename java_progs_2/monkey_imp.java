class monkey
{
    void jump()
	{
        System.out.println("Jumps");
    }
    void bite()
	{
        System.out.println("Bites");
    }
}
interface basic_animal
{
    void eat();
    void sleep();
}
class human extends monkey implements basic_animal
{
    public void eat() 
	{
        System.out.println("Eating");
    }
    public void sleep() 
	{
        System.out.println("Sleeping");
    }
}

public class monkey_imp 
{
    public static void main(String[] args) 
	{
        monkey obj = new human();
        obj.jump();
        obj.bite();
        basic_animal obj1 = new human();
        obj1.eat();
        obj1.sleep();

    }
}
