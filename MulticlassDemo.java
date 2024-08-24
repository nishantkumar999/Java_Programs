//Multiple Classes used in a program of type Circle and Box

class Circle
{    
      double x, y;                 // variables define
      double r;
      
                                  //methods added 
       double circumference(){
           return 2*3.14159*r;
       }      
       
       double area(){
           return 3.14159*r*r;
       }
      

}
 
class Box
{     double width;
      double height; 
      double depth;                               // variables define
             
                                                   //methods added 
      double volume(){
           return width*height*depth;
       }      
       
       double area(){
           return (width*height + height*depth + depth*width) * 2;
              
       }
       
       
}

class MulticlassDemo{
     public static void main(String args[]){
          Circle c = new Circle();
          Box b = new Box();
          
           //Initialize the cirles and box objects          
          c.x = 1.0; c.y = 2.0; c.r = 3.0;
          b.width = 1.0; b.height = 2.0; b.depth = 3.0;

          System.out.println("Circumference of Circle = " + c.circumference()); 
          System.out.println("Area of Circle = " + c.area());
          System.out.println("Area of Box = " + b.area()); 
          System.out.println("Volume of Box = " + b.volume());


     }
}

 