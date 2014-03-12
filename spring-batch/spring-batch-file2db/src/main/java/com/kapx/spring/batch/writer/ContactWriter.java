package com.kapx.spring.batch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import com.kapx.spring.batch.model.Contact;

public class ContactWriter implements ItemWriter<Contact> {

	private static final Logger logger = LoggerFactory.getLogger(ContactWriter.class);

	@Override
	public void write(final List<? extends Contact> contacts) throws Exception {

		for (Contact contact : contacts) {
			logger.info("Writing contact information FirstName: {}, LastName: {}, Email: {}", contact.getFirstName(), contact.getLastName(), contact.getEmail());
		}
	}

}
