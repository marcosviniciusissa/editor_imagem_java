/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import jdk.nashorn.internal.scripts.JD;
import marvin.MarvinPluginCollection;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;
import marvin.plugin.MarvinImagePlugin;
import marvin.plugin.MarvinPlugin;
import marvin.util.MarvinPluginLoader;
import model.Movimento;
import model.RecorteImagem;
import model.Rotacao;

/**
 *
 * @author herquiloide
 */
public class JanelaPrincipal extends javax.swing.JFrame {

   
    // Dialog que recebe os dados de altura e largura
    private JDScale jDScale;
    private JDAbout jDAbout;
    private JDBrilho jdBrilho;
    private JDCropSize jDCropSize;
    private Movimento movimento;
    private RecorteImagem recorte;
    
    
    
    private MarvinImage marvinImage, originalImage, imageIn, imageOut;
    private MarvinImagePlugin marvinImagePlugin;
    private int rotateAngle;
    private int [] rotateAngles;
    
    
    public JanelaPrincipal() {
       
        initComponents();
//        for(Component componente: ){
//            System.out.println(componente);
//        }
//        JOptionPane.showMessageDialog(null, );

         this.movimento = new Movimento(this.jPanel1.getComponents());
        this.jDScale = new JDScale(this, true);
        this.jDAbout = new JDAbout(this, true);
        this.jdBrilho = new JDBrilho(this, true);
        this.jDCropSize = new JDCropSize(this, true);
        
        

          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserOpen = new javax.swing.JFileChooser();
        mfcImagem = new marvin.util.MarvinFileChooser();
        jFileChooserSave = new javax.swing.JFileChooser();
        jpPrincinpal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jpImage = new marvin.gui.MarvinImagePanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout mfcImagemLayout = new javax.swing.GroupLayout(mfcImagem.getContentPane());
        mfcImagem.getContentPane().setLayout(mfcImagemLayout);
        mfcImagemLayout.setHorizontalGroup(
            mfcImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        mfcImagemLayout.setVerticalGroup(
            mfcImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFileChooserSave.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jpPrincinpal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(30, 144, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(204, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(204, 324));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rotate left.png"))); // NOI18N
        jButton1.setToolTipText("rotacao Anti-horaria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rotate right.png"))); // NOI18N
        jButton2.setToolTipText("Rotacao Horaria");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crop2.png"))); // NOI18N
        jButton3.setToolTipText("Clipping Image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scale.png"))); // NOI18N
        jButton4.setToolTipText("Escala");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(616, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jpImage.setBackground(new java.awt.Color(255, 255, 255));
        jpImage.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jpImage.setPreferredSize(new java.awt.Dimension(920, 680));
        jpImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpImageMouseDragged(evt);
            }
        });
        jpImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpImageKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpImageKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jpImageLayout = new javax.swing.GroupLayout(jpImage);
        jpImage.setLayout(jpImageLayout);
        jpImageLayout.setHorizontalGroup(
            jpImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        jpImageLayout.setVerticalGroup(
            jpImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpImage, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpImage, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpPrincinpalLayout = new javax.swing.GroupLayout(jpPrincinpal);
        jpPrincinpal.setLayout(jpPrincinpalLayout);
        jpPrincinpalLayout.setHorizontalGroup(
            jpPrincinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincinpalLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpPrincinpalLayout.setVerticalGroup(
            jpPrincinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincinpalLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Ficheiro");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Abrir...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Salvar...");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Sair");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem2.setText("Refazer");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Voltar");
        jMenu2.add(jMenuItem3);

        jMenuItem12.setText("Discartar Tudo");
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Efeitos");

        jMenuItem4.setText("Inverter Cores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Preto & Branco");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem8.setText("Desenho");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Brilho / Contraste");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("Recortar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ver");

        jMenuItem13.setText("Tela Cheia");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Tela Media");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Sobre");

        jMenuItem10.setText("Ajuda");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Sobre");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincinpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincinpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        FileNameExtensionFilter fileExtensions = new FileNameExtensionFilter("Imagens JPG e png", "jpg", "png");
        this.jFileChooserOpen.setFileFilter(fileExtensions);
        
        int returnValue = jFileChooserOpen.showOpenDialog(jpPrincinpal);
        
        if(returnValue == jFileChooserOpen.APPROVE_OPTION){
             File file = this.jFileChooserOpen.getSelectedFile();
                     
        try{
           
            this.originalImage = MarvinImageIO.loadImage(file.getAbsolutePath());
            recorte = new RecorteImagem(this.originalImage.getBufferedImage(), this.jpImage);
            recorte.setVisible(false);
//            this.imageIn = new MarvinImage(this.originalImage.getWidth(), this.originalImage.getHeight());
//            this.imageOut = new MarvinImage(this.originalImage.getWidth(), this.originalImage.getHeight());
            
            this.jpImage.setImage(this.originalImage);
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Erro ao renderizar a imgem " + ex);
    }
        }
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.originalImage = Rotacao.rotate90(this.originalImage);
        this.originalImage.update();
        this.jpImage.setImage(new MarvinImage());
        this.jpImage.setImage(this.originalImage);
        this.recorte.setFotoOriginal(this.originalImage.getBufferedImage());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.marvinImagePlugin = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.color.invert.jar");
        this.marvinImagePlugin.process(this.originalImage, this.originalImage);
        this.originalImage.update();
        this.jpImage.setImage(this.originalImage);
        this.recorte.setFotoOriginal(this.originalImage.getBufferedImage());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.marvinImagePlugin = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.color.grayScale.jar");
        this.marvinImagePlugin.process(this.originalImage, this.originalImage);
        this.originalImage.update();
        this.jpImage.setImage(this.originalImage);
        this.recorte.setFotoOriginal(this.originalImage.getBufferedImage());
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.originalImage = Rotacao.rotate270(this.originalImage);
       this.originalImage.update();
       this.jpImage.setImage(new MarvinImage());
       this.jpImage.setImage(this.originalImage);
       this.recorte.setFotoOriginal(this.originalImage.getBufferedImage());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.jDScale.setVisible(true);
       
       if(jDScale.largura >0 && this.jDScale.largura>0){
           this.imageOut = this.originalImage.clone();
       this.imageOut.setDimension(jDScale.largura, this.jDScale.largura);
       
        int x_ratio = (int)((this.originalImage.getWidth()<<16)/this.jDScale.largura) ;
	    int y_ratio = (int)((this.originalImage.getHeight()<<16)/this.jDScale.altura) ;
	    int x2, y2 ;
	    for (int i=0;i<this.jDScale.altura;i++) {
	        for (int j=0;j<this.jDScale.largura;j++) {
	            x2 = ((j*x_ratio)>>16) ;
	            y2 = ((i*y_ratio)>>16) ;
	            this.imageOut.setIntColor(j,i, this.originalImage.getIntColor(x2,y2));
                }
            }
         
           this.originalImage = this.imageOut.clone();
        this.originalImage.update();
        this.jpImage.setImage(this.originalImage);
        this.recorte.setFotoOriginal(this.originalImage.getBufferedImage());
       }
       
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       this.jDCropSize.setVisible(true);
            
            recorte.setClipAlto(jDCropSize.altura);
            recorte.setClipAncho(jDCropSize.largura);
            recorte.setVisible(true);
            recorte.setFocusable(true);
            this.jpImage.add(this.recorte);
            this.jPanel1.repaint();
            this.recorte.setFotoOriginal(this.originalImage.getBufferedImage());
//        MarvinPluginCollection.crop(this.originalImage.clone(), this.originalImage, 60, 32, 182, 62);
//        this.originalImage.update();
//        this.jpImage.setImage(this.originalImage);
      
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
          
        int returnValue = jFileChooserSave.showOpenDialog(jpPrincinpal);
        
        if(returnValue == jFileChooserOpen.APPROVE_OPTION){
             File file = this.jFileChooserSave.getSelectedFile();
             MarvinImageIO.saveImage(this.originalImage, file.getAbsolutePath() + "/imagem.jpg");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        this.jDAbout.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        this.marvinImagePlugin = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.color.thresholding.jar");
        this.marvinImagePlugin.process(this.originalImage, this.originalImage);
        this.originalImage.update();
        this.jpImage.setImage(this.originalImage);
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       this.jdBrilho.setVisible(true);
       
       this.marvinImagePlugin = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.color.brightnessAndContrast.jar");
       this.marvinImagePlugin.process(this.originalImage, this.originalImage);
       this.originalImage.update();
       this.jpImage.setImage(this.originalImage);
       
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       JOptionPane.showMessageDialog(null, "Não funcional ainda");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        this.setSize(new Dimension(1000, 706));
        this.revalidate();
        this.validate();
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jpImageMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpImageMouseDragged
       
        
    }//GEN-LAST:event_jpImageMouseDragged

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
//        if(evt.paramString() == KeyEvent.VK_ESCAPE){
//                 JOptionPane.showMessageDialog(null, "clicado");
//             }
    }//GEN-LAST:event_formKeyPressed

    private void jpImageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpImageKeyTyped

    }//GEN-LAST:event_jpImageKeyTyped

    private void jpImageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpImageKeyPressed
                    System.out.println(evt.getKeyChar());

    }//GEN-LAST:event_jpImageKeyPressed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        this.originalImage.setBufferedImage(this.recorte.recortar());
        this.originalImage.update();
        this.jpImage.removeAll();
        this.jpImage.repaint();
        this.jpImage.setImage(this.originalImage);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFileChooser jFileChooserOpen;
    private javax.swing.JFileChooser jFileChooserSave;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private marvin.gui.MarvinImagePanel jpImage;
    private javax.swing.JPanel jpPrincinpal;
    private marvin.util.MarvinFileChooser mfcImagem;
    // End of variables declaration//GEN-END:variables
}
