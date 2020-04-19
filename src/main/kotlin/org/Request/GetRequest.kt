package org.Request

import java.io.File

class GetRequest(url : String) : GenericRequest() {
    init {
        super.url = url
    }

    // to be changed by proxy
    override fun genericRequest(name: String) : Unit {
        println(url + "request is proccesing")

        File(name).writeText(khttp.get(url).text)
    }
}