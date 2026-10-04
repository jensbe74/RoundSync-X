# RoundSync X - Rclone for Android
[![license: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://github.com/jensbe74/RoundSync-X/blob/master/LICENSE) [![Latest Downloads](https://img.shields.io/github/downloads/jensbe74/round-sync/latest/total
)](https://github.com/jensbe74/RoundSync-X/releases) [![GitHub release](https://img.shields.io/github/v/release/jensbe74/RoundSync-X?include_prereleases)](https://github.com/jensbe74/RoundSync-X/releases/latest) [![F-Droid](https://img.shields.io/f-droid/v/de.felixnuesse.extract?logo=fdroid&logoColor=white)](https://f-droid.org/packages/de.felixnuesse.extract/) [![IzzyOnDroid](https://img.shields.io/endpoint?url=https://apt.izzysoft.de/fdroid/api/v1/shield/de.felixnuesse.extract&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAMAAABg3Am1AAAA4VBMVEXn9cuv7wDB9iGp4x2k5gKh3B6k3SyAxAGd4ASo6gCv5SCW2gHA7UTB6V+EwiOw3lK36zC+422d1yO78SWs3kfR7JhQiw2751G7+QCz8gCKzgGq3zay5DSm2jrF9jZLfwmNyiC77zXO7oaYzjW37CLj9Lze8LLA43uz3mK19ACR1QBcnRO78R6ExBek1kbE8FLI6nSPu0jH5YJxtQ2b1RiAmz53uwF7pitZkAeX1w7I72TY8KTO8HXD7La+0pKizWBzhExqjytpmR+UzSTA5Ctzy3uv1nOv3gyF3UuCsDRHcEx7M2pHAAAAS3RSTlP//////////////////////////////////////////////////////////////////////////////////////////////////wDLGfCsAAAB9ElEQVRIx72W53biMBCFhY0L7g0bTAktQEwgdMhuerbO+z/Q2sBiY0uKcvacnX8a3Y/R8YyuQPDJQP8KoExcro6ZC6C4TQXQx/oLABV3cfozgBgL/AWY9ScAsR7oBCD2AmSAoD8A+J3cWYECdBEaVm2z+U1hAuDx4fr6a08PGuuf6cmys5QvMEz0c12zhPWaAYBq9emp9/DlTrMUXsBOaw5Yjl5elrG+u9tYAxbAtjeL+Z3Wdl83Ovfr3BQyYAZBoLXbHDfQ2hykTSEAAIu+2LRcl4tD6UCm67jPCvD4/ON5YRhGpzOdrlar74fT5IcvOxDD0Xg0nvU7hjGVttv+0vYyAgyQdNgeey3Hce5DSZqN9GZmvzh8UO0F3thsiY4gqGoUtuL2AeaKpom5brVMryEKvCyXZVX0urd0wOxy4qwh8jxfLlcqZafpYoH0MzQGnNI/6CulOASFc/NWlZ17ADEG3oWjvn5TEvjbfJuyrnFaSfdyrK/f1Gp1tTAHF750aqgUJUCsr5UizFUv3EeQwmOFekmVmABDCiNVlqNwOwEqcM75vp+s/asrKpAmdxM/Gbnfuz0j8OYnPw2v9AqZ5Nt+f7hikwkw2T3Fc2l2jzdcst3DpwGCnvQ+EPUEu8c/STSAqMfZPeX5IQK0J+a//zn5MP4Am7ISN/4mSV8AAAAASUVORK5CYII=)](https://apt.izzysoft.de/packages/de.felixnuesse.extract)
[![Documentation](https://img.shields.io/badge/Documentation-roundsync.com-4aad4e)](https://roundsync.com) [![supportive flags](https://img.shields.io/badge/support-🇺🇦_🏳️‍⚧_🏳️‍🌈-4aad4e)](https://roundsync.com)
[![Android Lint](https://github.com/jensbe74/RoundSync-X/actions/workflows/lint.yml/badge.svg)](https://github.com/jensbe74/RoundSync-X/actions/workflows/lint.yml)

A cloud file manager, powered by rclone.

> **Fork notice:** RoundSync X is a fork of [newhinton/Round-Sync](https://github.com/newhinton/Round-Sync), maintained by [jensbe74](https://github.com/jensbe74). It is developed independently and is not meant to be merged back into the original. It adds the task type [Copy + delete old files](#copy--delete-old-files-fork-addition). The in-app *About* screen shows this fork information as well.
Visit [https://roundsync.com](https://roundsync.com) for more information!


## Screenshots
<table>
  <tr style="border:none">
    <td style="border:none">
      <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/1.jpg" width="360vh" />
    </td>
    <td style="border:none">
      <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/2.jpg" width="360vh" />
    </td>
    <td style="border:none">
      <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/3.jpg" width="360vh" />
    </td>
  </tr>
</table>


## Features
|                                                            Cloud Access                                                             |                                    256 Bit Encryption<sup>[1](https://rclone.org/crypt/#file-encryption)</sup>                                     |                                                         Integrated Experience                                                         |
|:-----------------------------------------------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------:|
| <img src="https://github.com/jensbe74/RoundSync-X/blob/master/docs/cloud-computing.png?raw=true" alt="Cloud Access" width="144" />  | <img src="https://github.com/jensbe74/RoundSync-X/blob/master/docs/locked-padlock.png?raw=true" alt="256 Bit End-to-End Encryption" width="108" /> | <img src="https://github.com/jensbe74/RoundSync-X/blob/master/docs/smartphone.png?raw=true" alt="Integrated Experience" width="132"/> |
|                                             Use your cloud storage like a local folder.                                             |                                         Keep your files private on any cloud provider with crypt remotes.                                          |                                  Don't give up features or comfort just because it runs on a phone.                                   |

- **File Management** (list, view, download, upload, move, rename, delete files and folders)
- **Streaming** (Stream media files, serve files and directories over FTP, HTTP, WebDAV or DLNA)
- **Integration** (Access local storage devices and share files with the application to store them on a remote)
- **Many cloud storage providers** (all via rclone config import, some without ui-setup)
- **Material 3 Design** (Dark theme)
- **All architectures** (runs on ARM, ARM64, x86 and x64 devices, Android 7+)
- **Storage Access Framework (SAF)** ([see docs](https://roundsync.com/usage/saf.html)) for SD card and USB device access.
- **Intentservice** to start tasks via third party apps!
- **Task Management** to allow regular runs of your important tasks!
- **Copy + delete old files** (fork addition): a task type that copies everything to the target and afterwards deletes files in the source that are older than a configurable age (minutes, hours, days or years), but only if they are verified at the target (checksums are compared). Available for local → remote and remote → local. See [Copy + delete old files](#copy--delete-old-files-fork-addition).


## Installation

Grab the [latest version](https://github.com/jensbe74/RoundSync-X/releases/latest) of the signed APK and install it on your phone.
| CPU architecture | Where to find | APK identifier |
|:---|:--|:---:|
|ARM 32 Bit | older devices | ```armeabi-v7a``` |
|**ARM 64 Bit** | **most devices** | ```arm64-v8a``` |
|Intel/AMD 32 Bit | some TV boxes and tablets | ```x86``` |
|Intel/AMD 64 Bit | some emulators | ```x86_64``` |

If you don't know which version to pick use ```roundsyncx-<version>-universal-release.apk```. Most devices run ARM 64 Bit, and 64 Bit devices often can also run the respective 32 bit version at lower performance. The app runs on any phone, tablet or TV with Android 7 or newer, as long as you have a touchscreen or mouse.

The F-Droid and IzzyOnDroid builds are the original app by newhinton and do **not** include the fork additions. This fork is only distributed through its [GitHub releases](https://github.com/jensbe74/RoundSync-X/releases); the in-app update check and the *Report a bug* link also point to this fork.

## Usage
[See the documentation](https://roundsync.com/).


## Copy + delete old files (fork addition)
Besides *Sync* and *Copy*, a task can use one of the directions *Copy local to remote, then delete old local files* or *Copy remote to local, then delete old remote files*. Set the age ("Delete source files older than") in minutes, hours, days or years.

A run works in two steps:
1. `rclone copy` copies **all** files and folders to the target (filters apply).
2. Only if step 1 finished without errors, `rclone move --min-age <age> --checksum` removes source files older than the age. rclone deletes a source file only after it was verified at the target, or if an identical file was already there. Newer files stay untouched.

Notes:
- The age refers to the **modification time of the source file**, not the creation or run date.
- Checksums are always compared in the second step, independent of the task's checksum option. Remotes without a common hash with the source may therefore leave files undeleted.
- An age greater than 0 is required.
- Empty source folders are not removed.

## Intents
This app includes the ability to launch an intent! Create a task to sync to a remote, and copy it's id (via the treedot-menu)
The intent needs the following:

| Intent          |                   Content                   |                 |
|:----------------|:-------------------------------------------:|----------------:|
| packageName     |     io.github.jensbe74.roundsyncx          |                 |
| className       | ca.pkay.rcloneexplorer.Services.SyncService |                 |
| Action          |                 START_TASK                  |                 |
| Integer Extra   |                    task                     |        idOfTask |
| Boolean Extra   |                notification                 |   true or false |


## Libraries
- [rclone](https://github.com/rclone/rclone) - Calling this a library is an understatement. Without rclone, there would not be Round Sync. See https://rclone.org/donate/ to support rclone.
- [Jetpack AndroidX](https://developer.android.com/license)
- [Floating Action Button SpeedDial](https://github.com/leinardi/FloatingActionButtonSpeedDial) - A Floating Action Button Speed Dial implementation for Android that follows the Material Design specification.
- [Glide](https://github.com/bumptech/glide) - An image loading and caching library for Android focused on smooth scrolling.
- [MarkdownJ](https://github.com/myabc/markdownj) - converts markdown into HTML.
- [Material Design Icons](https://github.com/Templarian/MaterialDesign) - 2200+ Material Design Icons from the Community.
- [Recyclerview Animators](https://github.com/wasabeef/recyclerview-animators) - An Android Animation library which easily add itemanimator to RecyclerView items.
- [Toasty](https://github.com/GrenderG/Toasty) - The usual Toast, but with steroids.
- Icons from [Flaticon](https://www.flaticon.com) courtesy of [Smashicons](https://www.flaticon.com/authors/smashicons) and [Freepik](https://www.flaticon.com/authors/freepik)


## Contributing
See [CONTRIBUTING](./CONTRIBUTING.md)

Anyone is welcome to contribute and help out. However, hate, discrimination and racism are decidedly unwelcome here. If you feel offended by this, you might belong to the group of people who are not welcome. I will not tolerate hate in any way.

If you want to add more translations, see our [weblate-project](https://hosted.weblate.org/projects/round-sync/round-sync/)!

## Developing

The application id is `io.github.jensbe74.roundsyncx`, so RoundSync X can be installed alongside the original Round Sync.

You should first make sure you have:

- Go installed and in your PATH (the version in `de.felixnuesse.extract.goVersion` in `gradle.properties`, currently 1.24)
- Java installed and in your PATH
- Android SDK command-line tools installed OR the NDK version specified in `gradle.properties`
  installed

You can then build the app normally from Android Studio or from CLI by running:

```sh
# Debug build
./gradlew assembleOssDebug

# or release build
./gradlew assembleOssRelease
```


## License
This app is released under the terms of the [GPLv3 license](https://github.com/newhinton/extract/blob/master/LICENSE). Community contributions are licensed under the MIT license, and [CLA Assistant](https://cla-assistant.io/) will ask you to confirm [a CLA stating that](https://gist.githubusercontent.com/x0b/889f037d76706fc9e3ab8ee1c047841b/raw/67c028b19e33111428904558cfda0c01039d1574/rcloneExplorer-cla-202001) if create a PR.


## About this app
This is a fork of [**RCX**](https://github.com/x0b/rcx) by **x0b**<sup>[x0b](https://github.com/x0b)</sup> which is itself a fork of [**rcloneExplorer**](https://github.com/patrykcoding/rcloneExplorer) by **Patryk Kaczmarkiewicz**<sup>[patrykcoding](https://github.com/patrykcoding)</sup> .

If you want to convey a modified version (fork), we ask you to use a different name, app icon and package id as well as proper attribution to avoid user confusion.
