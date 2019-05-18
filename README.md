# SignatureChecker

This is a library module built to get android app's signature(SHA-1 digested).

You can use java's [MessageDigest](https://docs.oracle.com/javase/7/docs/api/java/security/MessageDigest.html) class to get app signature directly,
but for security reason I chose to utilize NDK way. 

Yes, It's not perfectly secure, but at least it can make crackers to waste some more time, isn't it?

## How to setup

Run Gradle's <code>:signaturecheker/build</code> script, 
then you can find <code>signaturechecker-release.aar</code> in <code>*[project_path]*/sicnaturechecker/build/outputs/aar</code> path.

Copy and paste this aar file to your android project's <code>libs/</code> folder and follow the next step [described here.](https://stackoverflow.com/a/34919810)

Then you're ready to go!



(...Or just copy & paste signaturechecker module folder to your project :P)


## How to use

To get app's default signature string,
<pre><code>

...

SignatureChecker.getSignature(*activity*);

...

</code></pre>

To add salt string to your app's signature string,

<pre><code>

SignatureChecker.getSignature(*activity*, "ThisIsMySaltString");

</code></pre>

Salt string is converted to byte array and then passed as a parameter for [MessageDigest.Update()] method.

* I highly recommend to use salt string, and use this module with your own server to compare hash!
