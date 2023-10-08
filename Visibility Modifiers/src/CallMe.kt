class CallMe :MyInterface,NewInterface{
    override fun hello() {

        println("Hi")
    }

    override fun greeting() {
        println("New greeting")
    }

    override fun newMethod(){
        println("function of new interface")
    }

    }
