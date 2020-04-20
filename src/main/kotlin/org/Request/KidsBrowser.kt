package org.Request

import khttp.request

object KidsBrowser {
    // map with url as Key and Generic Request class as value ( can be either Post or Get aka Clean or Not Clean) !
    private val requests: MutableMap<String, GenericRequest> = HashMap()
    private var noOfRequest: Int = 0

    //map with url as key and outputFileName as value
    private var allReq: MutableMap<String, String> = HashMap()

    //Prototype
    fun getReq(url: String): GenericRequest{
        return requests[url]!!.clone() as GenericRequest
    }

    //Facade
    fun getPostReq(url: String){
        val outputFileName: String = "RequestNotCleanNo"+ noOfRequest.toString() + ".html"
        noOfRequest++
        this.allReq[url] = outputFileName

        requests[url] = PostRequest(url)

    }

    fun getCleanReq(url: String){
        val outputFileName: String = "RequestCleanNo"+ noOfRequest.toString() + ".html"
        noOfRequest++
        this.allReq[url] = outputFileName

        requests[url] = GetRequest(url)
    }

    fun start(){
        for((url,outputName) in allReq){
            this.getReq(url).genericRequest(outputName)
        }
    }
}