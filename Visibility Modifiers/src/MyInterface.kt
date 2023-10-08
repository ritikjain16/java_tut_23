// no constructors in interface
interface MyInterface {

//    function without any implementations / body can be write in interface
    fun hello()

//    function with default implementation
    fun greeting()= println("Hello there")
}