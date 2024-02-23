
package com.appleistore.controller;

import com.appleistore.controller.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

public class OpenPdf {
    public static void OpenById(String id) {
        try {
            File pdfFile = new File(InventoryUtils.billPath + id + ".pdf");

            if (pdfFile.exists()) {
                // Get the absolute path of the file
                String absolutePath = pdfFile.getAbsolutePath();

                // Open the file with the default program
                ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", absolutePath);
                processBuilder.start();
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

