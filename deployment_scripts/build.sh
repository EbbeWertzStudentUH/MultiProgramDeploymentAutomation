#!/bin/bash
set -e  # Stop on error

mkdir -p artifacts/frontend
mkdir -p artifacts/java

echo "Building Launcher..."
mkdir -p launcher/build/libs
javac -d launcher/build/libs launcher/src/Launcher.java
jar --create --file=launcher/build/libs/Launcher.jar --main-class=Launcher -C launcher/build/libs .

echo "Building Java..."
mkdir -p java/build/libs
javac -d java/build/libs java/src/Main.java
jar cf java/build/libs/Main.jar -C java/build/libs .

echo "Building JS..."
cd frontend
neu build --release
cd ..

cp frontend/dist/frontend/frontend-win_x64.exe artifacts/frontend/frontend.exe
cp launcher/build/libs/Launcher.jar artifacts/Launcher.jar
cp java/build/libs/Main.jar artifacts/java/Main.jar

echo "Build complete!"
