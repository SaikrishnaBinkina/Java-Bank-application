/*
Student Management

Create two interfaces Sports and Academics.

Sports should contain a method play().
Academics should contain a method study().
Create a Student class that implements both interfaces.
Display the student's sports and academic activities.



Create two interfaces Shopping and Payment.

Shopping should contain a method addToCart().
Payment should contain a method makePayment().
Create an OnlineCustomer class that implements both interfaces.
Display the shopping and payment operations.


*/
interface sports{
    void play();
}
interface academics{
    void study();
}

class student implements sports, academics{
    public void play(){
        System.out.println("Student is playing");
    }
    public void study(){
        System.out.println("Student is studying");
    }
}
class multipleinterface{
    public static void main(String[] args) {

        //student obj
        student s = new student();
        s.play();
        s.study();
        
    }
}