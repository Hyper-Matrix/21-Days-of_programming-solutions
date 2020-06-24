
import java.util.*
fun main(args:Array<String>) {
    var count = 0
    var sc = Scanner(System.`in`)
    print("enter number")
    var n = sc.nextInt()
    for (i in 1..n) {
        if (n % i == 0) {
            if (i % 2 == 0)
            {
                print(" ")
            }
            else {
                count=count+i
            }

        }
    }
print(count)
}


