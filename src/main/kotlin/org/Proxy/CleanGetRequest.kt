package org.Proxy

import org.Request.GetRequest


class CleanGetRequest(var url: String) : HTTPGet {
    private val myrequest: GetRequest = GetRequest(url)

    companion object {
        private var bannedSites: MutableList<String> = mutableListOf()

        init {
            bannedSites.add("https://www.youtube.com/watch?v=Gqrli3Lkf58 ");
            bannedSites.add("def.com");
            bannedSites.add("ijk.com");
            bannedSites.add("lnm.com");
        }
    }

    override public fun getResponse(name: String) {
        if(bannedSites!!.contains(url!!)){
            throw java.lang.Exception("Access Denied")
        }
        myrequest.getResponse(name)
    }
}