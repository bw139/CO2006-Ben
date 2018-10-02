<link rel='stylesheet' href='web/swiss.css'/>

# Integrated Development Environment Contest

Create a Java project and add the class [Message.java](./Message.java) under the folder `src` and the file [text.txt](./text.txt) under the root folder of the project. Then **desk check** that your application runs and that the message `Smoke` appears on the output console. 

The **challenge** consists in decrypting the messages `firstMessage()` and `secondMessage()`. The words appearing in the given  file [text.txt](./text.txt) have been hashed in the variable `map`, that is they have been recorded as entries `hashCode |-> word`. In order to decrypt the message, follow the control flow of your program step by step **using the Java debugger** and inspect the word obtained after accessing an entry of `map` with a given hash code, e.g. with `map.get(hashCode)`. Each such access will yield a word that you must write, in the order in which it appears as the program executes.

Once you have decrypted the messages, call a TA and you will be asked to demonstrate how you obtained the message. Those who did not use the Java debugger to solve the challenge cannot qualify as a winner.

We'll record the first ten quickest teams/students on the score board that solved the problem using the Java debugger.

**Good luck!** 

Once you solve this challenge, complete the exercises of the worksheet.

Please register your solution in [this form](https://goo.gl/forms/2CtJObboPgn8SiHI2). Solutions will be processed in FIFO order (order of reception).