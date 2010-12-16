/**
 * @copyright
 * ====================================================================
 * Copyright (c) 2006 Xiaoniu.org.  All rights reserved.
 *
 * This software is licensed as described in the file LICENSE, which
 * you should have received as part of this distribution.  The terms
 * are also available at http://code.google.com/p/suafe/.
 * If newer versions of this license are posted there, you may use a
 * newer version instead, at your option.
 *
 * This software consists of voluntary contributions made by many
 * individuals.  For exact contribution history, see the revision
 * history and logs, available at http://code.google.com/p/suafe/.
 * ====================================================================
 * @endcopyright
 */
package org.suafe.core.utilities;

/**
 * Typesafe enumeration resource key constants for error messages.
 * 
 * @since 2.0
 */
public final class AuthzErrorResourceKey implements AuthzResourceKeyIF {
	public static final AuthzResourceKeyIF ACCESS_RULE_ALREADY_EXISTS = new AuthzErrorResourceKey(
			"errorAccessRuleAlreadyExists");

	public static final AuthzResourceKeyIF ALREADY_MEMBER_OF_GROUP = new AuthzErrorResourceKey(
			"errorAlreadyMemberOfGroup");

	public static final AuthzResourceKeyIF GROUP_ALREADY_EXISTS = new AuthzErrorResourceKey("errorGroupAlreadyExists");

	public static final AuthzResourceKeyIF GROUP_MEMBER_ALREADY_EXISTS = new AuthzErrorResourceKey(
			"errorGroupMemberAlreadyExists");

	public static final AuthzResourceKeyIF INVALID_GROUP_NAME = new AuthzErrorResourceKey("errorInvalidGroupName");

	public static final AuthzResourceKeyIF INVALID_PATH = new AuthzErrorResourceKey("errorInvalidPath");

	public static final AuthzResourceKeyIF INVALID_REPOSITORY_NAME = new AuthzErrorResourceKey(
			"errorInvalidRepositoryName");

	public static final AuthzResourceKeyIF INVALID_USER_ALIAS = new AuthzErrorResourceKey("errorInvalidUserAlias");

	public static final AuthzResourceKeyIF INVALID_USER_NAME = new AuthzErrorResourceKey("errorInvalidUserName");

	public static final AuthzResourceKeyIF NOT_GROUP_MEMBER = new AuthzErrorResourceKey("errorNotGroupMember");

	public static final AuthzResourceKeyIF NOT_MEMBER_OF_GROUP = new AuthzErrorResourceKey("errorNotMemberOfGroup");

	public static final AuthzResourceKeyIF PATH_ALREADY_EXISTS = new AuthzErrorResourceKey("errorPathAlreadyExists");

	public static final AuthzResourceKeyIF REPOSITORY_ALREADY_EXISTS = new AuthzErrorResourceKey(
			"errorRepositoryAlreadyExists");

	public static final AuthzResourceKeyIF USER_ALIAS_ALREADY_EXISTS = new AuthzErrorResourceKey(
			"errorUserAliasAlreadyExists");

	public static final AuthzResourceKeyIF USER_ALREADY_EXISTS = new AuthzErrorResourceKey("errorUserAlreadyExists");

	private final String key;

	/**
	 * Private constructor used to create static typesafe enumeration values.
	 * 
	 * @param key Resource file key
	 */
	private AuthzErrorResourceKey(final String key) {
		super();

		this.key = key;
	}

	/**
	 * Compares this object with the provided AuthzErrorResourceKey object for equality.
	 * 
	 * @param object Object to compare
	 * @return True if this object matches the provided object, otherwise false
	 */
	@Override
	public boolean equals(final Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (getClass() != object.getClass()) {
			return false;
		}
		final AuthzErrorResourceKey other = (AuthzErrorResourceKey) object;
		if (key == null) {
			if (other.key != null) {
				return false;
			}
		}
		else if (!key.equals(other.key)) {
			return false;
		}
		return true;
	}

	/**
	 * Calculates hashCode value of this resource key.
	 * 
	 * @return Hashcode of this object
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (key == null ? 0 : key.hashCode());
		return result;
	}

	/**
	 * Creates a string representation of this resource key.
	 * 
	 * @return String representation of this resource key
	 */
	@Override
	public String toString() {
		return key;
	}
}
