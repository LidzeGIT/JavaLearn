<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>mavenHome</groupId>
    <artifactId>mavenHome</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <aspectj.version>1.8.10</aspectj.version>
    </properties>

    <build>

        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.20</version>
                <configuration>
                    <testFailureIgnore>false</testFailureIgnore>
                    <argLine>
                        -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
                    </argLine>
                    <properties>
                        <property>
                            <name>listener</name>
                            <value>io.qameta.allure.junit4.AllureJunit4</value>
                        </property>
                    </properties>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>org.aspectj</groupId>
                        <artifactId>aspectjweaver</artifactId>
                        <version>${aspectj.version}</version>
                    </dependency>
                </dependencies>
            </plugin>

            <plugin>
                <groupId>io.qameta.allure</groupId>
                <artifactId>allure-maven</artifactId>
                <configuration>
                    <properties>
                        <allure.issues.tracker.pattern>http://example.com/%s</allure.issues.tracker.pattern>
                    </properties>
                </configuration>
            </plugin>
        </plugins>
    </build>
    <reporting>
        <plugins>
            <plugin>
                <groupId>ru.yandex.qatools.allure</groupId>
                <artifactId>allure-maven-plugin</artifactId>
                <version>2.2</version>
                <configuration>
                    <resultsPattern>target/allure-results</resultsPattern>
                    <reportVersion>1.4.0</reportVersion>
                </configuration>
            </plugin>
        </plugins>
    </reporting>


    <dependencies>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.5</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <version>1.7.5</version>
        </dependency>
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>3.1.1</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.14.3</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.rest-assured/json-path -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>json-path</artifactId>
            <version>3.0.0</version>
        </dependency>
        <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-junit4</artifactId>
            <version>2.7.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId> org.apache.cassandra</groupId>
            <artifactId>cassandra-all</artifactId>
            <version>0.8.1</version>

            <exclusions>
                <exclusion>
                    <groupId>org.slf4j</groupId>
                    <artifactId>slf4j-log4j12</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>log4j</groupId>
                    <artifactId>log4j</artifactId>
                </exclusion>
            </exclusions>

        </dependency>
    </dependencies>


</project>
