package org.xiaoniu.suafe.frames.menus;

import org.xiaoniu.suafe.ActionConstants;
import org.xiaoniu.suafe.resources.ResourceUtil;

import javax.annotation.Nonnull;
import javax.swing.*;
import java.awt.event.ActionListener;

public final class AccessRulesPopupMenu extends JPopupMenu {
    private static final long serialVersionUID = 6018077204492947280L;

    private final ActionListener actionListener;

    private JMenuItem addRepositoryPopupMenuItem;

    private JMenuItem deletePathPopupMenuItem;

    private JMenuItem deleteRepositoryPopupMenuItem;

    private JMenuItem renamePathMenuItem;

    private JMenuItem renameRepositoryPopupMenuItem;

    public AccessRulesPopupMenu(@Nonnull final ActionListener actionListener) {
        this.actionListener = actionListener;

        add(getAddRepositoryPopupMenuItem());
        add(getRenameUserPopupMenuItem());
        add(getDeletePathPopupMenuItem());
        add(getRenameRepositoryPopupMenuItem());
        add(getEditPathPopupMenuItem());
    }

    /**
     * This method initializes getAddRepositoryPopupMenuItem.
     *
     * @return javax.swing.JMenuItem
     */
    public JMenuItem getAddRepositoryPopupMenuItem() {
        if (addRepositoryPopupMenuItem == null) {
            addRepositoryPopupMenuItem = new JMenuItem();
            addRepositoryPopupMenuItem.addActionListener(actionListener);
            addRepositoryPopupMenuItem.setActionCommand(ActionConstants.ADD_REPOSITORY_ACTION);
            // addRepositoryPopupMenuItem.setIcon(ResourceUtil.addRepositoryIcon);;
            addRepositoryPopupMenuItem.setText(ResourceUtil.getString("button.add"));
            addRepositoryPopupMenuItem.setToolTipText(ResourceUtil.getString("mainframe.button.addrepository.tooltip"));
        }

        return addRepositoryPopupMenuItem;
    }

    /**
     * This method initializes deleteUserPopupMenuItem.
     *
     * @return javax.swing.JMenuItem
     */
    public JMenuItem getDeletePathPopupMenuItem() {
        if (deletePathPopupMenuItem == null) {
            deletePathPopupMenuItem = new JMenuItem();
            deletePathPopupMenuItem.addActionListener(actionListener);
            deletePathPopupMenuItem.setActionCommand(ActionConstants.DELETE_PATH_ACTION);
            deletePathPopupMenuItem.setIcon(ResourceUtil.deleteUserIcon);
            deletePathPopupMenuItem.setText(ResourceUtil.getString("button.delete"));
            deletePathPopupMenuItem.setToolTipText(ResourceUtil.getString("mainframe.button.deleteuser.tooltip"));
            deletePathPopupMenuItem.setEnabled(false);
        }

        return deletePathPopupMenuItem;
    }

    /**
     * This method initializes cloneUserPopupMenuItem
     *
     * @return javax.swing.JMenuItem
     */
    public JMenuItem getEditPathPopupMenuItem() {
        if (renamePathMenuItem == null) {
            renamePathMenuItem = new JMenuItem();
            renamePathMenuItem.addActionListener(actionListener);
            renamePathMenuItem.setActionCommand(ActionConstants.CLONE_USER_ACTION);
            renamePathMenuItem.setIcon(ResourceUtil.cloneUserIcon);
            renamePathMenuItem.setText(ResourceUtil.getString("menu.clone"));
            renamePathMenuItem.setEnabled(false);
        }
        return renamePathMenuItem;
    }

    /**
     * This method initializes getRenameRepositoryPopupMenuItem.
     *
     * @return javax.swing.JMenuItem
     */
    public JMenuItem getRenameRepositoryPopupMenuItem() {
        if (renameRepositoryPopupMenuItem == null) {
            renameRepositoryPopupMenuItem = new JMenuItem();
            renameRepositoryPopupMenuItem.addActionListener(actionListener);
            renameRepositoryPopupMenuItem.setActionCommand(ActionConstants.CHANGE_MEMBERSHIP_ACTION);
            renameRepositoryPopupMenuItem.setIcon(ResourceUtil.changeMembershipIcon);
            renameRepositoryPopupMenuItem.setText(ResourceUtil.getString("mainframe.button.changemembership"));
            renameRepositoryPopupMenuItem.setToolTipText(ResourceUtil
                    .getString("mainframe.button.changemembership.tooltip"));
            renameRepositoryPopupMenuItem.setEnabled(false);
        }

        return renameRepositoryPopupMenuItem;
    }

    /**
     * This method initializes renameUserPopupMenuItem.
     *
     * @return javax.swing.JMenuItem
     */
    public JMenuItem getRenameUserPopupMenuItem() {
        if (deleteRepositoryPopupMenuItem == null) {
            deleteRepositoryPopupMenuItem = new JMenuItem();
            deleteRepositoryPopupMenuItem.addActionListener(actionListener);
            deleteRepositoryPopupMenuItem.setActionCommand(ActionConstants.RENAME_USER_ACTION);
            deleteRepositoryPopupMenuItem.setIcon(ResourceUtil.renameUserIcon);
            deleteRepositoryPopupMenuItem.setText(ResourceUtil.getString("button.rename"));
            deleteRepositoryPopupMenuItem.setToolTipText(ResourceUtil.getString("mainframe.button.renameuser.tooltip"));
            deleteRepositoryPopupMenuItem.setEnabled(false);
        }

        return deleteRepositoryPopupMenuItem;
    }
}
