package ca.yorku.eecs3311.model.booking;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingRandoopTest0 {

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
            System.out.format("%n%s%n", "BookingRandoopTest0.test001");
        ca.yorku.eecs3311.model.user.User user0 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking4 = new ca.yorku.eecs3311.model.booking.Booking(user0, equipment1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test002");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test003");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test005");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test006");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test007");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test008");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test009");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test010");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test011");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test012");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test013");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test014");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test015");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test016");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test017");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test018");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test019");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test020");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test021");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test022");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test023");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test024");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test025");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test026");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test027");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test028");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test029");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test030");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test031");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test032");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test033");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test034");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test035");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test036");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test037");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test038");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test039");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test040");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test041");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test042");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test043");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test044");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test045");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test046");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test047");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test048");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test049");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test050");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test051");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test052");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test053");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test054");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test055");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test056");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test057");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test058");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test059");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test060");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test061");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test062");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test063");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test064");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test065");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test066");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test067");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test068");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test069");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test070");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test071");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1L), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test072");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test073");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test074");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test075");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test076");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test077");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test078");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test079");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test080");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test081");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test082");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test083");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test084");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test085");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test086");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test087");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test088");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test089");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test090");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test091");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test092");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test093");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test094");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test095");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test096");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test097");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test098");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test099");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test100");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test101");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test102");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test103");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test104");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test105");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test106");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test107");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test108");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test109");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test110");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test111");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test112");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test113");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test114");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test115");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test116");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test117");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test118");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test119");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test120");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test121");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test122");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test123");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test124");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test125");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test126");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test127");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test128");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test129");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test130");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test131");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test132");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test133");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test134");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test135");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test136");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test137");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test138");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test139");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test140");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test141");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test142");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test143");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test144");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test145");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test146");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test147");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test148");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test149");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test150");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test151");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test152");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test153");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test154");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test155");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test156");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test157");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test158");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test159");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test160");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test161");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test162");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test163");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test164");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test165");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test166");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test167");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test168");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test169");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test170");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test171");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test172");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test173");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test174");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test175");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test176");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test177");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test178");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test179");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test180");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test181");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test182");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test183");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test184");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test185");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test186");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test187");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test188");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test189");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test190");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test191");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test192");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test193");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test194");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test195");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test196");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test197");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test198");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test199");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test200");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test201");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test202");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test203");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test204");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test205");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test206");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test207");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test208");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test209");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test210");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test211");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test212");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test213");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test214");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test215");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test216");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test217");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test218");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test219");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test220");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test221");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test222");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test223");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test224");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test225");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test226");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test227");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test228");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test229");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test230");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test231");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test232");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test233");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test234");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test235");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test236");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test237");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test238");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test239");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test240");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test241");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test242");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test243");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test244");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test245");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test246");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test247");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test248");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test249");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test250");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test251");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test252");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test253");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test254");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test255");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test256");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test257");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test258");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test259");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test260");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test261");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test262");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test263");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test264");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test265");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test266");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test267");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test268");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test269");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test270");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test271");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test272");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test273");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test274");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test275");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test276");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test277");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test278");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test279");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test280");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test281");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test282");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test283");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test284");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test285");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test286");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test287");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test288");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test289");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test290");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test291");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test292");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test293");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test294");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test295");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test296");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test297");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test298");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test299");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test300");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test301");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test302");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test303");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test304");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test305");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test306");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test307");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test308");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test309");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test310");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test311");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test312");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test313");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test314");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test315");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1L), (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test316");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test317");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test318");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test319");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test320");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test321");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test322");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test323");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1L), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test324");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test325");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test326");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test327");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test328");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test329");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test330");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test331");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test332");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test333");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test334");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test335");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test336");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test337");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test338");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test339");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test340");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test341");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test342");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test343");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test344");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test345");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test346");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test347");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test348");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test349");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test350");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test351");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test352");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test353");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test354");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test355");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test356");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test357");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test358");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test359");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test360");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test361");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test362");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test363");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test364");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test365");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test366");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test367");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test368");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test369");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test370");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test371");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test372");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1L), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test373");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test374");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test375");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test376");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test377");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test378");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test379");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test380");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test381");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test382");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test383");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test384");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test385");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test386");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test387");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test388");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test389");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test390");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test391");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test392");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test393");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test394");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test395");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test396");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test397");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test398");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test399");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test400");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test401");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test402");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test403");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test404");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test405");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test406");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test407");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test408");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test409");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test410");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test411");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test412");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test413");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test414");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test415");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test416");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test417");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test418");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test419");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test420");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test421");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test422");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test423");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test424");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test425");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test426");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test427");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test428");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test429");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) ' ', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test430");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test431");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test432");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test433");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test434");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test435");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test436");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test437");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test438");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test439");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test440");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test441");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test442");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test443");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test444");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test445");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test446");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test447");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test448");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test449");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test450");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test451");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1L), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test452");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test453");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test454");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test455");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test456");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test457");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test458");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test459");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test460");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test461");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test462");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test463");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test464");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test465");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (-1.0f), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test466");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test467");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test468");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '4', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test469");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test470");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test471");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 0.0f, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test472");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) -1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test473");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test474");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 10L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test475");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test476");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test477");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test478");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) '#', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test479");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test480");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test481");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test482");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test483");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 10.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test484");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test485");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test486");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test487");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 'a', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test488");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test489");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test490");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test491");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test492");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 1.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test493");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 100.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test494");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test495");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test496");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (byte) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test497");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, 0.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test498");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) (short) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test499");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("hi!", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (-1.0d), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingRandoopTest0.test500");
        ca.yorku.eecs3311.model.user.User user1 = null;
        ca.yorku.eecs3311.model.equipment.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        ca.yorku.eecs3311.model.enums.BookingStatus bookingStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ca.yorku.eecs3311.model.booking.Booking booking10 = new ca.yorku.eecs3311.model.booking.Booking("", user1, equipment2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, bookingStatus7, (double) 100.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

