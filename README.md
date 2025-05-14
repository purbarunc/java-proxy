# java-proxy

This repository demonstrates simple ways of how we can create java proxies using CGLib and ByteBuddy libraries. Both are used in Spring framework as underlying bytecode instrumentation libraries.

**CGLib**<br/> 
https://github.com/cglib/cglib<br/> 
We need to add the below JVM Argument to make this work for JDK 17+<br/> 
```--add-opens java.base/java.lang=ALL-UNNAMED```<br/> 
Note: CGLibs recommends to use Bytebuddy and is not maintained anymore as given in the above link.<br/> 

**ByteBuddy**<br/>
https://bytebuddy.net/#/<br/>
https://github.com/raphw/byte-buddy<br/>

**Output/Result**<br/>
Output is same as below for all the 3 code samples:

```
before myMethod
Test
after myMethod
```
Without proxy output should be same as below:
```
Test
```
