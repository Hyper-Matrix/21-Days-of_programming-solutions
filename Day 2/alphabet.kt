import java.lang.Math.sqrt
import java.util.*
import kotlin.math.sqrt

fun main(args:Array<String>){
    var c = 'A'
var sc = Scanner(System.`in`)
    print("Enter Rows")
    var m = sc.nextInt()
    var space=m+1
       for(i in 1..m){

for(j in 0 until space){
print(" ")
}
           for(j in 1..i) {

               print(c+j-1)

           }
           for(j in i-1 downTo 1 ) {

               print(c+j-1)

           }
           print("\n")
space--


       }
}




