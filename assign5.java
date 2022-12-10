class Shape{
String name;
Shape()
{
 name="none";
}
public String getName()
{
return name;
}
}

interface Area{
void cal_area();
}

interface Volume{
void cal_vol();
}

class Circle extends Shape implements Area
{
 double radius;
 Circle(double r,String n)
 {
  radius = r;
  name=n;
 }
 void cal_area()
 {
  System.out.println("Area of Circle:"+(3.14*radius*radius));
 }
}

class Square extends Shape implements Area
{
 double side;
 Square(double s,String n)
 { 
  side=s;
  name=n;
 }
 void cal_area()
 {
  System.out.println("Area of Square :"+(side*side));
 }
}

class Cylinder extends Circle implements Volume
{
 double height;
 Cylinder(double h,double r,String s)
 {
  height h;
  super(r,s);
 }
 void cal_vol()
 {
  System.out.println("Volume of cylinder :"+(3.14*radius*radius*height));
 }
}

class Sphere extends Circle implements Volume
{
 Sphere(double r,String n)
 {
  super(r,n);
 }
 void cal_vol()
 {
  System.out.println("Volume of the Sphere :"+(4*3.14*radius*radius*radius));
 }
}

class Cube extends Square implements Volume
{
 Cube(double s,String n)
 { 
  super(s,n);
 }
 void cal_vol()
 {
  System.out.println("Volume of the Cube:"+(side*side*side));
 }
}

class Glome extends Sphere implements Volume
{
 Glome(double r,String s)
 { 
  super(r,s);
 }
 void cal_vol()
 {
  System.out.println("Volume of Glome:"+(2*3.14*3.14*radius*radius*radius));
 }
}

class assign5{
public static void main(String args[])
{
 Circle c= new Circle(5.0,"Circle");
 c.cal_area();
 Square s=new Square(4.0,"Square");
 s.cal_area();
 Cylinder cy=new Cylinder(10.0,5.0,"Cylinder");
 cy.cal_vol();
 Sphere sp=new Sphere(8.0,"Sphere");
 sp.cal_vol();
 Cube cu=new Cube(7.0,"Cube");
 cu.cal_vol();
 Glome g=new Glome(15.0,"Glome");
 g.cal_vol();
}
}
  