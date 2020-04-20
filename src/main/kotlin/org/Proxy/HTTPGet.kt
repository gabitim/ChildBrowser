package org.Proxy

interface HTTPGet {
    @Throws(Exception::class)
    fun getResponse(name: String)
}