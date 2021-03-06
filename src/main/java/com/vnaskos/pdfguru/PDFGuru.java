package com.vnaskos.pdfguru;

import com.vnaskos.pdfguru.execute.ProcessHandler;
import com.vnaskos.pdfguru.input.DirectoryScanner;
import com.vnaskos.pdfguru.input.FileChooser;
import com.vnaskos.pdfguru.input.FilenameUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

/**
 *
 * @author Vasilis Naskos
 */
public class PDFGuru extends javax.swing.JFrame {

    private final FileChooser fileChooser;
    private final DefaultListModel model;
    
    /**
     * Creates new form PDFGuru
     */
    public PDFGuru() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        fileChooser = new FileChooser(this);
        model = new DefaultListModel();
        inputList.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        inputScrollPane = new javax.swing.JScrollPane();
        inputList = new javax.swing.JList();
        outputPanel = new javax.swing.JPanel();
        outputBrowseButton = new javax.swing.JButton();
        outputFilepathField = new javax.swing.JTextField();
        useTempCheckbox = new javax.swing.JCheckBox();
        compressionSpinner = new javax.swing.JSpinner();
        compressionLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDF Guru v0.1");

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        upButton.setText("Up");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        downButton.setText("Down");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        inputScrollPane.setViewportView(inputList);

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upButton, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downButton, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(inputScrollPane)
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addComponent(inputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(upButton)
                    .addComponent(downButton)
                    .addComponent(removeButton)
                    .addComponent(clearButton))
                .addContainerGap())
        );

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));

        outputBrowseButton.setText("...");
        outputBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputBrowseButtonActionPerformed(evt);
            }
        });

        outputFilepathField.setText(System.getProperty("user.home"));

        useTempCheckbox.setText("use temp files");

        compressionSpinner.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.5f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.1f)));

        compressionLabel.setText("compression:");

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(outputFilepathField, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputBrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(useTempCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compressionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compressionSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputBrowseButton)
                    .addComponent(outputFilepathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useTempCheckbox)
                    .addComponent(compressionSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compressionLabel))
                .addGap(7, 7, 7))
        );

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addElements();
    }//GEN-LAST:event_addButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        moveUp();
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        moveDown();
    }//GEN-LAST:event_downButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        removeSelected();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        model.removeAllElements();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void outputBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputBrowseButtonActionPerformed
        browseOutput();
    }//GEN-LAST:event_outputBrowseButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        List<String> files = new ArrayList<String>();
        boolean useTemp = useTempCheckbox.isSelected();
        float compression = Float.parseFloat(compressionSpinner.getValue().toString());
        String output = outputFilepathField.getText();
        
        for(int i=0; i<model.getSize(); i++) {
            String file = model.get(i).toString();
            files.add(file);
        }
        
        ProcessHandler handler = new ProcessHandler(files, useTemp, compression, output);
        handler.execute();
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PDFGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDFGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDFGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDFGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PDFGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel compressionLabel;
    private javax.swing.JSpinner compressionSpinner;
    private javax.swing.JButton downButton;
    private javax.swing.JList inputList;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane inputScrollPane;
    private javax.swing.JButton okButton;
    private javax.swing.JButton outputBrowseButton;
    private javax.swing.JTextField outputFilepathField;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton upButton;
    private javax.swing.JCheckBox useTempCheckbox;
    // End of variables declaration//GEN-END:variables

    private void addElements() {
        File[] selectedFiles = fileChooser.getSelectedFiles();

        if (selectedFiles == null) {
            return;
        }

        DirectoryScanner scanner = new DirectoryScanner(selectedFiles);
        ArrayList<File[]> files = scanner.getFiles();

        for (File[] directory : files) {
            for (File file : directory) {
                model.add(model.size(), FilenameUtils.normalize(file.getPath()));
            }
        }
    }
    
    private void moveUp() {
        int[] selected = inputList.getSelectedIndices();
        for (int i = 0; i < selected.length; i++) {
            moveElement(selected[i], -1);
            selected[i]--;
        }
        inputList.setSelectedIndices(selected);
    }
    
    private void moveDown() {
        int[] selected = inputList.getSelectedIndices();
        for (int i = selected.length - 1; i >= 0; i--) {
            moveElement(selected[i], 1);
            selected[i]++;
        }
        inputList.setSelectedIndices(selected);
    }
    
    private void moveElement(int indexOfSelected, int direction) {
        swapElements(indexOfSelected, indexOfSelected + 1 * direction);
        indexOfSelected = indexOfSelected + 1 * direction;
        inputList.setSelectedIndex(indexOfSelected);
        inputList.updateUI();
    }
    
    private void swapElements(int pos1, int pos2) {
        Object tmp = model.get(pos1);
        model.set(pos1, model.get(pos2));
        model.set(pos2, tmp);
    }

    private void removeSelected() {
        int[] selected = inputList.getSelectedIndices();
        for (int i = selected.length - 1; i >= 0; i--) {
            model.remove(selected[i]);
        }
    }
    
    private void browseOutput() {
        JFileChooser jChooser = fileChooser.getFileChooser();

        if (jChooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        if (jChooser.getSelectedFile() != null) {
            String path = jChooser.getSelectedFile().getPath();
            path = FilenameUtils.normalize(path);
            path += path.toLowerCase().endsWith(".pdf") ? "" : ".pdf";
            outputFilepathField.setText(path);
        }
    }
}
