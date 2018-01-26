package sample.ooplab7;

//talking about student?
// 1. Student ID
// 2. Name
// 3. person ID
// 4. Address

public class Student {
    //properties of student class
    private String id;
    private String name;
    private String pid;
    private String address;
    //constructor
    //default constructor
    private Student () {}
    //create by own
    private Student (Student id, Student n, String pid, String a) {
        //assign data to class properties
        this.id = id;
        this.name = n;
        this.pid = pid;
        this.address = a;
    }
    //getter and setter methods

    public String get id() {
        return this id;
    }
    public void setId (String id){
        this.id = id;
    }
    public String getId () {
        return this id;
    public void setId (Student id) {
        this.id = Student id;
    }
}




