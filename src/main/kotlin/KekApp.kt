external fun require(module: String): dynamic

fun main(args: Array<String>) {
    val express = require("express")
    val process = require("process")
    val app = express()
    val port = process.env.PORT ?: 3000

    app.get("/", { _, res ->
        res.type("text/plain")
        res.send("Hello KEK!")
    })

    app.listen(port, {
        println("Listening on port $port")
    })
}
