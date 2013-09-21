#
# Gets executed in pom.xml during mvn package
# Comment out pom.xml exec plugin when already installed
#

#mvn install:install-file -Dfile=manually-downloaded-lib/xmlsec-1.4.4-sources.jar \
#  -DgroupId=org.apache.santuario -DartifactId=xmlsec \
#  -Dversion=1.4.4 -Dpackaging=jar \
#  -Dclassifier=sources \
#  -DlocalRepositoryPath=project-local-repo

#mvn install:install-file -Dfile=manually-downloaded-lib/javamail-1.3.2.jar \
#  -DgroupId=javax.mail -DartifactId=mail \
#  -Dversion=1.3.2 -Dpackaging=jar \
#  -DlocalRepositoryPath=project-local-repo

#mvn install:install-file -Dfile=manually-downloaded-lib/activation-1.0.2.jar \
#  -DgroupId=javax.activation -DartifactId=activation \
#  -Dversion=1.0.2 -Dpackaging=jar \
#  -DlocalRepositoryPath=project-local-repo