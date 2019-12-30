cd "../src"
javac -classpath ../jars/jsoup-1.12.1.jar;. *.java
java -classpath ../jars/jsoup-1.12.1.jar;. Downloader

gcc -o background background.c
background.exe
del *.class
del background.exe
@pause