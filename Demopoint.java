//Encapsulation: Defining a class with method and parameters.

class Point
{
     int x, y ;
     void setpoint(int a , int b){
        x = a;
        y = b;
     }
}

//definition of another class , This is main class.

class DemoPoint{
      float distance;
     public static void main(String[] args){
          Point p = new Point();
          p.setpoint(15,20);
          System.out.println("x = " + p.x);
          System.out.println("y = " + p.y);
     }

}
