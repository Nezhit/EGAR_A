import org.example.classes.Director;
import org.example.classes.HRmanager;
import org.example.classes.Programmer;
import org.example.sickness.Sickness;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    private Director director,director2,director3,testdirector,nulldirector;
    private HRmanager hr;
    private ArrayList<Programmer> subordinates;

    @BeforeEach
    void setUp() {
        ArrayList<Programmer> list1=new ArrayList<>();
        list1.add(new Programmer("A",100));
        list1.add(new Programmer("B",150));
        list1.add(new Programmer("C",200));
        list1.add(new Programmer("D",300));
        list1.add(new Programmer("E",700));

        director = new Director(list1,"Cain",10000);
        director2 = new Director(list1,"Avel",15000);
        director3 = new Director(list1,"Enoch",2000);
        ArrayList<Director> directors=new ArrayList<>();
        directors.add(director);
        directors.add(director2);
        directors.add(director3);

        testdirector=new Director(new ArrayList<>(),"null",0);
        hr=new HRmanager(directors);
        subordinates = new ArrayList<>();

        director.setSubordinates(subordinates);
    }
    @Test
    void salarytest(){
        assertNotNull(director);
        assertNotNull(director2);
        assertNotNull(director3);
        director.work();
        director.work(100);
        director2.work();
        director2.work(200);
        director3.work();
        director3.work(200);
        assertNotNull(director);
        assertNotNull(director2);
        assertNotNull(director3);
    }
    @Test
    void randomPercentageTest(){
        assertNotNull(hr);
        hr.CallSick();
        for(Director dir:hr.getEmployees()){
            dir.getName();
        }

    }
    @Test
    void exceptiontest(){

        assertThrows(IndexOutOfBoundsException.class, () -> {
            testdirector.getSubordinates().get(1);
        });

    }
    @Test
    void testSalary() {

        assertEquals(10000, director.getSalary());
    }

    @Test
    void testCalculateSickLeavePercentage_AllSubordinatesSick() {
        assertNull(nulldirector);
    }


}
