abstract class Animal{
protected int legs;
Animal(int l)
{
 legs=l;
}
abstract void eat();
void walk()
{
 System.out.println("This animal walks on "+legs+" legs");
}
}

interface Pet{
String getName();
void setName(String n);
void play();
}

class Spider extends Animal{
Spider()
{
 super((8));
}
void eat()
{ 
 System.out.println("The spider eats a fly");
}
}

class Cat extends Animal implements Pet{
String name;
Cat(String n)
{
 super(4);
 name=n;
}
Cat()
{
 this(" ");
}
String getName()
{ 
 return name;
}
void setName(String n)
{
 name=n;
}
void play()
{
System.out.println(name+"likes to play with ball");
}
void eat()
{
 System.out.println("Cats like to eat spiders and mice.");
}
}

class Fish extends Animal implements Pet{
String name;
Fish()
{
 super(0);
}
void setName(String n)
{
 name=n;
}
String getName()
{
 return name;
}
void play()
{
 System.out.println("Fish swim in their tanks all day");
}
void walk()
{
 System.out.println("Fish can't walk,they swim");
}
void eat()
{
 System.out.println("Fish eat pond scum");
}
}

class TestAnimals{
public static void main(String args[])
{
Fish f = new Fish();
Cat c = new Cat("Bunny");
Animal a = new Fish();
Animal e = new Spider();
Pet p=new Cat();
f.play();
f.eat();
c.play();
c.eat();
a.play();
a.eat();
e.play();
e.eat();
p.play();
p.eat();
}
}



