# Actorbase JVM driver connector

This is the source code of the JVM driver connector for Actorbase.

## Compile the code
* Open a terminal and go to the source folder
* run: `sbt compile`

## Use the JVM driver

Create a new connection:
`val connection = Driver.connect("address", port, "username", "password")`

Execute a query:
`connection.executeQuery("Query")` 

Close the connection:
`connection.closeConnection()`
