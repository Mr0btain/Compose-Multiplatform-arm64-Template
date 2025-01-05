# Compose Multiplatform Template arm64

A Template that should build and run on linux and windows arm64 in intellij idea without the kotlin-natives prebuilts
error that you get with the new templates.

## Running on Desktop
  To run on desktop youll need to add a config. at the top beside run hit add config

  ![alt text](https://github.com/Mr0btain/Compose-Multiplatform-arm64-Template/blob/main/readmeimages/editconfig.png?raw=true)

  in the top right of the Run/Debug Config screen that pops up hit the plus symbol.
  Select gradle config
  in the name you can name it something like desktopApp
  Under run you want to put composeApp:run

  ![alt text](https://github.com/[Mr0btain]/[Compose-Multiplatform-arm64-Template]/blob/[main]/readmeimages/runsettings.png?raw=true)

  After saving this config and hitting run you should end up with something like this

  ![alt text](https://github.com/[Mr0btain]/[Compose-Multiplatform-arm64-Template]/blob/[main]/readmeimages/example.png?raw=true)

## IOS
  Building for IOS has been disabled so it will build on linux and windows. to enable it uncomment the section for IOS 
  in the gradle build file in composeApp directory.
  
   ![alt text](https://github.com/[Mr0btain]/[Compose-Multiplatform-arm64-Template]/blob/[main]/readmeimages/ios.png?raw=true)


## From original ReadMe

  This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.
