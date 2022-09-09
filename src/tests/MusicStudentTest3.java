/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package tests;
import model.MusicStudent;
import model.MusicStudentLogic;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MusicStudentTest3 {
	MusicStudentLogic musLogic = new MusicStudentLogic();
	MusicStudent student3 = new MusicStudent("Michelle", "Mandolin", 13.25, 34);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateMonthlyIncomeFromStudent() {
		double monthlyIncome = musLogic.calculateMonthlyIncomeFromStudent(student3);
		assertEquals(53, monthlyIncome, 0.0);
	}
	@Test
	public void testFindStudentMethod() {
		String studentMethod = musLogic.findStudentMethod(student3);
		assertFalse("Youth" == studentMethod);
		assertFalse("Senior" == studentMethod);
		assertTrue("Adult" == studentMethod);
	}
}

