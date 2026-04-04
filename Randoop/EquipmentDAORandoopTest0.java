package ca.yorku.eecs3311.dao;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipmentDAORandoopTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test001");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.lang.Class<?> wildcardClass1 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test002");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test003");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray2 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3, equipmentArray2);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3);
        java.lang.Class<?> wildcardClass6 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test004");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test005");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test006");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray2 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3, equipmentArray2);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3);
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test007");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test008");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = lab5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test009");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass5 = labList4.getClass();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test010");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab4 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test011");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test012");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test013");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test014");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.lang.Class<?> wildcardClass6 = equipmentList5.getClass();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test015");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test016");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray20 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21, equipmentArray20);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        java.lang.Class<?> wildcardClass25 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test017");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test018");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.findByLabId("hi!");
        java.lang.Class<?> wildcardClass7 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test019");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test020");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray20 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21, equipmentArray20);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        ca.yorku.eecs3311.model.equipment.Lab lab25 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test021");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test022");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray20 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21, equipmentArray20);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        ca.yorku.eecs3311.model.equipment.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test023");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.model.equipment.Lab lab19 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNull(lab19);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test024");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass7 = labList6.getClass();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test025");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass7 = labList6.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test026");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray2 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3, equipmentArray2);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test027");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test028");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass7 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test029");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(labList19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test030");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(equipmentList35);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test031");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test032");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("");
        java.lang.Class<?> wildcardClass8 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNull(lab7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test033");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList37 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment38 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNotNull(equipmentList37);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test034");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab32 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test035");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList37 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab38 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNotNull(equipmentList37);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test036");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList12 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(labList12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test037");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(labList8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test038");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass6 = labList5.getClass();
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test039");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList32 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(equipmentList32);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test040");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus6);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO8.updateStatus("hi!", equipmentStatus10);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO12 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray13 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14, equipmentArray13);
        equipmentDAO12.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14);
        equipmentDAO8.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO8.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList19);
        java.lang.Class<?> wildcardClass21 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNotNull(equipmentArray13);
        org.junit.Assert.assertArrayEquals(equipmentArray13, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test041");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test042");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.lang.Class<?> wildcardClass5 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test043");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = lab7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNull(lab7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test044");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        java.lang.Class<?> wildcardClass18 = equipmentList16.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test045");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass15 = labList14.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test046");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus15 = null;
        equipmentDAO0.updateStatus("", equipmentStatus15);
        ca.yorku.eecs3311.model.equipment.Equipment equipment18 = equipmentDAO0.findById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNull(equipment18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test047");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test048");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus19 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus19);
        ca.yorku.eecs3311.model.equipment.Lab lab21 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test049");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Lab lab9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test050");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus4 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus4);
        ca.yorku.eecs3311.model.equipment.Lab lab6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test051");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test052");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test053");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO0.loadAll();
        java.lang.Class<?> wildcardClass16 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test054");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test055");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test056");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Lab lab9 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(lab9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test057");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        equipmentDAO8.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus15 = null;
        equipmentDAO4.updateStatus("", equipmentStatus15);
        ca.yorku.eecs3311.model.equipment.Equipment equipment18 = equipmentDAO4.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList19);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(equipment18);
        org.junit.Assert.assertNotNull(equipmentList19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test058");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Lab lab1 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test059");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO14.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab18 = equipmentDAO14.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO20 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO20.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        equipmentDAO20.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO27 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList28 = equipmentDAO27.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList30 = equipmentDAO27.findByLabId("hi!");
        equipmentDAO14.writeAllEquipment(equipmentList30);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO32 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList33 = equipmentDAO32.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO32.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab36 = equipmentDAO32.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList37 = equipmentDAO32.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO38 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList39 = equipmentDAO38.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray40 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList41 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41, equipmentArray40);
        equipmentDAO38.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        equipmentDAO32.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList47 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.writeAllEquipment(equipmentList47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNull(lab18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(labList28);
        org.junit.Assert.assertNotNull(equipmentList30);
        org.junit.Assert.assertNotNull(labList33);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNull(lab36);
        org.junit.Assert.assertNotNull(labList37);
        org.junit.Assert.assertNotNull(labList39);
        org.junit.Assert.assertNotNull(equipmentArray40);
        org.junit.Assert.assertArrayEquals(equipmentArray40, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test060");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(labList7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test061");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus10);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test062");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(labList8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test063");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(lab7);
        org.junit.Assert.assertNotNull(labList8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test064");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        java.lang.Class<?> wildcardClass7 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test065");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test066");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test067");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test068");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test069");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO14.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab18 = equipmentDAO14.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO20 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO20.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        equipmentDAO20.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNull(lab18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test070");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO6.updateStatus("hi!", equipmentStatus8);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(lab16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test071");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNull(equipment4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test072");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment3 = equipmentDAO0.findById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(equipment3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test073");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test074");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabsWithEquipment();
        java.lang.Class<?> wildcardClass4 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test075");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test076");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus6);
        java.lang.Class<?> wildcardClass8 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test077");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.equipment.Lab lab10 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(lab10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test078");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test079");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass10 = labList9.getClass();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test080");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList36 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList38 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNotNull(equipmentList36);
        org.junit.Assert.assertNotNull(equipmentList38);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test081");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test082");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO17 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO17.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab21 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO23 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO23.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        equipmentDAO23.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO30 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList31 = equipmentDAO30.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = equipmentDAO30.findByLabId("hi!");
        equipmentDAO17.writeAllEquipment(equipmentList33);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO35 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList36 = equipmentDAO35.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList37 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab39 = equipmentDAO35.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList40 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO41 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList42 = equipmentDAO41.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray43 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList44 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44, equipmentArray43);
        equipmentDAO41.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO35.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        ca.yorku.eecs3311.model.equipment.Lab lab50 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList52 = equipmentDAO17.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList52);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList54 = equipmentDAO0.loadAllLabsWithEquipment();
        java.lang.Class<?> wildcardClass55 = labList54.getClass();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNull(lab16);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNull(lab21);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(labList31);
        org.junit.Assert.assertNotNull(equipmentList33);
        org.junit.Assert.assertNotNull(labList36);
        org.junit.Assert.assertNotNull(labList37);
        org.junit.Assert.assertNull(lab39);
        org.junit.Assert.assertNotNull(labList40);
        org.junit.Assert.assertNotNull(labList42);
        org.junit.Assert.assertNotNull(equipmentArray43);
        org.junit.Assert.assertArrayEquals(equipmentArray43, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(lab50);
        org.junit.Assert.assertNotNull(equipmentList52);
        org.junit.Assert.assertNotNull(labList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test083");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test084");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(labList8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test085");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus14 = null;
        equipmentDAO0.updateStatus("", equipmentStatus14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test086");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO15.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList17 = equipmentDAO15.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab19 = equipmentDAO15.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO15.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO21 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO21.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray23 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24, equipmentArray23);
        equipmentDAO21.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        equipmentDAO15.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList29 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNotNull(labList17);
        org.junit.Assert.assertNull(lab19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(equipmentArray23);
        org.junit.Assert.assertArrayEquals(equipmentArray23, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(labList29);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test087");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList36 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab38 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(equipmentList36);
        org.junit.Assert.assertNull(lab38);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test088");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment3 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO4.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO4.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO8.updateStatus("hi!", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO8.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO8.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO8.loadAll();
        equipmentDAO4.writeAllEquipment(equipmentList14);
        equipmentDAO0.writeAllEquipment(equipmentList14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(equipment3);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNull(lab7);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test089");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus14 = null;
        equipmentDAO0.updateStatus("", equipmentStatus14);
        ca.yorku.eecs3311.model.equipment.Lab lab16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test090");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray2 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3, equipmentArray2);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.writeAllEquipment(equipmentList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test091");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList35 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNotNull(labList35);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test092");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO14.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab18 = equipmentDAO14.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO20 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO20.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        equipmentDAO20.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = equipmentDAO14.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList27);
        ca.yorku.eecs3311.model.equipment.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNull(lab18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(equipmentList27);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test093");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = lab7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(lab7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test094");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus7);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test095");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment8 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList10 = equipmentDAO9.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab12 = equipmentDAO9.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus15 = null;
        equipmentDAO13.updateStatus("hi!", equipmentStatus15);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = equipmentDAO13.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO13.loadAll();
        equipmentDAO9.writeAllEquipment(equipmentList19);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = equipmentDAO9.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO9.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO25 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus27 = null;
        equipmentDAO25.updateStatus("hi!", equipmentStatus27);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList29 = equipmentDAO25.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList31 = equipmentDAO25.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = equipmentDAO25.findByLabId("");
        equipmentDAO9.writeAllEquipment(equipmentList33);
        equipmentDAO0.writeAllEquipment(equipmentList33);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNotNull(labList10);
        org.junit.Assert.assertNull(lab12);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentList22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(labList29);
        org.junit.Assert.assertNotNull(equipmentList31);
        org.junit.Assert.assertNotNull(equipmentList33);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test096");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test097");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.lang.Class<?> wildcardClass5 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test098");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test099");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(labList9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test100");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test101");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO17 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO17.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab21 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO23 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO23.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        equipmentDAO23.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO30 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList31 = equipmentDAO30.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = equipmentDAO30.findByLabId("hi!");
        equipmentDAO17.writeAllEquipment(equipmentList33);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO35 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList36 = equipmentDAO35.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList37 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab39 = equipmentDAO35.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList40 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO41 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList42 = equipmentDAO41.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray43 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList44 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44, equipmentArray43);
        equipmentDAO41.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO35.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        ca.yorku.eecs3311.model.equipment.Lab lab50 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList52 = equipmentDAO17.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList52);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList54 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus56 = null;
        equipmentDAO0.updateStatus("", equipmentStatus56);
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNull(lab16);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNull(lab21);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(labList31);
        org.junit.Assert.assertNotNull(equipmentList33);
        org.junit.Assert.assertNotNull(labList36);
        org.junit.Assert.assertNotNull(labList37);
        org.junit.Assert.assertNull(lab39);
        org.junit.Assert.assertNotNull(labList40);
        org.junit.Assert.assertNotNull(labList42);
        org.junit.Assert.assertNotNull(equipmentArray43);
        org.junit.Assert.assertArrayEquals(equipmentArray43, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(lab50);
        org.junit.Assert.assertNotNull(equipmentList52);
        org.junit.Assert.assertNotNull(labList54);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test102");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabsWithEquipment();
        java.lang.Class<?> wildcardClass15 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test103");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus7);
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(equipment5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test104");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test105");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test106");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus20 = null;
        equipmentDAO0.updateStatus("", equipmentStatus20);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(equipmentList22);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test107");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus8);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test108");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO0.findLabById("");
        java.lang.Class<?> wildcardClass17 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNull(lab16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test109");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test110");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList10 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO9.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO9.findByLabId("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus17 = null;
        equipmentDAO15.updateStatus("hi!", equipmentStatus17);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray19 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList20 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList20, equipmentArray19);
        equipmentDAO15.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList20);
        equipmentDAO9.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList20);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList20);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList10);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentArray19);
        org.junit.Assert.assertArrayEquals(equipmentArray19, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(labList25);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test111");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Lab lab13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test112");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(lab8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test113");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        java.lang.Class<?> wildcardClass14 = equipmentList13.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test114");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test115");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test116");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO0.updateStatus("", equipmentStatus8);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test117");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test118");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus15 = null;
        equipmentDAO0.updateStatus("", equipmentStatus15);
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labList13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test119");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO6.updateStatus("hi!", equipmentStatus8);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test120");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test121");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO16 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus18 = null;
        equipmentDAO16.updateStatus("hi!", equipmentStatus18);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO16.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = equipmentDAO16.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = equipmentDAO16.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList24);
        java.lang.Class<?> wildcardClass26 = equipmentList24.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNotNull(equipmentList22);
        org.junit.Assert.assertNotNull(equipmentList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test122");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNull(lab15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test123");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment37 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus39 = null;
        equipmentDAO0.updateStatus("", equipmentStatus39);
        ca.yorku.eecs3311.model.equipment.Lab lab42 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNull(equipment37);
        org.junit.Assert.assertNull(lab42);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test124");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(labList16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test125");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.equipment.Equipment equipment11 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus13 = null;
        equipmentDAO0.updateStatus("", equipmentStatus13);
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test126");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus4 = null;
        equipmentDAO0.updateStatus("", equipmentStatus4);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test127");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO15.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList17 = equipmentDAO15.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab19 = equipmentDAO15.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO15.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO21 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO21.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray23 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24, equipmentArray23);
        equipmentDAO21.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        equipmentDAO15.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList29 = equipmentDAO0.loadAllLabsWithEquipment();
        java.lang.Class<?> wildcardClass30 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNotNull(labList17);
        org.junit.Assert.assertNull(lab19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(equipmentArray23);
        org.junit.Assert.assertArrayEquals(equipmentArray23, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(labList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test128");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO5.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO5.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO9.updateStatus("hi!", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO9.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO9.loadAll();
        equipmentDAO5.writeAllEquipment(equipmentList15);
        equipmentDAO0.writeAllEquipment(equipmentList15);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus19 = null;
        equipmentDAO0.updateStatus("", equipmentStatus19);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test129");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass16 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test130");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab17 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNull(lab15);
        org.junit.Assert.assertNull(lab17);
        org.junit.Assert.assertNotNull(labList18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test131");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO17 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO17.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab21 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO23 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO23.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        equipmentDAO23.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO30 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList31 = equipmentDAO30.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = equipmentDAO30.findByLabId("hi!");
        equipmentDAO17.writeAllEquipment(equipmentList33);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO35 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList36 = equipmentDAO35.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList37 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab39 = equipmentDAO35.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList40 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO41 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList42 = equipmentDAO41.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray43 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList44 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44, equipmentArray43);
        equipmentDAO41.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO35.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        ca.yorku.eecs3311.model.equipment.Lab lab50 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList52 = equipmentDAO17.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList52);
        java.lang.Class<?> wildcardClass54 = equipmentList52.getClass();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNull(lab16);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNull(lab21);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(labList31);
        org.junit.Assert.assertNotNull(equipmentList33);
        org.junit.Assert.assertNotNull(labList36);
        org.junit.Assert.assertNotNull(labList37);
        org.junit.Assert.assertNull(lab39);
        org.junit.Assert.assertNotNull(labList40);
        org.junit.Assert.assertNotNull(labList42);
        org.junit.Assert.assertNotNull(equipmentArray43);
        org.junit.Assert.assertArrayEquals(equipmentArray43, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(lab50);
        org.junit.Assert.assertNotNull(equipmentList52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test132");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus4 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus4);
        ca.yorku.eecs3311.model.equipment.Lab lab6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test133");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNull(lab7);
        org.junit.Assert.assertNotNull(labList8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test134");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO14.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab18 = equipmentDAO14.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO20 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO20.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        equipmentDAO20.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = equipmentDAO14.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList27);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO29 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus31 = null;
        equipmentDAO29.updateStatus("hi!", equipmentStatus31);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray33 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList34 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34, equipmentArray33);
        equipmentDAO29.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList39 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNull(lab18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(equipmentList27);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(equipmentList39);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test135");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment10 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test136");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test137");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab36 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test138");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test139");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList20 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(equipmentList20);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test140");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = equipmentDAO6.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO6.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Equipment equipment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test141");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab18 = equipmentDAO0.findLabById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNull(lab15);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNull(lab18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test142");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment3 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO4.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO4.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO8.updateStatus("hi!", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO8.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO8.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO8.loadAll();
        equipmentDAO4.writeAllEquipment(equipmentList14);
        equipmentDAO0.writeAllEquipment(equipmentList14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList17 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus19 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus19);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(equipment3);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNull(lab7);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(labList17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test143");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus6);
        ca.yorku.eecs3311.model.equipment.Lab lab8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test144");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.model.equipment.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test145");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO4.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = equipmentDAO4.findByLabId("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO10 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList11 = equipmentDAO10.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO10.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO10.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO10.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = equipmentDAO10.findByLabId("");
        equipmentDAO4.writeAllEquipment(equipmentList18);
        equipmentDAO0.writeAllEquipment(equipmentList18);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(labList11);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNull(lab15);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNotNull(equipmentList18);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test146");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO7 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = equipmentDAO7.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO7.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test147");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO0.updateStatus("", equipmentStatus8);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test148");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO7 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus9 = null;
        equipmentDAO7.updateStatus("hi!", equipmentStatus9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO7.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList12 = equipmentDAO7.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = equipmentDAO13.findByLabId("");
        equipmentDAO7.writeAllEquipment(equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = equipmentDAO7.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO22 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray23 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24, equipmentArray23);
        equipmentDAO22.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        equipmentDAO7.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(labList12);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertNotNull(equipmentList21);
        org.junit.Assert.assertNotNull(equipmentArray23);
        org.junit.Assert.assertArrayEquals(equipmentArray23, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test149");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO0.loadAllLabsWithEquipment();
        java.lang.Class<?> wildcardClass8 = labList7.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test150");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus14 = null;
        equipmentDAO0.updateStatus("", equipmentStatus14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test151");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test152");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab10 = equipmentDAO0.findLabById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNull(lab10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test153");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment3 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO4.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO4.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO8.updateStatus("hi!", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO8.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO8.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO8.loadAll();
        equipmentDAO4.writeAllEquipment(equipmentList14);
        equipmentDAO0.writeAllEquipment(equipmentList14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(equipment3);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNull(lab7);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test154");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        java.lang.Class<?> wildcardClass32 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test155");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.writeAllEquipment(equipmentList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test156");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab10 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab12 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNull(lab10);
        org.junit.Assert.assertNull(lab12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test157");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO8.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO8.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO12 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus14 = null;
        equipmentDAO12.updateStatus("hi!", equipmentStatus14);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray16 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17, equipmentArray16);
        equipmentDAO12.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        equipmentDAO8.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO22 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus24 = null;
        equipmentDAO22.updateStatus("hi!", equipmentStatus24);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList26 = equipmentDAO22.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment28 = equipmentDAO22.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList29 = equipmentDAO22.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList29);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(lab7);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(labList26);
        org.junit.Assert.assertNull(equipment28);
        org.junit.Assert.assertNotNull(equipmentList29);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test158");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO5.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO5.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO9.updateStatus("hi!", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO9.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO9.loadAll();
        equipmentDAO5.writeAllEquipment(equipmentList15);
        equipmentDAO0.writeAllEquipment(equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList19);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test159");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment10 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNotNull(labList8);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test160");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test161");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment15 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test162");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test163");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(labList8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test164");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test165");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO0.loadAllLabsWithEquipment();
        java.lang.Class<?> wildcardClass35 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test166");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus9 = null;
        equipmentDAO0.updateStatus("", equipmentStatus9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO11 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList12 = equipmentDAO11.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab14 = equipmentDAO11.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO11.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus18 = null;
        equipmentDAO11.updateStatus("", equipmentStatus18);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO20 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO20.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = equipmentDAO20.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList25 = equipmentDAO20.findByLabId("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO26 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus28 = null;
        equipmentDAO26.updateStatus("hi!", equipmentStatus28);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray30 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList31 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList31, equipmentArray30);
        equipmentDAO26.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList31);
        equipmentDAO20.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList31);
        equipmentDAO11.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList31);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList31);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(labList12);
        org.junit.Assert.assertNull(lab14);
        org.junit.Assert.assertNull(lab16);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(equipmentList23);
        org.junit.Assert.assertNotNull(equipmentList25);
        org.junit.Assert.assertNotNull(equipmentArray30);
        org.junit.Assert.assertArrayEquals(equipmentArray30, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test167");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList36 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus38 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus38);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(equipmentList36);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test168");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO0.updateStatus("", equipmentStatus8);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO10 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList11 = equipmentDAO10.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList12 = equipmentDAO10.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab14 = equipmentDAO10.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO10.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO16 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList17 = equipmentDAO16.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        equipmentDAO16.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        equipmentDAO10.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO23 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO23.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = equipmentDAO23.findByLabId("hi!");
        equipmentDAO10.writeAllEquipment(equipmentList26);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO28 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList29 = equipmentDAO28.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList30 = equipmentDAO28.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab32 = equipmentDAO28.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList33 = equipmentDAO28.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO34 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList35 = equipmentDAO34.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray36 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList37 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37, equipmentArray36);
        equipmentDAO34.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        equipmentDAO28.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        equipmentDAO10.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        ca.yorku.eecs3311.model.equipment.Lab lab43 = equipmentDAO10.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList45 = equipmentDAO10.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList46 = equipmentDAO10.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList48 = equipmentDAO10.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList48);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(labList11);
        org.junit.Assert.assertNotNull(labList12);
        org.junit.Assert.assertNull(lab14);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(equipmentList26);
        org.junit.Assert.assertNotNull(labList29);
        org.junit.Assert.assertNotNull(labList30);
        org.junit.Assert.assertNull(lab32);
        org.junit.Assert.assertNotNull(labList33);
        org.junit.Assert.assertNotNull(labList35);
        org.junit.Assert.assertNotNull(equipmentArray36);
        org.junit.Assert.assertArrayEquals(equipmentArray36, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(lab43);
        org.junit.Assert.assertNotNull(equipmentList45);
        org.junit.Assert.assertNotNull(labList46);
        org.junit.Assert.assertNotNull(equipmentList48);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test169");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO17 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus19 = null;
        equipmentDAO17.updateStatus("hi!", equipmentStatus19);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = equipmentDAO17.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO17.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = equipmentDAO17.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab25 = equipmentDAO17.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = equipmentDAO17.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList27);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(equipmentList21);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(equipmentList23);
        org.junit.Assert.assertNull(lab25);
        org.junit.Assert.assertNotNull(equipmentList27);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test170");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test171");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO5.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO5.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = equipmentDAO5.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment11 = equipmentDAO5.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO5.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList12);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO14.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab18 = equipmentDAO14.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO20 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO20.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        equipmentDAO20.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = equipmentDAO14.loadAll();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO28 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList29 = equipmentDAO28.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList30 = equipmentDAO28.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab32 = equipmentDAO28.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList33 = equipmentDAO28.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO34 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList35 = equipmentDAO34.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray36 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList37 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37, equipmentArray36);
        equipmentDAO34.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        equipmentDAO28.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO41 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList42 = equipmentDAO41.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList44 = equipmentDAO41.findByLabId("hi!");
        equipmentDAO28.writeAllEquipment(equipmentList44);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO46 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList47 = equipmentDAO46.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList48 = equipmentDAO46.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab50 = equipmentDAO46.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList51 = equipmentDAO46.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO52 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList53 = equipmentDAO52.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray54 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList55 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55, equipmentArray54);
        equipmentDAO52.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55);
        equipmentDAO46.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55);
        equipmentDAO28.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNull(lab18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(equipmentList27);
        org.junit.Assert.assertNotNull(labList29);
        org.junit.Assert.assertNotNull(labList30);
        org.junit.Assert.assertNull(lab32);
        org.junit.Assert.assertNotNull(labList33);
        org.junit.Assert.assertNotNull(labList35);
        org.junit.Assert.assertNotNull(equipmentArray36);
        org.junit.Assert.assertArrayEquals(equipmentArray36, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(labList42);
        org.junit.Assert.assertNotNull(equipmentList44);
        org.junit.Assert.assertNotNull(labList47);
        org.junit.Assert.assertNotNull(labList48);
        org.junit.Assert.assertNull(lab50);
        org.junit.Assert.assertNotNull(labList51);
        org.junit.Assert.assertNotNull(labList53);
        org.junit.Assert.assertNotNull(equipmentArray54);
        org.junit.Assert.assertArrayEquals(equipmentArray54, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test172");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray4 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5, equipmentArray4);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5);
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(equipmentArray4);
        org.junit.Assert.assertArrayEquals(equipmentArray4, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test173");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray20 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21, equipmentArray20);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus26 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus26);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList29 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList30 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(equipmentList29);
        org.junit.Assert.assertNotNull(equipmentList30);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test174");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = equipmentDAO6.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO6.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray16 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17, equipmentArray16);
        equipmentDAO15.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO22 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO22.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO22.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO22.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList26 = equipmentDAO22.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = equipmentDAO22.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList28);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList30 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab32 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(labList26);
        org.junit.Assert.assertNotNull(equipmentList28);
        org.junit.Assert.assertNotNull(labList30);
        org.junit.Assert.assertNull(lab32);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test175");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO16 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus18 = null;
        equipmentDAO16.updateStatus("hi!", equipmentStatus18);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO16.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = equipmentDAO16.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = equipmentDAO16.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList24);
        java.lang.Class<?> wildcardClass26 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNotNull(equipmentList22);
        org.junit.Assert.assertNotNull(equipmentList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test176");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus10);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus13 = null;
        equipmentDAO0.updateStatus("", equipmentStatus13);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus16 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus16);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test177");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment15 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test178");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO5.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO5.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO9.updateStatus("hi!", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO9.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO9.loadAll();
        equipmentDAO5.writeAllEquipment(equipmentList15);
        equipmentDAO0.writeAllEquipment(equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment21 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment23 = equipmentDAO0.findById("");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(equipment23);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test179");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO5.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO5.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO9.updateStatus("hi!", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO9.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO9.loadAll();
        equipmentDAO5.writeAllEquipment(equipmentList15);
        equipmentDAO0.writeAllEquipment(equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment21 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = equipmentDAO0.findByLabId("hi!");
        java.lang.Class<?> wildcardClass24 = equipmentList23.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNotNull(equipmentList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test180");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus4 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus4);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test181");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test182");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test183");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(labList4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test184");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList37 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO38 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList39 = equipmentDAO38.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList40 = equipmentDAO38.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment42 = equipmentDAO38.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList43 = equipmentDAO38.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList44 = equipmentDAO38.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList44);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNotNull(equipmentList37);
        org.junit.Assert.assertNotNull(labList39);
        org.junit.Assert.assertNotNull(labList40);
        org.junit.Assert.assertNull(equipment42);
        org.junit.Assert.assertNotNull(labList43);
        org.junit.Assert.assertNotNull(equipmentList44);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test185");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.findByLabId("hi!");
        java.lang.Class<?> wildcardClass8 = equipmentList7.getClass();
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test186");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = equipmentDAO6.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO6.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray16 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17, equipmentArray16);
        equipmentDAO15.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO22 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO22.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO22.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO22.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList26 = equipmentDAO22.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = equipmentDAO22.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList28);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList30 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(labList26);
        org.junit.Assert.assertNotNull(equipmentList28);
        org.junit.Assert.assertNotNull(labList30);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test187");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus10);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus13 = null;
        equipmentDAO0.updateStatus("", equipmentStatus13);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test188");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray4 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5, equipmentArray4);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5);
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab11 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(equipmentArray4);
        org.junit.Assert.assertArrayEquals(equipmentArray4, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(lab11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test189");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO4.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO4.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment8 = equipmentDAO4.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment10 = equipmentDAO4.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList11);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test190");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test191");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO17 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO17.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab21 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO23 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO23.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        equipmentDAO23.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO30 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList31 = equipmentDAO30.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = equipmentDAO30.findByLabId("hi!");
        equipmentDAO17.writeAllEquipment(equipmentList33);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO35 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList36 = equipmentDAO35.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList37 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab39 = equipmentDAO35.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList40 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO41 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList42 = equipmentDAO41.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray43 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList44 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44, equipmentArray43);
        equipmentDAO41.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO35.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        ca.yorku.eecs3311.model.equipment.Lab lab50 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList52 = equipmentDAO17.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList52);
        ca.yorku.eecs3311.model.equipment.Lab lab55 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus57 = null;
        equipmentDAO0.updateStatus("", equipmentStatus57);
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNull(lab16);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNull(lab21);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(labList31);
        org.junit.Assert.assertNotNull(equipmentList33);
        org.junit.Assert.assertNotNull(labList36);
        org.junit.Assert.assertNotNull(labList37);
        org.junit.Assert.assertNull(lab39);
        org.junit.Assert.assertNotNull(labList40);
        org.junit.Assert.assertNotNull(labList42);
        org.junit.Assert.assertNotNull(equipmentArray43);
        org.junit.Assert.assertArrayEquals(equipmentArray43, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(lab50);
        org.junit.Assert.assertNotNull(equipmentList52);
        org.junit.Assert.assertNull(lab55);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test192");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Equipment equipment14 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO17 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO17.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab21 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO17.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO23 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList24 = equipmentDAO23.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        equipmentDAO23.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO30 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList31 = equipmentDAO30.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = equipmentDAO30.findByLabId("hi!");
        equipmentDAO17.writeAllEquipment(equipmentList33);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO35 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList36 = equipmentDAO35.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList37 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab39 = equipmentDAO35.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList40 = equipmentDAO35.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO41 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList42 = equipmentDAO41.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray43 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList44 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44, equipmentArray43);
        equipmentDAO41.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO35.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        equipmentDAO17.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList44);
        ca.yorku.eecs3311.model.equipment.Lab lab50 = equipmentDAO17.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList52 = equipmentDAO17.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList52);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList54 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab55 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNull(lab16);
        org.junit.Assert.assertNotNull(labList18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNull(lab21);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(labList24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(labList31);
        org.junit.Assert.assertNotNull(equipmentList33);
        org.junit.Assert.assertNotNull(labList36);
        org.junit.Assert.assertNotNull(labList37);
        org.junit.Assert.assertNull(lab39);
        org.junit.Assert.assertNotNull(labList40);
        org.junit.Assert.assertNotNull(labList42);
        org.junit.Assert.assertNotNull(equipmentArray43);
        org.junit.Assert.assertArrayEquals(equipmentArray43, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(lab50);
        org.junit.Assert.assertNotNull(equipmentList52);
        org.junit.Assert.assertNotNull(labList54);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test193");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO15.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab18 = equipmentDAO15.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList20 = equipmentDAO15.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList20);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNull(lab18);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentList22);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test194");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO14.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab18 = equipmentDAO14.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO14.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO20 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO20.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        equipmentDAO20.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO27 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList28 = equipmentDAO27.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList30 = equipmentDAO27.findByLabId("hi!");
        equipmentDAO14.writeAllEquipment(equipmentList30);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO32 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList33 = equipmentDAO32.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO32.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab36 = equipmentDAO32.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList37 = equipmentDAO32.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO38 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList39 = equipmentDAO38.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray40 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList41 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41, equipmentArray40);
        equipmentDAO38.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        equipmentDAO32.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        equipmentDAO14.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList47 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment49 = equipmentDAO0.findById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNull(lab18);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(labList28);
        org.junit.Assert.assertNotNull(equipmentList30);
        org.junit.Assert.assertNotNull(labList33);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNull(lab36);
        org.junit.Assert.assertNotNull(labList37);
        org.junit.Assert.assertNotNull(labList39);
        org.junit.Assert.assertNotNull(equipmentArray40);
        org.junit.Assert.assertArrayEquals(equipmentArray40, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(labList47);
        org.junit.Assert.assertNull(equipment49);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test195");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO32 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList33 = equipmentDAO32.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab35 = equipmentDAO32.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab37 = equipmentDAO32.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus39 = null;
        equipmentDAO32.updateStatus("", equipmentStatus39);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus42 = null;
        equipmentDAO32.updateStatus("", equipmentStatus42);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList45 = equipmentDAO32.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList45);
        ca.yorku.eecs3311.model.equipment.Lab lab48 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(labList33);
        org.junit.Assert.assertNull(lab35);
        org.junit.Assert.assertNull(lab37);
        org.junit.Assert.assertNotNull(equipmentList45);
        org.junit.Assert.assertNull(lab48);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test196");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test197");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus11);
        ca.yorku.eecs3311.model.equipment.Lab lab14 = equipmentDAO0.findLabById("");
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNull(lab14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test198");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus14 = null;
        equipmentDAO0.updateStatus("", equipmentStatus14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab18 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test199");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test200");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray2 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3, equipmentArray2);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus7);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList10 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO9.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab14 = equipmentDAO9.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment16 = equipmentDAO9.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = equipmentDAO9.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList17);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labList10);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNull(lab14);
        org.junit.Assert.assertNull(equipment16);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test201");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test202");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList36 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus38 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus38);
        ca.yorku.eecs3311.model.equipment.Equipment equipment40 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(labList36);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test203");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO10 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList11 = equipmentDAO10.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO10.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO10.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab17 = equipmentDAO10.findLabById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = equipmentDAO18.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO22 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus24 = null;
        equipmentDAO22.updateStatus("hi!", equipmentStatus24);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO22.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO10.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(labList11);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNull(lab15);
        org.junit.Assert.assertNull(lab17);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(equipmentList21);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test204");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray2 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3, equipmentArray2);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus7);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labList9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test205");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNotNull(labList8);
        org.junit.Assert.assertNotNull(labList9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test206");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNotNull(labList8);
        org.junit.Assert.assertNotNull(labList9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test207");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test208");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab4 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test209");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList36 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab38 = equipmentDAO0.findLabById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(labList36);
        org.junit.Assert.assertNull(lab38);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test210");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab36 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNull(lab36);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test211");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus7);
        ca.yorku.eecs3311.model.equipment.Equipment equipment10 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO11 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList12 = equipmentDAO11.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO11.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab16 = equipmentDAO11.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment18 = equipmentDAO11.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO11.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList19);
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNotNull(labList12);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNull(lab16);
        org.junit.Assert.assertNull(equipment18);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNull(lab22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test212");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(labList7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test213");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray2 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3, equipmentArray2);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test214");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test215");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO0.updateStatus("", equipmentStatus8);
        java.lang.Class<?> wildcardClass10 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test216");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus6);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO8.updateStatus("hi!", equipmentStatus10);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO12 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray13 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14, equipmentArray13);
        equipmentDAO12.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14);
        equipmentDAO8.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO8.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList19);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment25 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNotNull(equipmentArray13);
        org.junit.Assert.assertArrayEquals(equipmentArray13, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentList22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNull(equipment25);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test217");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus19 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus19);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab23 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNull(lab23);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test218");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = equipmentDAO6.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab11 = equipmentDAO6.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO6.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList12);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNull(lab11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(labList14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test219");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment7 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList10 = equipmentDAO9.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList11 = equipmentDAO9.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab13 = equipmentDAO9.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO9.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO15.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        equipmentDAO15.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        equipmentDAO9.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO22 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO22.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList25 = equipmentDAO22.findByLabId("hi!");
        equipmentDAO9.writeAllEquipment(equipmentList25);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO27 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList28 = equipmentDAO27.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList29 = equipmentDAO27.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab31 = equipmentDAO27.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList32 = equipmentDAO27.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO33 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList34 = equipmentDAO33.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray35 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList36 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36, equipmentArray35);
        equipmentDAO33.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        equipmentDAO27.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        equipmentDAO9.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO41 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList42 = equipmentDAO41.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab44 = equipmentDAO41.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab46 = equipmentDAO41.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus48 = null;
        equipmentDAO41.updateStatus("", equipmentStatus48);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus51 = null;
        equipmentDAO41.updateStatus("", equipmentStatus51);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList54 = equipmentDAO41.findByLabId("");
        equipmentDAO9.writeAllEquipment(equipmentList54);
        equipmentDAO0.writeAllEquipment(equipmentList54);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList58 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList10);
        org.junit.Assert.assertNotNull(labList11);
        org.junit.Assert.assertNull(lab13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(equipmentList25);
        org.junit.Assert.assertNotNull(labList28);
        org.junit.Assert.assertNotNull(labList29);
        org.junit.Assert.assertNull(lab31);
        org.junit.Assert.assertNotNull(labList32);
        org.junit.Assert.assertNotNull(labList34);
        org.junit.Assert.assertNotNull(equipmentArray35);
        org.junit.Assert.assertArrayEquals(equipmentArray35, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(labList42);
        org.junit.Assert.assertNull(lab44);
        org.junit.Assert.assertNull(lab46);
        org.junit.Assert.assertNotNull(equipmentList54);
        org.junit.Assert.assertNotNull(equipmentList58);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test220");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.lang.Class<?> wildcardClass6 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test221");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment15 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment17 = equipmentDAO0.findById("");
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertNull(equipment17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test222");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(labList3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test223");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList8 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab10 = equipmentDAO6.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList11 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO12 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO12.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        equipmentDAO12.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO6.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO6.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO21 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO21.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO21.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab25 = equipmentDAO21.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList26 = equipmentDAO21.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO27 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList28 = equipmentDAO27.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray29 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList30 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30, equipmentArray29);
        equipmentDAO27.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30);
        equipmentDAO21.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(labList8);
        org.junit.Assert.assertNull(lab10);
        org.junit.Assert.assertNotNull(labList11);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNull(lab25);
        org.junit.Assert.assertNotNull(labList26);
        org.junit.Assert.assertNotNull(labList28);
        org.junit.Assert.assertNotNull(equipmentArray29);
        org.junit.Assert.assertArrayEquals(equipmentArray29, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test224");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus7);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test225");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList12 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus14 = null;
        equipmentDAO0.updateStatus("", equipmentStatus14);
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(labList12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test226");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO9.updateStatus("hi!", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO9.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO9.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList15);
        ca.yorku.eecs3311.model.equipment.Lab lab17 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test227");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO15.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList17 = equipmentDAO15.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab19 = equipmentDAO15.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO15.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO21 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO21.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray23 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24, equipmentArray23);
        equipmentDAO21.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        equipmentDAO15.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList29 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab31 = equipmentDAO0.findLabById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList16);
        org.junit.Assert.assertNotNull(labList17);
        org.junit.Assert.assertNull(lab19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNotNull(equipmentArray23);
        org.junit.Assert.assertArrayEquals(equipmentArray23, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(labList29);
        org.junit.Assert.assertNull(lab31);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test228");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO5.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO5.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = equipmentDAO5.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment11 = equipmentDAO5.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO5.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList12);
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus17 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus17);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNull(lab15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test229");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO6.updateStatus("hi!", equipmentStatus8);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList16 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList16);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test230");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO5.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO5.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO9.updateStatus("hi!", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO9.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO9.loadAll();
        equipmentDAO5.writeAllEquipment(equipmentList15);
        equipmentDAO0.writeAllEquipment(equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment21 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment23 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(equipment23);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test231");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO16 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList17 = equipmentDAO16.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO16.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList19);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.equipment.Lab lab24 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNull(lab15);
        org.junit.Assert.assertNotNull(labList17);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentList22);
        org.junit.Assert.assertNull(lab24);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test232");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        equipmentDAO4.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO0.updateStatus("", equipmentStatus11);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus14 = null;
        equipmentDAO0.updateStatus("", equipmentStatus14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment19 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO20 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList21 = equipmentDAO20.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList22 = equipmentDAO20.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment24 = equipmentDAO20.findById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment26 = equipmentDAO20.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = equipmentDAO20.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList28);
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNull(equipment19);
        org.junit.Assert.assertNotNull(labList21);
        org.junit.Assert.assertNotNull(labList22);
        org.junit.Assert.assertNull(equipment24);
        org.junit.Assert.assertNull(equipment26);
        org.junit.Assert.assertNotNull(equipmentList28);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test233");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO0.updateStatus("", equipmentStatus6);
        org.junit.Assert.assertNotNull(labList4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test234");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment37 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab39 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO40 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus42 = null;
        equipmentDAO40.updateStatus("hi!", equipmentStatus42);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray44 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList45 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList45, equipmentArray44);
        equipmentDAO40.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList45);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList45);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList49 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNull(equipment37);
        org.junit.Assert.assertNull(lab39);
        org.junit.Assert.assertNotNull(equipmentArray44);
        org.junit.Assert.assertArrayEquals(equipmentArray44, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(equipmentList49);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test235");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment3 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO4.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO4.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO8.updateStatus("hi!", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO8.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO8.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO8.loadAll();
        equipmentDAO4.writeAllEquipment(equipmentList14);
        equipmentDAO0.writeAllEquipment(equipmentList14);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList17 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList18 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(equipment3);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNull(lab7);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(labList17);
        org.junit.Assert.assertNotNull(labList18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test236");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment10 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test237");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus5 = null;
        equipmentDAO0.updateStatus("", equipmentStatus5);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(labList7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test238");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("hi!");
        java.lang.Class<?> wildcardClass9 = equipmentList8.getClass();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test239");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab9 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment11 = equipmentDAO0.findById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNull(lab9);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test240");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment5 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = equipmentDAO6.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab11 = equipmentDAO6.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList12 = equipmentDAO6.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList13 = equipmentDAO6.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO6.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = equipmentDAO6.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList17);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(equipment5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNull(lab11);
        org.junit.Assert.assertNotNull(labList12);
        org.junit.Assert.assertNotNull(labList13);
        org.junit.Assert.assertNull(lab15);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test241");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList36 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList38 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList40 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(labList36);
        org.junit.Assert.assertNotNull(equipmentList38);
        org.junit.Assert.assertNotNull(equipmentList40);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test242");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO32 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList33 = equipmentDAO32.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab35 = equipmentDAO32.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab37 = equipmentDAO32.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus39 = null;
        equipmentDAO32.updateStatus("", equipmentStatus39);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus42 = null;
        equipmentDAO32.updateStatus("", equipmentStatus42);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList45 = equipmentDAO32.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList45);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList47 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList48 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab49 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(labList33);
        org.junit.Assert.assertNull(lab35);
        org.junit.Assert.assertNull(lab37);
        org.junit.Assert.assertNotNull(equipmentList45);
        org.junit.Assert.assertNotNull(labList47);
        org.junit.Assert.assertNotNull(labList48);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test243");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment37 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus39 = null;
        equipmentDAO0.updateStatus("", equipmentStatus39);
        ca.yorku.eecs3311.model.equipment.Equipment equipment42 = equipmentDAO0.findById("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus44 = null;
        equipmentDAO0.updateStatus("", equipmentStatus44);
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNull(equipment37);
        org.junit.Assert.assertNull(equipment42);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test244");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test245");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab10 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus14 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus14);
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNull(lab10);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test246");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Equipment equipment6 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO0.updateStatus("", equipmentStatus8);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test247");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray2 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3, equipmentArray2);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList3);
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(lab7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test248");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment37 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus39 = null;
        equipmentDAO0.updateStatus("", equipmentStatus39);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList41 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList43 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList44 = equipmentDAO0.loadAllLabs();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNull(equipment37);
        org.junit.Assert.assertNotNull(labList41);
        org.junit.Assert.assertNotNull(equipmentList43);
        org.junit.Assert.assertNotNull(labList44);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test249");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab15 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment17 = equipmentDAO0.findById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNull(lab15);
        org.junit.Assert.assertNull(equipment17);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test250");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.lang.Class<?> wildcardClass3 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test251");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus4 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus4);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.findByLabId("hi!");
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test252");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray4 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5, equipmentArray4);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5);
        ca.yorku.eecs3311.model.equipment.Lab lab9 = equipmentDAO0.findLabById("");
        org.junit.Assert.assertNotNull(equipmentArray4);
        org.junit.Assert.assertArrayEquals(equipmentArray4, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(lab9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test253");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Equipment equipment9 = equipmentDAO0.findById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test254");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList3 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus5 = null;
        equipmentDAO0.updateStatus("", equipmentStatus5);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(labList3);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test255");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.loadAll();
        java.lang.Class<?> wildcardClass4 = equipmentList3.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test256");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList7 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab10 = equipmentDAO0.findLabById("hi!");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNull(lab10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test257");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList4 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment11 = equipmentDAO0.findById("hi!");
        org.junit.Assert.assertNotNull(labList4);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test258");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test259");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO13 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO13.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = equipmentDAO13.findByLabId("hi!");
        equipmentDAO0.writeAllEquipment(equipmentList16);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList19 = equipmentDAO18.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab22 = equipmentDAO18.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList23 = equipmentDAO18.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO24 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList25 = equipmentDAO24.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        equipmentDAO24.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO18.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.Lab lab33 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment35 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Equipment equipment37 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab39 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList40 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(labList19);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNull(lab22);
        org.junit.Assert.assertNotNull(labList23);
        org.junit.Assert.assertNotNull(labList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(lab33);
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNull(equipment37);
        org.junit.Assert.assertNull(lab39);
        org.junit.Assert.assertNotNull(equipmentList40);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test260");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab4 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList7 = equipmentDAO6.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = equipmentDAO0.findByLabId("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(lab4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(labList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test261");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("");
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(lab7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test262");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO4 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus6 = null;
        equipmentDAO4.updateStatus("hi!", equipmentStatus6);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO4.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO4.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = equipmentDAO4.loadAll();
        equipmentDAO0.writeAllEquipment(equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList15 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO16 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus18 = null;
        equipmentDAO16.updateStatus("hi!", equipmentStatus18);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList20 = equipmentDAO16.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = equipmentDAO16.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = equipmentDAO16.findByLabId("");
        equipmentDAO0.writeAllEquipment(equipmentList24);
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList26 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab27 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(labList15);
        org.junit.Assert.assertNotNull(labList20);
        org.junit.Assert.assertNotNull(equipmentList22);
        org.junit.Assert.assertNotNull(equipmentList24);
        org.junit.Assert.assertNotNull(labList26);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test263");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab7 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.save(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Equipment.getEquipmentID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNull(lab7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test264");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList2 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Equipment equipment4 = equipmentDAO0.findById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        ca.yorku.eecs3311.model.equipment.Lab lab6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentDAO0.saveLab(lab6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ca.yorku.eecs3311.model.equipment.Lab.getLabID()\" because \"l\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(labList2);
        org.junit.Assert.assertNull(equipment4);
        org.junit.Assert.assertNotNull(labList5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test265");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("");
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus7 = null;
        equipmentDAO0.updateStatus("", equipmentStatus7);
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus10 = null;
        equipmentDAO0.updateStatus("", equipmentStatus10);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO0.findByLabId("");
        java.lang.Class<?> wildcardClass14 = equipmentDAO0.getClass();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test266");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO5.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO5.findLabById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus11 = null;
        equipmentDAO9.updateStatus("hi!", equipmentStatus11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = equipmentDAO9.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList14 = equipmentDAO9.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO9.loadAll();
        equipmentDAO5.writeAllEquipment(equipmentList15);
        equipmentDAO0.writeAllEquipment(equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = equipmentDAO0.findByLabId("hi!");
        ca.yorku.eecs3311.model.equipment.Equipment equipment21 = equipmentDAO0.findById("");
        ca.yorku.eecs3311.model.equipment.Lab lab23 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(labList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(lab23);
        org.junit.Assert.assertNotNull(equipmentList24);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test267");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabsWithEquipment();
        ca.yorku.eecs3311.model.equipment.Lab lab3 = equipmentDAO0.findLabById("hi!");
        ca.yorku.eecs3311.model.equipment.Lab lab5 = equipmentDAO0.findLabById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList6 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList8 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabsWithEquipment();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNull(lab3);
        org.junit.Assert.assertNull(lab5);
        org.junit.Assert.assertNotNull(labList6);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(labList9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test268");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus2 = null;
        equipmentDAO0.updateStatus("hi!", equipmentStatus2);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = equipmentDAO0.loadAll();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList5 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = equipmentDAO0.loadAll();
        ca.yorku.eecs3311.model.equipment.Lab lab8 = equipmentDAO0.findLabById("");
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList9 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(labList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(lab8);
        org.junit.Assert.assertNotNull(labList9);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentDAORandoopTest0.test269");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO0 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.equipment.Lab> labList1 = equipmentDAO0.loadAllLabs();
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList3 = equipmentDAO0.findByLabId("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = equipmentDAO0.findByLabId("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = new ca.yorku.eecs3311.dao.EquipmentDAO();
        ca.yorku.eecs3311.model.enums.EquipmentStatus equipmentStatus8 = null;
        equipmentDAO6.updateStatus("hi!", equipmentStatus8);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        equipmentDAO6.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        equipmentDAO0.writeAllEquipment((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = equipmentDAO0.loadAll();
        org.junit.Assert.assertNotNull(labList1);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
    }
}

