# Exercise 1

First exercise, creating a basic CRUD via sockets using Swing, JasperReports, JFreeChart. Everything is done with Groovy and Java. Check further information about the practices and technologies check [RootReadme] (../../../../../README.md)

# How does it work?

Using a Swing interface which shows all the basic operations (Create , Read, Update, Delete) the user will be able to manage information about a students and it related career.

The application connects to a server (via TCP sockets) and extract information from a database (Mysql), all the information returns to the client to be used.

The user can create some charts (Pie, Bar, Histogram) just for information purposes. All the information in the databases will be seen on a pdf report via Jasper.

# Diagram

# How to run it?

On repository root folder, we just need to execute the next commands.

Server: 
```
./gradlew Ex1_ServerInstance
```

Client:
```
./gradlew Ex1_ClientInstance
```

# Extra information.

Any doubts about it! Try to contact me! [Twitter](http://twitter.com/jresendiz27)