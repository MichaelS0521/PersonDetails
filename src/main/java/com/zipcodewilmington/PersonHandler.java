package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int length = personArray.length;
        int counter = 0;
        while (counter < length) {      // while `counter` is less than length of array
            result += personArray[counter];     // use `counter` to identify the `current Person` in the array
            counter = counter + 1;      // get `string Representation` of `currentPerson`
            System.out.printf(result);
        }

        return result;
    }



    public String forLoop() {
        String result = "";

        for (int counter = 0; counter < personArray.length; counter++){
            result += personArray[counter];
            System.out.printf(result);
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";

        for (Person counter : personArray){
            result += counter;
            System.out.printf(result);
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
