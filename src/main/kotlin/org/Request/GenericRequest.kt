package org.Request

open class GenericRequest() : Cloneable {

    var url : String = ""

    open fun genericRequest(name: String) {}

    public override fun clone() : Any {
        var clone : Any? = null
        try{
            clone = super.clone()
        }
        catch (e : CloneNotSupportedException){
            e.printStackTrace()
        }
        return clone!!
    }
}