package com.junitDemo;

public class TestClassGit {
    String name;
    int age;
    boolean isMarried ;

    private TestClassGit (String name, int age, boolean isMarried ){this.name = name; this.age = age; this.isMarried = isMarried;

    }
     void displayInfo ( ){
         System.out.println("Name of the student: "+name);
         System.out.println("Age of the student: "+age);
         System.out.println("Marriage status of the student: "+isMarried);
     }

    public static void main(String[] args) {

        TestClassGit ob1 = new TestClassGit ("Binoy", 39, true);
        ob1.displayInfo();
    }

}
