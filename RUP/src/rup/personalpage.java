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
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import static rup.LabelImage.path;

/**
 *
 * @author mahe
 */
public class personalpage extends javax.swing.JFrame {
private static WebDriver driver;
    /**
     * Creates new form personalpage
     */
    public personalpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        desp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        avg_rate = new javax.swing.JLabel();
        imdb = new javax.swing.JLabel();
        num_view = new javax.swing.JLabel();
        hyp = new javax.swing.JLabel();
        panels = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        desp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 54;
        gridBagConstraints.ipadx = 844;
        gridBagConstraints.ipady = 51;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(desp, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("BOOK THE TICKETS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 22, 0, 0);
        getContentPane().add(jLabel12, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("GO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 19, 41, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("AVERAGE RATINGS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 4, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        lb1.setText("Photo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.ipady = 140;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 10, 0, 0);
        getContentPane().add(lb1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NO OF REVIEWERS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 4, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("IMDB Rating");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 4, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("SHORT DESCRIPTION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("ADD TO WATCHLIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 47;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 45, 41, 0);
        getContentPane().add(jButton3, gridBagConstraints);

        avg_rate.setText("jLabel13");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 47;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 4, 0, 0);
        getContentPane().add(avg_rate, gridBagConstraints);

        imdb.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 47;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 4, 0, 0);
        getContentPane().add(imdb, gridBagConstraints);

        num_view.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 47;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 4, 0, 0);
        getContentPane().add(num_view, gridBagConstraints);

        hyp.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        hyp.setText("RATE MY SHOW");
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 49;
        gridBagConstraints.ipadx = 621;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 3, 0, 0);
        getContentPane().add(hyp, gridBagConstraints);

        panels.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(panels, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("RECOMMEND YOUR FRIENDS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 22, 0, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        buttonGroup3.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox5.setText("YES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 19, 0, 0);
        getContentPane().add(jCheckBox5, gridBagConstraints);

        buttonGroup3.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox6.setText("NOT NOW");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 47;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 45, 0, 0);
        getContentPane().add(jCheckBox6, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("RATE THE MOVIE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 22, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        rb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rb1MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 19, 0, 0);
        getContentPane().add(rb1, gridBagConstraints);

        rb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rb2MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 2, 0, 0);
        getContentPane().add(rb2, gridBagConstraints);

        rb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rb3MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 1, 0, 0);
        getContentPane().add(rb3, gridBagConstraints);

        rb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rb4MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 1, 0, 0);
        getContentPane().add(rb4, gridBagConstraints);

        rb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rb5MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 46;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 2, 0, 0);
        getContentPane().add(rb5, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("SUBMIT ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 47;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 45, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        buttonGroup2.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox3.setText("YES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 2, 0, 0);
        getContentPane().add(jCheckBox3, gridBagConstraints);

        buttonGroup2.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox4.setText("LATER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 47;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 45, 0, 0);
        getContentPane().add(jCheckBox4, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("WANT TO RATE THIS MOVIE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 22, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("ALREADY WATCHED ?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(109, 22, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setText("YES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(104, 2, 0, 0);
        getContentPane().add(jCheckBox1, gridBagConstraints);

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox2.setText("NO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 47;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(104, 45, 0, 0);
        getContentPane().add(jCheckBox2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
String movie_name;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        Icon src = new ImageIcon(new ImageIcon(LabelImage.path).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH));
        LabelImage.src=src;
        lb1.setIcon(LabelImage.src); 
        
        if(Basic.login==1)
            panels.setVisible(true);
        else
            panels.setVisible(false);
        
        desp.setEditable(false);   
        desp.setEnabled(false);
        desp.setDisabledTextColor(Color.BLACK);//description text area
        setExtendedState(this.MAXIMIZED_BOTH);
        
    try{          //Connection Code 
       Connection conn = Conn.connect();                                                             
       PreparedStatement pst =   conn.prepareStatement("Select * from movie_details where movie_id="+LabelImage.id+";");
       ResultSet rs = pst.executeQuery();    
       //conn.close();
       if(rs.next()){
           movie_name = rs.getString("movie_name");
           String movie_desc = rs.getString("about_movie");
           double avgs = rs.getDouble("avg_rating");
           int num = rs.getInt("no_of_reviews");
           desp.setText(movie_desc);
            num_view.setText(num+"");
            avg_rate.setText(avgs+"");
       }
       
       
   }
   catch(Exception e){
       e.printStackTrace();
      // return false;
   }
    }//GEN-LAST:event_formWindowOpened

    private void despActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_despActionPerformed

    private void rb1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb1MouseEntered
       rb1.setSelected(true);
       rb2.setSelected(false);
       rb3.setSelected(false);
       rb4.setSelected(false);
       rb5.setSelected(false);
    }//GEN-LAST:event_rb1MouseEntered

    private void rb2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb2MouseEntered
rb1.setSelected(true);
       rb2.setSelected(true);
       rb3.setSelected(false);
       rb4.setSelected(false);
       rb5.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_rb2MouseEntered

    private void rb3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb3MouseEntered
rb1.setSelected(true);
       rb2.setSelected(true);
       rb3.setSelected(true);
       rb4.setSelected(false);
       rb5.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_rb3MouseEntered

    private void rb4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb4MouseEntered
rb1.setSelected(true);
       rb2.setSelected(true);
       rb3.setSelected(true);
       rb4.setSelected(true);
       rb5.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_rb4MouseEntered

    private void rb5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb5MouseEntered
rb1.setSelected(true);
       rb2.setSelected(true);
       rb3.setSelected(true);
       rb4.setSelected(true);
       rb5.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_rb5MouseEntered

    private void hypMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hypMouseClicked
this.setVisible(false);
new mainForm().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_hypMouseClicked

    private void hypMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hypMouseEntered
hyp.setForeground(Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_hypMouseEntered

    private void hypMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hypMouseExited
hyp.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_hypMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mahe\\Desktop\\chromedriver.exe");
    driver = new ChromeDriver();
    Dimension d;
      d = new Dimension(0,0);
   driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    try{
       // InputStream ExcelFileToRead = new FileInputStream("C:\\Users\\mahe\\Desktop\\automation.xlsx");
//        XSSFWorkbook  wb1 = new XSSFWorkbook(ExcelFileToRead);
//	XSSFSheet sheetInp = wb1.getSheetAt(0);
//        String loc = sheetInp.getRow(1).getCell(0).getStringCellValue();
        String loc = "https://in.bookmyshow.com/manipal";
	driver.get(loc);       
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]"));
        driver.findElement(By.xpath("//*[@id=\"quickbook-wrapper\"]/div[1]/div[1]/span[1]/input[2]")).sendKeys(movie_name);
        driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quickbook-wrapper\"]/div[1]/div[1]/span[1]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"quickbook-wrapper\"]/div[1]/div[1]/span[1]/div/div/div[2]")).click();
        }
	catch (Exception e)
	{
        String message = e.getMessage();
        System.out.println("Error"+message);
	}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(personalpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personalpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personalpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personalpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personalpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avg_rate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField desp;
    private javax.swing.JLabel hyp;
    private javax.swing.JLabel imdb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel num_view;
    private javax.swing.JPanel panels;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    // End of variables declaration//GEN-END:variables
}
