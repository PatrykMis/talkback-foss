# TalkBack-FOSS

## Introduction

This repository is the FOSS-friendly fork of Google's TalkBack, which is a screen
reader for blind and visually-impaired users of Android. For usage instructions,
see [TalkBack User Guide](https://support.google.com/accessibility/android/answer/6283677?hl=en).

## Changes from upstream

All changes are in the commits log. Below are the most important ones:

* Removed unnessesary Google Mobile Services dependencies and permissions (credits to [Tad](https://gitlab.com/IratePorcupine) for [this patch on F-Droid repo](https://gitlab.com/fdroid/fdroiddata/-/blob/master/metadata/com.android.talkback/370044210-Remove-GMS-dependency.patch)
* Added support for Polish braille tables in Brailleime
* Various translation and typo fixes
* added Gradle Wrapper to simplify build process on various systems and build instructions in the readme.
* Added instruction how to run TalkBack without screen access.

There is also an issue tracker where various issues and improvements can be discussed. Unfortunately, the upstream code is not beeing updated too often.

## How to Build

To build TalkBack, run `./build.sh`, which will produce an apk file; or, issue `gradlew assembleRelease` command and sign the apk.

## How to Install

Install the apk onto your Android device in the usual manner using adb.

## How to Run

With the apk now installed on the device, the TalkBack service should now be
present under Settings -> Accessibility, and will be off by default. To turn it
on, toggle the switch preference to the on position.

Alternatively you can do it via ADB:

> `adb shell settings put secure enabled_accessibility_services com.android.talkback/com.google.android.marvin.talkback.TalkBackService`

