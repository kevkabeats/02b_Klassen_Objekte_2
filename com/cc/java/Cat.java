package com.cc.java;

public class Cat {

    // Eigenschaften / Felder / Attribute
    private String firstName;
    private String furColor;
    private int age;

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }

    /* GETTER */
    public String getFirstName() {
        if (getPermission()) {
            return firstName; 
        } else {
            return "Sorry, no permission!";
        }
    }

    private boolean getPermission(){
        // return true;
        return false;
    }


    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

     /* SETTER */

    public void setAge(int age) {
        this.age = age;
    }

    // return der Instanzvariablen / Adresse
    public Cat getInstanceVariable(){
       return this;
    }

}
