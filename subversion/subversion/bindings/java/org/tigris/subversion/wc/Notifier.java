package org.tigris.subversion.wc;

/*
 * ====================================================================
 * Copyright (c) 2000-2003 CollabNet.  All rights reserved.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution.  The terms
 * are also available at http://subversion.tigris.org/license-1.html.
 * If newer versions of this license are posted there, you may use a
 * newer version instead, at your option.
 *
 * This software consists of voluntary contributions made by many
 * individuals.  For exact contribution history, see the revision
 * history and logs, available at http://subversion.tigris.org/.
 * ====================================================================
 */

import org.tigris.subversion.NodeKind;
import org.tigris.subversion.Revision;

/**
 * The methods of this interface correspond to the types and functions
 * described in the subversion C api located in 'svn_wc.h'.
 */
public interface Notifier
{
    /**
     * <code>notify()</code> has Java-specific semantics.
     */
    void notifyWC(int action, NodeKind kind, String mimeType, int notifyState,
                  int propState, Revision revision);
}
