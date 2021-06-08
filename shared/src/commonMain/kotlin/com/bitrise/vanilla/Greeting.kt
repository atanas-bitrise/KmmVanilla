package com.bitrise.vanilla

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}