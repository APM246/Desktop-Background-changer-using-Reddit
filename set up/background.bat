javac -classpath ../jars/jsoup-1.12.1.jar;. ../src/*.java
java ../src/Downloader
gcc -o "../src/background" "../src/background.c"
"../src/background.exe"
del "../src/*.class"
del "../src/background.exe"
@pause