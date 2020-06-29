
import java.util.*
fun main(args:Array<String>) {
var odd= 0
    var even = 0
    var sc = Scanner(System.`in`)
    print("enter number")
   var k = sc.nextLong()
    var  m = k.toString().split("").toMutableList()
    m.removeAt(0)
    m.removeAt(m.size-1)
    //print(m)
for(i in 0 until m.size){
    if(i%2==0){
        even += m[i].toInt()
    }
    else
    {
        odd += m[i].toInt()
    }
}
    if(even-odd == 0){
        print("YES")
    }
    else
        print("NO")
}


