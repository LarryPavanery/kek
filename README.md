# Kotlin + Express + Kotlin - KEK

### Tech

Kek uses a number of open source projects to work properly:

* [kotlin] - Statically typed programming language for modern multiplatform applications
* [node.js] - evented I/O for the backend
* [Express] - fast node.js network app framework

### Installation

Kek requires [Node.js](https://nodejs.org/) v8+ to run.

```sh
$ cd kek
$ npm install #(will install dependencies)
$ ./gradlew build #(will compile Kotlin to JavaScript)
$ npm start #(this runs: node node/index.js)
```
>Open the browser on http://localhost:3000/

### Check code style

To check code style - `./gradlew ktlint`.  
To run formatter - `./gradlew ktlintFormat`.

### Plugins

Kek is currently extended with the following plugins. Instructions on how to use them in your own application are linked below.

| Plugin | README |
| ------ | ------ |
| ktlint | [plugins/ktlint/README.md] [ktl] |

License
----

MIT


**Free Software, Hell Yeah!**

[ktl]: https://github.com/shyiko/ktlint/blob/master/README.md