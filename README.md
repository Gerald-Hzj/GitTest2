# StudentManageSystemAPI

学生管理系统的Java实现版本

# 修改项目配置参数
```
src/main/resources/application.properties
```

# 生成IDEA项目
```
./gradlew idea
```

# 编译并生成可执行的 jar文件
```
./gradlew build
```
默认版本为 0.1-SNAPSHOT 如果需要指定版本号，使用version参数，例如：
```
./gradlew -Pversion=0.2 build
```

# 编译并将可执行的jar文件上传到仓库
```
./gradlew publish
```

# 创建本地docker镜像
```
docker build -t offcn/offcnapi .
```

# 将docker镜像上传到指定的私有仓库
```
docker tag 1f0fb2d80e6a 192.168.137.201:5000/offcn/offcnapi
docker login http://192.168.137.201:5000
docker push 192.168.137.201:5000/offcn/offcnapi
```


# 下载最新版本的docker image
```
docker pull 192.168.137.201:5000/offcn/offcnapi
```