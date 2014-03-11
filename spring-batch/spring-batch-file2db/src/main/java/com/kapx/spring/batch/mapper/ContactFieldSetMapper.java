package com.kapx.spring.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.kapx.spring.batch.model.Contact;

public class ContactFieldSetMapper implements FieldSetMapper<Contact> {

	private static final int FIRST_NAME = 1;
	private static final int LAST_NAME = 2;
	private static final int EMAIL = 3;

	@Override
	public Contact mapFieldSet(FieldSet fieldSet) throws BindException {
		if (fieldSet == null) {
			throw new IllegalStateException();
		}

		Contact contact = new Contact();
		contact.setFirstName(fieldSet.readString(FIRST_NAME));
		contact.setLastName(fieldSet.readString(LAST_NAME));
		contact.setEmail(fieldSet.readString(EMAIL));

		return contact;
	}

}
