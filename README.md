# spring-boot-tutorial
ReZero Spring Boot Course free to learn

## 0. Course Zero - Before and begin
### 1. Introduction
- I will guide you with this main document: README.md
- Need to learn first: 
    + Markdown readme docs language: https://www.markdownguide.org/basic-syntax/
    + Java language: https://www.javatpoint.com/java-tutorial
    + Java and OOP: https://www.javatpoint.com/java-oops-concepts
- Some optional must know:
  + Restful API
  + Database, SQL language, RDMS(relational database management system)
  + Oauth2 definition
  + What is Spring Framework - and their history
  + git - version source control tool
  + How to use IntelliJ Idea
- PlantUml syntax (optional) for draw diagram in MarkDown(md) file:
  - home page: https://www.plantuml.com/
  - enable it in IntelliJ Idea: File | Settings | Languages & Frameworks | Markdown | PlantUml
- Course will be mark with Tag of Git, please follow it. For ex: Tag course_0_introduction

### 2. Prepare to install tools
- JDK 20
- IntelliJ Idea or Eclipse Java or NetBean for Java develop tool
- Maven mvn installed

### 3. Checking environment
- Maven is the dependency management tool for Java like npm in java-script
- in Windows, maven cached dependency jars file in user's home dir: `%userprofile%\.m2\repository\`
- in Linux & MacOs, maven cached dependency jars file in user's home dir: `~/.m2/repository/`
- You can download jdk20 in Ida tool like this:
  
  ![Download jdk20](img/jdk20.png)
  - after installed, go to ProjectStructure menu > Project SDK > choose Jdk 20
  - add to `PATH` environment variable that folder(google Windows or Linux Path variable): `C:\Users\hieu1\.jdks\openjdk-20.0.2\bin`
  - add Environment for java home(google): JAVA_HOME=`C:\Users\hieu1\.jdks\openjdk-20.0.2`

We can check environment by some command:
> java --version
```log
openjdk 20.0.2 2023-07-18
OpenJDK Runtime Environment (build 20.0.2+9-78)
OpenJDK 64-Bit Server VM (build 20.0.2+9-78, mixed mode, sharing)
```
> mvn --version
```log
Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
Maven home: F:\Documents\apache-maven-3.8.6
Java version: 11.0.16.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.16.1
Default locale: en_US, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```