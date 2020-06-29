
import java.util.*
fun main(args:Array<String>) {

    var sc = Scanner(System.`in`)
    print("enter time")
   var k = sc.nextLine()
   var m = k.split(" ").toMutableList()

if(m[1]== "PM"){
  var z = k.split(":"," ").toMutableList()
    var n = z[0].toInt()
    n +=12
    print("${n}:${z[1]}:${z[2]}")
}
    else
    print(m[0])
}


