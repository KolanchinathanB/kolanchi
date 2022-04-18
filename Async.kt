import kotlinx.coroutines.*

class Async {
}
fun main(){
    var i=0
    runBlocking {
        val obj=async {
            println("start")
            repeat(100){                            // repeat loop 100 times
                println("i--->${i++}")               
                delay(100)
            }
            i                                        // deferred object value
        }
        try {
           // delay(200)
            obj.cancelAndJoin()
            println(obj.await())                      // print deferred object value
            println("end")
        }
        catch (e:CancellationException){
            println("cancel ")
        }


    }
}
