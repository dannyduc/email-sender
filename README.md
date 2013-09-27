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


To run individual class

    mvn exec:java -Dmail.debug=true -Dexec.mainClass=com.ingenuity.SendEmail

locale charmap

    uebuild1: UTF-8
    uehudson4: ANSI_X3.4-1968
    utbdajm1: UTF-8
