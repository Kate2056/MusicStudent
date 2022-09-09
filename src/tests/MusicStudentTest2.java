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

public class MusicStudentTest2 {
	MusicStudentLogic musLogic = new MusicStudentLogic();
	MusicStudent student2 = new MusicStudent("Michael", "Guitar", 17.50, 68);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateMonthlyIncomeFromStudent() {
		double monthlyIncome = musLogic.calculateMonthlyIncomeFromStudent(student2);
		assertEquals(70, monthlyIncome, 0.0);
	}
	@Test
	public void testFindStudentMethod() {
		String studentMethod = musLogic.findStudentMethod(student2);
		assertFalse("Youth" == studentMethod);
		assertTrue("Senior" == studentMethod);
		assertFalse("Adult" == studentMethod);
	}
}
