
import java.util.*
fun main(args:Array<String>) {
    var c=0

    var sc = Scanner(System.`in`)
    print("enter number")
   var k = sc.nextInt()
    if(k in 1..1015){
        if(k == 1){
            print("1")
        }
        else
            if(k == 2){
                print("2")
            }
            else
                if(k ==4){
                    print("2")
                }
                else{
                    for(i in 1..k){

                        if(k%i==0){
                            for (z in 2 until i){
                                if(i%z==0) {
                                    break
                                }
                                else{
                                    c = i
                                    if (c >= i) {
                                        c = i

                                    }
                                }

                            }

                        }

                    }
                    print(c)
                }

    }

}


