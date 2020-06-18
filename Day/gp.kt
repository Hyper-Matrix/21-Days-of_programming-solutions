import java.lang.Math.pow
import java.util.*

fun main(args:Array<String>){
    var sum:Double = 0.0
var sc = Scanner(System.`in`)
    print("Enter 1st Number")
    var a = sc.nextInt()
    var f = a.toDouble()
    print("No of items")
    var b = sc.nextInt()
    var d = b.toDouble()
    print("Enter CD")
    var c = sc.nextInt()
    var m= c.toDouble()
    for( i in 1..b){

        print("${a}\n")
        a = a * c

    }
    var n =pow(m,d)

    var k =f*(n-1)

    var y =f*(1-n)
    if(c>1){
        sum = k/(m-1)
    }
    else
        if(c<1){
            sum = y/(1-m)
        }
    else
        {
            sum = a*d
        }
    print("${sum}")

}
