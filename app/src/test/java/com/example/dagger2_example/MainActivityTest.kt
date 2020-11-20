package com.example.dagger2_example

import com.example.dagger2_example.model.Person
import org.junit.Assert.*
import org.junit.Test

class MainActivityTest {

    private var person = Person("champ",11)

    @Test
    fun `initialize person`(){
        assertNotNull(person)
    }

    @Test
    fun `have name`(){
        val haveName = person.name
        assertEquals("champ",haveName)
    }

    @Test
    fun `have age`(){
        val haveAge = person.age
        assertEquals(11,haveAge)
    }
}