
import java.util.*
fun main(args:Array<String>) {
    var y =" "
    var j =0
    var sc = Scanner(System.`in`)
    print("enter message")
    var k = sc.nextLine().toCharArray()
    var m = k.toMutableList()
    for(i in 0 until m.size-1){
        if(m[i] == ' '){
            m.removeAt(i)
        j=i
        }

    }
    for(i in 0 .. m.size-1){
        if(i%2 == 0){
            m[i] = m[i] -1
        }
        else{

            m[i] = m[i]+1
        }

    }
    for(i in 0 .. m.size-1){
        if(i == j){
            y= y+' '

        }
         y = y+m[i]
    }
    print(y)

}




