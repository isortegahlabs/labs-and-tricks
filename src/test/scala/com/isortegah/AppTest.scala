package com.isortegah

import org.junit.Assert._
import org.junit._

@Test
class AppTest {

    @Test
    def testOK() = {
        var arr = new Array[String](1)
        arr(0)="test"

        println(App.foo(arr))
    }

//    @Test
//    def testKO() = assertTrue(false)

}


