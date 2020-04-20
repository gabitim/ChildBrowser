package org.Main

import khttp.get
import org.Request.KidsBrowser
import java.io.File

fun main(args: Array<String>) {

    KidsBrowser.getCleanReq("https://kotlinlang.org/api/latest/jvm/stdlb/kotlin.text/remove-prefix.html")

    KidsBrowser.getCleanReq("https://www.youtube.com/watch?v=Gqrli3Lkf58 ")

    KidsBrowser.getCleanReq("https://stackoverflow.com/questions/12013416/is-there-any-way-in-android-to-force-open-a-link-to-open-in-chrome")

    KidsBrowser.getCleanReq("def.com")

    KidsBrowser.getPostReq("https://stackoverflow.com/questions/43857824/kotlin-static-methods-and-variables")

}


