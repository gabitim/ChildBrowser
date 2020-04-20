package org.Proxy

import org.Request.GetRequest
import java.lang.Exception


class CleanGetRequest(var url: String) : HTTPGet {
    private val myrequest: GetRequest = GetRequest(url)

    companion object {
        private var bannedWords: MutableList<String> = mutableListOf()

        init {
            bannedWords.add("porn");
            bannedWords.add("sex");
            bannedWords.add("xxx");
            bannedWords.add("stackoverflow");
        }
    }

    // check if any of the banned words is in the url
    override public fun getResponse(name: String) {
        for( word in bannedWords){
            if( url.contains(word, ignoreCase = true)){
                throw java.lang.Exception("Access Denied")
            }
        }

        myrequest.getResponse(name)
    }
}