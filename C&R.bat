@echo off
SET PATH=C:\Users\1168576\Stuff\jdk-13.0.2_windows-x64_bin\jdk-13.0.2\bin
SET CLASSPATH= C:\Users\1168576\Stuff\jdk-13.0.2_windows-x64_bin\jdk-13.0.2\lib
echo path and classpath have been set so that java 13.0.2 is being used.
echo.
echo -----END OF PART 1/3-----
echo -----START OF PART 2/3-----
echo.
echo starting compilation of the files...
echo.
javac *.java
echo.
echo finished compiling of %1!
echo.
echo -----END OF PART 2/3-----
echo.

echo.
echo -----START OF PART 3/3-----
echo.
echo.
java -classpath ..\ AnimalPicker
echo -----END OF PART 3/3-----
echo.
echo.
pause
