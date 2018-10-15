package org.wecancodeit.pairgenerater;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItems;


import org.junit.Assert;
import org.junit.Test;


public class RepoTest {
	
	Repo underTest = new Repo();

	@Test
	
	public void addStudentToMap () {
		Student student = new Student("testStudent", "2");
		underTest.add(student);
		assertThat(underTest.studentMap.values(), hasItems(student));	}


	@Test

	public void shouldGenerateRandomePair() {
		
	}
	}
