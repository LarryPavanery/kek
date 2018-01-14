class InfoResource {
    init {
        println("Initializing InfoResource")
        var router = RouterMapper.instance.router

        router.get("/info", { req, res ->
            res.send(Response("Contact: @larrypavanery"))
        })

        router.post("/info", { req, res ->
            res.json(Response(req.body))
        })
    }
}
