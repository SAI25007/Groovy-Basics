package GroovyBasics

// Define a class with nested properties
class Person {
    String name
    Address address
}

class Address {
    String city
    String state
}

// Create a Person instance with some properties as null
Person person = new Person(name: "John Doe", address: null)

// Use the null-safe operator to safely access properties
println "Person's Name: ${person.name}" // Outputs: John Doe
println "Person's City: ${person.address?.city}" // Outputs: null (without throwing an error)
println "Person's State: ${person.address?.state}" // Outputs: null (without throwing an error)

// Assign nested properties using null-safe operator
person.address?.state = "California" // This won't cause an error even though address is null

// Assign a value to the address and then access properties
person.address = new Address(city: "San Francisco", state: "California")
println "Person's Updated City: ${person.address?.city}" // Outputs: San Francisco
println "Person's Updated State: ${person.address?.state}" // Outputs: California


