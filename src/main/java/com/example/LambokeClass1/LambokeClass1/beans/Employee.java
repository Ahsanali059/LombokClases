package com.example.LambokeClass1.LambokeClass1.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/*
     @Data Generate getter and setter and toString method equals and hashcode method
     @NoArgsConstructor generate no argument Constructor
     @RequiredArgsConstructor generate Argument Constructor
     @AllArgsConstructor generate all Constructor
     @Getter @Setter generate getter and setter
     @ToString Generate ToString method
     @EqualAndHash generate two method toString and hashcode method
     @Builder
          The @Builder annotation in Lombok is used to automatically generate a builder pattern for your class. The builder pattern is a design pattern that provides an alternative way to construct complex objects by specifying the parameters in a readable and expressive manner. The builder pattern is especially useful when a class has many optional parameters or configurations.



 */



@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee
{
    private String name;
    private int Id;

    private String salary;

    private String joiningDate;


}
