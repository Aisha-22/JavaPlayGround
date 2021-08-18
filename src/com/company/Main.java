package com.company;

public class Main {

    public static void main(String[] args) {

        Aisha aisha = new Aisha();

        aisha.print_About_Me();
    }
}
class Aisha {
    //Returns a String
    public String myName(){
        return "My name is Aisha";
    }
    public String myNameWithArg(String myName){
        return "My name is " + myName;
    }
    //Returns an int
    public int myAge(){
        return 29;
    }
    public int myAgeWithArg(int age){
        return age;
    }
    //    Does not return anything aka void
    public void print_About_Me(){
        System.out.println(this.myName());
        System.out.println(this.myAge());
        System.out.println(this.myAgeWithArg(29));
        System.out.println(this.myNameWithArg("Aisha"));
    }

}
