package Restaurant.View.Dialog;

import Restaurant.Controller.Service.ServiceStaffWarehouse;
import Restaurant.Model.Modelngredient;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MS_DeleteIngr extends javax.swing.JDialog {

    private final Animator animator;
    private boolean show = true;
    private Frame frame;
    private ServiceStaffWarehouse service;
    private boolean delete;

    public MS_DeleteIngr(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        service = new ServiceStaffWarehouse();
        this.frame = parent;
        setOpacity(0f);
        getContentPane().setBackground(Color.WHITE);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    setOpacity(fraction);
                } else {
                    setOpacity(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (show == false) {
                    setVisible(false);
                }
            }

        };
        animator = new Animator(200, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
    }

    public boolean Staff_ConfirmDelete(Modelngredient data) {
        setLocationRelativeTo(frame);
        delete=false;
        lbTitle.setText("XÁC NHẬN XÓA NGUYÊN LIỆU");
        lbMessage.setText("Bạn có chắc xóa nguyên liệu " + data.getNameIngre() + " không ?");

        animator.start();
        cmdOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    delete=true;
                    service.DeleteNL(data);
                } catch (SQLException ex) {
                    Logger.getLogger(MS_DeleteIngr.class.getName()).log(Level.SEVERE, null, ex);
                }
                closeMenu();
            }

        });
        cmdCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeMenu();
            }

        });
        show = true;
        setVisible(true);
        return delete;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound2 = new Restaurant.View.Swing.Dashboard.PanelRound();
        cmdOK = new Restaurant.View.Swing.Login.ButtonOutLine();
        cmdCancel = new Restaurant.View.Swing.Login.ButtonOutLine();
        lbTitle = new javax.swing.JLabel();
        lbMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(215, 215, 215));
        setUndecorated(true);

        cmdOK.setBackground(new java.awt.Color(17, 153, 142));
        cmdOK.setForeground(new java.awt.Color(108, 91, 123));
        cmdOK.setText("Xác nhận");
        cmdOK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOKActionPerformed(evt);
            }
        });

        cmdCancel.setBackground(new java.awt.Color(237, 33, 58));
        cmdCancel.setForeground(new java.awt.Color(108, 91, 123));
        cmdCancel.setText("Hủy");
        cmdCancel.setActionCommand("Hủy");
        cmdCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(108, 91, 123));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("XÁC NHẬN HỦY ĐẶT TRƯỚC");

        lbMessage.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbMessage.setForeground(new java.awt.Color(108, 91, 123));
        lbMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMessage.setText("Message");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(cmdOK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(cmdCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMessage)
                .addGap(58, 58, 58)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdOK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOKActionPerformed

    }//GEN-LAST:event_cmdOKActionPerformed

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed

    }//GEN-LAST:event_cmdCancelActionPerformed

    private void closeMenu() {
        if (animator.isRunning()) {
            animator.stop();
        }
        show = false;
        animator.start();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#516395"), 0, getHeight(), Color.decode("#614385"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponents(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Restaurant.View.Swing.Login.ButtonOutLine cmdCancel;
    private Restaurant.View.Swing.Login.ButtonOutLine cmdOK;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JLabel lbTitle;
    private Restaurant.View.Swing.Dashboard.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
