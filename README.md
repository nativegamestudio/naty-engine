# natty-engine

<div align="center">
<img src="https://user-images.githubusercontent.com/93536412/227720045-6f8f4242-8c3f-4bec-a807-f41b69ed3139.png" width="500">

![version](https://img.shields.io/badge/version-1.1-brightgreen)
![platform](https://img.shields.io/badge/platform-Android-brightgreen)
![minSdk](https://img.shields.io/badge/minSdk-21-brightgreen)
![license](https://img.shields.io/badge/license-MIT-brightgreen)

<img src="https://user-images.githubusercontent.com/93536412/227760931-fe5e06c5-7623-4bb5-b00f-00820c949b9b.png" width="500">

**Natty Engine is an open-source 2D Android game engine help you built game in Android Studio**
</div>

---

## Features
* :rocket: **Entity** - Sprite, Animation, ParticleSystem, Modifier...
* :musical_note: **Audio** - Audio control with Andriod SoundPool and MediaPlayer API
* :atom: **Physic** - Pixel perfect collision using spatial partitioning
* :joystick: **Input** - Touch, Acceleration and Orientation support
* :open_file_folder: **Asset** - Texture, Audio, and Android Resource management tool
* :gear: **UI** - Native Android UI with Fragment, Dialog, Button...

## Setup
Add the jitpack
```groovy
allprojects {
    repositories {
    ...
    maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency
```groovy
dependencies {
    implementation 'com.github.nativegamestudio:natty-engine:<version>'
}
```

## Game Project
[<img src="https://user-images.githubusercontent.com/93536412/227769818-765004b1-7ed5-4b88-9156-1e3d9fd15dcb.png" width="70">](https://github.com/nativegamestudio/juicy-match) 
[<img src="https://user-images.githubusercontent.com/93536412/227769871-22eb91ff-d72d-45c4-b217-ce3fe44111ac.png" width="70">](https://github.com/nativegamestudio/animals-pop)

## License
 Natty Engine is licensed under the [MIT license](https://github.com/nativegamestudio/natty-engine/blob/master/LICENSE)
