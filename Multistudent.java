//this Keyword: To avoid name-space Collisions.

class Student{
     int rollno;
     String name, course;
     float fee;

     //constructor
     Student(int rollno, String name, String course){
           this.rollno = rollno;
           this.course = course;
           this.name = name;
     }


     //Reusing Constructor

     Student(int rollno, String course, float fee){
         this(rollno, name, course);
         this.fee= fee;
     }

     void display(){
         System.out.println("rollno" + "name" + "course" + "fee");
    }
}

class Multistudent
{
     public static void main(String[] args)
     {
          Student s = new Student();
          s.display();
          
     }
}

