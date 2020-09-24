# StudentManageSystemAPI

学生管理系统的Java实现版本

## 修改项目配置参数
```
src/main/resources/application.properties
```

## 生成IDEA项目
```
./gradlew idea
```

## 编译并生成可执行的 jar文件
```
./gradlew build
```
默认版本为 0.1-SNAPSHOT 如果需要指定版本号，使用version参数，例如：
```
./gradlew -Pversion=0.2 build
```

## 编译并将可执行的jar文件上传到仓库
```
./gradlew publish
```

上面的命令将会把编译打包好的jar文件上传到 nexus3服务器 192.168.137.201上。



## 下载jar文件

从本地仓库下载最新的SNAPSHOT（快照）版本的软件：

```bash
wget -O OffcnStudentManageAPI-0.1-SNAPSHOT.jar "http://192.168.137.201:8081/service/rest/v1/search/assets/download?sort=version&repository=maven-snapshots&maven.groupId=com.offcn&maven.artifactId=OffcnStudentManageAPI&maven.baseVersion=0.1-SNAPSHOT&maven.extension=jar"
```

从本地仓库下载最新的Release（发行）版本版本的软件：

```bash
wget -O OffcnStudentManageAPI-0.2.jar "http://192.168.137.201:8081/service/rest/v1/search/assets/download?sort=version&repository=maven-releases&maven.groupId=com.offcn&maven.artifactId=OffcnStudentManageAPI&maven.baseVersion=0.2&maven.extension=jar"
```



## 使用jar文件启动服务

（1）、根据配置文件`application.properties`的配置项，将准备好的sqlite3数据库文件放置到对应的目录，然后使用下面的命令即可：

```
java -jar OffcnStudentManageAPI-0.1-SNAPSHOT.jar
```

（2）、如果要使用自己定义的properties文件，则在 OffcnStudentManageAPI-0.1-SNAPSHOT.jar 文件所在的目录下创建 config目录，然后将源代码中的`application.properties` 文件复制到config目录下，修改该文件后，使用步骤1中的命令启动服务即可。

访问： http://your_ip_address:8088/api/v1/departments/ 验证服务是否启动。

## 创建本地docker镜像

```
docker build -t offcn/offcnapi .
```

## 将docker镜像上传到指定的私有仓库

```
docker tag offcn/offcnapi 192.168.137.201:5000/offcn/offcnapi
docker login -u admin -p 12345678 http://192.168.137.201:5000
docker push 192.168.137.201:5000/offcn/offcnapi
```


## 下载最新版本的docker image

```
docker pull 192.168.137.201:5000/offcn/offcnapi
```



## 使用docker文件启动服务

（1）、创建容器：使用`192.168.137.201:5000/offcn/offcnapi` 镜像的最新版本创建一个名称为myoffcnapi的容器，将本机的8088端口映射到容器的8088端口，将本机的/opt/data目录挂接到容器的 /opt/data目录。

```bash
docker create --name myoffcnapi -t -p 8088:8088 -v /opt/data:/opt/data  192.168.137.201:5000/offcn/offcnapi
```

（2）、启动容器：

```
docker start myoffcnapi
```

（3）、监控容器日志：

```
docker logs -f myoffcnapi
```

（4）、停止容器

```
docker stop myoffcnapi
```

访问： http://192.168.137.200:8088/api/v1/departments/ 验证容器是否启动成功。