#Install Robolectric powered by Deckard (for Maven) (https://github.com/robolectric/deckard-maven)

1) Install maven

2) Download Android SDK from here : 
Linux : http://dl.google.com/android/android-sdk_r23.0.2-linux.tgz
MacOS : http://dl.google.com/android/android-sdk_r23.0.2-macosx.zip

3) Add environment variable :
ANDROID_HOME="yourPATH"

4) Download and unpack installer in your project folder
wget https://github.com/robolectric/deckard-maven/archive/master.zip
unzip master.zip

5) Run setup.sh

6) Clean folder and clone this project
git clone https://github.com/MartinBaptiste/Robolectric-V-V.git

7) Open IntelliJ and open this project

8) Change the version of android in pom.xml
<dependency>
     <groupId>android</groupId>
     <artifactId>android</artifactId>
     <version>4.3.1_r3</version>
     <scope>provided</scope>
</dependency>

9) Add hamcrest core dependency
<dependency>
     <groupId>org.hamcrest</groupId>
     <artifactId>hamcrest-core</artifactId>
     <version>1.3</version>
</dependency>

10) Run test with maven, enjoy test
