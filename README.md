# crafting-interpreters

Following Nystrom's book, Crafting Interpreters.
https://craftinginterpreters.com/

Two implementations of the Lox language
https://craftinginterpreters.com/the-lox-language.html

## jlox

The first implementation is an interpreter in Java. 
From the `/java/` directory, run the following command to compile the AST generator:

``` java
javac -d out/ lox/tool/*.java
```

Then run the AST generator to generate the necessary classes.

``` java
java -cp ./out com/crafting_interpreters/java/lox/GenerateAst ./lox
```

Then, run this to compile all .java files to an output folder.

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

## clox


