package com.example.pico

sealed class HttpError(val code:Int){

    data class UnAuthorized(val reason:String):HttpError(401)
    object notFound:HttpError(404)

    fun doSomething(){

    }

}

enum class HttpErrorEnum(val code: Int){

    UnAuthorized(401),
    notFound(404);

    fun doSomething(){

    }

}
