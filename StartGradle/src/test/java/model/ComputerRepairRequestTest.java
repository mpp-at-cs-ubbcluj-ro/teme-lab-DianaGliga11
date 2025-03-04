package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerRepairRequestTest {

    @Test
    void getOwnerName() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getOwnerName());
    }

    @Test
    void setOwnerName() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getOwnerName());
        c1.setOwnerName("Ana");
        assertEquals("Ana", c1.getOwnerName());
    }

    @Test
    void getOwnerAddress() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getOwnerAddress());
    }

    @Test
    void setOwnerAddress() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getOwnerAddress());
        c1.setOwnerAddress("Suceava, str.Veseliei");
        assertEquals("Suceava, str.Veseliei", c1.getOwnerAddress());
    }

    @Test
    void getPhoneNumber() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getPhoneNumber());
        c1.setPhoneNumber("0788657763");
        assertEquals("0788657763", c1.getPhoneNumber());
    }

    @Test
    void getModel() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getModel());
    }

    @Test
    void setModel() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getModel());
        c1.setModel("Lenovo");
        assertEquals("Lenovo", c1.getModel());
    }

    @Test
    void getDate() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getDate());
    }

    @Test
    void setDate() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getDate());
        c1.setDate("04-03-2024");
        assertEquals("04-03-2024", c1.getDate());
    }

    @Test
    void getProblemDescription() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getProblemDescription());
    }

    @Test
    void setProblemDescription() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals("", c1.getProblemDescription());
        c1.setProblemDescription("Hardisk collapse :(");
        assertEquals("Hardisk collapse :(", c1.getProblemDescription());
    }

    @Test
    void getID() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals(0, c1.getID());
    }

    @Test
    void setID() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest();
        assertEquals(0, c1.getID());
        c1.setID(1);
        assertEquals(1, c1.getID());
    }

    @Test
    void testToString() {
        ComputerRepairRequest c1 =  new ComputerRepairRequest(1, "Ana", "Suceava", "0765736472", "Lenovo", "04-03-2024", "Soft");
        String rez = c1.toString();
       // System.out.println(rez);
        assertEquals("ID=1, ownerName='Ana', model='Lenovo', date='04-03-2024', problemDescription='Soft'", rez);
    }
}