
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    int x = 50;
    int counter = 2;
    int i = 0;
    Color arr[] = {Color.red, Color.blue, Color.yellow, Color.green, Color.GRAY, Color.orange, Color.PINK, Color.LIGHT_GRAY};
    Color input[] = new Color[4];
    Color secret[] = new Color[]{Color.red, Color.blue, Color.yellow, Color.green};
    int tryGame = 0;

    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        rand();
    }
     String getColorName(Color color) {
    if (color.equals(Color.red)) return "Red";
    if (color.equals(Color.blue)) return "Blue";
    if (color.equals(Color.green)) return "Green";
    if (color.equals(Color.yellow)) return "YELLOW";
    if (color.equals(Color.black)) return "BLACK";
    if (color.equals(Color.GRAY)) return "GRAY";
    if (color.equals(Color.orange)) return "ORANGE";
    if (color.equals(Color.PINK)) return "PINK";
    if (color.equals(Color.LIGHT_GRAY)) return "LIGHT_GRAY";

        
    return "Unknown";
}
    void create() {
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton5.setEnabled(false);
        jButton5.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton5.setMinimumSize(new java.awt.Dimension(30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("" + counter++);

        jButton6.setEnabled(false);
        jButton6.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton6.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton8.setEnabled(false);
        jButton8.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton8.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton9.setEnabled(false);
        jButton9.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton9.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton10.setEnabled(false);
        jButton10.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton10.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton11.setEnabled(false);
        jButton11.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton11.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton12.setEnabled(false);
        jButton12.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton12.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton13.setEnabled(false);
        jButton13.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton13.setMinimumSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(425, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20 + x, 20 + x, 20 + x) // height
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(114, 114, 114)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                ))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(154, Short.MAX_VALUE))
        );

    }

    void rand() {
        for (int i = 0; i < secret.length; i++) {
            Random random = new Random();
            int x = random.nextInt(arr.length);
            secret[i] = arr[x];
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        jButton7.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton7.setMinimumSize(new java.awt.Dimension(30, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master Mind");
        setMinimumSize(new java.awt.Dimension(802, 597));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);

        jButton1.setBackground(java.awt.Color.black);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.black);
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.black);
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.Color.black);
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setEnabled(false);
        jButton5.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton5.setMinimumSize(new java.awt.Dimension(30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1");

        jButton6.setEnabled(false);
        jButton6.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton6.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton8.setEnabled(false);
        jButton8.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton8.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton9.setEnabled(false);
        jButton9.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton9.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setEnabled(false);
        jButton10.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton10.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setEnabled(false);
        jButton11.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton11.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setEnabled(false);
        jButton12.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton12.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setEnabled(false);
        jButton13.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton13.setMinimumSize(new java.awt.Dimension(30, 30));

        jButton14.setBackground(new java.awt.Color(0, 102, 51));
        jButton14.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jButton14.setText("TRY!! ");
        jButton14.setActionCommand("try!!\n");
        jButton14.setBorder(new javax.swing.border.MatteBorder(null));
        jButton14.setFocusPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (jButton4.getBackground().equals(Color.black)
                || jButton3.getBackground().equals(Color.black)
                || jButton2.getBackground().equals(Color.black)
                || jButton1.getBackground().equals(Color.black)) {
            JOptionPane.showMessageDialog(null, "Please Select Color ", "Error", JOptionPane.WARNING_MESSAGE);

        } else {
            if (tryGame < 10) {
                tryGame++;
                jButton5.setBackground(jButton1.getBackground());
                jButton6.setBackground(jButton2.getBackground());
                jButton8.setBackground(jButton3.getBackground());
                jButton9.setBackground(jButton4.getBackground());
                input[0] = jButton1.getBackground();
                input[1] = jButton2.getBackground();
                input[2] = jButton3.getBackground();
                input[3] = jButton4.getBackground();

                boolean[] matchedSecret = new boolean[4];
                boolean[] matchedInput = new boolean[4];
                int win = 0;
                for (int i = 0; i < 4; i++) {
                    if (secret[i].equals(input[i])) {
                        win++;
                        matchedSecret[i] = true;
                        matchedInput[i] = true;
                        switch (i) {
                            case 0:
                                jButton10.setBackground(Color.black);
                                break;
                            case 1:
                                jButton11.setBackground(Color.black);
                                break;
                            case 2:
                                jButton12.setBackground(Color.black);
                                break;
                            case 3:
                                jButton13.setBackground(Color.black);
                                break;
                        }
                    }
                }

                ///        
                // Check partial matches
                for (int i = 0; i < 4; i++) {
                    if (!matchedSecret[i]) { // Skip already matched
                        for (int j = 0; j < 4; j++) {
                            if (!matchedInput[j] && secret[i].equals(input[j])) {
                                matchedInput[j] = true;
                                switch (j) {
                                    case 0:
                                        jButton10.setBackground(Color.red);
                                        break;
                                    case 1:
                                        jButton11.setBackground(Color.red);
                                        break;
                                    case 2:
                                        jButton12.setBackground(Color.red);
                                        break;
                                    case 3:
                                        jButton13.setBackground(Color.red);
                                        break;
                                }
                                break;
                            }
                        }
                    }
                }
                if (win == 4) {
                    JOptionPane.showMessageDialog(null, "You Win ", "info", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                create();
                x += 50;
            } else {
                String secretColors = "";
                int i=1;
                for (Color color : secret) {
                    secretColors +=i+" :"+ getColorName(color) + "\n";
                    i++;
                }
                JOptionPane.showMessageDialog(null, "Game Over!\nThe correct colors were: \n" + secretColors, "Game Over", JOptionPane.WARNING_MESSAGE);
            }

        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (i < arr.length) {
            jButton4.setBackground(arr[i++]);
        } else {
            i = 0;
            jButton4.setBackground(arr[i++]);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (i < arr.length) {
            jButton3.setBackground(arr[i++]);
        } else {
            i = 0;
            jButton3.setBackground(arr[i++]);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (i < arr.length) {
            jButton2.setBackground(arr[i++]);
        } else {
            i = 0;
            jButton2.setBackground(arr[i++]);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (i < arr.length) {
            jButton1.setBackground(arr[i++]);
        } else {
            i = 0;
            jButton1.setBackground(arr[i++]);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
