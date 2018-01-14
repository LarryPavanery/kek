/**
* https://medium.com/@adinugroho/singleton-in-kotlin-502f80fd8a63
*/
public class RouterMapper private constructor() {
    init {
        println("This ($this) is a singleton")
    }

    private object Holder {
        val INSTANCE = RouterMapper()
    }

    companion object {
        val instance: RouterMapper by lazy { Holder.INSTANCE }
    }

    val express = require("express")
    val router = express.Router()
}
