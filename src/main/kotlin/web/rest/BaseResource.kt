class BaseResource {
    init {
        println("Initializing BaseResource")
        var router = RouterMapper.instance.router

        router.get("/", { req, res ->
            res.send(Response("Hello World!"))
        })

        router.post("/", { req, res ->
            res.json(Response(req.body))
        })
    }
}
