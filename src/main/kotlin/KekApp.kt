external fun require(module: String): dynamic
external val process: dynamic
external val console: dynamic

fun main(args: Array<String>) {
    val bodyParser = require("body-parser")
    val express = require("express")
    val app = express()
    val port = process.env.PORT ?: 3000

    app.use(bodyParser.json())
    app.use("/", RouterMapper.instance.router)
    app.listen(port, {
        println("Listening on port $port")
    })

    // Initialize resources
    BaseResource()
    InfoResource()
}
