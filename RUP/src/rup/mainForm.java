/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rup;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author mahe
 */

public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */
    public mainForm() {
        initComponents();
        if(Basic.login==1)      //checking whether the user is logged in or not
            hyp.setVisible(false);
        setExtendedState(this.MAXIMIZED_BOTH);
       try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,link from movie_details;");
       ResultSet rs = pst.executeQuery();
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb1.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb2.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb3.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb4.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb5.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb6.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb7.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb8.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb9.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb10.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb11.setIcon(LabelImage.src);
       }  
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
           LabelImage.src=src;
           lb12.setIcon(LabelImage.src);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
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

        srch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        hyp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb1MouseClicked(evt);
            }
        });

        lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb2MouseClicked(evt);
            }
        });

        lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb3MouseClicked(evt);
            }
        });

        lb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb4MouseClicked(evt);
            }
        });

        lb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb5MouseClicked(evt);
            }
        });

        lb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb6MouseClicked(evt);
            }
        });

        lb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb7MouseClicked(evt);
            }
        });

        lb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb8MouseClicked(evt);
            }
        });

        lb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb9MouseClicked(evt);
            }
        });

        lb10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb10MouseClicked(evt);
            }
        });

        lb11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb11MouseClicked(evt);
            }
        });

        lb12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb12MouseClicked(evt);
            }
        });

        hyp.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        hyp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hyp.setText("Login/Register");
        hyp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hypMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hypMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hypMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hyp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hyp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb12, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


    }//GEN-LAST:event_formWindowActivated

    private void lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseClicked

        try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 101;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
        
//        Icon src = lb1.getIcon();
//        LabelImage.src=src;
//        LabelImage.id=101;
//        new personalpage().setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_lb1MouseClicked

    private void lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 102;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb2MouseClicked

    private void lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 103;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb3MouseClicked

    private void lb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb4MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 104;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb4MouseClicked

    private void lb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb5MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 105;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb5MouseClicked

    private void lb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb6MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 106;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb6MouseClicked

    private void lb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb7MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 107;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb7MouseClicked

    private void lb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb8MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 108;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb8MouseClicked

    private void lb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb9MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 109;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb9MouseClicked

    private void lb10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb10MouseClicked
        try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 110;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb10MouseClicked

    private void lb11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb11MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 111;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb11MouseClicked

    private void lb12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb12MouseClicked
         try{          //Connection Code 
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull","root","robin");
                                                                    
       PreparedStatement pst =   conn.prepareStatement("Select movie_id,movie_name,link from movie_details where movie_id = 112;");
       ResultSet rs = pst.executeQuery();    
       int num =1;
       if(rs.next()){
           LabelImage.path=rs.getString("link");
           LabelImage.id=rs.getInt("movie_id");
           new personalpage().setVisible(true);
           this.setVisible(false);
       }  
       conn.close();
   }
   catch(Exception e){
       e.printStackTrace();
       
   }
    }//GEN-LAST:event_lb12MouseClicked

    private void hypMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hypMouseClicked
this.setVisible(false);
new Login().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_hypMouseClicked

    private void hypMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hypMouseEntered
hyp.setForeground(Color.BLUE);        // TODO add your handling code here:
    }//GEN-LAST:event_hypMouseEntered

    private void hypMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hypMouseExited
hyp.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_hypMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        Basic.searched=srch.getText();
        this.setVisible(false);
        new search_results().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hyp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JTextField srch;
    // End of variables declaration//GEN-END:variables
}

