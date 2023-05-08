# TalkBack-FOSS

## Introduction

This repository is the FOSS-friendly fork of Google's TalkBack, which is a screen
reader for blind and visually-impaired users of Android. For usage instructions,
see [TalkBack User Guide](https://support.google.com/accessibility/android/answer/6283677?hl=en).

## Support

Matrix: [#talkback-foss:matrix.org](https://matrix.to/#/#talkback-foss:matrix.org)

## Changes from upstream

All changes are in the commits log. Below are the most important ones:

* Removed unnecessary Google dependencies and permissions (credits to [Tad](https://github.com/SkewedZeppelin) from [DivestOS](https://github.com/Divested-Mobile/talkback/) project)
* Various translations and typo fixes
* added Gradle Wrapper to simplify build process on various systems
* various improvements from [GrapheneOS](https://github.com/GrapheneOS/talkback) project by [Daniel Micay](https://github.com/thestinger)
* updated dependencies which may fix bugs and potential security issues
* Added more instructions in the readme

There is also an issue tracker where various issues and improvements can be discussed. Unfortunately, the upstream code is not beeing updated too often.

## How to Build

**NOTE**! This version won't build under Windows due to brltty incompatibilities, patches are welcome. Use a GNU/Linux distribution, WSL2 or GitHub CI.

To build TalkBack, Issue `./gradlew build` command. Sign the release apk first if you would like to use it.

## How to Install

Install the apk onto your Android device in the usual manner using adb.

## How to Run

With the apk now installed on the device, the TalkBack service should now be
present under Settings -> Accessibility, and will be off by default. To turn it
on, toggle the switch preference to the on position.

Alternatively you can do it via ADB:

<code>adb shell settings put secure enabled_accessibility_services app.talkbackfoss/com.google.android.marvin.talkback.TalkBackService</code>

## Versioning

Versions are in form "v$UPSTREAM_VERSION_WITH_BUILD_NUMBER-$RELEASE" where:

* $UPSTREAM is the public, visible version of upstream.
* $RELEASE is a letter `f` followed by this fork's release.

e.g. 12.1.0.397273158-f01 means first release based on upstream 12.1.0.397273158 version.
