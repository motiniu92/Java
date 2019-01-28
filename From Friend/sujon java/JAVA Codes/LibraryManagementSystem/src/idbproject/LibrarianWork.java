/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idbproject;

import java.awt.Color;

/**
 *
 * @author R-one
 */
public class LibrarianWork extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianWork
     */
    public LibrarianWork() {
        initComponents();
        getContentPane().setBackground(Color.ORANGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnReturnBooks = new javax.swing.JButton();
        btnViewIssuedBooks = new javax.swing.JButton();
        btnViewBooks = new javax.swing.JButton();
        btnIssueBooks = new javax.swing.JButton();
        btnDeleteBooks = new javax.swing.JButton();
        btnAddBooks = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Librarian");
        setMaximumSize(jLabel4.getPreferredSize());
        setMinimumSize(jLabel4.getMaximumSize());
        setPreferredSize(null);
        setResizable(false);

        jPanel1.setLayout(null);

        btnLogout.setBackground(new java.awt.Color(102, 102, 0));
        btnLogout.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(10, 461, 361, 55);

        btnReturnBooks.setBackground(new java.awt.Color(102, 102, 0));
        btnReturnBooks.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        btnReturnBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnBooks.setText("Return Books");
        btnReturnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturnBooks);
        btnReturnBooks.setBounds(30, 400, 361, 55);

        btnViewIssuedBooks.setBackground(new java.awt.Color(102, 102, 0));
        btnViewIssuedBooks.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        btnViewIssuedBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnViewIssuedBooks.setText("View Issued Books");
        btnViewIssuedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewIssuedBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewIssuedBooks);
        btnViewIssuedBooks.setBounds(53, 335, 361, 55);

        btnViewBooks.setBackground(new java.awt.Color(102, 102, 0));
        btnViewBooks.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        btnViewBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBooks.setText("View Books");
        btnViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewBooks);
        btnViewBooks.setBounds(115, 146, 364, 55);

        btnIssueBooks.setBackground(new java.awt.Color(102, 102, 0));
        btnIssueBooks.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        btnIssueBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnIssueBooks.setText("Issue Books");
        btnIssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnIssueBooks);
        btnIssueBooks.setBounds(73, 272, 361, 55);

        btnDeleteBooks.setBackground(new java.awt.Color(102, 102, 0));
        btnDeleteBooks.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        btnDeleteBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteBooks.setText("Delete Books");
        btnDeleteBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteBooks);
        btnDeleteBooks.setBounds(95, 209, 364, 55);

        btnAddBooks.setBackground(new java.awt.Color(102, 102, 0));
        btnAddBooks.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        btnAddBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBooks.setText("Add Books");
        btnAddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddBooks);
        btnAddBooks.setBounds(136, 83, 364, 55);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/idbproject/b.jpeg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 430, 90, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/idbproject/b1.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 61, 90, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Librarian Work Space");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 10, 392, 44);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/idbproject/l.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 520, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBooksActionPerformed
        // TODO add your handling code here:
        AddBook ab = new AddBook();
        ab.setVisible(true);
        hide();
    }//GEN-LAST:event_btnAddBooksActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        MainLogin mn = new MainLogin();
        mn.setVisible(true);
        hide();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnIssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBooksActionPerformed
        // TODO add your handling code here:
        IssueBook ib = new IssueBook();
        ib.setVisible(true);
        hide();
    }//GEN-LAST:event_btnIssueBooksActionPerformed

    private void btnReturnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBooksActionPerformed
        // TODO add your handling code here:
        ReturnBook rb = new ReturnBook();
        rb.setVisible(true);
        hide();
    }//GEN-LAST:event_btnReturnBooksActionPerformed

    private void btnViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBooksActionPerformed
        // TODO add your handling code here:
        BooksTable bt = new BooksTable();
        bt.setVisible(true);
        hide();
    }//GEN-LAST:event_btnViewBooksActionPerformed

    private void btnDeleteBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBooksActionPerformed
        // TODO add your handling code here:
        DeleteBooks db = new DeleteBooks();
        db.setVisible(true);
        hide();
    }//GEN-LAST:event_btnDeleteBooksActionPerformed

    private void btnViewIssuedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewIssuedBooksActionPerformed
        // TODO add your handling code here:
        IssuedBooksTable ibt = new IssuedBooksTable();
        ibt.setVisible(true);
        hide();
    }//GEN-LAST:event_btnViewIssuedBooksActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibrarianWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianWork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBooks;
    private javax.swing.JButton btnDeleteBooks;
    private javax.swing.JButton btnIssueBooks;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReturnBooks;
    private javax.swing.JButton btnViewBooks;
    private javax.swing.JButton btnViewIssuedBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}