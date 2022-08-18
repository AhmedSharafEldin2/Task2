package MyTask

import java.util.*


fun main(args : Array<String>){

    val reader = Scanner(System.`in`)
    var integer:Int = reader.nextInt()
    val arrayList = ArrayList<String>()
    for(i in 1..integer){
        var inputt  = reader.next()
        for(i in 0 .. inputt.length - 1){
            if(inputt[i].lowercase().equals("a") || inputt[i].lowercase().equals("m")){
                arrayList.add(inputt)
            }
        }}

    println(arrayList.size)

    for(i in 0 .. arrayList.size - 1){
            println(arrayList[i])
        }


}