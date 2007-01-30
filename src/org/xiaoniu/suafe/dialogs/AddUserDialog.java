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

package org.xiaoniu.suafe.dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.xiaoniu.suafe.Constants;
import org.xiaoniu.suafe.UserPreferences;
import org.xiaoniu.suafe.beans.Document;
import org.xiaoniu.suafe.beans.Message;
import org.xiaoniu.suafe.exceptions.ApplicationException;
import org.xiaoniu.suafe.resources.ResourceUtil;
import org.xiaoniu.suafe.validators.Validator;
import java.awt.Dimension;

/**
 * Dialog that allows the user to add a user.
 * 
 * @author Shaun Johnson
 */
public class AddUserDialog extends ParentDialog implements ActionListener {

	/**
	 * Serial ID.
	 */
	private static final long serialVersionUID = -7533467798513820728L;
	
	private Message message;
	
	private JPanel jContentPane = null;
	
	private JPanel buttonPanel = null;
	
	private JButton addButton = null;
	
	private JButton cancelButton = null;
	
	private JPanel buttonSubPanel = null;
	
	private JPanel formPanel = null;
	
	private JPanel formSubPanel = null;
	
	private JTextField userNameText = null;
	
	/**
	 * Default constructor.
	 */
	public AddUserDialog(Message message) {
		super();
		
		this.message = message;
		this.message.setState(Message.CANCEL);
		
		initialize();
	}
	
	/**
	 * This method initializes this
	 */
	private void initialize() {
		this.setResizable(false);
		this.setModal(true);
		this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setTitle(ResourceUtil.getString("adduser.title"));
		this.setSize(450, 135);
		this.setContentPane(getJContentPane());
		
		getRootPane().setDefaultButton(addButton);
	}
	
	/**
	 * This method initializes jContentPane.
	 * 
	 * @return javax.swing.JPanel
	 */
	private javax.swing.JPanel getJContentPane() {
		if(jContentPane == null) {
			jContentPane = new JPanel(new BorderLayout());	
			jContentPane.add(getFormPanel(), java.awt.BorderLayout.CENTER);
			jContentPane.add(getButtonPanel(), java.awt.BorderLayout.SOUTH);
			jContentPane.add(new JLabel(ResourceUtil.getString("adduser.instructions")), java.awt.BorderLayout.NORTH);
		}
		
		return jContentPane;
	}
	
	/**
	 * This method initializes buttonPanel.	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getButtonPanel() {
		if (buttonPanel == null) {
			buttonPanel = new JPanel(new GridLayout(1, 1));
			buttonPanel.add(getButtonSubPanel());
		}
		
		return buttonPanel;
	}
	
	/**
	 * This method initializes addButton.	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getAddButton() {
		if (addButton == null) {
			addButton = new JButton();
			addButton.addActionListener(this);
			addButton.setActionCommand(Constants.ADD_ACTION);
			addButton.setText(ResourceUtil.getString("button.add"));
		}
		
		return addButton;
	}
	
	/**
	 * This method initializes cancelButton.	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getCancelButton() {
		if (cancelButton == null) {
			cancelButton = new JButton();
			cancelButton.addActionListener(this);
			cancelButton.setActionCommand(Constants.CANCEL_ACTION);
			cancelButton.setText(ResourceUtil.getString("button.cancel"));
		}
		
		return cancelButton;
	}
	
	/**
	 * This method initializes buttonSubPanel.	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getButtonSubPanel() {
		if (buttonSubPanel == null) {
			buttonSubPanel = new JPanel();
			buttonSubPanel.add(getAddButton());
			buttonSubPanel.add(getCancelButton());
		}
		
		return buttonSubPanel;
	}
	
	/**
	 * This method initializes formPanel.	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getFormPanel() {
		if (formPanel == null) {
			formPanel = new JPanel(new FlowLayout());
			formPanel.add(getFormSubPanel());
		}
		
		return formPanel;
	}
	
	/**
	 * This method initializes formSubPanel.	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getFormSubPanel() {
		if (formSubPanel == null) {
			formSubPanel = new JPanel(new FlowLayout());
			formSubPanel.add(new JLabel(ResourceUtil.getString("adduser.username")));
			formSubPanel.add(getUserNameText());
		}
		
		return formSubPanel;
	}
	
	/**
	 * This method initializes userNameText.	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getUserNameText() {
		if (userNameText == null) {
			userNameText = new JTextField();
			userNameText.setFont(UserPreferences.getUserFont());
			userNameText.setPreferredSize(new Dimension(340, 21));
		}
		
		return userNameText;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(Constants.ADD_ACTION)) {
			try {
				String userName = getUserNameText().getText();
				
				Validator.validateNotEmptyString(ResourceUtil.getString("adduser.username"), userName);
				Validator.validateUserName(userName);
				
				if (Document.findUser(userName) == null) {				
					message.setUserObject(Document.addUser(userName));
					message.setState(Message.SUCCESS);
					dispose();
				}
				else {
					displayError(ResourceUtil.getFormattedString("adduser.error.useralreadyexists", userName));
				}			
			}
			catch (ApplicationException ex) {
				displayError(ex.getMessage());
			}
		}
		else if (e.getActionCommand().equals(Constants.CANCEL_ACTION)) {
			message.setState(Message.CANCEL);
			dispose();
		}
	}
}
