fun main(){


    val text:String = "Rishika"
    println("Simply printing text value(Not null): $text")

    // what if we directly assign a null value ...we will
    // face an error which shows that can't assign null to non-nullable type.

      //val text1:String = null
    val text1:String? = null
    println("Text1 value when it holds null value is: $text1")

    val text2:String = null.toString()
    println("Without defining it as null: $text2")

}
