import kotlinx.coroutines.*

fun main(){

    runBlocking {
        launch {
            println("name is ${Thread.currentThread().name}")            // run on main thread
            withContext(Dispatchers.IO){                                  // change another thread
                println("name is ${Thread.currentThread().name}")
                withContext(Dispatchers.Unconfined){                      // change another thread unconfined   
                    println("name is ${Thread.currentThread().name}")     // first run IO thread
                    delay(1000)
                    println("name is ${Thread.currentThread().name}")     // then change another thread
                }
            }
        }
    }
}
