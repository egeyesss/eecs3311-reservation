package ca.yorku.eecs3311.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingManagerRandoopTest0 {

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
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test001");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking6 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test002");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test003");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test004");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking4 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test005");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test006");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.modifyBooking("", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test007");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.completeBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test008");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.createBooking("", "", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test009");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.modifyBooking("", localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test010");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.extendBooking("", localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test011");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test012");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking9 = bookingManager0.extendBooking("", localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test013");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking4 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test014");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.modifyBooking("", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test015");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.createBooking("hi!", "", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test016");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = bookingManager0.isEquipmentAvailable("hi!", localDateTime10, localDateTime11);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test017");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.createBooking("", "", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test018");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDAO9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test019");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        ca.yorku.eecs3311.dao.UserDAO userDAO28 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking30 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userDAO28);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test020");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test021");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test022");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByUser("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test023");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test024");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.createBooking("", "", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test025");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking22 = bookingManager0.modifyBooking("hi!", localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test026");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking4 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test027");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = bookingManager0.isEquipmentAvailable("hi!", localDateTime4, localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test028");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test029");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData9 = null;
        bookingManager0.update(sensorData9);
        java.lang.Class<?> wildcardClass11 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test030");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test031");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        ca.yorku.eecs3311.dao.UserDAO userDAO28 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime30 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking31 = bookingManager0.extendBooking("hi!", localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userDAO28);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test032");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.extendBooking("hi!", localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test033");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.createBooking("hi!", "", localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test034");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList15 = bookingManager0.getBookingsByUser("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getAllBookings();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test035");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.lang.Class<?> wildcardClass15 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test036");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking7 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNull(booking5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test037");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking21 = bookingManager0.createBooking("hi!", "hi!", localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test038");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test039");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test040");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingDAO10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test041");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        ca.yorku.eecs3311.model.equipment.SensorData sensorData9 = null;
        bookingManager0.update(sensorData9);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test042");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager3 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray4 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5, equipmentArray4);
        bookingManager3.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = bookingManager3.isEquipmentAvailable("hi!", localDateTime9, localDateTime10);
        ca.yorku.eecs3311.service.BookingManager bookingManager12 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray13 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14, equipmentArray13);
        bookingManager12.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData17 = null;
        bookingManager12.update(sensorData17);
        ca.yorku.eecs3311.service.BookingManager bookingManager19 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray20 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21, equipmentArray20);
        bookingManager19.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        bookingManager12.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        bookingManager3.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        java.time.LocalDateTime localDateTime28 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking29 = bookingManager0.extendBooking("hi!", localDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertNotNull(equipmentArray4);
        org.junit.Assert.assertArrayEquals(equipmentArray4, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookingManager12);
        org.junit.Assert.assertNotNull(equipmentArray13);
        org.junit.Assert.assertArrayEquals(equipmentArray13, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test043");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking24 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test044");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.createBooking("", "", localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test045");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test046");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.extendBooking("hi!", localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test047");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test048");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.modifyBooking("", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingDAO10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test049");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.createBooking("", "hi!", localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test050");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        java.time.LocalDateTime localDateTime31 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking32 = bookingManager0.extendBooking("hi!", localDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test051");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test052");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.findBookingById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = booking18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNull(booking18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test053");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.completeBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test054");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDAO9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test055");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.createBooking("hi!", "", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test056");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO14 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
        org.junit.Assert.assertNotNull(userDAO14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test057");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager10 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray11 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12, equipmentArray11);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData15 = null;
        bookingManager10.update(sensorData15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager10.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager10.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = bookingManager10.isEquipmentAvailable("hi!", localDateTime21, localDateTime22);
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData29 = null;
        bookingManager24.update(sensorData29);
        ca.yorku.eecs3311.service.BookingManager bookingManager31 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray32 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33, equipmentArray32);
        bookingManager31.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        java.lang.Class<?> wildcardClass39 = equipmentList33.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingManager10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingManager31);
        org.junit.Assert.assertNotNull(equipmentArray32);
        org.junit.Assert.assertArrayEquals(equipmentArray32, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test058");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test059");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.createBooking("", "", localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNull(booking3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test060");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test061");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getAllBookings();
        java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test062");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData24 = null;
        bookingManager0.update(sensorData24);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking27 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test063");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test064");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList40 = bookingManager17.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager41 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray42 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList43 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43, equipmentArray42);
        bookingManager41.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking52 = bookingManager0.createBooking("hi!", "hi!", localDateTime50, localDateTime51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingList40);
        org.junit.Assert.assertNotNull(bookingManager41);
        org.junit.Assert.assertNotNull(equipmentArray42);
        org.junit.Assert.assertArrayEquals(equipmentArray42, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test065");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test066");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test067");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.extendBooking("hi!", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test068");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByUser("");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking22 = bookingManager0.modifyBooking("", localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(userDAO16);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test069");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.lang.Class<?> wildcardClass13 = equipmentList9.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test070");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test071");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO18 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(equipmentDAO18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test072");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test073");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking7 = bookingManager0.createBooking("", "hi!", localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test074");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO19 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(equipmentDAO19);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test075");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test076");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test077");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking25 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test078");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO14 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
        org.junit.Assert.assertNotNull(userDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test079");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.modifyBooking("hi!", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test080");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.createBooking("", "", localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(equipmentDAO14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test081");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        java.lang.Class<?> wildcardClass7 = equipmentDAO6.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test082");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("hi!");
        java.lang.Class<?> wildcardClass9 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test083");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.time.LocalDateTime localDateTime29 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking30 = bookingManager0.extendBooking("hi!", localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test084");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO14 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
        org.junit.Assert.assertNotNull(userDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test085");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO16 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.extendBooking("", localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(equipmentDAO16);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test086");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.findBookingById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNull(booking18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test087");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        ca.yorku.eecs3311.dao.UserDAO userDAO28 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking30 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userDAO28);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test088");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByUser("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(userDAO16);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test089");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking4 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test090");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.extendBooking("", localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test091");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getAllBookings();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test092");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getAllBookings();
        java.lang.Class<?> wildcardClass19 = bookingList18.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test093");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test094");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test095");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList21 = bookingManager0.getBookingsByUser("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(bookingList21);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test096");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = bookingManager0.isEquipmentAvailable("hi!", localDateTime29, localDateTime30);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking35 = bookingManager0.modifyBooking("hi!", localDateTime33, localDateTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test097");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingManager0.isEquipmentAvailable("hi!", localDateTime5, localDateTime6);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData8 = null;
        bookingManager0.update(sensorData8);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test098");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = booking8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test099");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking4 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test100");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO6 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(userDAO6);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test101");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByUser("");
        java.lang.Class<?> wildcardClass19 = bookingList18.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(userDAO16);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test102");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList25 = bookingManager0.getBookingsByEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking27 = bookingManager0.completeBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList25);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test103");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO11 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.createBooking("", "", localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(userDAO11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test104");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingManager0.isEquipmentAvailable("hi!", localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.extendBooking("hi!", localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test105");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        java.lang.Class<?> wildcardClass14 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test106");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = bookingManager14.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager14.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList42 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = bookingManager0.isEquipmentAvailable("", localDateTime44, localDateTime45);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking51 = bookingManager0.createBooking("hi!", "hi!", localDateTime49, localDateTime50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentDAO15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingList42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test107");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = booking8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test108");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData15 = null;
        bookingManager0.update(sensorData15);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(equipmentDAO14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test109");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test110");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getBookingsByEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking21 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList19);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test111");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test112");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByEquipment("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test113");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.extendBooking("", localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test114");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.modifyBooking("", localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test115");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.lang.Class<?> wildcardClass10 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test116");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager19 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray20 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21, equipmentArray20);
        bookingManager19.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = bookingManager19.isEquipmentAvailable("hi!", localDateTime25, localDateTime26);
        ca.yorku.eecs3311.service.BookingManager bookingManager28 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray29 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList30 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30, equipmentArray29);
        bookingManager28.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData33 = null;
        bookingManager28.update(sensorData33);
        ca.yorku.eecs3311.service.BookingManager bookingManager35 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray36 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList37 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37, equipmentArray36);
        bookingManager35.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        bookingManager28.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        bookingManager19.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList44 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO45 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNull(booking18);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingManager28);
        org.junit.Assert.assertNotNull(equipmentArray29);
        org.junit.Assert.assertArrayEquals(equipmentArray29, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingManager35);
        org.junit.Assert.assertNotNull(equipmentArray36);
        org.junit.Assert.assertArrayEquals(equipmentArray36, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookingList44);
        org.junit.Assert.assertNotNull(equipmentDAO45);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test117");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime25 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking26 = bookingManager0.extendBooking("hi!", localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test118");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test119");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.modifyBooking("", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingDAO9);
        org.junit.Assert.assertNotNull(bookingDAO10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test120");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO3 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData4 = null;
        bookingManager0.update(sensorData4);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking7 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingDAO3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test121");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingDAO9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test122");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.completeBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test123");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test124");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByUser("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking23 = bookingManager0.createBooking("", "", localDateTime21, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(userDAO16);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test125");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO14 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.findBookingById("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
        org.junit.Assert.assertNotNull(userDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(booking19);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test126");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO3 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData4 = null;
        bookingManager0.update(sensorData4);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking9 = bookingManager0.modifyBooking("", localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingDAO3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test127");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.dao.UserDAO userDAO7 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userDAO7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test128");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData24 = null;
        bookingManager0.update(sensorData24);
        java.time.LocalDateTime localDateTime27 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking28 = bookingManager0.extendBooking("hi!", localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test129");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO11 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.createBooking("hi!", "", localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(bookingDAO11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test130");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList12 = bookingManager0.getBookingsByUser("hi!");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(bookingDAO13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test131");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = bookingManager0.isEquipmentAvailable("hi!", localDateTime29, localDateTime30);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO32 = bookingManager0.getBookingDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingDAO32);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test132");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = bookingManager14.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager14.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList42 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.UserDAO userDAO43 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking45 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentDAO15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingList42);
        org.junit.Assert.assertNotNull(userDAO43);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test133");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager15 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray16 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17, equipmentArray16);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData20 = null;
        bookingManager15.update(sensorData20);
        ca.yorku.eecs3311.service.BookingManager bookingManager22 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray23 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24, equipmentArray23);
        bookingManager22.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList28 = bookingManager15.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager29 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO30 = bookingManager29.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList31 = bookingManager29.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager32 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray33 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList34 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34, equipmentArray33);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = bookingManager32.isEquipmentAvailable("hi!", localDateTime38, localDateTime39);
        ca.yorku.eecs3311.service.BookingManager bookingManager41 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray42 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList43 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43, equipmentArray42);
        bookingManager41.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData46 = null;
        bookingManager41.update(sensorData46);
        ca.yorku.eecs3311.service.BookingManager bookingManager48 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray49 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList50 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50, equipmentArray49);
        bookingManager48.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager41.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager29.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingManager15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookingManager22);
        org.junit.Assert.assertNotNull(equipmentArray23);
        org.junit.Assert.assertArrayEquals(equipmentArray23, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(bookingManager29);
        org.junit.Assert.assertNotNull(equipmentDAO30);
        org.junit.Assert.assertNotNull(bookingList31);
        org.junit.Assert.assertNotNull(bookingManager32);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookingManager41);
        org.junit.Assert.assertNotNull(equipmentArray42);
        org.junit.Assert.assertArrayEquals(equipmentArray42, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(bookingManager48);
        org.junit.Assert.assertNotNull(equipmentArray49);
        org.junit.Assert.assertArrayEquals(equipmentArray49, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test134");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList40 = bookingManager17.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager41 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray42 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList43 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43, equipmentArray42);
        bookingManager41.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        java.time.LocalDateTime localDateTime49 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking50 = bookingManager0.extendBooking("", localDateTime49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingList40);
        org.junit.Assert.assertNotNull(bookingManager41);
        org.junit.Assert.assertNotNull(equipmentArray42);
        org.junit.Assert.assertArrayEquals(equipmentArray42, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test135");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.extendBooking("hi!", localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test136");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO7 = bookingManager0.getEquipmentDAO();
        java.lang.Class<?> wildcardClass8 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(equipmentDAO7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test137");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = bookingManager0.isEquipmentAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.createBooking("", "hi!", localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test138");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByUser("");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.modifyBooking("hi!", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test139");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager10 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray11 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12, equipmentArray11);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData15 = null;
        bookingManager10.update(sensorData15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager10.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager10.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = bookingManager10.isEquipmentAvailable("hi!", localDateTime21, localDateTime22);
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData29 = null;
        bookingManager24.update(sensorData29);
        ca.yorku.eecs3311.service.BookingManager bookingManager31 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray32 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33, equipmentArray32);
        bookingManager31.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking40 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingManager10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingManager31);
        org.junit.Assert.assertNotNull(equipmentArray32);
        org.junit.Assert.assertArrayEquals(equipmentArray32, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test140");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test141");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        ca.yorku.eecs3311.dao.UserDAO userDAO28 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking32 = bookingManager0.modifyBooking("hi!", localDateTime30, localDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userDAO28);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test142");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData24 = null;
        bookingManager0.update(sensorData24);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking27 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test143");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.createBooking("hi!", "hi!", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test144");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO11 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager15 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray16 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17, equipmentArray16);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData20 = null;
        bookingManager15.update(sensorData20);
        ca.yorku.eecs3311.service.BookingManager bookingManager22 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray23 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24, equipmentArray23);
        bookingManager22.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList28 = bookingManager15.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO29 = bookingManager15.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList31 = bookingManager15.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking33 = bookingManager15.findBookingById("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager34 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray35 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList36 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36, equipmentArray35);
        bookingManager34.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingManager34.isEquipmentAvailable("hi!", localDateTime40, localDateTime41);
        ca.yorku.eecs3311.service.BookingManager bookingManager43 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray44 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList45 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList45, equipmentArray44);
        bookingManager43.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList45);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData48 = null;
        bookingManager43.update(sensorData48);
        ca.yorku.eecs3311.service.BookingManager bookingManager50 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray51 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList52 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52, equipmentArray51);
        bookingManager50.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        bookingManager43.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        bookingManager34.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        ca.yorku.eecs3311.model.booking.Booking booking60 = bookingManager0.findBookingById("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(booking10);
        org.junit.Assert.assertNotNull(equipmentDAO11);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingManager15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookingManager22);
        org.junit.Assert.assertNotNull(equipmentArray23);
        org.junit.Assert.assertArrayEquals(equipmentArray23, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(bookingDAO29);
        org.junit.Assert.assertNotNull(bookingList31);
        org.junit.Assert.assertNull(booking33);
        org.junit.Assert.assertNotNull(bookingManager34);
        org.junit.Assert.assertNotNull(equipmentArray35);
        org.junit.Assert.assertArrayEquals(equipmentArray35, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookingManager43);
        org.junit.Assert.assertNotNull(equipmentArray44);
        org.junit.Assert.assertArrayEquals(equipmentArray44, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookingManager50);
        org.junit.Assert.assertNotNull(equipmentArray51);
        org.junit.Assert.assertArrayEquals(equipmentArray51, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(booking60);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test145");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList4 = bookingManager0.getBookingsByUser("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test146");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList25 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO26 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(equipmentDAO26);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test147");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList29 = bookingManager0.getBookingsByUser("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList31 = bookingManager0.getBookingsByEquipment("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingList29);
        org.junit.Assert.assertNotNull(bookingList31);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test148");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = bookingManager0.isEquipmentAvailable("hi!", localDateTime10, localDateTime11);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test149");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager3 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray4 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5, equipmentArray4);
        bookingManager3.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData8 = null;
        bookingManager3.update(sensorData8);
        ca.yorku.eecs3311.service.BookingManager bookingManager10 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray11 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12, equipmentArray11);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        bookingManager3.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager3.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData17 = null;
        bookingManager3.update(sensorData17);
        ca.yorku.eecs3311.dao.UserDAO userDAO19 = bookingManager3.getUserDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager20 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray21 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList22 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList22, equipmentArray21);
        bookingManager20.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList22);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData25 = null;
        bookingManager20.update(sensorData25);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList27 = bookingManager20.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList29 = bookingManager20.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = bookingManager20.isEquipmentAvailable("hi!", localDateTime31, localDateTime32);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager20.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager3.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertNotNull(equipmentArray4);
        org.junit.Assert.assertArrayEquals(equipmentArray4, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookingManager10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(userDAO19);
        org.junit.Assert.assertNotNull(bookingManager20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNotNull(bookingList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test150");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        java.lang.Class<?> wildcardClass7 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test151");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingManager0.isEquipmentAvailable("hi!", localDateTime5, localDateTime6);
        ca.yorku.eecs3311.model.booking.Booking booking9 = bookingManager0.findBookingById("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(booking9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test152");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.extendBooking("hi!", localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test153");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking7 = bookingManager0.createBooking("hi!", "hi!", localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test154");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = bookingManager14.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager14.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = bookingManager0.isEquipmentAvailable("", localDateTime43, localDateTime44);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList46 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking51 = bookingManager0.createBooking("", "hi!", localDateTime49, localDateTime50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentDAO15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(bookingList46);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test155");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test156");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO11 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList12 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking17 = bookingManager0.createBooking("", "hi!", localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(booking10);
        org.junit.Assert.assertNotNull(equipmentDAO11);
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test157");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking2 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test158");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO10 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertNotNull(equipmentDAO10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test159");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData9 = null;
        bookingManager0.update(sensorData9);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test160");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.modifyBooking("", localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(equipmentDAO14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test161");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList25 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking30 = bookingManager0.createBooking("", "hi!", localDateTime28, localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList25);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test162");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData16 = null;
        bookingManager0.update(sensorData16);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test163");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO11 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO12 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(userDAO11);
        org.junit.Assert.assertNotNull(userDAO12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test164");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingDAO9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test165");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByUser("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test166");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        ca.yorku.eecs3311.dao.UserDAO userDAO18 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList20 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList22 = bookingManager0.getBookingsByEquipment("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userDAO18);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(bookingList22);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test167");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO7 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO8 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = bookingManager0.isEquipmentAvailable("", localDateTime10, localDateTime11);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(equipmentDAO7);
        org.junit.Assert.assertNotNull(equipmentDAO8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test168");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.createBooking("", "hi!", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test169");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = bookingManager0.isEquipmentAvailable("hi!", localDateTime4, localDateTime5);
        ca.yorku.eecs3311.dao.UserDAO userDAO7 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking9 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userDAO7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test170");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = bookingManager0.isEquipmentAvailable("hi!", localDateTime4, localDateTime5);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO7 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.extendBooking("", localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookingDAO7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test171");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList40 = bookingManager17.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager41 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray42 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList43 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43, equipmentArray42);
        bookingManager41.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = bookingManager0.isEquipmentAvailable("hi!", localDateTime49, localDateTime50);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingList40);
        org.junit.Assert.assertNotNull(bookingManager41);
        org.junit.Assert.assertNotNull(equipmentArray42);
        org.junit.Assert.assertArrayEquals(equipmentArray42, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test172");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.model.equipment.SensorData sensorData11 = null;
        bookingManager0.update(sensorData11);
        ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.findBookingById("");
        java.lang.Class<?> wildcardClass15 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test173");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking4 = bookingManager0.completeBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test174");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = bookingManager0.getEquipmentDAO();
        java.lang.Class<?> wildcardClass10 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test175");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList29 = bookingManager0.getBookingsByUser("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking31 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingList29);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test176");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = bookingManager0.isEquipmentAvailable("hi!", localDateTime4, localDateTime5);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO7 = bookingManager0.getBookingDAO();
        java.lang.Class<?> wildcardClass8 = bookingDAO7.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookingDAO7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test177");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO21 = bookingManager0.getEquipmentDAO();
        java.lang.Class<?> wildcardClass22 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(booking20);
        org.junit.Assert.assertNotNull(equipmentDAO21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test178");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test179");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.createBooking("", "hi!", localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingDAO14);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test180");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("", localDateTime11, localDateTime12);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingDAO9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test181");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByUser("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test182");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData10 = null;
        bookingManager0.update(sensorData10);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingDAO9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test183");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = bookingManager0.isEquipmentAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.modifyBooking("", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test184");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.extendBooking("hi!", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test185");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.model.equipment.SensorData sensorData17 = null;
        bookingManager0.update(sensorData17);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test186");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = bookingManager0.isEquipmentAvailable("", localDateTime9, localDateTime10);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test187");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.findBookingById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        java.lang.Class<?> wildcardClass7 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test188");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = bookingManager0.isEquipmentAvailable("hi!", localDateTime4, localDateTime5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test189");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO7 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking9 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(equipmentDAO7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test190");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager19 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray20 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21, equipmentArray20);
        bookingManager19.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = bookingManager19.isEquipmentAvailable("hi!", localDateTime25, localDateTime26);
        ca.yorku.eecs3311.service.BookingManager bookingManager28 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray29 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList30 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30, equipmentArray29);
        bookingManager28.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList30);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData33 = null;
        bookingManager28.update(sensorData33);
        ca.yorku.eecs3311.service.BookingManager bookingManager35 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray36 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList37 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37, equipmentArray36);
        bookingManager35.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        bookingManager28.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        bookingManager19.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList37);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList44 = bookingManager0.getBookingsByEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking46 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNull(booking18);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingManager28);
        org.junit.Assert.assertNotNull(equipmentArray29);
        org.junit.Assert.assertArrayEquals(equipmentArray29, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingManager35);
        org.junit.Assert.assertNotNull(equipmentArray36);
        org.junit.Assert.assertArrayEquals(equipmentArray36, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookingList44);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test191");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking17 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test192");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingManager0.isEquipmentAvailable("hi!", localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.createBooking("hi!", "hi!", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test193");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByUser("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(userDAO16);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test194");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking17 = bookingManager0.extendBooking("hi!", localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(equipmentDAO14);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test195");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData22 = null;
        bookingManager17.update(sensorData22);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList24 = bookingManager17.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList26 = bookingManager17.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = bookingManager17.isEquipmentAvailable("hi!", localDateTime28, localDateTime29);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray31 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList32 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32, equipmentArray31);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList36 = bookingManager0.getAllBookings();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(userDAO16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(equipmentArray31);
        org.junit.Assert.assertArrayEquals(equipmentArray31, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingList36);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test196");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.booking.Booking booking31 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager32 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray33 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList34 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34, equipmentArray33);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData37 = null;
        bookingManager32.update(sensorData37);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList39 = bookingManager32.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager40 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray41 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList42 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42, equipmentArray41);
        bookingManager40.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking48 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(booking31);
        org.junit.Assert.assertNotNull(bookingManager32);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertNotNull(bookingManager40);
        org.junit.Assert.assertNotNull(equipmentArray41);
        org.junit.Assert.assertArrayEquals(equipmentArray41, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test197");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager10 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray11 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12, equipmentArray11);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData15 = null;
        bookingManager10.update(sensorData15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager10.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager10.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = bookingManager10.isEquipmentAvailable("hi!", localDateTime21, localDateTime22);
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData29 = null;
        bookingManager24.update(sensorData29);
        ca.yorku.eecs3311.service.BookingManager bookingManager31 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray32 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33, equipmentArray32);
        bookingManager31.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        ca.yorku.eecs3311.dao.UserDAO userDAO39 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingManager10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingManager31);
        org.junit.Assert.assertNotNull(equipmentArray32);
        org.junit.Assert.assertArrayEquals(equipmentArray32, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userDAO39);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test198");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = bookingManager0.isEquipmentAvailable("hi!", localDateTime4, localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test199");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.extendBooking("", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(equipmentDAO9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test200");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData3 = null;
        bookingManager0.update(sensorData3);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList5 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getBookingsByUser("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test201");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.createBooking("hi!", "", localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test202");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager10 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray11 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12, equipmentArray11);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData15 = null;
        bookingManager10.update(sensorData15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager10.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager10.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = bookingManager10.isEquipmentAvailable("hi!", localDateTime21, localDateTime22);
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData29 = null;
        bookingManager24.update(sensorData29);
        ca.yorku.eecs3311.service.BookingManager bookingManager31 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray32 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33, equipmentArray32);
        bookingManager31.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingManager0.isEquipmentAvailable("", localDateTime40, localDateTime41);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO43 = bookingManager0.getBookingDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingManager10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingManager31);
        org.junit.Assert.assertNotNull(equipmentArray32);
        org.junit.Assert.assertArrayEquals(equipmentArray32, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookingDAO43);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test203");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList21 = bookingManager0.getBookingsByUser("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking23 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(bookingList21);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test204");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO11 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.completeBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(booking10);
        org.junit.Assert.assertNotNull(equipmentDAO11);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertNotNull(bookingDAO14);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test205");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = bookingManager0.isEquipmentAvailable("hi!", localDateTime4, localDateTime5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test206");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager10 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray11 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12, equipmentArray11);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData15 = null;
        bookingManager10.update(sensorData15);
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingDAO9);
        org.junit.Assert.assertNotNull(bookingManager10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test207");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking19 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test208");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO14 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking18 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
        org.junit.Assert.assertNotNull(userDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test209");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager3 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray4 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList5 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5, equipmentArray4);
        bookingManager3.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = bookingManager3.isEquipmentAvailable("hi!", localDateTime9, localDateTime10);
        ca.yorku.eecs3311.service.BookingManager bookingManager12 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray13 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList14 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14, equipmentArray13);
        bookingManager12.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList14);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData17 = null;
        bookingManager12.update(sensorData17);
        ca.yorku.eecs3311.service.BookingManager bookingManager19 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray20 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList21 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21, equipmentArray20);
        bookingManager19.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        bookingManager12.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        bookingManager3.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList21);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking28 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertNotNull(equipmentArray4);
        org.junit.Assert.assertArrayEquals(equipmentArray4, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookingManager12);
        org.junit.Assert.assertNotNull(equipmentArray13);
        org.junit.Assert.assertArrayEquals(equipmentArray13, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test210");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList12 = bookingManager0.getBookingsByUser("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingDAO9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test211");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test212");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList15 = bookingManager0.getBookingsByUser("");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.createBooking("", "", localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookingList15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test213");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO10 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager13 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager13.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData18 = null;
        bookingManager13.update(sensorData18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList21 = bookingManager13.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO22 = bookingManager13.getBookingDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO23 = bookingManager13.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        bookingManager13.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList32 = bookingManager0.getBookingsByUser("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList34 = bookingManager0.getBookingsByEquipment("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(equipmentDAO10);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertNotNull(bookingManager13);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(bookingDAO22);
        org.junit.Assert.assertNotNull(bookingDAO23);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertNotNull(bookingList34);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test214");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test215");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager11 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray12 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList13, equipmentArray12);
        bookingManager11.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList13);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList13);
        ca.yorku.eecs3311.dao.UserDAO userDAO17 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingDAO9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(bookingManager11);
        org.junit.Assert.assertNotNull(equipmentArray12);
        org.junit.Assert.assertArrayEquals(equipmentArray12, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userDAO17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test216");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList25 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList26 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager27 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray28 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList29 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList29, equipmentArray28);
        bookingManager27.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList29);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData32 = null;
        bookingManager27.update(sensorData32);
        ca.yorku.eecs3311.service.BookingManager bookingManager34 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray35 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList36 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36, equipmentArray35);
        bookingManager34.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        bookingManager27.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList40 = bookingManager27.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO41 = bookingManager27.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList43 = bookingManager27.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager44 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray45 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList46 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList46, equipmentArray45);
        bookingManager44.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList46);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = bookingManager44.isEquipmentAvailable("hi!", localDateTime50, localDateTime51);
        ca.yorku.eecs3311.service.BookingManager bookingManager53 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray54 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList55 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55, equipmentArray54);
        bookingManager53.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData58 = null;
        bookingManager53.update(sensorData58);
        ca.yorku.eecs3311.service.BookingManager bookingManager60 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray61 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList62 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList62, equipmentArray61);
        bookingManager60.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList62);
        bookingManager53.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList62);
        bookingManager44.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList62);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList67 = bookingManager44.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager68 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray69 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList70 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70, equipmentArray69);
        bookingManager68.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70);
        bookingManager44.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70);
        bookingManager27.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking77 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertNotNull(bookingManager27);
        org.junit.Assert.assertNotNull(equipmentArray28);
        org.junit.Assert.assertArrayEquals(equipmentArray28, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookingManager34);
        org.junit.Assert.assertNotNull(equipmentArray35);
        org.junit.Assert.assertArrayEquals(equipmentArray35, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookingList40);
        org.junit.Assert.assertNotNull(bookingDAO41);
        org.junit.Assert.assertNotNull(bookingList43);
        org.junit.Assert.assertNotNull(bookingManager44);
        org.junit.Assert.assertNotNull(equipmentArray45);
        org.junit.Assert.assertArrayEquals(equipmentArray45, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookingManager53);
        org.junit.Assert.assertNotNull(equipmentArray54);
        org.junit.Assert.assertArrayEquals(equipmentArray54, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(bookingManager60);
        org.junit.Assert.assertNotNull(equipmentArray61);
        org.junit.Assert.assertArrayEquals(equipmentArray61, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(bookingList67);
        org.junit.Assert.assertNotNull(bookingManager68);
        org.junit.Assert.assertNotNull(equipmentArray69);
        org.junit.Assert.assertArrayEquals(equipmentArray69, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test217");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        ca.yorku.eecs3311.service.BookingManager bookingManager23 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray24 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList25 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList25, equipmentArray24);
        bookingManager23.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList25);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData28 = null;
        bookingManager23.update(sensorData28);
        ca.yorku.eecs3311.service.BookingManager bookingManager30 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray31 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList32 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32, equipmentArray31);
        bookingManager30.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32);
        bookingManager23.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList36 = bookingManager23.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager37 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO38 = bookingManager37.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList39 = bookingManager37.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager40 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray41 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList42 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42, equipmentArray41);
        bookingManager40.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42);
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = bookingManager40.isEquipmentAvailable("hi!", localDateTime46, localDateTime47);
        ca.yorku.eecs3311.service.BookingManager bookingManager49 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray50 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList51 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList51, equipmentArray50);
        bookingManager49.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList51);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData54 = null;
        bookingManager49.update(sensorData54);
        ca.yorku.eecs3311.service.BookingManager bookingManager56 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray57 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList58 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList58, equipmentArray57);
        bookingManager56.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList58);
        bookingManager49.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList58);
        bookingManager40.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList58);
        bookingManager37.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList58);
        bookingManager23.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList58);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList58);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingManager23);
        org.junit.Assert.assertNotNull(equipmentArray24);
        org.junit.Assert.assertArrayEquals(equipmentArray24, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookingManager30);
        org.junit.Assert.assertNotNull(equipmentArray31);
        org.junit.Assert.assertArrayEquals(equipmentArray31, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookingList36);
        org.junit.Assert.assertNotNull(bookingManager37);
        org.junit.Assert.assertNotNull(equipmentDAO38);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertNotNull(bookingManager40);
        org.junit.Assert.assertNotNull(equipmentArray41);
        org.junit.Assert.assertArrayEquals(equipmentArray41, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bookingManager49);
        org.junit.Assert.assertNotNull(equipmentArray50);
        org.junit.Assert.assertArrayEquals(equipmentArray50, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookingManager56);
        org.junit.Assert.assertNotNull(equipmentArray57);
        org.junit.Assert.assertArrayEquals(equipmentArray57, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test218");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test219");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByUser("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByEquipment("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test220");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = bookingManager14.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager14.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList42 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO43 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime45 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking46 = bookingManager0.extendBooking("hi!", localDateTime45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentDAO15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingList42);
        org.junit.Assert.assertNotNull(equipmentDAO43);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test221");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO6 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(userDAO6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test222");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData20 = null;
        bookingManager0.update(sensorData20);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO22 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking25 = bookingManager0.extendBooking("", localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(bookingDAO22);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test223");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingManager0.isEquipmentAvailable("hi!", localDateTime5, localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking9 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test224");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking3 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList5 = bookingManager0.getBookingsByEquipment("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test225");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test226");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test227");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager0.getBookingsByEquipment("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test228");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = bookingManager14.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager14.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList42 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = bookingManager0.isEquipmentAvailable("", localDateTime44, localDateTime45);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking48 = bookingManager0.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentDAO15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingList42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test229");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.findBookingById("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(booking20);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test230");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        ca.yorku.eecs3311.dao.UserDAO userDAO28 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList30 = bookingManager0.getBookingsByEquipment("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userDAO28);
        org.junit.Assert.assertNotNull(bookingList30);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test231");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData10 = null;
        bookingManager0.update(sensorData10);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getBookingsByEquipment("");
        java.lang.Class<?> wildcardClass14 = bookingList13.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test232");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO10 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.findBookingById("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertNotNull(userDAO10);
        org.junit.Assert.assertNull(booking12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test233");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager0.getBookingsByUser("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(booking15);
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test234");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.model.equipment.SensorData sensorData11 = null;
        bookingManager0.update(sensorData11);
        ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(booking14);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test235");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager15 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray16 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17, equipmentArray16);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData20 = null;
        bookingManager15.update(sensorData20);
        ca.yorku.eecs3311.service.BookingManager bookingManager22 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray23 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24, equipmentArray23);
        bookingManager22.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList28 = bookingManager15.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager29 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO30 = bookingManager29.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList31 = bookingManager29.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager32 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray33 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList34 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34, equipmentArray33);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = bookingManager32.isEquipmentAvailable("hi!", localDateTime38, localDateTime39);
        ca.yorku.eecs3311.service.BookingManager bookingManager41 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray42 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList43 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43, equipmentArray42);
        bookingManager41.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList43);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData46 = null;
        bookingManager41.update(sensorData46);
        ca.yorku.eecs3311.service.BookingManager bookingManager48 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray49 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList50 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50, equipmentArray49);
        bookingManager48.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager41.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager29.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList50);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking59 = bookingManager0.completeBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingManager15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookingManager22);
        org.junit.Assert.assertNotNull(equipmentArray23);
        org.junit.Assert.assertArrayEquals(equipmentArray23, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(bookingManager29);
        org.junit.Assert.assertNotNull(equipmentDAO30);
        org.junit.Assert.assertNotNull(bookingList31);
        org.junit.Assert.assertNotNull(bookingManager32);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookingManager41);
        org.junit.Assert.assertNotNull(equipmentArray42);
        org.junit.Assert.assertArrayEquals(equipmentArray42, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(bookingManager48);
        org.junit.Assert.assertNotNull(equipmentArray49);
        org.junit.Assert.assertArrayEquals(equipmentArray49, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test236");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData3 = null;
        bookingManager0.update(sensorData3);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList5 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking7 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test237");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO21 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager0.isEquipmentAvailable("", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO26 = bookingManager0.getBookingDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking28 = bookingManager0.completeBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(booking20);
        org.junit.Assert.assertNotNull(equipmentDAO21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingDAO26);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test238");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = bookingManager14.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager14.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = bookingManager0.isEquipmentAvailable("", localDateTime43, localDateTime44);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList46 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO47 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking49 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentDAO15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(bookingList46);
        org.junit.Assert.assertNotNull(equipmentDAO47);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test239");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager10 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray11 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12, equipmentArray11);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData15 = null;
        bookingManager10.update(sensorData15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager10.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager10.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = bookingManager10.isEquipmentAvailable("hi!", localDateTime21, localDateTime22);
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData29 = null;
        bookingManager24.update(sensorData29);
        ca.yorku.eecs3311.service.BookingManager bookingManager31 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray32 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33, equipmentArray32);
        bookingManager31.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingManager0.isEquipmentAvailable("", localDateTime40, localDateTime41);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData43 = null;
        bookingManager0.update(sensorData43);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingManager10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingManager31);
        org.junit.Assert.assertNotNull(equipmentArray32);
        org.junit.Assert.assertArrayEquals(equipmentArray32, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test240");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList25 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList26 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager27 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray28 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList29 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList29, equipmentArray28);
        bookingManager27.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList29);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData32 = null;
        bookingManager27.update(sensorData32);
        ca.yorku.eecs3311.service.BookingManager bookingManager34 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray35 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList36 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36, equipmentArray35);
        bookingManager34.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        bookingManager27.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList40 = bookingManager27.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO41 = bookingManager27.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList43 = bookingManager27.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager44 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray45 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList46 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList46, equipmentArray45);
        bookingManager44.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList46);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = bookingManager44.isEquipmentAvailable("hi!", localDateTime50, localDateTime51);
        ca.yorku.eecs3311.service.BookingManager bookingManager53 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray54 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList55 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55, equipmentArray54);
        bookingManager53.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList55);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData58 = null;
        bookingManager53.update(sensorData58);
        ca.yorku.eecs3311.service.BookingManager bookingManager60 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray61 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList62 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList62, equipmentArray61);
        bookingManager60.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList62);
        bookingManager53.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList62);
        bookingManager44.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList62);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList67 = bookingManager44.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager68 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray69 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList70 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70, equipmentArray69);
        bookingManager68.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70);
        bookingManager44.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70);
        bookingManager27.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList70);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO76 = bookingManager0.getBookingDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertNotNull(bookingManager27);
        org.junit.Assert.assertNotNull(equipmentArray28);
        org.junit.Assert.assertArrayEquals(equipmentArray28, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookingManager34);
        org.junit.Assert.assertNotNull(equipmentArray35);
        org.junit.Assert.assertArrayEquals(equipmentArray35, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookingList40);
        org.junit.Assert.assertNotNull(bookingDAO41);
        org.junit.Assert.assertNotNull(bookingList43);
        org.junit.Assert.assertNotNull(bookingManager44);
        org.junit.Assert.assertNotNull(equipmentArray45);
        org.junit.Assert.assertArrayEquals(equipmentArray45, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookingManager53);
        org.junit.Assert.assertNotNull(equipmentArray54);
        org.junit.Assert.assertArrayEquals(equipmentArray54, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(bookingManager60);
        org.junit.Assert.assertNotNull(equipmentArray61);
        org.junit.Assert.assertArrayEquals(equipmentArray61, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(bookingList67);
        org.junit.Assert.assertNotNull(bookingManager68);
        org.junit.Assert.assertNotNull(equipmentArray69);
        org.junit.Assert.assertArrayEquals(equipmentArray69, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(bookingDAO76);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test241");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = bookingManager0.isEquipmentAvailable("", localDateTime17, localDateTime18);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test242");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO3 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData4 = null;
        bookingManager0.update(sensorData4);
        ca.yorku.eecs3311.model.booking.Booking booking7 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking9 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingDAO3);
        org.junit.Assert.assertNull(booking7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test243");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test244");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO11 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager15 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray16 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17, equipmentArray16);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData20 = null;
        bookingManager15.update(sensorData20);
        ca.yorku.eecs3311.service.BookingManager bookingManager22 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray23 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList24 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24, equipmentArray23);
        bookingManager22.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList24);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList28 = bookingManager15.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO29 = bookingManager15.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList31 = bookingManager15.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking33 = bookingManager15.findBookingById("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager34 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray35 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList36 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36, equipmentArray35);
        bookingManager34.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList36);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingManager34.isEquipmentAvailable("hi!", localDateTime40, localDateTime41);
        ca.yorku.eecs3311.service.BookingManager bookingManager43 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray44 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList45 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList45, equipmentArray44);
        bookingManager43.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList45);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData48 = null;
        bookingManager43.update(sensorData48);
        ca.yorku.eecs3311.service.BookingManager bookingManager50 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray51 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList52 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52, equipmentArray51);
        bookingManager50.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        bookingManager43.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        bookingManager34.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        ca.yorku.eecs3311.dao.UserDAO userDAO59 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(booking10);
        org.junit.Assert.assertNotNull(equipmentDAO11);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingManager15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookingManager22);
        org.junit.Assert.assertNotNull(equipmentArray23);
        org.junit.Assert.assertArrayEquals(equipmentArray23, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(bookingDAO29);
        org.junit.Assert.assertNotNull(bookingList31);
        org.junit.Assert.assertNull(booking33);
        org.junit.Assert.assertNotNull(bookingManager34);
        org.junit.Assert.assertNotNull(equipmentArray35);
        org.junit.Assert.assertArrayEquals(equipmentArray35, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookingManager43);
        org.junit.Assert.assertNotNull(equipmentArray44);
        org.junit.Assert.assertArrayEquals(equipmentArray44, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookingManager50);
        org.junit.Assert.assertNotNull(equipmentArray51);
        org.junit.Assert.assertArrayEquals(equipmentArray51, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(userDAO59);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test245");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.createBooking("", "", localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test246");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test247");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO11 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingDAO9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(equipmentDAO11);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test248");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO11 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.findBookingById("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(booking10);
        org.junit.Assert.assertNotNull(equipmentDAO11);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNull(booking16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test249");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking32 = bookingManager0.createBooking("hi!", "", localDateTime30, localDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test250");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.modifyBooking("hi!", localDateTime3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test251");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = bookingManager0.isEquipmentAvailable("hi!", localDateTime29, localDateTime30);
        ca.yorku.eecs3311.service.BookingManager bookingManager32 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray33 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList34 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34, equipmentArray33);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData37 = null;
        bookingManager32.update(sensorData37);
        ca.yorku.eecs3311.service.BookingManager bookingManager39 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray40 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList41 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41, equipmentArray40);
        bookingManager39.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingManager32);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookingManager39);
        org.junit.Assert.assertNotNull(equipmentArray40);
        org.junit.Assert.assertArrayEquals(equipmentArray40, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test252");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList24 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking26 = bookingManager0.findBookingById("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNull(booking26);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test253");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData22 = null;
        bookingManager17.update(sensorData22);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList24 = bookingManager17.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList26 = bookingManager17.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = bookingManager17.isEquipmentAvailable("hi!", localDateTime28, localDateTime29);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray31 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList32 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32, equipmentArray31);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking37 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(userDAO16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(equipmentArray31);
        org.junit.Assert.assertArrayEquals(equipmentArray31, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test254");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager4 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray5 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList6 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6, equipmentArray5);
        bookingManager4.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList6);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData9 = null;
        bookingManager4.update(sensorData9);
        ca.yorku.eecs3311.service.BookingManager bookingManager11 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray12 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList13 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList13, equipmentArray12);
        bookingManager11.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList13);
        bookingManager4.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList13);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager4.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO18 = bookingManager4.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList20 = bookingManager4.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking22 = bookingManager4.findBookingById("hi!");
        ca.yorku.eecs3311.service.BookingManager bookingManager23 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray24 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList25 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList25, equipmentArray24);
        bookingManager23.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList25);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = bookingManager23.isEquipmentAvailable("hi!", localDateTime29, localDateTime30);
        ca.yorku.eecs3311.service.BookingManager bookingManager32 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray33 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList34 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34, equipmentArray33);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList34);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData37 = null;
        bookingManager32.update(sensorData37);
        ca.yorku.eecs3311.service.BookingManager bookingManager39 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray40 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList41 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41, equipmentArray40);
        bookingManager39.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        bookingManager32.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        bookingManager23.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        bookingManager4.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingManager4);
        org.junit.Assert.assertNotNull(equipmentArray5);
        org.junit.Assert.assertArrayEquals(equipmentArray5, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookingManager11);
        org.junit.Assert.assertNotNull(equipmentArray12);
        org.junit.Assert.assertArrayEquals(equipmentArray12, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingDAO18);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNull(booking22);
        org.junit.Assert.assertNotNull(bookingManager23);
        org.junit.Assert.assertNotNull(equipmentArray24);
        org.junit.Assert.assertArrayEquals(equipmentArray24, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingManager32);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookingManager39);
        org.junit.Assert.assertNotNull(equipmentArray40);
        org.junit.Assert.assertArrayEquals(equipmentArray40, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test255");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getBookingsByUser("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test256");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking25 = bookingManager0.createBooking("hi!", "hi!", localDateTime23, localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(booking20);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test257");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO30 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = bookingManager0.isEquipmentAvailable("hi!", localDateTime32, localDateTime33);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(equipmentDAO30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test258");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = null;
        bookingManager0.registerToAllSensors(equipmentList9);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test259");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO9 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingDAO9);
        org.junit.Assert.assertNotNull(bookingDAO10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test260");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO5 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO7 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentDAO5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertNotNull(userDAO7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test261");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData3 = null;
        bookingManager0.update(sensorData3);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList5 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = bookingManager0.isEquipmentAvailable("", localDateTime7, localDateTime8);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO10 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.modifyBooking("hi!", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(equipmentDAO10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test262");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList21 = bookingManager0.getBookingsByUser("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList22 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking24 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(bookingList22);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test263");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.findBookingById("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO6 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO7 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertNotNull(equipmentDAO6);
        org.junit.Assert.assertNotNull(equipmentDAO7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test264");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByUser("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test265");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList10 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.model.equipment.SensorData sensorData11 = null;
        bookingManager0.update(sensorData11);
        ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.findBookingById("");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = bookingManager0.isEquipmentAvailable("hi!", localDateTime16, localDateTime17);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test266");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        java.lang.Class<?> wildcardClass7 = equipmentList4.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test267");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData20 = null;
        bookingManager0.update(sensorData20);
        ca.yorku.eecs3311.model.booking.Booking booking23 = bookingManager0.findBookingById("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(booking23);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test268");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager10 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray11 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList12 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12, equipmentArray11);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList12);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData15 = null;
        bookingManager10.update(sensorData15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList17 = bookingManager10.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager10.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = bookingManager10.isEquipmentAvailable("hi!", localDateTime21, localDateTime22);
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData29 = null;
        bookingManager24.update(sensorData29);
        ca.yorku.eecs3311.service.BookingManager bookingManager31 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray32 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList33 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33, equipmentArray32);
        bookingManager31.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager10.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList33);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO39 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingManager10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingManager31);
        org.junit.Assert.assertNotNull(equipmentArray32);
        org.junit.Assert.assertArrayEquals(equipmentArray32, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(equipmentDAO39);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test269");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.findBookingById("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking7 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNull(booking5);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test270");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.findBookingById("");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = bookingManager0.isEquipmentAvailable("hi!", localDateTime16, localDateTime17);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO19 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking24 = bookingManager0.createBooking("hi!", "hi!", localDateTime22, localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookingDAO19);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test271");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData19 = null;
        bookingManager14.update(sensorData19);
        ca.yorku.eecs3311.service.BookingManager bookingManager21 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray22 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList23 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23, equipmentArray22);
        bookingManager21.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList23);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO28 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList29 = bookingManager0.getAllBookings();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingManager21);
        org.junit.Assert.assertNotNull(equipmentArray22);
        org.junit.Assert.assertArrayEquals(equipmentArray22, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(equipmentDAO28);
        org.junit.Assert.assertNotNull(bookingList29);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test272");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData10 = null;
        bookingManager0.update(sensorData10);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test273");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.equipment.SensorData sensorData20 = null;
        bookingManager0.update(sensorData20);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.UserDAO userDAO24 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(userDAO24);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test274");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO3 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList4 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingDAO3);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test275");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO11 = bookingManager0.getBookingDAO();
        java.lang.Class<?> wildcardClass12 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(bookingDAO11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test276");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("", localDateTime11, localDateTime12);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test277");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("hi!");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getBookingsByEquipment("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList21 = bookingManager0.getBookingsByUser("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking23 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(bookingList21);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test278");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO13 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingDAO13);
        org.junit.Assert.assertNotNull(userDAO16);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test279");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.dao.UserDAO userDAO14 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userDAO14);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test280");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        ca.yorku.eecs3311.dao.UserDAO userDAO18 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.findBookingById("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userDAO18);
        org.junit.Assert.assertNull(booking20);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test281");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO10 = bookingManager0.getEquipmentDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(equipmentDAO10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test282");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = bookingManager14.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager14.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        ca.yorku.eecs3311.dao.UserDAO userDAO42 = bookingManager0.getUserDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking44 = bookingManager0.confirmBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentDAO15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userDAO42);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test283");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData7 = null;
        bookingManager0.update(sensorData7);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData10 = null;
        bookingManager0.update(sensorData10);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getBookingsByUser("");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("hi!", localDateTime15, localDateTime16);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test284");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = bookingManager0.isEquipmentAvailable("hi!", localDateTime4, localDateTime5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("hi!");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test285");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO3 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingManager0.isEquipmentAvailable("hi!", localDateTime5, localDateTime6);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingDAO3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test286");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList1 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test287");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList3 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking5 = bookingManager0.confirmArrival("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test288");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.booking.Booking booking31 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO32 = bookingManager0.getBookingDAO();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking34 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(booking31);
        org.junit.Assert.assertNotNull(bookingDAO32);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test289");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData3 = null;
        bookingManager0.update(sensorData3);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList5 = bookingManager0.getAllBookings();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = bookingManager0.isEquipmentAvailable("", localDateTime7, localDateTime8);
        java.lang.Class<?> wildcardClass10 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test290");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.service.BookingManager bookingManager9 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray10 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList11 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11, equipmentArray10);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList11);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager9.update(sensorData14);
        ca.yorku.eecs3311.service.BookingManager bookingManager16 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray17 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList18 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18, equipmentArray17);
        bookingManager16.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager9.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList18);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList23 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager24 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray25 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList26 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26, equipmentArray25);
        bookingManager24.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList26);
        ca.yorku.eecs3311.model.booking.Booking booking31 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO32 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO33 = bookingManager0.getEquipmentDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingManager9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingManager24);
        org.junit.Assert.assertNotNull(equipmentArray25);
        org.junit.Assert.assertArrayEquals(equipmentArray25, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(booking31);
        org.junit.Assert.assertNotNull(bookingDAO32);
        org.junit.Assert.assertNotNull(equipmentDAO33);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test291");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager8 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray9 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList10 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10, equipmentArray9);
        bookingManager8.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList10);
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO14 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager15 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray16 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList17 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17, equipmentArray16);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList17);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData20 = null;
        bookingManager15.update(sensorData20);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData22 = null;
        bookingManager15.update(sensorData22);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList24 = bookingManager15.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager25 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray26 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList27 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27, equipmentArray26);
        bookingManager25.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList27);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData30 = null;
        bookingManager25.update(sensorData30);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList32 = bookingManager25.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList34 = bookingManager25.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = bookingManager25.isEquipmentAvailable("hi!", localDateTime36, localDateTime37);
        ca.yorku.eecs3311.service.BookingManager bookingManager39 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray40 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList41 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41, equipmentArray40);
        bookingManager39.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList41);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData44 = null;
        bookingManager39.update(sensorData44);
        ca.yorku.eecs3311.service.BookingManager bookingManager46 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray47 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList48 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList48, equipmentArray47);
        bookingManager46.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList48);
        bookingManager39.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList48);
        bookingManager25.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList48);
        bookingManager15.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList48);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList48);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(equipmentArray9);
        org.junit.Assert.assertArrayEquals(equipmentArray9, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(equipmentDAO14);
        org.junit.Assert.assertNotNull(bookingManager15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNotNull(bookingManager25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertNotNull(bookingList34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookingManager39);
        org.junit.Assert.assertNotNull(equipmentArray40);
        org.junit.Assert.assertArrayEquals(equipmentArray40, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookingManager46);
        org.junit.Assert.assertNotNull(equipmentArray47);
        org.junit.Assert.assertArrayEquals(equipmentArray47, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test292");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO11 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO12 = bookingManager0.getUserDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertNotNull(bookingDAO10);
        org.junit.Assert.assertNotNull(userDAO11);
        org.junit.Assert.assertNotNull(userDAO12);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test293");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO3 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList5 = bookingManager0.getBookingsByUser("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingDAO3);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test294");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager14 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO15 = bookingManager14.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager14.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager17.isEquipmentAvailable("hi!", localDateTime23, localDateTime24);
        ca.yorku.eecs3311.service.BookingManager bookingManager26 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray27 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList28 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28, equipmentArray27);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList28);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData31 = null;
        bookingManager26.update(sensorData31);
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager26.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager14.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        java.lang.Class<?> wildcardClass42 = equipmentList35.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingManager14);
        org.junit.Assert.assertNotNull(equipmentDAO15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookingManager26);
        org.junit.Assert.assertNotNull(equipmentArray27);
        org.junit.Assert.assertArrayEquals(equipmentArray27, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test295");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData18 = null;
        bookingManager0.update(sensorData18);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test296");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking12 = bookingManager0.modifyBooking("", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test297");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.dao.UserDAO userDAO5 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking9 = bookingManager0.modifyBooking("hi!", localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDAO5);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test298");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO17 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData18 = null;
        bookingManager0.update(sensorData18);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingDAO17);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test299");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking4 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test300");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.findBookingById("");
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray15 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList16 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16, equipmentArray15);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList16);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertNotNull(equipmentArray15);
        org.junit.Assert.assertArrayEquals(equipmentArray15, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test301");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList18 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.booking.Booking booking20 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO21 = bookingManager0.getEquipmentDAO();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = bookingManager0.isEquipmentAvailable("", localDateTime23, localDateTime24);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking27 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(booking20);
        org.junit.Assert.assertNotNull(equipmentDAO21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test302");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.modifyBooking("hi!", localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test303");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData14 = null;
        bookingManager0.update(sensorData14);
        ca.yorku.eecs3311.dao.UserDAO userDAO16 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager17 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray18 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList19 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19, equipmentArray18);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList19);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData22 = null;
        bookingManager17.update(sensorData22);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList24 = bookingManager17.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList26 = bookingManager17.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = bookingManager17.isEquipmentAvailable("hi!", localDateTime28, localDateTime29);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray31 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList32 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32, equipmentArray31);
        bookingManager17.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList32);
        java.time.LocalDateTime localDateTime37 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking38 = bookingManager0.extendBooking("", localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(userDAO16);
        org.junit.Assert.assertNotNull(bookingManager17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(equipmentArray31);
        org.junit.Assert.assertArrayEquals(equipmentArray31, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test304");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByUser("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO10 = bookingManager0.getBookingDAO();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(bookingDAO10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test305");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = bookingManager0.isEquipmentAvailable("", localDateTime15, localDateTime16);
        ca.yorku.eecs3311.dao.UserDAO userDAO18 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList20 = bookingManager0.getBookingsByEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking22 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userDAO18);
        org.junit.Assert.assertNotNull(bookingList20);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test306");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        ca.yorku.eecs3311.service.BookingManager bookingManager7 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray8 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList9 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9, equipmentArray8);
        bookingManager7.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.findBookingById("");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking21 = bookingManager0.createBooking("hi!", "hi!", localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNull(booking16);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test307");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByUser("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test308");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.UserDAO userDAO2 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray3 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList4 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4, equipmentArray3);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList4);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList8 = bookingManager0.getBookingsByUser("");
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO9 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData10 = null;
        bookingManager0.update(sensorData10);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList13 = bookingManager0.getBookingsByUser("");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking15 = bookingManager0.completeBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(userDAO2);
        org.junit.Assert.assertNotNull(equipmentArray3);
        org.junit.Assert.assertArrayEquals(equipmentArray3, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(equipmentDAO9);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test309");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList2 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO3 = bookingManager0.getBookingDAO();
        java.lang.Class<?> wildcardClass4 = bookingManager0.getClass();
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingDAO3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test310");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        ca.yorku.eecs3311.model.booking.Booking booking11 = bookingManager0.findBookingById("hi!");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking16 = bookingManager0.createBooking("hi!", "hi!", localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isBefore(java.time.chrono.ChronoLocalDateTime)\" because \"start\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test311");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO14 = bookingManager0.getBookingDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList16 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO17 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager18 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray19 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList20 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList20, equipmentArray19);
        bookingManager18.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList20);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList24 = bookingManager18.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking26 = bookingManager18.findBookingById("hi!");
        ca.yorku.eecs3311.dao.UserDAO userDAO27 = bookingManager18.getUserDAO();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = bookingManager18.isEquipmentAvailable("hi!", localDateTime29, localDateTime30);
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO32 = bookingManager18.getBookingDAO();
        ca.yorku.eecs3311.service.BookingManager bookingManager33 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray34 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList35 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35, equipmentArray34);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList35);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData38 = null;
        bookingManager33.update(sensorData38);
        ca.yorku.eecs3311.service.BookingManager bookingManager40 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray41 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList42 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42, equipmentArray41);
        bookingManager40.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList42);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList46 = bookingManager33.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager47 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO48 = bookingManager47.getEquipmentDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList49 = bookingManager47.getAllBookings();
        ca.yorku.eecs3311.service.BookingManager bookingManager50 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray51 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList52 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52, equipmentArray51);
        bookingManager50.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList52);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        boolean boolean58 = bookingManager50.isEquipmentAvailable("hi!", localDateTime56, localDateTime57);
        ca.yorku.eecs3311.service.BookingManager bookingManager59 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray60 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList61 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList61, equipmentArray60);
        bookingManager59.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList61);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData64 = null;
        bookingManager59.update(sensorData64);
        ca.yorku.eecs3311.service.BookingManager bookingManager66 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray67 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList68 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList68, equipmentArray67);
        bookingManager66.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList68);
        bookingManager59.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList68);
        bookingManager50.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList68);
        bookingManager47.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList68);
        bookingManager33.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList68);
        bookingManager18.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList68);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList68);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingDAO14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingDAO17);
        org.junit.Assert.assertNotNull(bookingManager18);
        org.junit.Assert.assertNotNull(equipmentArray19);
        org.junit.Assert.assertArrayEquals(equipmentArray19, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNull(booking26);
        org.junit.Assert.assertNotNull(userDAO27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookingDAO32);
        org.junit.Assert.assertNotNull(bookingManager33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookingManager40);
        org.junit.Assert.assertNotNull(equipmentArray41);
        org.junit.Assert.assertArrayEquals(equipmentArray41, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(bookingList46);
        org.junit.Assert.assertNotNull(bookingManager47);
        org.junit.Assert.assertNotNull(equipmentDAO48);
        org.junit.Assert.assertNotNull(bookingList49);
        org.junit.Assert.assertNotNull(bookingManager50);
        org.junit.Assert.assertNotNull(equipmentArray51);
        org.junit.Assert.assertArrayEquals(equipmentArray51, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(bookingManager59);
        org.junit.Assert.assertNotNull(equipmentArray60);
        org.junit.Assert.assertArrayEquals(equipmentArray60, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(bookingManager66);
        org.junit.Assert.assertNotNull(equipmentArray67);
        org.junit.Assert.assertArrayEquals(equipmentArray67, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test312");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO1 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.EquipmentDAO equipmentDAO2 = bookingManager0.getEquipmentDAO();
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO3 = bookingManager0.getBookingDAO();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData4 = null;
        bookingManager0.update(sensorData4);
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking7 = bookingManager0.confirmBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentDAO1);
        org.junit.Assert.assertNotNull(equipmentDAO2);
        org.junit.Assert.assertNotNull(bookingDAO3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test313");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData9 = null;
        bookingManager0.update(sensorData9);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList12 = bookingManager0.getBookingsByUser("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking14 = bookingManager0.confirmArrival("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test314");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = bookingManager0.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test315");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData5 = null;
        bookingManager0.update(sensorData5);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList7 = bookingManager0.getAllBookings();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getBookingsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = bookingManager0.isEquipmentAvailable("hi!", localDateTime11, localDateTime12);
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray14 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList15 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15, equipmentArray14);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList15);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList19 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.dao.BookingDAO bookingDAO20 = bookingManager0.getBookingDAO();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = bookingManager0.isEquipmentAvailable("hi!", localDateTime22, localDateTime23);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList26 = bookingManager0.getBookingsByUser("");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentArray14);
        org.junit.Assert.assertArrayEquals(equipmentArray14, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(bookingDAO20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookingList26);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test316");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList6 = bookingManager0.getBookingsByEquipment("hi!");
        ca.yorku.eecs3311.model.booking.Booking booking8 = bookingManager0.findBookingById("");
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList9 = bookingManager0.getAllBookings();
        ca.yorku.eecs3311.model.equipment.SensorData sensorData10 = null;
        bookingManager0.update(sensorData10);
        ca.yorku.eecs3311.model.equipment.SensorData sensorData12 = null;
        bookingManager0.update(sensorData12);
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingManagerRandoopTest0.test317");
        ca.yorku.eecs3311.service.BookingManager bookingManager0 = ca.yorku.eecs3311.service.BookingManager.getInstance();
        ca.yorku.eecs3311.model.equipment.Equipment[] equipmentArray1 = new ca.yorku.eecs3311.model.equipment.Equipment[] {};
        java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment> equipmentList2 = new java.util.ArrayList<ca.yorku.eecs3311.model.equipment.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2, equipmentArray1);
        bookingManager0.registerToAllSensors((java.util.List<ca.yorku.eecs3311.model.equipment.Equipment>) equipmentList2);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingManager0.isEquipmentAvailable("hi!", localDateTime6, localDateTime7);
        ca.yorku.eecs3311.dao.UserDAO userDAO9 = bookingManager0.getUserDAO();
        java.util.List<ca.yorku.eecs3311.model.booking.Booking> bookingList11 = bookingManager0.getBookingsByEquipment("");
        ca.yorku.eecs3311.model.booking.Booking booking13 = bookingManager0.findBookingById("hi!");
        org.junit.Assert.assertNotNull(bookingManager0);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new ca.yorku.eecs3311.model.equipment.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDAO9);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(booking13);
    }
}

