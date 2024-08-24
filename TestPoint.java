//A program that use simple point class and naive initialization of its data.

class Point
{
     int x ;
     int y ;
} 

class TestPoint{
     public static void main(String[] args){
          Point mypoint = new Point();

     mypoint.x = 10;    //Assign values to mypoint instance variable
     mypoint.y = 20;
     
    //access the values from mypoint instanc variables
     System.out.println("x = " + mypoint.x);
     System.out.println("y = " + mypoint.y);
     }
}

