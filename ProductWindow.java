package database.and.oop.project;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;
import static com.mysql.cj.conf.PropertyKey.USER;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ProductWindow extends javax.swing.JFrame {


    public ProductWindow() {
        initComponents();
        showAvailableProducts();
        setLocationRelativeTo(null);
        setResizable(false);
        
        JTableHeader tableHeader = ProductTable.getTableHeader();
        tableHeader.setFont(new Font("Arial", Font.BOLD, 16)); 
        tableHeader.setPreferredSize(new Dimension(tableHeader.getPreferredSize().width, 30)); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProductTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Price", "Stock"
            }
        ));
        ProductTable.setRowHeight(28);
        jScrollPane1.setViewportView(ProductTable);

        jButton1.setText("Restock Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modify Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Product");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete Product");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addProduct();        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        restockProduct();            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modifyPrice();                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        deleteProduct();       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();        
    }//GEN-LAST:event_jButton5ActionPerformed

    
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
            java.util.logging.Logger.getLogger(ProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static final String URL = "jdbc:mysql://localhost:3306/inventorydbb?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Hernandez14";
    
    private void showAvailableProducts() {
    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
        // SQL query
        String query = "SELECT * FROM inventory";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel tableModel = (DefaultTableModel) ProductTable.getModel();


        // Populate the table with data from the database
        while (rs.next()) {
            int Id = rs.getInt("id");
            String ProductName = rs.getString("Product_Name");
            double Price = rs.getDouble("Price");
            int Stock = rs.getInt("Stock");

            // Add a row to the table model
            tableModel.addRow(new Object[]{Id, ProductName, Price, Stock});
          
        }
        // Check if there are no expenses
        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No available Product");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error retrieving products: " + e.getMessage());
    }
}

    // Restock a product
    private void restockProduct() {
        String productId = JOptionPane.showInputDialog("Enter product ID to restock:");
    if (productId == null) {
        return;
    }
    String quantityStr = JOptionPane.showInputDialog("Enter quantity to add:");
    if (quantityStr == null) {
        return;
    }
        
        try {
            int id = Integer.parseInt(productId);
            int quantity = Integer.parseInt(quantityStr);
            
            if (quantity <= 0) {
                JOptionPane.showMessageDialog(this, "Quantity must be greater than 0.");
                return;
            }
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                String query = "UPDATE inventory SET Stock = Stock + ? WHERE id = ?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setInt(1, quantity);
                stmt.setInt(2, id);
                int rowsUpdated = stmt.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Product restocked successfully.");
                    showAvailableProducts(); // Refresh the product list
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Product ID not found.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
                }
            } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }

    // Add a new product
    private void addProduct() {
        String name = JOptionPane.showInputDialog("Enter product name:");
    if (name == null) {
        return;
    }
        String priceStr = JOptionPane.showInputDialog("Enter product price:");
    if (priceStr == null) {
        return;
    }
        String quantityStr = JOptionPane.showInputDialog("Enter product quantity:");
    if (quantityStr == null) {
        return;
    }    
        try {
            double price = Double.parseDouble(priceStr);
            int quantity = Integer.parseInt(quantityStr);

            if (price <= 0 || quantity < 0) {
                JOptionPane.showMessageDialog(this, "Invalid input. Price must be positive and quantity cannot be negative.");
                return;
            }

            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                String query = "INSERT INTO inventory (Product_Name, Price, Stock) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, name);
                stmt.setDouble(2, price);
                stmt.setInt(3, quantity);
                int rowsInserted = stmt.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Product added successfully.");
                    showAvailableProducts(); 
                    resetAutoIncrement(conn);
                    showAvailableProducts();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }
    
    private void deleteProduct() {
    String productId = JOptionPane.showInputDialog("Enter product ID to delete:");
    if (productId == null) {
        return;
    }
    try {
        int id = Integer.parseInt(productId);
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            conn.setAutoCommit(false); // Enable transaction management

            // Step 1: Delete the selected product
            String deleteQuery = "DELETE FROM inventory WHERE id = ?";
            try (PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {
                deleteStmt.setInt(1, id);
                int rowsDeleted = deleteStmt.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Product deleted successfully.");

                    // Step 2: Reassign IDs to fill gaps using a temporary table
                    String tempTableQuery = 
                        "CREATE TEMPORARY TABLE temp_table AS " +
                        "SELECT id, (@count := @count + 1) AS new_id " +
                        "FROM (SELECT @count := 0) AS init, inventory " +
                        "ORDER BY id";
                    try (PreparedStatement tempTableStmt = conn.prepareStatement(tempTableQuery)) {
                        tempTableStmt.executeUpdate();
                    }

                    String updateQuery = 
                        "UPDATE inventory AS i " +
                        "JOIN temp_table AS t ON i.id = t.id " +
                        "SET i.id = t.new_id";
                    try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                        updateStmt.executeUpdate();
                    }

                    // Step 3: Drop the temporary table
                    String dropTempTableQuery = "DROP TEMPORARY TABLE temp_table";
                    try (PreparedStatement dropTempTableStmt = conn.prepareStatement(dropTempTableQuery)) {
                        dropTempTableStmt.executeUpdate();
                    }

                    // Step 4: Reset the AUTO_INCREMENT value
                    resetAutoIncrement(conn);

                    conn.commit(); // Commit all changes
                    // Refresh the product list
                    showAvailableProducts();
                } else {
                    JOptionPane.showMessageDialog(null, "Product ID not found.");
                }
            } catch (SQLException e) {
                conn.rollback(); // Roll back changes on failure
                throw e;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for product ID.");
    }
}

    private void resetAutoIncrement(Connection conn) throws SQLException {
    String resetAutoIncrementQuery = "ALTER TABLE inventory AUTO_INCREMENT = 1";
    try (PreparedStatement resetStmt = conn.prepareStatement(resetAutoIncrementQuery)) {
        resetStmt.executeUpdate();
    }
}

    private void modifyPrice() {
        String productId = JOptionPane.showInputDialog("Enter product ID to modify price:");
    if (productId == null) {
        return;
    }    
        String newPriceStr = JOptionPane.showInputDialog("Enter new price:");
    if (newPriceStr == null) {
        return;
    }
        try {
            int id = Integer.parseInt(productId);
            double newPrice = Double.parseDouble(newPriceStr);

            if (newPrice <= 0) {
                JOptionPane.showMessageDialog(this, "Price must be greater than 0.");
                return;
            }

            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                String query = "UPDATE inventory SET Price = ? WHERE id = ?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setDouble(1, newPrice);
                stmt.setInt(2, id);
                int rowsUpdated = stmt.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Product price updated successfully.");
                    showAvailableProducts(); // Refresh the product list
                } else {
                    JOptionPane.showMessageDialog(this, "Product ID not found.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }
}
