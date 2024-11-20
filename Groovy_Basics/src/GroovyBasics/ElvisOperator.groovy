// Define a method to demonstrate the Elvis operator
def getGreeting(String name) {
    // Use the Elvis operator to provide a default value if name is null or empty
    String greetingName = name ?: "Guest"
    return "Hello, ${greetingName}!"
}

// Example 1: Name is not null
String name1 = "John"
println getGreeting(name1) // Outputs: Hello, John!

// Example 2: Name is null
String name2 = null
println getGreeting(name2) // Outputs: Hello, Guest!

// Example 3: Empty string
String name3 = ""
println getGreeting(name3) // Outputs: Hello, Guest!

// Example 4: Inline usage
String defaultMessage = "This is the default messages."
String userMessage = null
println userMessage ?: defaultMessage // Outputs: This is the default message.
