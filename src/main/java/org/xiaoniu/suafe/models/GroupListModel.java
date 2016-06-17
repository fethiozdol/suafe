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
package org.xiaoniu.suafe.models;

import org.xiaoniu.suafe.api.beans.Document;

import javax.annotation.Nonnull;

/**
 * Group list for a combo-box. A combo-box listing out all Group objects
 * from the current document.
 *
 * @author Shaun Johnson
 */
public final class GroupListModel extends BaseComboBoxModel {
    /**
     * Default constructor.
     */
    public GroupListModel(@Nonnull final Document document) {
        itemList = document.getGroupObjects();
    }
}
