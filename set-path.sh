export CLASSPATH=.:/home/ugrad14/cchoi/Documents/git/lib/junit-4.12.jar:/home/ugrad14/cchoi/Documents/git/lib/hamcrest-core-1.3.jar:build/main


javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar Circle1Test.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore Circle1Test
