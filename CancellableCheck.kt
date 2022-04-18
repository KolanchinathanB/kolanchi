import kotlinx.coroutines.*

fun main(){
    var i=0
    runBlocking {
       val job= launch {
           try {
               repeat(1000) {
                   i += 2
                   println("i ---${i}")
                   delay(100)
               }
           }
           catch (e:Exception){
               println("exception occurred")
           }
           finally {
               withContext(NonCancellable) {
                   println("final block running")                // with context -when using delay in finally block
                   delay(1000)
                   println("final block end")
               }
           }
        }
        println("running")
        delay(2000)
        job.cancelAndJoin()
        println("end")
    }
}