# crafting-interpreters

Following Nystrom's book, Crafting Interpreters.
https://craftinginterpreters.com/

Two implementations of the Lox language
https://craftinginterpreters.com/the-lox-language.html

## jlox

The first implementation is an interpreter in Java. 
From the `/java/` directory, run this to compile all .java files to an output folder.

``` java
javac -d out/ lox/*.java
```

Then, there are two options. 

You can either pass in a file path to some source code, like so:

``` java
java -cp ./out com/crafting_interpreters/java/lox/Lox [<file_path>]
```

Or, open the REPL by running the class without any arguments

``` java
java -cp ./out com/crafting_interpreters/java/lox/Lox
```

In the REPL, you can type in some code and it would evaluate, print, and prompt the user again.

``` sh
jlox>var = "This is a string!"
IDENTIFIER var null
EQUAL = null
STRING "This is a string!" This is a string!
EOF  null

jlox> print "Hello World"
IDENTIFIER print null
STRING "Hello World" Hello World
EOF  null
```

