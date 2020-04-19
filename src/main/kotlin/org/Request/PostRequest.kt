package org.Request
import khttp.get
import khttp.requests.Request
import khttp.responses.Response
import java.io.File

class PostRequest(url : String) : GenericRequest() {
    init {
        super.url = url
    }

    override fun genericRequest(name: String) : Unit {
        println(url + "request is proccesing")

        File(name).writeText(get(url).text)
    }
}