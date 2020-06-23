
import java.util.*
fun main(args:Array<String>){
var i = 7
    var j = 0.0
    var sum =0
var sc  = Scanner(System.`in`)
    print("Input binary digit")
var c = sc.nextLine().trim()
    var d = c.split("")
    var  m = d.toMutableList()
m.removeAt(0)
    m.removeAt(8)
   // print(m)
while(i>=0 && j<=8.0){
    var k  =m[i].toInt()
    var l = k*(Math.pow(2.0,j))
   // print(l)
    sum = sum+ l.toInt()
    i--
    j++
}
    var p:Char = sum.toChar()
    print(p)
}

