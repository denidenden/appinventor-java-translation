/*
   appinventor-java-translation

   Originally authored by Joshua Swank at the University of Alabama
   Work supported in part by NSF award #0702764 and a Google 2011 CS4HS award

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package android.java.gui;

import android.java.AppInventorProject;

import javax.swing.JFileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import java.util.zip.ZipInputStream;

import javax.swing.JOptionPane;

/**
 *
 * @author jswank
 */
public class AndroidToJavaForm extends javax.swing.JFrame {

    /** Creates new form AndroidToJavaForm */
    public AndroidToJavaForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInput = new javax.swing.JTextField();
        btnBrowseInput = new javax.swing.JButton();
        lblInput = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        btnBrowseOutput = new javax.swing.JButton();
        txtOutput = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Android to Java");
        setName("frmAndroidToJava"); // NOI18N

        txtInput.setEditable(false);

        btnBrowseInput.setText("Browse...");
        btnBrowseInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseInputActionPerformed(evt);
            }
        });

        lblInput.setText("Input");

        lblOutput.setText("Output");

        btnBrowseOutput.setText("Browse...");
        btnBrowseOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseOutputActionPerformed(evt);
            }
        });

        txtOutput.setEditable(false);

        btnConvert.setText("Convert");
        btnConvert.setEnabled(false);
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowseInput))
                    .addComponent(lblInput)
                    .addComponent(lblOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConvert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBrowseOutput)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrowseInput)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrowseOutput)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBrowseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseInputActionPerformed
        JFileChooser chooser = getFileChooser();
        
        int returnVal = chooser.showOpenDialog( this );
        
        if( returnVal == JFileChooser.APPROVE_OPTION )
            txtInput.setText( chooser.getSelectedFile().getAbsolutePath() );
        
        enableConvertIfValid();
    }//GEN-LAST:event_btnBrowseInputActionPerformed

    private void btnBrowseOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseOutputActionPerformed
        JFileChooser chooser = getFileChooser();
        
        int returnVal = chooser.showSaveDialog( this );
        
        if( returnVal == JFileChooser.APPROVE_OPTION )
            txtOutput.setText( chooser.getSelectedFile().getAbsolutePath() );
        
        enableConvertIfValid();
    }//GEN-LAST:event_btnBrowseOutputActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        AppInventorProject project;
        File inputFile = new File( txtInput.getText() );
        InputStream inputStream = null;
        
        try
        {
            if( inputFile.isDirectory() )
                project = new AppInventorProject( inputFile.getAbsolutePath() );
            else if( inputFile.getName().toLowerCase().endsWith( ".zip" ))
            {
                inputStream = new ZipInputStream( new FileInputStream( inputFile ) );
                project = new AppInventorProject( (ZipInputStream)inputStream );
            }
        } catch( IOException e ) {
            showError( "There was an error reading the input." );
            System.err.println( e );
            return;
        } finally {
            try
            {
                if( inputStream != null )
                    inputStream.close();
            } catch( IOException e ) {
                System.err.println( e );
            }
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void showError( String error )
    {
        JOptionPane.showMessageDialog( this, error, "Error", JOptionPane.ERROR_MESSAGE );
    }
    
    private JFileChooser getFileChooser()
    {
        JFileChooser chooser = new JFileChooser( "/" );
        chooser.addChoosableFileFilter( new ZipFilter() );
        chooser.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES );
        chooser.setMultiSelectionEnabled( false );
        
        return chooser;
    }
    
    private void enableConvertIfValid()
    {
        if( !txtInput.getText().isEmpty() && txtOutput.getText().isEmpty() )
            btnConvert.setEnabled( true );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AndroidToJavaForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseInput;
    private javax.swing.JButton btnBrowseOutput;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
