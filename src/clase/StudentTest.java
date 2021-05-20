package clase;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    public void testConstructorRightName(){
        String nume= "Ruxandra";
        Student student= new Student(nume);
        assertEquals(nume, student.getNume());
    }
}