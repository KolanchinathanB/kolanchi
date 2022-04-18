import kotlinx.coroutines.*

class Async {
}
fun main(){
    var i=0
    runBlocking {
        val obj=async {
            println("start")
            repeat(100){
                println("i--->${i++}")
                delay(100)
            }
            i
        }
        try {
            delay(200)
            obj.cancelAndJoin()
            println(obj.await())
            println("end")
        }
        catch (e:CancellationException){
            println("cancel ")
        }


    }
}