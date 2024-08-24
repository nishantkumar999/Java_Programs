//Multiple Constructor or Constructor Overloading with multiple Objects of type circle
 
class Circle
{                                     
     double x, y;                                     // variables define
     double r;
     
     Circle(double x, double y, double r){            // constructor first
          this.x = x; this.y = y; this.r = r;
     }
      
     Circle(double r){                             //constructor second
          x = 0; y = 0; this.r = r;     
     }

     Circle(Circle c){                            // constructor third
          x = c.x; y = c.y; r = c.r;              
     }
     
     Circle(){                                   // constructor fourth
          x = 0.0; y = 0.0; r = 1.0; 
     }

      double circumference(){                    // Methods Added
           return 2*3.14159*r;
      }
      
      double area(){
           return 3.14159*r*r;
      } 

}    
 
class CircleBar{
     public static void main(String args[]){
          Circle c1 = new Circle(30,40,50);
          Circle c2 = new Circle(50);
          Circle c3 = new Circle(c1);
          Circle c4 = new Circle();
          System.out.println("Circumference of Circle1 " + c1.circumference());
          System.out.println("Area of Circle1 " + c1.area());
          System.out.println("Circumference of Circle2 " + c2.circumference());
          System.out.println("Area of Circle2 " + c2.area());
          System.out.println("Circumference of Circle3 " + c3.circumference());
          System.out.println("Area of Circle3 " + c3.area());
          System.out.println("Circumference of Circle4 " + c4.circumference());
          System.out.println("Area of Circle4 " + c4.area());
      
     }   
}







