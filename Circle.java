class Circle
{     double x, y;                 // variables define
      double r;
      
                                  //methods added 
       double circumference(){
           return 2*3.14159*r;
       }      
       
       double area(){
           return 3.14159*r*r;
       }
}  

class CircleDemo1        //The following class declare an object of type circle 
{
     public static void main(String[] args){
        Circle c = new Circle();
        c.x = 0.0;
        c.y = 0.0;
        c.r = 5.0;
        System.out.println("Circumference of Circle" + c.circumference());
        System.out.println("Area of Circle" + c.area());
     }
}