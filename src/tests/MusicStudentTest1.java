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

public class MusicStudentTest1 {
	MusicStudentLogic musLogic = new MusicStudentLogic();
	MusicStudent student1 = new MusicStudent("Sara", "Piano", 15.00, 12);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateMonthlyIncomeFromStudent() {
		double monthlyIncome = musLogic.calculateMonthlyIncomeFromStudent(student1);
		assertEquals(60, monthlyIncome, 0.0);
	}
	@Test
	public void testFindStudentMethod() {
		String studentMethod = musLogic.findStudentMethod(student1);
		assertTrue("Youth" == studentMethod);
		assertFalse("Senior" == studentMethod);
		assertFalse("Adult" == studentMethod);
	}
}
