# jdk9-mrjar

- Package as the current project strucutre.

- Create the artifacts following the steps in https://blog.jetbrains.com/idea/2017/10/creating-multi-release-jar-files-in-intellij-idea/

- Execute the JAR as follows:-
➜  /Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/bin/java -jar out/artifacts/MultiReleaseJDKEightNine/MultiReleaseJDKEightNine.jar

Java 8: 3
java.lang.Thread.getStackTrace(Thread.java:1552)
com.stackoverflow.nullpointer.StackParser.getStack(StackParser.java:17)
com.stackoverflow.nullpointer.Main.main(Main.java:7)
sun.misc


➜  /Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/java -jar out/artifacts/MultiReleaseJDKEightNine/MultiReleaseJDKEightNine.jar  

Java 9: 2
com.stackoverflow.nullpointer.StackParser.getStack(StackParser.java:17)
com.stackoverflow.nullpointer.Main.main(Main.java:7)
jdk.unsupported -> sun.misc
