/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.db.mysql.actions;

import org.netbeans.modules.db.mysql.DatabaseServer;
import org.netbeans.modules.db.mysql.util.Utils;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 * Connect to a database
 * 
 * @author David Van Couvering
 */
public class RefreshServerAction extends CookieAction {
    private static final Class[] COOKIE_CLASSES = 
            new Class[] { DatabaseServer.class };
    
    public RefreshServerAction() {
        putValue("noIconInMenu", Boolean.TRUE);
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }

    public String getName() {
        return Utils.getBundle().getString("LBL_RefreshServerAction");
    }

    public HelpCtx getHelpCtx() {
        return new HelpCtx(RefreshServerAction.class);
    }

    @Override
    public boolean enable(Node[] activatedNodes) {
        if ( activatedNodes == null || activatedNodes.length == 0 ) {
            return false;
        }
        
        DatabaseServer server = activatedNodes[0].getCookie(DatabaseServer.class);
        
        return server != null && server.isConnected();
    }

    @Override
    protected void performAction(Node[] activatedNodes) {
        DatabaseServer server = activatedNodes[0].getCookie(DatabaseServer.class);

        server.refreshDatabaseList();
    }
    
    @Override
    protected int mode() {
        return MODE_EXACTLY_ONE;
    }

    @Override
    protected Class<?>[] cookieClasses() {
        return COOKIE_CLASSES;
    }
}
