
import java.util.*
fun main(args:Array<String>) {

    var sc = Scanner(System.`in`)
    print("enter List")
   var k = sc.nextLine()
   var m = k.split(" ").toMutableList()
    print(m)
var  q = m[0]
    var z = m[m.size-1]
    m[0] = z
    m[m.size-1] = q
print("\n${m}")
}


