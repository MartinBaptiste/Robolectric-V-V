#Install Robolectric powered by Deckard (for Maven) (https://github.com/robolectric/deckard-maven)

1) Install Maven

2) Download Android SDK from  :  
*Linux : http://dl.google.com/android/android-sdk_r23.0.2-linux.tgz*  
*MacOS : http://dl.google.com/android/android-sdk_r23.0.2-macosx.zip*

3) Define ANDROID_HOME environment variable :
```bash
export ANDROID_HOME="yourPATH"
```

4) Download and unpack installer in your project folder
```bash
wget https://github.com/robolectric/deckard-maven/archive/master.zip
unzip master.zip
```
4-1) Create a symbolic link to android executable
```bash
sudo ln -s $ANDROID_HOME/tools/android /bin/android
```

5) Run setup.sh

6) Clean project folder and clone the current project
```bash
git clone https://github.com/MartinBaptiste/Robolectric-V-V.git
```

7) Run IntelliJ and open this project

8) Change SDK compiler to Android SDK 18 (4.3.1) or 19 (4.4.2) "File -> Project Structure." and set "Project Settings -> Project -> Project SDK -> Edit"

9) Change the version of android in pom.xml if needed
```xml
<plugin>
     <groupId>com.jayway.maven.plugins.android.generation2</groupId>
     <artifactId>android-maven-plugin</artifactId>
     <version>3.8.2</version>
     <configuration>
     <sdk>
          <platform>18</platform>
          <path>${env.ANDROID_HOME}</path>
     </sdk>
     <undeployBeforeDeploy>true</undeployBeforeDeploy>
     </configuration>
     <extensions>true</extensions>
</plugin>
```

10) Run the test suite with Maven or jUnit, enjoy your tests.
