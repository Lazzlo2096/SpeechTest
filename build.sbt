scalaVersion := "2.11.1" // "2.12.8" - не резолвиться депенденси

// libraryDependencies += "net.sf.sociaal" % "freetts" % "1.2.2"

libraryDependencies += "de.sciss" %% "fileutil" % "1.1.1" // не мой репозиторий, и похоже он его подготовил для мавена, лол.

fork in run := true //обязательно, иначе ошибки какие-то, лол.
