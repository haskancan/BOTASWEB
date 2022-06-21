<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

<groupId>GFKTEST</groupId>
<artifactId>testAutomations</artifactId>
<version>1.0-SNAPSHOT</version>

<properties>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
<maven.compiler.source>1.8</maven.compiler.source>
<maven.compiler.target>1.8</maven.compiler.target>

<junit.version>4.12</junit.version>
<slf4j.version>1.7.28</slf4j.version>
<logback.version>1.2.3</logback.version>
<allure-testng-version>2.13.9</allure-testng-version>
<surefire.version>3.0.0-M3</surefire.version>
<jfairy.version>0.6.0</jfairy.version>
<htmlunit.version>2.33.3</htmlunit.version>
<chromedriver.version>3.141.59</chromedriver.version>
</properties>

<dependencies>

<dependency>
<groupId>com.devskiller</groupId>
<artifactId>jfairy</artifactId>
<version>${jfairy.version}</version>
</dependency>
<dependency>
<groupId>org.apache.httpcomponents</groupId>
<artifactId>httpclient</artifactId>
<version>4.5.10</version>
</dependency>

<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-chrome-driver</artifactId>
<version>${chromedriver.version}</version>
</dependency>
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>htmlunit-driver</artifactId>
<version>${htmlunit.version}</version>
</dependency>
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>${junit.version}</version>
<scope>test</scope>
</dependency>

<dependency>
<groupId>org.slf4j</groupId>
<artifactId>slf4j-api</artifactId>
<version>${slf4j.version}</version>
</dependency>

<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-java</artifactId>
<version>7.0.0</version>
<scope>test</scope>
</dependency>

<dependency>
<groupId>ch.qos.logback</groupId>
<artifactId>logback-classic</artifactId>
<version>${logback.version}</version>
</dependency>

<dependency>
<groupId>ch.qos.logback</groupId>
<artifactId>logback-core</artifactId>
<version>${logback.version}</version>
</dependency>

<dependency>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-report-plugin</artifactId>
<version>${surefire.version}</version>
<type>maven-plugin</type>
</dependency>

</dependencies>

<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>${surefire.version}</version>
<configuration>
<runOrder>alphabetical</runOrder>
<argLine>-Dfile.encoding=${project.build.sourceEncoding}</argLine>
<testFailureIgnore>true</testFailureIgnore>
<includes>
<include>*/seleniumTests/*.java</include>
<!--                        <include>**/BotasLogin*.java</include>-->
<!--                        <include>**/FiltreliArama*.java</include>-->
<include>*/seleniumTests/*.java</include>
<!--                        <include>**/GFKgiris*.java</include>-->
<!--                        <include>**/GFKGorevEkle*.java</include>-->
<!--                        <include>**/MagazaSorgulama*.java</include>-->
<!--                        <include>**/gorevSorgulama*.java</include>-->


<!--<include>**/package/*.java</include>
                       <include>**/package/*.java</include>-->
                    </includes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.7.1</version>
            </plugin>
        </plugins>
    </build>

    <reporting>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>${surefire.version}</version>
            </plugin>
        </plugins>
    </reporting>
</project>