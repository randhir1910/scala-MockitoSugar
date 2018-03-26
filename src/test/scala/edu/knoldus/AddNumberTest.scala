package edu.knoldus

import org.mockito.Mockito._
import org.scalatest.FunSuite
import org.scalatest.mockito.MockitoSugar

class AddNumberTest extends FunSuite with MockitoSugar {

  test("add two number testing") {
    val addition =mock[Addition]
    when(addition.add(5,9)).thenCallRealMethod()
    val add1 = mock[AddNumber]
    when(add1.add(3, 6)).thenReturn(1)
    assert(add1.add(3, 6) === 1)
    assert(addition.add(5,9) === 14)
  }

}
