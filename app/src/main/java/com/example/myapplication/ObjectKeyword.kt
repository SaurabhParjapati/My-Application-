package com.example.myapplication

//  println(A.num)
//    B.test()
//
//}
// object A{
//     val num: Int= 20
//
// }
// object B{
//    val P: Int = 30
//      fun test(){
//        println("I am object ")
//
//    }

fun main() {

    Sharingwiget.incrementTwitterLikes()
         Sharingwiget.incrementTwitterLikes()
           Sharingwiget.incrementTwitterLikes()
    Sharingwiget.incrementTwitterLikes()
             Sharingwiget.incrementFBLikes()
                Sharingwiget.display()

 }
  object Sharingwiget{
    private var twitterLikes = 0
            private  var fbLikes = 0

      fun incrementTwitterLikes() = twitterLikes++
        fun incrementFBLikes() = fbLikes++
         fun display() = println("Facebook - $fbLikes -- Twitter - $twitterLikes")

  }