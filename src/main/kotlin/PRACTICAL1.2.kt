fun main()
{
    var int:Int=14
    var double:Double=7.2
    var str:String="210"
    println("Integer: $int")
    println("Double: $double")
    println("String: $str")
    double = int.toDouble()
    println("Integer To Double: $double")
    int = str.toInt()
    println("String to Integer: $int")
    double = str.toDouble()
    println("String to Double: $double")
}