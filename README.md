# TalkBack-FOSS

## Introduction

This repository is the FOSS-friendly fork of Google's TalkBack, which is a screen
reader for blind and visually-impaired users of Android. For usage instructions,
see [TalkBack User Guide](https://support.google.com/accessibility/android/answer/6283677?hl=en).

## Changes from upstream

All changes are in the commits log. Below are the most important ones:

* Removed unnessesary Google dependencies and permissions (credits to [Tad](https://github.com/SkewedZeppelin) from [DivestOS](https://github.com/Divested-Mobile/talkback/) project)
* Braille input: Added support for French and Polish braille tables
* Various translation and typo fixes
* added Gradle Wrapper to simplify build process on various systems
* various improvements from [GrapheneOS](https://github.com/GrapheneOS/talkback) project by [Daniel Micay](https://github.com/thestinger)
* updated dependencies which may fix potencial security issues
* Added more instructions in the readme

There is also an issue tracker where various issues and improvements can be discussed. Unfortunately, the upstream code is not beeing developed openly and actively maintained.

## How to Build

To build TalkBack, run `gradlew assembleRelease` command and sign the apk.

## How to Install

Install the apk onto your Android device in the usual manner using adb.

## How to Run

With the apk now installed on the device, the TalkBack service should now be
present under Settings -> Accessibility, and will be off by default. To turn it
on, toggle the switch preference to the on position.

Alternatively you can do it via ADB:

> `adb shell settings put secure enabled_accessibility_services com.android.talkback/com.google.android.marvin.talkback.TalkBackService`

