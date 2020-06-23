
import java.util.*
fun main(args:Array<String>) {
    var value = false
    var sc = Scanner(System.`in`)
    print("enter string")
    var num = sc.nextLine()
    var list = num.toMutableList()
    var list2 = arrayListOf<String>()

    for (i in list.size - 1 downTo 0) {
        // print(list[i])
        list2.add(list[i].toString())


    }
   // print(list2.toString())
  //  print(list.toString())

    if(list2.toString().equals(list.toString())){
        print("palindrome")
    }
    else
    {
        print("not a palindrome")
    }
}


