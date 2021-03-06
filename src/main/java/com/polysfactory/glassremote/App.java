package com.polysfactory.glassremote;

import javax.swing.SwingUtilities;

import com.polysfactory.glassremote.ui.MainFrame;

public class App {
    public static final String NAME = "GlassRemote";

    public static boolean DEBUG = false;

    public static void main(String[] args) {
        DEBUG = "true".equalsIgnoreCase(System.getProperty("debug"));
        if (DEBUG) {
            System.out.println("Debug mode is on.");
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setVisible(true);
                mainFrame.setFocusable(true);
                mainFrame.selectDevice();
            }
        });
    }
}
