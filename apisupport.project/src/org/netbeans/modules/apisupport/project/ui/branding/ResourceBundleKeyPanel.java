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

package org.netbeans.modules.apisupport.project.ui.branding;

/**
 *
 * @author Antonin Nebuzelsky
 */
public class ResourceBundleKeyPanel extends javax.swing.JPanel {

    public ResourceBundleKeyPanel(String key) {
        this();
        keyName.setText(key);
    }

    public ResourceBundleKeyPanel() {
        initComponents();
    }

    public String getText() {
        return keyValue.getText();
    }

    public void setText(final String value) {
        keyValue.setText(value);
        keyValue.selectAll();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        keyName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keyValue = new javax.swing.JTextArea();

        keyName.setText(org.openide.util.NbBundle.getMessage(ResourceBundleKeyPanel.class, "ResourceBundleKeyPanel.keyName.text")); // NOI18N

        keyValue.setColumns(20);
        keyValue.setRows(5);
        keyValue.setText(org.openide.util.NbBundle.getMessage(ResourceBundleKeyPanel.class, "ResourceBundleKeyPanel.keyValue.text")); // NOI18N
        jScrollPane1.setViewportView(keyValue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addComponent(keyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(keyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keyName;
    private javax.swing.JTextArea keyValue;
    // End of variables declaration//GEN-END:variables

}