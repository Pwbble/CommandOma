# CommandOma

Versatile open-source command framework for Minecraft Spigot servers.

## FAQ

(Q) Why should I use CommandOma over the default Spigot command API, or any other framework?

(A) I've always used the Spigot command API, and there's absolutely nothing wrong with it; however, it doesn't offer support for many of the features that CommandOma tries to make up for. For example, CommandOma implements a system allowing developers to pass multiple arguments into a command, and much more! CommandOma is also made easy to learn, so you wont have to spend tons of time getting the feel for it when instead you could be writing code.

## Info

  Maintainer(s): Cory Torode

Currently, this command framework is still in early development, and thus does not function as initially intended. The README.md file also includes information intended for future use, so portions of it may not be applicable at this moment. Regardless of that however, I have included steps as well as an example project showcasing how you could implement CommandOma into your own plugin.

Note: If you have little to no experience with Java and the Spigot API, I strongly advise coming back to this library once you have acquired more Java and Spigot experience.

1. Prior to including CommandOma as one of your project libraries, it is absolutely crucial that you understand and comply with the rules and regulations of this project's license that restrict unfair use of this source. If you fail to comply with the restrictions underlined in the LICENSE, it could result in litigation.
2. Assuming you already have your project setup, include the library in your build system.

- maven pom.xml:
```xml
<repository>
    <!--> coming soon... <!-->
</repository>
```
```xml
<dependency>
    <groupId>oma.command</groupId>
    <artifactId>commandoma</artifactId>
    <version>__tag__</version> <!--> replace __tag__ with the version of CommandOma that you wish to use <!-->
    <scope>compile</scope>
</dependency>
```
- gradle, lorem ipsum
```
coming soon...
```
3. (Optional) Take a peek at CommandOma-example for an example as to how the command framework is intended to be used.
