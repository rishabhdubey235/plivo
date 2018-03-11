Steps for running locally
- Download tomcat : http://www-eu.apache.org/dist/tomcat/tomcat-8/v8.5.28/bin/apache-tomcat-8.5.28.tar.gz
- Install maven2
- cd to repo dir and run : mvn clean install
- copy the war file from ./target folder to tomcat's webapp directory
- rename the war file to ROOT.war
- run http://localhost:8080