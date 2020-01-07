to build, you need the freetts 1.2.2 library.
(Download it from [SourceForge](http://sourceforge.net/projects/freetts/files/FreeTTS/FreeTTS%201.2.2/))
(But It already downloaded. See it in project folder.)

Next, Copy contents of `freetts-1.2/lib` of zip file into `lib` folder of this project.
Or Just do this: 
```
unzip ./freetts-1.2.2-bin.zip -d freetts-1.2.2-bin
cp -r ./freetts-1.2.2-bin/freetts-1.2/lib/ ./
rm -r ./freetts-1.2.2-bin
```

Then `sbt run`.
