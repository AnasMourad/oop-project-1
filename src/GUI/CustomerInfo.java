/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.LinkedList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import project1.Controller;

/**
 *
 * @author Jeremiah Trahern
 */
public class CustomerInfo extends javax.swing.JFrame {
    
     class EventHandler implements ActionListener, ListSelectionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {

            int row = jTable1.getSelectedRow();
            int col = jTable1.getSelectedColumn();
            if (row >= 0 && col == 0) { //the user selected the checkbox (it is at column 0)
                boolean value = (boolean) jTable1.getValueAt(row, 0);
                String product_ID = (String) jTable1.getValueAt(row, 1); //we just need the product ID
                if (value) {
                    System.err.println("added"+ product_ID);
                    selected_cars.add(product_ID);
                } else {
                    System.err.println("removed"+ product_ID);
 
                    selected_cars.remove(product_ID);
                }
            }
            
                        int row = jTable3.getSelectedRow();
            int col = jTable3.getSelectedColumn();
            
            if (row >= 0 && col == 0) { //the user selected the checkbox (it is at column 0)
                boolean value = (boolean) jTable3.getValueAt(row, 0);
                String product_ID = (String) jTable3.getValueAt(row, 1); //we just need the product ID
                if (value) {
                    System.err.println("added"+ product_ID);
                    selected_cars2.add(product_ID);
                } else {
                    System.err.println("removed"+ product_ID);
 
                    selected_cars2.remove(product_ID);
                }
            } 
            
            int row2 = jTable3.getSelectedRow();
            int col2 = jTable3.getSelectedColumn();
            
            if (row2 >= 0 && col2 == 0) { //the user selected the checkbox (it is at column 0)
                boolean value = (boolean) jTable3.getValueAt(row2, 0);
                String product_ID = (String) jTable3.getValueAt(row2, 1); //we just need the product ID
                if (value) {
                    System.err.println("added"+ product_ID);
                    selected_cars2.add(product_ID);
                } else {
                    System.err.println("removed"+ product_ID);
 
                    selected_cars2.remove(product_ID);
                }
            } 
            
        }

    }
   
    /**
     * Creates new form CustomerInfo
     */
    Controller c;
    String CustomerId;
    public CustomerInfo(Controller c, String CustomerId) {
        
        
        this.c = c;
        this.CustomerId = CustomerId;
        
        initComponents();
        EventHandler eh = new EventHandler();
        jTable1.getSelectionModel().addListSelectionListener(eh);
        jTable1.getSelectionModel().addListSelectionListener(eh);
        populateCustomerInfo();
    }
     private void populateCustomerInfo() {
        jLabel1.setText(c.getCustomerName(CustomerId));
    }
     
     String[] new_cars_columns = {"Select", "ID", "Make", "Model", "Year", "Size"};
     String[] new_cars_columns_mod = {"Select", "ID", "Make", "Model", "Year", "Rent date"};
     String[] new_cars_columns_mod2 = {"ID", "Make", "Model", "Year", "Rent date", "Return date"};
     
     Class[] new_cars_types = new Class[]{java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
     , java.lang.Object.class, java.lang.Object.class};
     Class[] new_cars_types2 = new Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
     , java.lang.Object.class, java.lang.Object.class};
     LinkedList<String> selected_cars;
     LinkedList<String> selected_cars2;
    
     public void populateCars(){
         Object[][] cars = c.carsSearch(findCarText.getText());
         DefaultTableModel model = new DefaultTableModel(cars, new_cars_columns) {
                Class[] types = new_cars_types;

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
            jTable1.setModel(model);
            selected_cars=new LinkedList<String>();
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        findCarText = new javax.swing.JTextField();
        findCarSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        returnButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        findCarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCarTextActionPerformed(evt);
            }
        });

        findCarSearch.setText("Search");
        findCarSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCarSearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Select", "ID", "Make", "Model", "Year", "Size"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Rent Selected");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(findCarText)
                        .addGap(18, 18, 18)
                        .addComponent(findCarSearch)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(findCarSearch)
                    .addComponent(findCarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("Find Car", jPanel1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Select", "Make", "Model", "Year", "Size"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        returnButton.setText("Return Selected");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(returnButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jTabbedPane1.addTab("Rented Cars", jPanel2);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Make", "Model", "Year", "Rented", "Returned"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Returned Cars", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findCarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findCarTextActionPerformed

    private void findCarSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCarSearchActionPerformed
        // TODO add your handling code here:
        populateCars();
        
    }//GEN-LAST:event_findCarSearchActionPerformed
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (String car : selected_cars) {
            System.out.println(car);
            c.addRental(Calendar.getInstance(), null, car, CustomerId);
            c.setRented(car);
        
        }
        
                populateRented();
                populateReturned();
                populateCars();
                selected_cars=new LinkedList<String>();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        for (String car : selected_cars2)  {
            System.out.println(car);
            c.setReturned(car);
            c.returnRental(CustomerId+car, Calendar.getInstance());
        }
        
                populateRented();
                populateReturned();
                populateCars();  
                selected_cars2=new LinkedList<String>();
            
                    
    }//GEN-LAST:event_returnButtonActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
    
    public void populateRented(){
         
        Object[][] data = c.getRentalOrders(CustomerId);
        DefaultTableModel model = new DefaultTableModel(data, new_cars_columns_mod) {
                Class[] types = new_cars_types;

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
        this.jTable3.setModel(model);
        
    }
    
    public void populateReturned(){
        Object[][] data = c.getReturnedOrders(CustomerId);
        DefaultTableModel model = new DefaultTableModel(data, new_cars_columns_mod2) {
                Class[] types = new_cars_types2;

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
        this.jTable2.setModel(model);
        
    }
    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton findCarSearch;
    private javax.swing.JTextField findCarText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
