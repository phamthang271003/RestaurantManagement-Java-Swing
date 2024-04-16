/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Restaurant.View.Form.Manager;


import Restaurant.Controller.Service.ServiceStaff;
import Restaurant.Model.Modelngredient;
import Restaurant.View.Component.Dashboard.SearchOptinEvent;
import Restaurant.View.Component.Dashboard.SearchOption;
import Restaurant.View.Component.Manager.SimpleFormManager;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author quangthang
 */
public class Table_menuInfo extends SimpleFormManager {

    private ServiceStaff service;
    private ArrayList<Modelngredient> list;
    DecimalFormat df;

    /**
     * Creates new form Table
     */
    public Table_menuInfo() {
        initComponents();
        service = new ServiceStaff();
        df = new DecimalFormat("#,###");
        initTable();
        //Search
        txt.addEventOptionSelected(new SearchOptinEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txt.setHint("Search by " + option.getName() + "...");
            }
        });
        txt.addOption(new SearchOption("Name", new ImageIcon(getClass().getResource("/Icons/Search/user.png"))));
        txt.addOption(new SearchOption("Tel", new ImageIcon(getClass().getResource("/Icons/Search/tel.png"))));
        txt.addOption(new SearchOption("Email", new ImageIcon(getClass().getResource("/Icons/Search/email.png"))));
        txt.addOption(new SearchOption("Address", new ImageIcon(getClass().getResource("/Icons/Search/address.png"))));

        //Table
        table.setDefaultRenderer(Object.class, new TableGradientCell());
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
        scroll.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");
        //testData();
    }

//    private void testData() {
//   
//        model.addRow(new Object[]{1, "Thit ga", "40,000đ", "Kg"});
//        model.addRow(new Object[]{2, "Thit heo", "50,000đ", "Kg"});
//        model.addRow(new Object[]{3, "Thit bo", "80,000đ", "Kg"});
//        model.addRow(new Object[]{4, "Tom", "100,000đ", "Kg"});
//        model.addRow(new Object[]{5, "Ca hoi", "500,000đ", "Kg"});
//    }

        public void initTable() {
                 DefaultTableModel model = (DefaultTableModel) table.getModel();
            try {
                list = service.MenuIngr();
                for (Modelngredient data : list) {
                    model.addRow(new Object[]{data.getiD_Ingr(), data.getNameIngre(), df.format(data.getPrice()) + "đ", data.getUnit()});
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
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
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        uWPButton1 = new Restaurant.View.Component.Dashboard.UWPButton();
        uWPButton2 = new Restaurant.View.Component.Dashboard.UWPButton();
        uWPButton3 = new Restaurant.View.Component.Dashboard.UWPButton();
        txt = new Restaurant.View.Component.Dashboard.TextFieldSearchOption();

        jPanel1.setLayout(new java.awt.BorderLayout());

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma NL", "Tên nguyên liệu", "Đơn giá", "Đơn vị tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(40);
        scroll.setViewportView(table);

        uWPButton1.setText("uWPButton1");

        uWPButton2.setText("uWPButton2");

        uWPButton3.setText("uWPButton3");

        txt.setText("textFieldSearchOption1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(uWPButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uWPButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uWPButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1212, 1212, 1212)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uWPButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uWPButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uWPButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    private Restaurant.View.Component.Dashboard.TextFieldSearchOption txt;
    private Restaurant.View.Component.Dashboard.UWPButton uWPButton1;
    private Restaurant.View.Component.Dashboard.UWPButton uWPButton2;
    private Restaurant.View.Component.Dashboard.UWPButton uWPButton3;
    // End of variables declaration//GEN-END:variables
}