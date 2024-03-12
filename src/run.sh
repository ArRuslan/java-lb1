#!/bin/bash

export PATH=~/.jdks/corretto-17.0.10/bin:$PATH
cd main/java

rm ua/nure/jfm/task1/*.class
rm *.class

javac ua/nure/jfm/task1/*.java Demo.java
java Demo