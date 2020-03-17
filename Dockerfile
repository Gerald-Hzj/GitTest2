# Docker image for springboot file run
# VERSION 0.0.1
# Author: Zhang Zhaoxiong
# 基础镜像使用java
FROM java:8

MAINTAINER Zhang Zhaoxiong <zhaoxiongzhang@icloud.com>
ARG version=0.1-SNAPSHOT
CMD mkdir -p /opt/data
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp /opt/data
EXPOSE 8088
# 将jar包添加到容器中并更名为app.jar
ADD build/libs/OffcnStudentManageAPI-${version}.jar app.jar
# 运行jar包
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]