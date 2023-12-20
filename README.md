# TalkBack-FOSS

## Introduction

Welcome to TalkBack-FOSS, the FOSS-friendly fork of Google's TalkBack – a screen reader designed for Android users who are blind or visually impaired.
This repository prioritizes open-source principles, ensuring freedom, privacy and accessibility for all.

For detailed usage instructions, consult the [official TalkBack User Guide](https://support.google.com/accessibility/android/answer/6283677).

## Support

Join the conversation on Matrix: [#talkback-foss:matrix.org](https://matrix.to/#/#talkback-foss:matrix.org).

Feel free to contribute, report issues through our [issue tracker](https://github.com/talkback-foss-team/talkback-foss/), or discuss improvements via our [GitHub discussions](https://github.com/talkback-foss-team/talkback-foss/discussions/).

## Changes from upstream

All changes are documented in the commits log. Below are the most important ones:

* Removed unnecessary Google closed-source dependencies and permissions (credits to [Tad](https://github.com/SkewedZeppelin) from [DivestOS](https://github.com/Divested-Mobile/talkback/) project)
* Various translations and typo fixes
* added Gradle Wrapper to simplify build process on various systems
* various improvements from [GrapheneOS](https://github.com/GrapheneOS/talkback) project by [Daniel Micay](https://github.com/thestinger)
* updated dependencies which may fix bugs and potential security issues
* Expanded instructions in the readme

There is also an issue tracker where various issues and improvements can be discussed. Unfortunately, the upstream code is not being updated too often.

## How to Build

**NOTE:** This version won't build under Windows due to brltty incompatibilities. Patches are welcome. Use a GNU/Linux distribution, WSL2, or GitHub CI.

To build TalkBack, Issue the following command:

```bash
./gradlew build
```

Don't forget to sign the release APK if you plan to use it.

## How to Install and run

1. Install the APK on your Android device using the standard adb method.
2. With the APK installed, the TalkBack FOSS service should now appear under Settings -> Accessibility. By default, it will be turned off. Toggle the switch preference to the "on" position to activate it.

Alternatively, you can enable TalkBack via ADB:

```bash
adb shell settings put secure enabled_accessibility_services app.talkbackfoss/com.google.android.marvin.talkback.TalkBackService
```

## Versioning

Versions follow the format "v$UPSTREAM_VERSION_WITH_BUILD_NUMBER-$RELEASE", where:

* $UPSTREAM is the public, visible version of upstream release.
* $RELEASE is a letter `f` followed by this fork's release number.

For example, "v12.1.0.397273158-f01" signifies the first release based on upstream version "12.1.0.397273158".
