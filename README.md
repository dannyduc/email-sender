# email-sender

Sample maven project with project local repository

To install libraries

    manually-downloaded-lib/install.sh

To generate library dependencies (dependency:copy) and execute

    mvn package
    java -jar target/email-sender.jar
    

To generate single jar and execute

    mvn clean compile assembly:single
    java -jar target/email-sender-jar-with-dependencies.jar