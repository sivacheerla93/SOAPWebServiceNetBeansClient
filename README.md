### Client program for SOAPWebServiceNetBeans Project

#### Project Configuartion:
* OS: Windows 8.1 64-bit
* Language: Java 8
* IDE: NetBeans 8.2
* Server: GlassFish Server 4.1.1 coming with NetBeans

#### Steps to create project:
##### 1. Open NetBeans -> Click on New Project -> Select Java -> Choose Java Application -> Click Next
![](/screenshots/Client1.png)

##### 2. Give any name and check Create Main Class and then click Finish
![](/screenshots/Client2.png)

##### 3. Right click on project -> New -> Select Web Service Client
###### Note: If you don't find Web Service Client option, then follow Step 4, Otherwise follow Step 5
![](/screenshots/Client3.png)

##### 4. Right click on project -> Other -> Web Services -> Select Web Service Client
![](/screenshots/Client4.png)

##### 5. Go to your Service project web page and click on WSDL File
![](/screenshots/Client5.png)

##### 6. Now copy WSDL URL
![](/screenshots/Client6.png)

##### 7. After proceeding with Step 3, You'll get a New Web Service Client Window -> Then choose WSDL URL -> Paste the WSDL URL as we copied from browser i.e., Step 6
![](/screenshots/Client7.png)

##### 8. Go to Source Packages in the project folder -> Expand Client package -> Open CalculatorClient.java file
![](/screenshots/Client8.png)

##### 9. Go to Web Service References in the project folder -> Calcualtor Service -> Calculator Service -> CalculatorServicePort -> Now drag & drop the Addition operation to CalculatorClient.java file(Note: Outside the main block)
![](/screenshots/Client9.png)

##### 10. Call the Addition operation with parameters -> Right click on Project -> Do Clean and Build
![](/screenshots/Client10.png)

##### 11. Now run CalculatorClient.java and notice the result!
![](/screenshots/Client11.png)


### Note:
Please don't edit this project as it is open source or public repository, If you find any error or want to give any suggestion, create a issue or write to sivacheerla@live.com