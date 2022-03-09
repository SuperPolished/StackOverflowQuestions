package com.in28minutes_springboot.in28minutes_demo.basic;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.in28minutes_springboot.in28minutes_demo.In28minutesDemoBasicApplication;
import static org.junit.Assert.assertEquals;


//load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = In28minutesDemoBasicApplication.class)
public class BinarySearchTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		
		// call method on binarySearch
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);

		// check if the value is correct
		assertEquals(4, actualResult);

	}

}
