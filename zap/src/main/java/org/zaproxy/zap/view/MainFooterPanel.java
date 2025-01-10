package org.zaproxy.zap.view;

import javax.swing.JPanel;

import org.zaproxy.zap.utils.DisplayUtils;

public class MainFooterPanel extends JPanel {
    public MainFooterPanel() {
        // ...existing code...

        // Update color scheme
        DisplayUtils.setDefaultColors(this); // Apply default colors

        // ...existing code...
    }

    // ...existing code...
}