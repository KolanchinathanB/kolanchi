import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class JobObject {
}
//fun main(){
//    runBlocking {
//        val job=launch {
//            println("start")
//            delay(1000)                        // job object
//            println("processing")
//        }
//        job.join()                            // join after completion process
//        delay(2000)
//        println("end")
//    }
//}

//
fun main(){
    runBlocking {
        val job=launch {
            println("start")
            for(i in 1..100){
                println("i-----$i")
                delay(100)                        // job cancel
            }

            println("processing")
        }
        //delay(1000)
        delay(2000)                         // delay 2 secs
        job.cancel()                          // after delay then cancel process
        println("end")

    }
}

//
//fun main(){
//    runBlocking {
//        val job=launch {
//            println("start")
//            for(i in 1..10){
//                println("i----$i")                      // job CancelAndJoin
//                delay(100)
//            }
//        }
//        delay(200)
//        job.cancelAndJoin()                     // after delay cancel process and execute process
//        println("end")
//    }
//}
