
import java.util.*
fun main(args:Array<String>){
var count0 = 0
    var count1 = 0
    var count2 = 0
    var count3 = 0
    var count4 = 0
    var count5 = 0
    var count6 = 0
    var count7 = 0
    var count8 = 0
    var count9 = 0
var sc = Scanner(System.`in`)
    print("enter number")
    var  num = sc.nextLine()
    var list = num.toMutableList()
    print(list)
var m=0

    var len = list.size
    print(len)
    while(m<len){
        when {
            list[m].toInt() == 0 -> count0 = count0+1
            list[m].toInt() == 1 -> count1 +=1
            list[m].toInt() == 2 -> count2 +=1
            list[m].toInt() == 3 -> count3 +=1
            list[m].toInt() == 4 -> count4 +=1
            list[m].toInt() == 5 -> count5+=1
            list[m].toInt() == 6 -> count6 +=1
            list[m].toInt() == 7 -> count7 +=1
            list[m].toInt() == 8 -> count8 +=1
            list[m].toInt() == 9 -> count9 +=1
        }
        m++
    }

print("Frequency of zero : ${count0}")
    print("Frequency of 1 : ${count1}")
    print("Frequency of 2 : ${count2}")
    print("Frequency of 3 : ${count3}")
    print("Frequency of 4 : ${count4}")
    print("Frequency of 5 : ${count5}")
    print("Frequency of 6 : ${count6}")
    print("Frequency of 7 : ${count7}")
    print("Frequency of 8 : ${count8}")
    print("Frequency of 9 : ${count9}")
    

}

