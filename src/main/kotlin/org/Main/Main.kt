package org.Main

import khttp.get
import org.Request.KidsBrowser
import java.io.File

fun main(args: Array<String>) {

    KidsBrowser.getPostReq("https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/remove-prefix.html")

    KidsBrowser.getPostReq("https://www.youtube.com/watch?v=Gqrli3Lkf58 ")

    KidsBrowser.getCleanReq("https://stackoverflow.com/questions/12013416/is-there-any-way-in-android-to-force-open-a-link-to-open-in-chrome")
}


