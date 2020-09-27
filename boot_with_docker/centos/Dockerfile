FROM centos:7

RUN yum -y update
RUN yum -y install wget
RUN yum -y install unzip

# install mysql5.7
RUN yum localinstall -y https://dev.mysql.com/get/mysql57-community-release-el7-11.noarch.rpm
# setting for mysql version 5.6
#  RUN yum-config-manager --disable mysql57-community
#  RUN yum-config-manager --enable mysql56-community

RUN yum install -y mysql mysql-server

# install java 
RUN yum install -y java-1.8.0-openjdk
RUN yum install -y java-1.8.0-openjdk-devel

# install gradle
RUN wget https://services.gradle.org/distributions/gradle-6.4.1-bin.zip
RUN unzip -d /opt/gradle /gradle-6.4.1-bin.zip
RUN rm -rf /gradle-6.4.1-bin.zip
RUN ls /opt/gradle/

# setting path
ENV GRADLE_HOME /opt/gradle/gradle-6.4.1
ENV JAVA_HOME /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el7_8.x86_64
ENV PATH ${JAVA_HOME}/bin:${GRADLE_HOME}/bin:${PATH}



