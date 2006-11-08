/**
 * @copyright
 * ====================================================================
 * Copyright (c) 2006 Xiaoniu.org.  All rights reserved.
 *
 * This software is licensed as described in the file LICENSE, which
 * you should have received as part of this distribution.  The terms
 * are also available at http://suafe.xiaoniu.org.
 * If newer versions of this license are posted there, you may use a
 * newer version instead, at your option.
 *
 * This software consists of voluntary contributions made by many
 * individuals.  For exact contribution history, see the revision
 * history and logs, available at http://suafe.xiaoniu.org/.
 * ====================================================================
 * @endcopyright
 */

package org.xiaoniu.suafe.resources;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.MessageFormat;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;

import org.xiaoniu.suafe.Constants;

/**
 * Utility class used to access application resources.
 * 
 * @author Shaun Johnson
 */
public class ResourceUtil {
	
	/**
	 * Current resource bundle. 
	 */
	protected static ResourceBundle bundle;
	
	/**
	 * Gets the current resource bundle.
	 * 
	 * @return
	 */
	protected static ResourceBundle getBundle() {
		if (bundle == null) {
			bundle = ResourceBundle.getBundle(Constants.RESOURCE_BUNDLE);
		}
		
		return bundle;
	}
	
	/**
	 * Retrieves a string from the resource bundle.
	 * 
	 * @param name Name of string.
	 * @return String from resource bundle.
	 */
	public static String getString(String name) {		
		return getBundle().getString(name);
	}
	
	/**
	 * Retrieves a formatted string from the resource bundle.
	 * 
	 * @param name Name of string.
	 * @param args String arguments
	 * @return Formatted string.
	 */
	public static String getFormattedString(String name, Object[] args) {
		return MessageFormat.format(getBundle().getString(name), args);
	}
	
	/**
	 * Retrieves a formatted string from the resource bundle.
	 * 
	 * @param name Name of string.
	 * @param arg String argument
	 * @return Formatted string.
	 */
	public static String getFormattedString(String name, String arg) {
		Object[] args = new Object[1];
		
		args[0] = arg;
		
		return MessageFormat.format(getBundle().getString(name), args);
	}

	/**
	 * Retrieves a formatted string from the resource bundle.
	 * 
	 * @param name Name of string.
	 * @param arg1 Int argument
	 * @param arg2 String argument
	 * @return Formatted string.
	 */
	public static String getFormattedString(String name, int arg1, String arg2) {
		Object[] args = new Object[2];
		
		args[0] = arg1;
		args[1] = arg2;
		
		return MessageFormat.format(getBundle().getString(name), args);
	}
	
	//
	// Images and Icons
	//
	public static final Image serverImage = Toolkit.getDefaultToolkit().getImage(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Server16.gif"));
	
	public static final ImageIcon aboutIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/About16.gif"));

	public static final ImageIcon accessRuleIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Reversed.gif"));
	
	public static final ImageIcon fullSizeAccessRuleIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Reversed.gif"));
	
	public static final ImageIcon addAccessRuleIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/AccessRuleAdd.gif"));
	
	public static final ImageIcon addGroupIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/GroupAdd.gif"));
	
	public static final ImageIcon addRemoveMembersIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Preferences16.gif"));
	
	public static final ImageIcon addUserIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/UserAdd.gif"));
	
	public static final ImageIcon assignIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Forward24.gif"));
	
	public static final ImageIcon changeMembershipIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Preferences16.gif"));
	
	public static final ImageIcon cloneGroupIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Clone.gif"));
	
	public static final ImageIcon cloneUserIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Clone.gif"));
	
	public static final ImageIcon deleteAccessRuleIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/AccessRuleDelete.gif"));
	
	public static final ImageIcon deleteGroupIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/GroupDelete.gif"));
	
	public static final ImageIcon deleteUserIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/UserDelete.gif"));
	
	public static final ImageIcon denyAccessIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/DenyAccess16.gif"));
	
	public static final ImageIcon editAccessRuleIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/AccessRuleEdit.gif"));
	
	public static final ImageIcon editGroupIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/GroupEdit.gif"));
	
	public static final ImageIcon editUserIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/UserEdit.gif"));
	
	public static final ImageIcon fullSizeGroupIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/MorePeople.gif"));
	
	public static final ImageIcon fullSizeUserIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/PlainPeople.gif"));
	
	public static final ImageIcon groupIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/ListGroup.gif"));
	
	public static final ImageIcon helpIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Help16.gif"));
	
	public static final ImageIcon licenseIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/History16.gif"));
	
	public static final ImageIcon newFileIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/New16.gif"));
	
	public static final ImageIcon openFileIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Open16.gif"));
	
	public static final ImageIcon pathIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Path16.gif"));
	
	public static final ImageIcon pathEditIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/PathEdit.gif"));
	
	public static final ImageIcon pathDeleteIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/PathDelete.gif"));
	
	public static final ImageIcon previewIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Preview.gif"));
	
	public static final ImageIcon printIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Print16.gif"));
	
	public static final ImageIcon readOnlyIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/ReadOnly16.gif"));
	
	public static final ImageIcon readWriteIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/ReadWrite16.gif"));
	
	public static final ImageIcon repositoryIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Repository16.gif"));
	
	public static final ImageIcon repositoryEditIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/RepositoryEdit.gif"));
	
	public static final ImageIcon repositoryDeleteIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/RepositoryDelete.gif"));
	
	public static final ImageIcon saveFileIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Save16.gif"));
	
	public static final ImageIcon saveFileAsIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/SaveAs16.gif"));

	public static final ImageIcon serverIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Server16.gif"));
	
	public static final ImageIcon unassignIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/Back24.gif"));
	
	public static final ImageIcon userIcon = new ImageIcon(ResourceUtil.class.getResource(Constants.IMAGE_DIR + "/ListUser.gif"));
}