#Install Robolectric powered by Deckard (for Maven) (https://github.com/robolectric/deckard-maven)

1) Install maven

2) Download Android SDK from here :  
*Linux : http://dl.google.com/android/android-sdk_r23.0.2-linux.tgz*  
*MacOS : http://dl.google.com/android/android-sdk_r23.0.2-macosx.zip*

3) Add environment variable :
```bash
ANDROID_HOME="yourPATH"
```

4) Download and unpack installer in your project folder
```bash
wget https://github.com/robolectric/deckard-maven/archive/master.zip
unzip master.zip
```

5) Run setup.sh

6) Clean folder and clone this project
```bash
git clone https://github.com/MartinBaptiste/Robolectric-V-V.git
```

7) Open IntelliJ and open this project

8) Change the version of android in pom.xml
```xml
<plugin>
     <groupId>com.jayway.maven.plugins.android.generation2</groupId>
     <artifactId>android-maven-plugin</artifactId>
     <version>3.8.2</version>
     <configuration>
     <sdk>
          <platform>18</platform>
          <path>Your Android SDK path</path>
     </sdk>
     <undeployBeforeDeploy>true</undeployBeforeDeploy>
     </configuration>
     <extensions>true</extensions>
</plugin>
```

9) Run test with maven, enjoy test
