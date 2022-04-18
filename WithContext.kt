import kotlinx.coroutines.*

fun main(){

    runBlocking {
        launch {
            println("name is ${Thread.currentThread().name}")
            withContext(Dispatchers.IO){
                println("name is ${Thread.currentThread().name}")
                withContext(Dispatchers.Unconfined){
                    println("name is ${Thread.currentThread().name}")
                    delay(1000)
                    println("name is ${Thread.currentThread().name}")
                }
            }
        }
    }
}