
import java.util.*
fun main(args:Array<String>) {
    var count = 0
    var second=0
    var value = false
    var sc = Scanner(System.`in`)
    print("enter size")
   var n = sc.nextInt()
    var list2 = arrayListOf<Int>()
    print("Enter Scores")
for (i in 0 until n){
    list2.add(sc.nextInt())
}
    //print(list2)
    for (i in 0 until n){
        if(list2[i] >count ){
            second = count
            count = list2[i]
        }
        else{
            break
        }
    }
    print(second)
}


