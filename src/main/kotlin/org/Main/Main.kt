package org.Main

import khttp.get
import org.Request.KidsBrowser
import java.io.File

fun main(args: Array<String>) {

    // getCleanReq will filter the links
    // getPostReq will NOT filter the links

    KidsBrowser.getCleanReq("https://kotlinlang.org/api/latest/jvm/stdlb/kotlin.text/remove-prefix.html")
    KidsBrowser.getCleanReq("https://www.pornhub.com")
    KidsBrowser.getCleanReq("https://stackoverflow.com/questions/12013416/is-there-any-way-in-android-to-force-open-a-link-to-open-in-chrome")
    KidsBrowser.getCleanReq("https://def.com")
    KidsBrowser.getPostReq("https://stackoverflow.com/questions/43857824/kotlin-static-methods-and-variables")

    // all request will begin when press start
    KidsBrowser.start()

    //for verification it creates files with the content of every page:
                                                                    // RequestCleanNo0, RequestNotCleanNo? ...
}


