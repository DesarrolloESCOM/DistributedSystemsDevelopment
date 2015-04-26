# Exercise 4

**RMI CALCULATOR**. 

For further information about the practices and technologies check [RootReadme] (../../../../../README.md)

# What does it do?
 
 **RMI CALCULATOR** uses the basic calculator skeleton from *EX2*, replaces the sockets and now uses Java RMI for 
 executing the specific operations.
 
 For further information about how to use the calculator check [Excersice 2](../EX2/README.md)
 
 Here's a image about the algorithm.
 *TODO: implement image*

# How does it work?

Using a Java RMI server and a Swing interface we connect the operations of the remote object, each operation will be called
via RMI and all the results will be seen inside the Swing containers.

To execute the exercise we need to run the server and then the client using gradle tasks.

*Server*


```
$./gradlew Ex4_ServerInstance
```

*Client*


```
$./gradlew Ex4_ClientInstance
```

# Pictures

*TODO: Add images*

# Extra information.

Any doubts about it! Try to contact me! [Twitter](http://twitter.com/jresendiz27)