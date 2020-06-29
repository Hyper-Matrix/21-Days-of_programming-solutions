
import java.util.*
fun main(args:Array<String>) {
    var c=""

    var sc = Scanner(System.`in`)
    print("enter string")
   var k = sc.nextLine()
    var list = k.split(" ").toMutableList()
    print("Enter string to be replaced")
    var str = sc.nextLine()
    print("what do you want to use")
    var rep = sc.nextLine()
    for(i in 1 until list.size){
        if(list[i]==str){
            list[i] = rep
        }

    }
    for(i in 0 until list.size){
c =c+ " "+ list[i]
    }
    print(c)

}


