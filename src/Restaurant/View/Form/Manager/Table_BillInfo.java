/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Restaurant.View.Form.Manager;


import Restaurant.Controller.Service.ServiceBill;
import Restaurant.Model.ModelBill;
import Restaurant.View.Component.Dashboard.SearchOptinEvent;
import Restaurant.View.Component.Dashboard.SearchOption;
import Restaurant.View.Component.Manager.SimpleFormManager;
import Restaurant.View.Dialog.FormBillInfo;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author quangthang
 */
public class Table_BillInfo extends SimpleFormManager {

    private ServiceBill service;
    private ArrayList<ModelBill> list;
    DecimalFormat df;

    /**
     * Creates new form Table
     */
    public Table_BillInfo() {
        initComponents();
        service = new ServiceBill();
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
    }

        public void initTable() {
                 DefaultTableModel model = (DefaultTableModel) table.getModel();
            try {
                list = service.listBill();
                for (ModelBill data : list) {
                    model.addRow(new Object[]{data.getID_Bill(), data.getTable() , data.getDateChekIn(), df.format(data.getTotalPrice()) + "đ", data.getStatus()});
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
                "ID", "Tên bàn", "Ngày đặt", "Tổng tiền", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(40);
        scroll.setViewportView(table);

        uWPButton1.setText("Tất cả");
        uWPButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uWPButton1ActionPerformed(evt);
            }
        });

        uWPButton2.setText("Hôm nay");
        uWPButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uWPButton2ActionPerformed(evt);
            }
        });

        uWPButton3.setText("Xem chi tiết");
        uWPButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uWPButton3ActionPerformed(evt);
            }
        });

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

    private void uWPButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uWPButton1ActionPerformed
        
         refreshData();
    }//GEN-LAST:event_uWPButton1ActionPerformed

    private void uWPButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uWPButton2ActionPerformed
        try {
            // Lọc dữ liệu và cập nhật bảng
            ArrayList<ModelBill> receiptList = service.BillToDay();
            if (receiptList != null && !receiptList.isEmpty()) {
                
                //JOptionPane.showMessageDialog(this, "Lọc thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                updateTable(receiptList);
            } else {
                // Nếu không có dữ liệu phù hợp, hiển thị thông báo
                JOptionPane.showMessageDialog(this, "Không có dữ liệu được tìm thấy cho hôm nay!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            // Xử lý lỗi nếu có
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lọc dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_uWPButton2ActionPerformed

    private void uWPButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uWPButton3ActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) { // Kiểm tra xem có hàng nào được chọn không
        int receiptID = (int) table.getValueAt(selectedRow, 0); // Lấy ID của hóa đơn được chọn      
       // System.out.println(receiptID);
        FormBillInfo newfrm = new FormBillInfo(receiptID);
        newfrm.setVisible(true);
        //JOptionPane.showMessageDialog(this,"" + receiptID);
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để xem chi tiết.", "Thông báo", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_uWPButton3ActionPerformed

    public void refreshData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa hết các dòng hiện tại trong bảng
        initTable(); // Load lại dữ liệu mới
    }
   private void updateTable(ArrayList<ModelBill> receiptList) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa hết các dòng hiện tại trong bảng

        for (ModelBill receipt : receiptList) {
            // Thêm dòng mới vào bảng với dữ liệu từ mỗi ModelReceipt trong danh sách
            model.addRow(new Object[]{receipt.getID_Bill(), receipt.getTable() , receipt.getDateChekIn()  , df.format(receipt.getTotalPrice()) + "đ", receipt.getStatus()});
        }
   }

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
