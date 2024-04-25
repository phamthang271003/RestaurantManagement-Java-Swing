/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Restaurant.View.Form.Staff;

import Restaurant.Controller.Event.Menu_Staff;
import Restaurant.Model.ModelTable;
import Restaurant.View.Swing.Dashboard.Button;
import Restaurant.View.Swing.Dashboard.PanelRound;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author quangthang
 */
public class TableS extends JPanel  {

    private final ModelTable table;
    private final Menu_Staff menuStaff;

    public static final Color COLOR_AVAILABLE = Color.decode("#355C7D");
    public static final Color COLOR_RESERVED = Color.decode("#FFE000");
    public static final Color COLOR_CANCELLED = Color.decode("#c94b4b");
    public static final Color COLOR_DEFAULT = Color.decode("#E9E4F0");

    public TableS(ModelTable table) {
        this.table = table;
        this.menuStaff = new Menu_Staff(this);
        initComponents();
        init();
    }

    public void init() {
        //gán hình ảnh bàn vừa với jlabel
        SwingUtilities.invokeLater(() -> {
            ImageIcon icon = new ImageIcon(TableS.class.getResource("/Icons/Staff/IconTable.png"));
            Image image = icon.getImage();
            int labelWidth = img.getWidth();
            int labelHeight = img.getHeight();
            Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
            img.setIcon(new ImageIcon(scaledImage));

        });
        // gán giá trị cho bàn
        lbTitle.setText("Mã bàn: " + table.getID_Table() + " - " + table.getTableName());
        lbValue.setText(table.getStatus());

        //khởi tạo các bàn trống hay đã đặt
        switch (table.getStatus()) {
            case "Con trong":
                img.setBackground(COLOR_DEFAULT);
                btnDatBan.setBackground(new Color(108, 91, 123));
                btnDatBan.setText("Đặt trước");
                break;

//            case "Dang dung bua" -> {
//                img.setBackground(Color.decode("#605C3C"));
            //             btnGoiMon.setText("GỌI MÓN");
//            
//            }
            case "Da dat truoc":
                img.setBackground(COLOR_RESERVED);
                btnDatBan.setText("Hủy đặt trước");
                btnDatBan.setBackground(COLOR_CANCELLED);
                break;
            default:
                break;
        }
        // gán sự kiên cho nút Đặt món và gọi món
        btnDatBan.addActionListener(menuStaff);
        btnGoiMon.addActionListener(menuStaff);
    }
//Cập nhật trạng thái bàn

    public void updateTableStatus(String statusText, Color statusColor, String buttonText, Color buttonColor) {
        lbValue.setText(statusText);
        img.setBackground(statusColor);
        btnDatBan.setText(buttonText);
        btnDatBan.setBackground(buttonColor);
        table.setStatus(statusText);
    }
//Tạo các getter,setter của thuộc tính để lớp controller có thể lấy được giá trị của thuộc tính

    public ModelTable getTable() {
        return table;
    }

    public Button getBtnDatBan() {
        return btnDatBan;
    }

    public JLabel getImg() {
        return img;
    }

    public void setBtnGoiMon(Button btnGoiMon) {
        this.btnGoiMon = btnGoiMon;
    }

    public Button getBtnGoiMon() {
        return btnGoiMon;
    }

    public JLabel getLbTitle() {
        return lbTitle;
    }

    public void setBtnDatBan(Button btnDatBan) {
        this.btnDatBan = btnDatBan;
    }

    public void setImg(JLabel img) {
        this.img = img;
    }

    public void setLbTitle(JLabel lbTitle) {
        this.lbTitle = lbTitle;
    }

    public void setLbValue(JLabel lbValue) {
        this.lbValue = lbValue;
    }

    public void setPanelRound1(PanelRound panelRound1) {
        this.panelRound1 = panelRound1;
    }

    public JLabel getLbValue() {
        return lbValue;
    }

    public PanelRound getPanelRound1() {
        return panelRound1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Restaurant.View.Swing.Dashboard.PanelRound();
        img = new javax.swing.JLabel();
        lbValue = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        btnDatBan = new Restaurant.View.Swing.Dashboard.Button();
        btnGoiMon = new Restaurant.View.Swing.Dashboard.Button();

        img.setBackground(new java.awt.Color(233, 228, 240));
        img.setOpaque(true);

        lbValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbValue.setForeground(new java.awt.Color(108, 91, 123));
        lbValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbValue.setText("Value");

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(108, 91, 123));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Title");

        btnDatBan.setBackground(new java.awt.Color(108, 91, 123));
        btnDatBan.setForeground(new java.awt.Color(255, 255, 255));
        btnDatBan.setText("Đặt trước");
        btnDatBan.setFocusable(false);
        btnDatBan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDatBan.setMaximumSize(new java.awt.Dimension(70, 29));
        btnDatBan.setMinimumSize(new java.awt.Dimension(70, 29));

        btnGoiMon.setBackground(new java.awt.Color(108, 91, 123));
        btnGoiMon.setForeground(new java.awt.Color(255, 255, 255));
        btnGoiMon.setText("Gọi món");
        btnGoiMon.setFocusable(false);
        btnGoiMon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnGoiMon.setMaximumSize(new java.awt.Dimension(70, 29));
        btnGoiMon.setMinimumSize(new java.awt.Dimension(70, 29));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDatBan, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGoiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lbValue, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDatBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGoiMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Restaurant.View.Swing.Dashboard.Button btnDatBan;
    private Restaurant.View.Swing.Dashboard.Button btnGoiMon;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbValue;
    private Restaurant.View.Swing.Dashboard.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
