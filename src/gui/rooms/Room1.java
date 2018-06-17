/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.rooms;

import java.awt.Image;
import static java.lang.Thread.sleep;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Jermy
 */
public class Room1 extends javax.swing.JFrame implements RoomInterface {

    /**
     * Creates new form Room1
     */
    public Room1() {
        initComponents();
        new Chrono().start();
        background();
    }

    public void background() {
        ImageIcon image = new ImageIcon(getClass().getResource("/images/room_1.jpg"));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_AREA_AVERAGING));
        background.setIcon(icon);
        ImageIcon imagePadlock = new ImageIcon(getClass().getResource("/images/padlock.png"));
        Icon iconPadlock = new ImageIcon(imagePadlock.getImage().getScaledInstance(padlock1.getWidth(), padlock1.getHeight(), Image.SCALE_AREA_AVERAGING));
        padlock1.setIcon(iconPadlock);
        padlock2.setIcon(iconPadlock);
        padlock3.setIcon(iconPadlock);
        padlock4.setIcon(iconPadlock);
    }

    @Override
    public void update(String msj){}

    @Override
    public void unlockTrack(int trackPadLock){}

    @Override
    public void unlockPadlock(int padlock){}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chrono = new javax.swing.JLabel();
        trackOneP1 = new javax.swing.JButton();
        trackTwoP1 = new javax.swing.JButton();
        trackThreeP1 = new javax.swing.JButton();
        trackLockP1 = new javax.swing.JButton();
        trackOneP2 = new javax.swing.JButton();
        trackTwoP2 = new javax.swing.JButton();
        trackThreeP2 = new javax.swing.JButton();
        trackLockP2 = new javax.swing.JButton();
        trackOneP3 = new javax.swing.JButton();
        trackTwoP3 = new javax.swing.JButton();
        trackThreeP3 = new javax.swing.JButton();
        trackLockP3 = new javax.swing.JButton();
        trackOneP4 = new javax.swing.JButton();
        trackTwoP4 = new javax.swing.JButton();
        trackThreeP4 = new javax.swing.JButton();
        trackLockP4 = new javax.swing.JButton();
        padlock1 = new javax.swing.JButton();
        padlock2 = new javax.swing.JButton();
        padlock3 = new javax.swing.JButton();
        padlock4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showInfo = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chrono.setBackground(new java.awt.Color(255, 255, 255));
        chrono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chrono.setForeground(new java.awt.Color(255, 0, 0));
        chrono.setText("30:00");
        getContentPane().add(chrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 70, 20));

        trackOneP1.setBorder(null);
        trackOneP1.setBorderPainted(false);
        trackOneP1.setContentAreaFilled(false);
        trackOneP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackOneP1.setOpaque(true);
        getContentPane().add(trackOneP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 20, 20));

        trackTwoP1.setBorder(null);
        trackTwoP1.setBorderPainted(false);
        trackTwoP1.setContentAreaFilled(false);
        trackTwoP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackTwoP1.setOpaque(true);
        getContentPane().add(trackTwoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 20, 20));

        trackThreeP1.setBorder(null);
        trackThreeP1.setBorderPainted(false);
        trackThreeP1.setContentAreaFilled(false);
        trackThreeP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackThreeP1.setOpaque(true);
        getContentPane().add(trackThreeP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 20, 20));

        trackLockP1.setBackground(new java.awt.Color(255, 255, 255));
        trackLockP1.setBorder(null);
        trackLockP1.setBorderPainted(false);
        trackLockP1.setContentAreaFilled(false);
        trackLockP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackLockP1.setOpaque(true);
        getContentPane().add(trackLockP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 20, 20));

        trackOneP2.setBorder(null);
        trackOneP2.setBorderPainted(false);
        trackOneP2.setContentAreaFilled(false);
        trackOneP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackOneP2.setOpaque(true);
        getContentPane().add(trackOneP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 20, 20));

        trackTwoP2.setBorder(null);
        trackTwoP2.setBorderPainted(false);
        trackTwoP2.setContentAreaFilled(false);
        trackTwoP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackTwoP2.setOpaque(true);
        getContentPane().add(trackTwoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 20, 20));

        trackThreeP2.setBorder(null);
        trackThreeP2.setBorderPainted(false);
        trackThreeP2.setContentAreaFilled(false);
        trackThreeP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackThreeP2.setOpaque(true);
        getContentPane().add(trackThreeP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 20, 20));

        trackLockP2.setBackground(new java.awt.Color(255, 255, 255));
        trackLockP2.setBorder(null);
        trackLockP2.setBorderPainted(false);
        trackLockP2.setContentAreaFilled(false);
        trackLockP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackLockP2.setOpaque(true);
        getContentPane().add(trackLockP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 20, 20));

        trackOneP3.setBorder(null);
        trackOneP3.setBorderPainted(false);
        trackOneP3.setContentAreaFilled(false);
        trackOneP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackOneP3.setOpaque(true);
        getContentPane().add(trackOneP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 20, 20));

        trackTwoP3.setBorder(null);
        trackTwoP3.setBorderPainted(false);
        trackTwoP3.setContentAreaFilled(false);
        trackTwoP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackTwoP3.setOpaque(true);
        getContentPane().add(trackTwoP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 20, 20));

        trackThreeP3.setBorder(null);
        trackThreeP3.setBorderPainted(false);
        trackThreeP3.setContentAreaFilled(false);
        trackThreeP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackThreeP3.setOpaque(true);
        getContentPane().add(trackThreeP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 20, 20));

        trackLockP3.setBackground(new java.awt.Color(255, 255, 255));
        trackLockP3.setBorder(null);
        trackLockP3.setBorderPainted(false);
        trackLockP3.setContentAreaFilled(false);
        trackLockP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackLockP3.setOpaque(true);
        getContentPane().add(trackLockP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 20, 20));

        trackOneP4.setBorder(null);
        trackOneP4.setBorderPainted(false);
        trackOneP4.setContentAreaFilled(false);
        trackOneP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackOneP4.setOpaque(true);
        getContentPane().add(trackOneP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 20, 20));

        trackTwoP4.setBorder(null);
        trackTwoP4.setBorderPainted(false);
        trackTwoP4.setContentAreaFilled(false);
        trackTwoP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackTwoP4.setOpaque(true);
        getContentPane().add(trackTwoP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 20, 20));

        trackThreeP4.setBorder(null);
        trackThreeP4.setBorderPainted(false);
        trackThreeP4.setContentAreaFilled(false);
        trackThreeP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackThreeP4.setOpaque(true);
        getContentPane().add(trackThreeP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 20, 20));

        trackLockP4.setBackground(new java.awt.Color(255, 255, 255));
        trackLockP4.setBorder(null);
        trackLockP4.setBorderPainted(false);
        trackLockP4.setContentAreaFilled(false);
        trackLockP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trackLockP4.setOpaque(true);
        getContentPane().add(trackLockP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 20, 20));

        padlock1.setBackground(new java.awt.Color(51, 51, 51));
        padlock1.setForeground(new java.awt.Color(255, 255, 255));
        padlock1.setBorder(null);
        padlock1.setBorderPainted(false);
        padlock1.setContentAreaFilled(false);
        padlock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padlock1ActionPerformed(evt);
            }
        });
        getContentPane().add(padlock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 60, 40));

        padlock2.setForeground(new java.awt.Color(255, 255, 255));
        padlock2.setBorder(null);
        padlock2.setBorderPainted(false);
        padlock2.setContentAreaFilled(false);
        getContentPane().add(padlock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 60, 40));

        padlock3.setForeground(new java.awt.Color(255, 255, 255));
        padlock3.setBorder(null);
        padlock3.setBorderPainted(false);
        padlock3.setContentAreaFilled(false);
        getContentPane().add(padlock3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 60, 40));

        padlock4.setForeground(new java.awt.Color(255, 255, 255));
        padlock4.setBorder(null);
        padlock4.setBorderPainted(false);
        padlock4.setContentAreaFilled(false);
        getContentPane().add(padlock4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 60, 40));

        showInfo.setEditable(false);
        showInfo.setColumns(20);
        showInfo.setRows(5);
        jScrollPane1.setViewportView(showInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 290, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room_1.jpg"))); // NOI18N
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void padlock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padlock1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_padlock1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel chrono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton padlock1;
    private javax.swing.JButton padlock2;
    private javax.swing.JButton padlock3;
    private javax.swing.JButton padlock4;
    private javax.swing.JTextArea showInfo;
    private javax.swing.JButton trackLockP1;
    private javax.swing.JButton trackLockP2;
    private javax.swing.JButton trackLockP3;
    private javax.swing.JButton trackLockP4;
    private javax.swing.JButton trackOneP1;
    private javax.swing.JButton trackOneP2;
    private javax.swing.JButton trackOneP3;
    private javax.swing.JButton trackOneP4;
    private javax.swing.JButton trackThreeP1;
    private javax.swing.JButton trackThreeP2;
    private javax.swing.JButton trackThreeP3;
    private javax.swing.JButton trackThreeP4;
    private javax.swing.JButton trackTwoP1;
    private javax.swing.JButton trackTwoP2;
    private javax.swing.JButton trackTwoP3;
    private javax.swing.JButton trackTwoP4;
    // End of variables declaration//GEN-END:variables

    private class Chrono extends Thread {

        private int minut;
        private int second;
        private boolean stop;

        public Chrono() {
            minut = 0;
            second = 0;
            stop = false;
        }

        @Override
        public String toString() {
            return minut + " : " + second + " s";
        }

        @Override
        public void run() {

            for (int i = 0; i < 1800 && !stop; i++) {
//                for (int i = 0; i < PropertiesConfig.getInstance().getProperties("timeLimit") && !stop; i++) {
                second++;
                if (second == 60) {
                    minut++;
                    second = 0;
                }
                chrono.setText(toString());
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            stop = true;
        }
    }
}
