package org.Request

object KidsBrowser {
    private val requests: MutableMap<String, GenericRequest> = HashMap()
    private var noOfRequest: Int = 0

    //Prototype
    fun getReq(url: String): GenericRequest{
        return requests[url]!!.clone() as GenericRequest
    }

    //Facade
    fun getPostReq(url: String){
        val outputFileName: String = "RequestNotCleanNo"+ noOfRequest.toString() + ".html"
        noOfRequest++

        requests[url] = PostRequest(url)
        this.getReq(url).genericRequest(outputFileName)
    }

    fun getCleanReq(url: String){
        val outputFileName: String = "RequestCleanNo"+ noOfRequest.toString() + ".html"
        noOfRequest++

        requests[url] = GetRequest(url)
        this.getReq(url).genericRequest(outputFileName)
    }
}