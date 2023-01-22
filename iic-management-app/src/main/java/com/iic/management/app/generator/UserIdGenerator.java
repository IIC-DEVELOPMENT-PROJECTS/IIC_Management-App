package com.iic.management.app.generator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;

public class UserIdGenerator implements IdentifierGenerator, Configurable {

	private static Long ID = 1L;

	public String getUserId() {
		String userId = "IICUSR120" + ID++;
		return userId;
	}

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return this.getUserId();
	}

}
