# Project Title: Automation of Calculator app on Android Using Appium

### Project Summary: The Calculator app offered by Google LLC on google playstore has been automated in this test automation project. The calculation of a series containing addition, subtraction, multiplication and division has been automated. 

## Prerequisites  
* JDK 11
* IntelliJ IDEA
* Gradle
* Libraries:
  * Selenium
  * TestNG
  * Allure
  * Java Client
* Android Studio  
* Appium
* Appium Inspector

## How to setup the environment?  
* Copy library name from the Gradle section on [https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) and paste it in build.gradle file in the project folder
* Copy library name from the Gradle section on [https://mvnrepository.com/artifact/org.testng/testng](https://mvnrepository.com/artifact/org.testng/testng) and paste it in build.gradle file in the project folder
* Copy library name from the Gradle section on [https://mvnrepository.com/artifact/io.qameta.allure/allure-testng](https://mvnrepository.com/artifact/io.qameta.allure/allure-testng) and paste it in build.gradle file in the project folder
* Copy library name from the Gradle section on [https://mvnrepository.com/artifact/io.appium/java-client](https://mvnrepository.com/artifact/io.appium/java-client) and paste it in build.gradle file in the project folder
* Click on the gradle icon on IntelliJ IDEA
* Click on the 'Reload All Gradle Projects' icon
* Turn on the emulator and start the Appium server using `appium` command

## How to run?  
Run the following command in the terminal inside the project directory:  
`gradle clean test`

## How to generate Allure report?  
Run the following command in the terminal inside the project directory:  
* `allure generate allure-results`  
* `allure serve allure-results`

## Output  
### Report 
 ![app_automation_allure_overview](https://github.com/user-attachments/assets/f397a5e7-1eed-42fb-9ffe-563b106067ef)
<br>
<br>
![app_automation_allure_behaviors](https://github.com/user-attachments/assets/0852f641-0967-462c-bb11-a04659b4d1b5)
<br>
<br>  
### Demonstration video
Please click the link to watch the video:  
https://drive.google.com/file/d/1cxi-Tp_tIN7zSagVtvMPfrxdhPSchYTY/view?usp=sharing
