# hands-free-voice-assistant


## Description:

A simple hands free voice assistant written entirely in java
The files provided here are the exact 'Netbeans' project i have worked on.
You can download the entire project and open it as a netbeans project to test its functionality.
As java is processor and os independent, the exact code will work irrespective of which OS you are running be it Windows, Mac or Ubuntu with a slight moditifaction of 'Paths' which obviously differ from system to system.They are illustrated below.

## Features:

- Can answer your basic question like *'who is the prime minister of india'* with a voice output.
- Can open applications like chrome, word, notepad etc with voice commands like *'open browser'* ,*'open word'* etc.
- Can close the above mentioned applications with *'close browser'* etc
- Can open sites in your browser with voice commands like *'open google'*, *'open youtube'* etc.
- Can shut down and restart your system with voice commands
- Can play a very good tic tac toe game with you ;)(More games will be added in the future)

## How to get it working on your system

### Changing paths

![1](https://user-images.githubusercontent.com/19932246/41988636-6022af1e-7a5a-11e8-92a6-d6ef53e31972.PNG)

The above image shows a snippet of code to add the dictionary and language file for the sphinx4 voice model.The dictionary and language files i used are provided as *'2385.dic'* and *'2385.lm'*.They contain the grammar and sounds so that when we speak it can transform it into text.

![2](https://user-images.githubusercontent.com/19932246/41988637-609628fe-7a5a-11e8-9c24-c0f1565d5ec5.PNG)

The above image shows code for opening google chrome.

In `browser=new ProcessBuilder("PATH_TO_YOUR_EXE_FILE")`.Replace the PATH_TO_YOUR_EXE_FILE with the path in your system.

### Including Free TTS library

Free tts library is used to convert any text to speech.Download free tts from:

[Free tts](https://sourceforge.net/projects/freetts/files/)

It contains jar files in the lib folder.Add all of them into your project

### Including Sphinx4

In the below link search for Sphinx4-core and Sphinx4-data and download the .jar files  with a preAlpha release and add them into your project:

[Sphinx4](https://oss.sonatype.org/#nexus-search;quick~)

### Creating your own commands

[Sphinx Knowledge Base Tool](http://www.speech.cs.cmu.edu/tools/lmtool-new.html)

Use the above tool to create your own predefined dict and lm files.The documentation on the website is sufficient to understand the process

Thats it!! Do try it and any feedback is appreciated








