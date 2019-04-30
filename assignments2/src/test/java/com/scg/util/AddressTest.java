/**
 * 
 */
package com.scg.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 * @author kailashm
 *
 */
class AddressTest {
	
	private static final String     STREET     = "123 test";
    private static final String     CITY       = "Bellevue";
    private static final StateCode  STATE      = StateCode.WA;
    private static final String     ZIP        = "98207";
    
    private static final String     STREET2     = "456 test";
    private static final String     CITY2       = "Everett";
    private static final StateCode  STATE2      = StateCode.CA;
    private static final String     ZIP2        = "98204";

    Address address = new Address(STREET,CITY,STATE,ZIP);
    
	@Test 
	void testConstructNullValues() {
		Address addr    = new Address( STREET, CITY, STATE, ZIP );
        
        assertEquals( STREET, addr.getStreetNumber() );
        assertEquals( CITY, addr.getCity() );
        assertEquals( STATE, addr.getState() );
        assertEquals( ZIP, addr.getPostalCode() );
	}
	
	/**
	 * Test method for {@link com.scg.util.Address#getStreetNumber()}.
	 */
	@Test 
	void testGetStreetNumber() {
		assertNotNull(address.getStreetNumber());
		assertEquals( STREET, address.getStreetNumber() );
	}

	
	/**
	 * Test method for {@link com.scg.util.Address#getCity()}.
	 */
	@Test
	void testGetCity() {
		assertNotNull(address.getCity());
		assertEquals( CITY, address.getCity() );
	}

	/**
	 * Test method for {@link com.scg.util.Address#getState()}.
	 */
	@Test
	void testGetState() {
		assertNotNull(address.getState());
		assertEquals( STATE, address.getState() );
	}

	/**
	 * Test method for {@link com.scg.util.Address#getPostalCode()}.
	 */
	@Test
	void testGetPostalCode() {
		assertNotNull(address.getPostalCode());
		assertEquals( ZIP, address.getPostalCode() );
	}
	
	@Test
	void testToString() {
		assertNotNull(address.toString());
	}	
	
	@Test
    public void testEqualsHash()
    {
        Address addr1   = new Address( STREET, CITY, STATE, ZIP );
        Address addr2   = new Address( STREET, CITY, STATE, ZIP );
        
        assertEquals( addr1, addr1 );
        assertNotEquals( addr1, null );
        assertNotEquals( addr1, new Object() );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
        
        addr2 = new Address( null, CITY, STATE, ZIP );
        assertNotEquals( addr1, addr2 );
        assertNotEquals( addr2, addr1 );
        addr1 = new Address( null, CITY, STATE, ZIP );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
        
        addr2 = new Address( null, null, STATE, ZIP );
        assertNotEquals( addr1, addr2 );
        assertNotEquals( addr2, addr1 );
        addr1 = new Address( null, null, STATE, ZIP );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
        
        addr2 = new Address( null, null, null, ZIP );
        assertNotEquals( addr1, addr2 );
        assertNotEquals( addr2, addr1 );
        addr1 = new Address( null, null, null, ZIP );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
        
        addr2 = new Address( null, null, null, null );
        assertNotEquals( addr1, addr2 );
        assertNotEquals( addr2, addr1 );
        addr1 = new Address( null, null, null, null );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
        
        addr2 = new Address( STREET2, CITY, STATE, ZIP );
        assertNotEquals( addr1, addr2 );
        assertNotEquals( addr2, addr1 );
        addr1 = new Address( STREET2, CITY, STATE, ZIP );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
        
        addr2 = new Address( STREET2, CITY2, STATE, ZIP );
        assertNotEquals( addr1, addr2 );
        assertNotEquals( addr2, addr1 );
        addr1 = new Address( STREET2, CITY2, STATE, ZIP );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
        
        addr2 = new Address( STREET2, CITY2, STATE2, ZIP );
        assertNotEquals( addr1, addr2 );
        assertNotEquals( addr2, addr1 );
        addr1 = new Address( STREET2, CITY2, STATE2, ZIP );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
        
        addr2 = new Address( STREET2, CITY2, STATE2, ZIP2 );
        assertNotEquals( addr1, addr2 );
        assertNotEquals( addr2, addr1 );
        addr1 = new Address( STREET2, CITY2, STATE2, ZIP2 );
        assertEquals( addr1, addr2 );
        assertEquals( addr2, addr1 );
        assertEquals( addr1.hashCode(), addr2.hashCode() );
    }

}
