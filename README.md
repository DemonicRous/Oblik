# Oblik

**Oblik — Redefine how Minecraft looks and feels.**

[Русская версия](README.ru.md)

Oblik is a NeoForge mod for Minecraft **1.21.1**, intended to provide comprehensive customization and improvements for Minecraft's existing interface and interfaces supplied by other mods.

The project is developed with the assistance of artificial intelligence (AI).
Developers: **DemonicRous, Codex**. License: **MIT**.

### Current status

Version **0.0.1** is the project foundation: common and client initialization, build tooling, and continuous integration. Interface customization, a public API, networking, and integrations with other mods are not implemented yet. The mod loads on both clients and dedicated servers; there are no server features or synchronization yet.

### Development

Requirements: a 64-bit **JDK 21** and an internet connection for the first build. Use the committed Gradle Wrapper; a separate Gradle installation is unnecessary.

| Task | Windows (PowerShell) | Linux / macOS |
| --- | --- | --- |
| Clean build | `.\gradlew.bat clean build` | `./gradlew clean build` |
| Run client | `.\gradlew.bat runClient` | `./gradlew runClient` |
| Run server | `.\gradlew.bat runServer` | `./gradlew runServer` |

Set `JAVA_HOME` to your JDK 21 installation if necessary. The client uses `run/`; the dedicated server uses `run-server/`. NeoForge development runs bypass the EULA check and may not generate `eula.txt`. For a normal dedicated server installation, read and accept the [Minecraft EULA](https://aka.ms/MinecraftEULA) yourself in its generated `eula.txt`; this project does not accept it on your behalf.

Build output: `build/libs/Oblik-1.21.1-0.0.1.jar`. Minecraft and mod versions are separate properties in `gradle.properties`. GitHub Actions builds each push and pull request and stores the JAR as an artifact; these artifacts are development builds, not releases.

The foundation uses NeoForge **21.1.252**, ModDevGradle **2.0.148**, Gradle **9.2.1**, and Parchment **2024.11.17** for Minecraft 1.21.1. It is based on the [official MDK](https://github.com/NeoForgeMDKs/MDK-1.21.1-ModDevGradle), revision `7819b902a351b03fe71db00754d103b5a31c4ebf`; its license is retained in `TEMPLATE_LICENSE.txt`.
