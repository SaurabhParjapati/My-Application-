package com.example.myapplication

 fun main() {
     myClass.Myobject.f()
    myClass.f()
    myClass.Anotherobject.g()
 myClass.Anotherobject.g()


}
  class myClass{
      companion object Myobject {
          @JvmStatic
          fun f(){
              println("Hello  I am F from object ")

          }
      }
       object Anotherobject {
           fun g(){
               println("Hello I am G from Another object")

           }
       }

  }