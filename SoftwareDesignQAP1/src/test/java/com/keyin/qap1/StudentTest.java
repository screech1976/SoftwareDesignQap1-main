// Programmer: Shane Dwyer
// Date: May 26, 2022
// Program Name: StudentTest.java
// Description: Simples tests for a student class that takes a student's first and last name along with email and displays it formatted

package com.keyin.qap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void itShouldReturnEmail() {
        String lastName = "Dwyer";
        String firstName = "Shane";
        String email = "shanedwyer@hotmail.com";
        Student s1 = new Student();
        assertNotNull(email, s1.getEmail());

    }

    @Test
    void itShouldReturnFirstName() {
        String firstName = "Shane";
        Student s1 = new Student();
        s1.setFirstName(firstName);
        assertEquals("Shane", s1.getFirstName());

    }

    @Test
    void itShouldReturnLastName() {
        String lastName = "Dwyer";
        Student s1 = new Student();
        s1.setLastName(lastName);
        assertEquals("Dwyer", s1.getLastName());

    }

    @Test
    void testToString() {
        Student s1 = new Student();
        s1.setStudent("Dwyer", "Shane", "shanedwyer@hotmail.com");
        String expectedString = "Student's name is Shane Dwyer and has email = shanedwyer@hotmail.com";
        assertEquals(expectedString, s1.toString());

        }
    }



