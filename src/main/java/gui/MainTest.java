package gui;

import javax.swing.*;

public class MainTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                    new TransactionHistoryFrame();
            }
        });
    }
}
