package org.Request

import org.Proxy.CleanGetRequest
import org.Proxy.HTTPGet
import java.io.File
import java.lang.Exception

class GetRequest(url : String) : GenericRequest(), HTTPGet {
    init {
        super.url = url
    }

    // to be changed by proxy
    override fun genericRequest(name: String) : Unit {
        try {
            val request: CleanGetRequest = CleanGetRequest(url)
            request.getResponse(name)
        }
        catch (e: Exception){
            println(e.message)
        }
    }

    override fun getResponse(name:  String) {
        println("VEEEEEry Safe request is proccesing: --->" + url)

        File(name).writeText(khttp.get(url).text)
    }
}