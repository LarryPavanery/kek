external fun require(module: String): dynamic

fun main(args: Array<String>) {
    println("Hello KEK!")

    val express = require("express")
    val app = express()

    app.get("/", { _, res ->
        res.type("text/plain")
        res.send("Hello KEK!")
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}
