package com.kubino.learning;

import com.kubino.learning.Person.Person;

public class Main {
    public static void main(String[] args) {
        Person[] people = {new Person("John", 21, 23000 )
                ,new Person("Steve", 32, 40000 ), new Person("Martin", 16, 2700 )};


        System.out.println(getPeopleBudget(people));
    }

    private static int getPeopleBudget(Person... p) {
        var r = 0;

        for (var people : p) {
            r += people.getBudget();
        }

        return r;
    }
}
