package InlineFunction

/** Inline function instruct compiler to insert the complete body of the function wherever that function gets used in the code.**/

    fun main() {
        guide()
    }

    fun guide(){
        System.out.println("guide start")
        inlinefun()
        System.out.println("guide end")
    }

    inline fun inlinefun() {
        System.out.println("inlinefun start")
    }
