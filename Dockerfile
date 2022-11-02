FROM openjdk:17-alpine as build
ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"
LABEL stage=intermediate
WORKDIR /home/app

COPY gradlew .
COPY settings.gradle .
COPY gradle gradle
COPY build.gradle .
COPY src src

#COPY libs libs
RUN ./gradlew build -x test

FROM openjdk:17-alpine
MAINTAINER ZiuzinDima
ENV JAVA_OPTS=""
ENV SPRING_PROFILE="default"
ENV APP_HOME /opt/textTranslator
ENV LOG_FOLDER="$APP_HOME/log"
ENV JAR_NAME=textTranslator.jar
ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"
VOLUME /tmp
VOLUME $APP_HOME
VOLUME $APP_HOME/log
VOLUME $APP_HOME/files
VOLUME $APP_HOME/templates

WORKDIR $APP_HOME
COPY --from=build /home/app/build/libs/*SNAPSHOT.jar $JAR_NAME
RUN chmod -R 777 $APP_HOME

EXPOSE 5006
CMD exec java $JAVA_OPTS \
-Dfile.encoding=UTF-8 \
-Djava.net.preferIPv4Stack=true \
-Dlogs.base.dir=$LOG_FOLDER \
-Dspring.profiles.active=$SPRING_PROFILE \
-jar $JAR_NAME