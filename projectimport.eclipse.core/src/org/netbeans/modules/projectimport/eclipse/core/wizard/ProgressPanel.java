/**
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

package org.netbeans.modules.projectimport.eclipse.core.wizard;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.modules.projectimport.eclipse.core.ImportProjectAction;
import org.openide.util.NbBundle;

/**
 * Shows status(progress) of importing.
 *
 * @author mkrauskopf
 */
public final class ProgressPanel extends JPanel {
    
    private JComponent progress;
    private ProgressHandle handle;
    
    /** Creates new form ProgressPanel */
    public ProgressPanel() {
        initComponents();
        handle = ProgressHandleFactory.createHandle(
                NbBundle.getMessage(ImportProjectAction.class, "CTL_ProgressDialogTitle")); // NOI18N
        progress = ProgressHandleFactory.createProgressComponent(handle);
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(450, 80));
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 5, 0, 5);
        add(progress, gridBagConstraints);
    }
    
    public void start(final int n) {
        handle.start(n);
    }
    
    public void setProgress(final int current, final String info) {
        handle.progress(info, current);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(450, 80));
        setLayout(new java.awt.GridBagLayout());
        getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(ProgressPanel.class, "ACSD_ProgressPanel_NA")); // NOI18N
        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(ProgressPanel.class, "ACSD_ProgressPanel_NA")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}