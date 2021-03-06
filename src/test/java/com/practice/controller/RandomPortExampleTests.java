package com.practice.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RandomPortExampleTests {

	@Autowired
	private TestRestTemplate restTemplate;

	/**
	 * TODO: get the http status and check response for it.
	 * @author Anand Singh <email: avsmips@gmail.com>
	 * */
	@Test
	public void exampleTest() {
		String body = this.restTemplate.getForObject("/", String.class);
		System.out.println(body);
		assertThat(body);
	}

}