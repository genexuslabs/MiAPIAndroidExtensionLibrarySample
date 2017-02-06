# MyAPI Android Extension Library Sample
This is the complete sample for [this article](http://wiki.genexus.com/commwiki/servlet/wiki?17878). It contains:
- A MyAPI `External Object` definition for GeneXus.
- An `Android Library` project of a `GeneXus Module` that implements it.

## Requirements
- GeneXus 15 (**Upgrade 3** or later)
- JDK
- Android SDK

For more details check [Android Requirements for GeneXus 15](http://wiki.genexus.com/commwiki/servlet/wiki?14449).

## Instructions

### Deploy the GeneXus Android Module to GeneXus
- Set the following environment variables:
    - `GENEXUS_HOME` to your GeneXus installation directory.
    - `ANDROID_HOME` to your Android SDK directory.
- Run the command `gradlew uploadArchives` from the project folder.

### Import the GeneXus Library definition to GeneXus
- Copy the `GXAndroidExtensions.library` file to `%GENEXUS_HOME%\Libraries\GXAndroidExtensions\`.
- Execute GeneXus with the /install parameter.

### Import the External Object definition to GeneXus
- Open GeneXus.
- Import the _MyAPI_ definition from `MyAPIExternalObjectDefinition.xpz`.

### Use it
Use the External object from any object (Smart Devices).

## Further reading

- [External Object definition](http://wiki.genexus.com/commwiki/servlet/wiki?6148)
- [Creating an Extension Library from scratch for Android](http://wiki.genexus.com/commwiki/servlet/wiki?33546)

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE.txt) file for more details.