/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import org.w3c.dom.events.MouseEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author nick
 */
public class EventrEventsForm extends javax.swing.JFrame implements MouseListener{

    /**
     * Creates new form EventrEventsForm
     */
    boolean inTransition = false;
    
    Vector<Events> eventList = new Vector<>();
    Vector<Vector <javax.swing.JLabel>> eventListDisplay = new Vector<>();
    
    int eventIndex = 0;
    String uploadedImagePath ="";
    

    public EventrEventsForm() {
    
        initComponents(); 
        LikeButton.addMouseListener(this);
        DislikeButton.addMouseListener(this);
        settingsIcon.addMouseListener(this);
        //leftSettingsTextTile.addMouseListener(this);
        addEvent.addMouseListener(this);
        clickBlocker.addMouseListener(this);
        createButton.addMouseListener(this);
        upLoadButton.addMouseListener(this);
        SeeEventsLabel.addMouseListener(this);
     
        
   
        SeeAddedEvents.addMouseListener(this);
         titleButton.addMouseListener(this);
         titleBackground.addMouseListener(this);
        
        
        createButton.setBackground(new Color(255,255,255,0));
        upLoadButton.setBackground(new Color(255,255,255,0));
        
     
        upTri.addMouseListener(this);
        downTriangleImage.addMouseListener(this);
        downTriangleImage.setVisible(false);
        
        LeftSettingsPanel.setBackground(new Color(102,51,255,230));
        
        
     
        AddedEvents.setLocation(0, 800);
        createPanel.setLocation(0, 800);
        SwipingPanel.setLocation(0,0);
        LeftSettingsPanel.setLocation(-400, -5);
        
        
        timeComboBox.removeAllItems();
        for (int i = 1; i < 12; ++i)
        {
            timeComboBox.addItem(i + ":00 am");
            timeComboBox.addItem(i + ":15 am");
            timeComboBox.addItem(i + ":30 am");
            timeComboBox.addItem(i + ":45 am");

        }
        for (int i = 1; i < 12; ++i)
        {
            timeComboBox.addItem(i + ":00 pm");
            timeComboBox.addItem(i + ":15 pm");
            timeComboBox.addItem(i + ":30 pm");
            timeComboBox.addItem(i + ":45 pm");
        }
        
        
        generatePreBuiltEventList();
        
        displayEvent();
        
   
      
        
        
        
        
        
    }
    
    private void generatePreBuiltEventList()
    {
        Events birdWatchingEvent = new Events("Bird Watching");
        birdWatchingEvent.setWhere("Botanical Gardens");
        
        birdWatchingEvent.setTime("8:00 am");
        birdWatchingEvent.setMonth("April");
        birdWatchingEvent.setDay(6);
        birdWatchingEvent.setYear(2024);
        
        birdWatchingEvent.setbackgroundImage("src/eventr/images/BirdWatchEvent.png");
        
 
        birdWatchingEvent.setAbout("We are a bird watching group affiliated with Clemson\nUniversity. We like to watch birds");
        
       
        eventList.add(birdWatchingEvent);
        
        
        Events volleyBall = new Events("Volley Ball");
        volleyBall.setWhere("250 Campus Vw Tri, Seneca, SC 29678");
        
          volleyBall.setTime("3:00 pm");
        volleyBall.setMonth("April");
        volleyBall.setDay(7);
        volleyBall.setYear(2024);
        
        
        volleyBall.setbackgroundImage("src/eventr/images/volleyBall.png");
        
 
        volleyBall.setAbout("Join Us! We play volleyball and we are the volleyball club");
        
       
        eventList.add(volleyBall);
        
        
        Events basketBallGame = new Events("NBA Game");
        basketBallGame.setWhere("State Farm Arena");
   
        basketBallGame.setTime("7:30 pm");
        basketBallGame.setMonth("April");
        basketBallGame.setDay(6);
        basketBallGame.setYear(2024);
        
        basketBallGame.setbackgroundImage("src/eventr/images/statefarmarena.jpg");
        
 
        basketBallGame.setAbout("Watch the Hawks play!");
        
       
        eventList.add(basketBallGame);
        
        
        
        Events footBallGame = new Events("Clemson Football");
        footBallGame.setWhere("Memorial Stadium");
   
         footBallGame.setTime("1:00 pm");
        footBallGame.setMonth("April");
        footBallGame.setDay(10);
        footBallGame.setYear(2024);
        
        footBallGame.setbackgroundImage("src/eventr/images/football.jpg");
        
 
        footBallGame.setAbout("Watch a football game!");
        
       
        eventList.add(footBallGame);
        
     
    }

    private void displayEvent()
    {
        
           
        SwipingPanel.setVisible(false);
        
        EventTitleLabel.setText(eventList.get(eventIndex).getTitle());
        
        EventTimeLabel.setText(eventList.get(eventIndex).getWhere());
        EventLocationLabel.setText(eventList.get(eventIndex).getWhen());
        
        WhereTextArea.setText(eventList.get(eventIndex).getWhere());
        WhenTextArea.setText(eventList.get(eventIndex).getWhen());

        EventImage.setIcon(new javax.swing.ImageIcon((eventList.get(eventIndex).getImage()))); 

        
        AboutUsTextArea.setText(eventList.get(eventIndex).getAbout());

             
        SwipingPanel.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleButton = new javax.swing.JLabel();
        titleBackground = new javax.swing.JLabel();
        settingsIcon = new javax.swing.JLabel();
        BannerImage = new javax.swing.JLabel();
        LeftSettingsPanel = new javax.swing.JPanel();
        leftSettingsTextTile = new javax.swing.JPanel();
        settingsLabel1 = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        addEvent = new javax.swing.JLabel();
        SeeAddedEvents = new javax.swing.JLabel();
        SeeEventsLabel = new javax.swing.JLabel();
        createPanel = new javax.swing.JPanel();
        upLoadButton = new javax.swing.JPanel();
        createButton = new javax.swing.JPanel();
        whiteSpace = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AboutTextInput = new javax.swing.JTextArea();
        whiteSpace2 = new javax.swing.JPanel();
        whereTextInput = new javax.swing.JTextField();
        whiteSpace4 = new javax.swing.JPanel();
        titleTextInput = new javax.swing.JTextField();
        whiteSpace3 = new javax.swing.JPanel();
        timeComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        dateComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        createBackgroundPanel = new javax.swing.JLabel();
        clickBlocker = new javax.swing.JPanel();
        AddedEvents = new javax.swing.JPanel();
        whitespace = new javax.swing.JPanel();
        EventsAddedTitle = new javax.swing.JLabel();
        eventScrollPane = new javax.swing.JScrollPane();
        EventsAddedPanel = new javax.swing.JPanel();
        SwipingPanel = new javax.swing.JPanel();
        ExtraSettingsPanel = new javax.swing.JLayeredPane();
        downTriangleImage = new javax.swing.JLabel();
        settingsInnerPanel = new javax.swing.JPanel();
        whereLabel = new javax.swing.JLabel();
        WhereTextArea = new javax.swing.JTextArea();
        whenLabel1 = new javax.swing.JLabel();
        WhenTextArea = new javax.swing.JTextArea();
        aboutUsLabel = new javax.swing.JLabel();
        AboutUsTextArea = new javax.swing.JTextArea();
        DislikeButton = new javax.swing.JLabel();
        LikeButton = new javax.swing.JLabel();
        upTri = new javax.swing.JLabel();
        EventLocationLabel = new javax.swing.JLabel();
        EventTitleLabel = new javax.swing.JLabel();
        geoTagImage = new javax.swing.JLabel();
        EventTimeLabel = new javax.swing.JLabel();
        timeIconImage = new javax.swing.JLabel();
        gradient = new javax.swing.JLabel();
        EventImage = new javax.swing.JLabel();
        LikePanel = new javax.swing.JLabel();
        DislikePanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        titlePanel.add(titleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 280, 90));

        titleBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/EventrTitlePage.png"))); // NOI18N
        titlePanel.add(titleBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 800));

        getContentPane().add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 800));

        settingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/settings.png"))); // NOI18N
        getContentPane().add(settingsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        BannerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/EventrBanner.png"))); // NOI18N
        getContentPane().add(BannerImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LeftSettingsPanel.setBackground(new java.awt.Color(102, 51, 255));
        LeftSettingsPanel.setForeground(new java.awt.Color(255, 255, 255));

        leftSettingsTextTile.setBackground(new java.awt.Color(102, 51, 255));
        leftSettingsTextTile.setPreferredSize(new java.awt.Dimension(280, 70));
        leftSettingsTextTile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsLabel1.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        settingsLabel1.setForeground(new java.awt.Color(255, 255, 255));
        settingsLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingsLabel1.setText("Settings");
        settingsLabel1.setPreferredSize(new java.awt.Dimension(96, 45));
        leftSettingsTextTile.add(settingsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        settingsLabel.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        settingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        settingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/settingsWhite.png"))); // NOI18N
        settingsLabel.setText("Settings");
        settingsLabel.setPreferredSize(new java.awt.Dimension(96, 45));
        leftSettingsTextTile.add(settingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 50, 70));

        LeftSettingsPanel.add(leftSettingsTextTile);

        addEvent.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        addEvent.setForeground(new java.awt.Color(255, 255, 255));
        addEvent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addEvent.setText("Create an Event");
        addEvent.setPreferredSize(new java.awt.Dimension(260, 50));
        LeftSettingsPanel.add(addEvent);

        SeeAddedEvents.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        SeeAddedEvents.setForeground(new java.awt.Color(255, 255, 255));
        SeeAddedEvents.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SeeAddedEvents.setText("Added Events");
        SeeAddedEvents.setPreferredSize(new java.awt.Dimension(260, 50));
        SeeAddedEvents.setRequestFocusEnabled(false);
        LeftSettingsPanel.add(SeeAddedEvents);

        SeeEventsLabel.setFont(new java.awt.Font("PingFang HK", 1, 24)); // NOI18N
        SeeEventsLabel.setForeground(new java.awt.Color(255, 255, 255));
        SeeEventsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SeeEventsLabel.setText("Browse Events");
        SeeEventsLabel.setPreferredSize(new java.awt.Dimension(260, 50));
        SeeEventsLabel.setRequestFocusEnabled(false);
        LeftSettingsPanel.add(SeeEventsLabel);

        getContentPane().add(LeftSettingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -5, 280, 800));

        createPanel.setBackground(new java.awt.Color(102, 51, 255));
        createPanel.setPreferredSize(new java.awt.Dimension(400, 800));
        createPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        createPanel.add(upLoadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 340, 150));
        createPanel.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 710, 160, 50));

        whiteSpace.setBackground(new java.awt.Color(255, 255, 255));

        AboutTextInput.setColumns(20);
        AboutTextInput.setRows(8);
        AboutTextInput.setText("Enter Here");
        jScrollPane1.setViewportView(AboutTextInput);

        whiteSpace.add(jScrollPane1);

        createPanel.add(whiteSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 400, 60));

        whiteSpace2.setBackground(new java.awt.Color(255, 255, 255));

        whereTextInput.setText("Enter Here");
        whereTextInput.setPreferredSize(new java.awt.Dimension(340, 26));
        whereTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whereTextInputActionPerformed(evt);
            }
        });
        whiteSpace2.add(whereTextInput);

        createPanel.add(whiteSpace2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 400, 50));

        whiteSpace4.setBackground(new java.awt.Color(255, 255, 255));

        titleTextInput.setText("Enter Here");
        titleTextInput.setPreferredSize(new java.awt.Dimension(340, 26));
        whiteSpace4.add(titleTextInput);

        createPanel.add(whiteSpace4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 400, 50));

        whiteSpace3.setBackground(new java.awt.Color(255, 255, 255));

        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        timeComboBox.setFocusTraversalKeysEnabled(false);
        timeComboBox.setFocusable(false);
        timeComboBox.setRequestFocusEnabled(false);
        timeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboBoxActionPerformed(evt);
            }
        });
        whiteSpace3.add(timeComboBox);

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });
        whiteSpace3.add(monthComboBox);

        dateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));
        dateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboBoxActionPerformed(evt);
            }
        });
        whiteSpace3.add(dateComboBox);

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025" }));
        whiteSpace3.add(yearComboBox);

        createPanel.add(whiteSpace3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 400, 50));

        createBackgroundPanel.setBackground(new java.awt.Color(102, 51, 255));
        createBackgroundPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/Create.png"))); // NOI18N
        createBackgroundPanel.setPreferredSize(new java.awt.Dimension(400, 850));
        createPanel.add(createBackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        clickBlocker.setBackground(new java.awt.Color(102, 102, 255));
        clickBlocker.setPreferredSize(new java.awt.Dimension(400, 600));
        createPanel.add(clickBlocker, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        getContentPane().add(createPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, -1, -1));

        AddedEvents.setBackground(new java.awt.Color(255, 255, 255));
        AddedEvents.setPreferredSize(new java.awt.Dimension(400, 800));

        whitespace.setBackground(new java.awt.Color(255, 255, 255));
        whitespace.setPreferredSize(new java.awt.Dimension(400, 60));
        AddedEvents.add(whitespace);

        EventsAddedTitle.setFont(new java.awt.Font("PingFang HK", 1, 48)); // NOI18N
        EventsAddedTitle.setForeground(new java.awt.Color(102, 102, 255));
        EventsAddedTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EventsAddedTitle.setText("Events Added");
        EventsAddedTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AddedEvents.add(EventsAddedTitle);

        eventScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        eventScrollPane.setPreferredSize(new java.awt.Dimension(400, 650));

        EventsAddedPanel.setBackground(new java.awt.Color(255, 255, 255));
        EventsAddedPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EventsAddedPanel.setPreferredSize(new java.awt.Dimension(400, 0));
        eventScrollPane.setViewportView(EventsAddedPanel);

        AddedEvents.add(eventScrollPane);

        getContentPane().add(AddedEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, -1, -1));

        SwipingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExtraSettingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        downTriangleImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/downTri.png"))); // NOI18N
        downTriangleImage.setPreferredSize(new java.awt.Dimension(100, 100));
        ExtraSettingsPanel.add(downTriangleImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -232, 400, 800));

        settingsInnerPanel.setBackground(new java.awt.Color(255, 253, 249));
        settingsInnerPanel.setPreferredSize(new java.awt.Dimension(400, 600));

        whereLabel.setFont(new java.awt.Font("PingFang HK", 1, 36)); // NOI18N
        whereLabel.setForeground(new java.awt.Color(102, 102, 255));
        whereLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        whereLabel.setText(" Where");
        whereLabel.setPreferredSize(new java.awt.Dimension(400, 52));
        settingsInnerPanel.add(whereLabel);

        WhereTextArea.setEditable(false);
        WhereTextArea.setBackground(new java.awt.Color(255, 253, 249));
        WhereTextArea.setColumns(20);
        WhereTextArea.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        WhereTextArea.setForeground(new java.awt.Color(0, 0, 102));
        WhereTextArea.setRows(2);
        WhereTextArea.setText("The event will be held at the Botanical Garderns.");
        WhereTextArea.setSelectionEnd(88);
        WhereTextArea.setSelectionStart(88);
        settingsInnerPanel.add(WhereTextArea);

        whenLabel1.setFont(new java.awt.Font("PingFang HK", 1, 36)); // NOI18N
        whenLabel1.setForeground(new java.awt.Color(102, 102, 255));
        whenLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        whenLabel1.setText(" When");
        whenLabel1.setToolTipText("");
        whenLabel1.setPreferredSize(new java.awt.Dimension(400, 45));
        settingsInnerPanel.add(whenLabel1);

        WhenTextArea.setEditable(false);
        WhenTextArea.setBackground(new java.awt.Color(255, 253, 249));
        WhenTextArea.setColumns(20);
        WhenTextArea.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        WhenTextArea.setForeground(new java.awt.Color(0, 0, 102));
        WhenTextArea.setRows(3);
        WhenTextArea.setText("We are a bird watching group affiliated with Clemson\nUniversity. We like to watch birds.");
        settingsInnerPanel.add(WhenTextArea);

        aboutUsLabel.setFont(new java.awt.Font("PingFang HK", 1, 36)); // NOI18N
        aboutUsLabel.setForeground(new java.awt.Color(102, 102, 255));
        aboutUsLabel.setText(" About Us");
        aboutUsLabel.setPreferredSize(new java.awt.Dimension(400, 40));
        settingsInnerPanel.add(aboutUsLabel);

        AboutUsTextArea.setEditable(false);
        AboutUsTextArea.setBackground(new java.awt.Color(255, 253, 249));
        AboutUsTextArea.setColumns(20);
        AboutUsTextArea.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        AboutUsTextArea.setForeground(new java.awt.Color(0, 0, 102));
        AboutUsTextArea.setRows(3);
        AboutUsTextArea.setText("We are a bird watching group affiliated with Clemson \nUniversity. We like to watch birds.");
        settingsInnerPanel.add(AboutUsTextArea);

        ExtraSettingsPanel.add(settingsInnerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        SwipingPanel.add(ExtraSettingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, -1, 480));

        DislikeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/DislikeButton.png"))); // NOI18N
        SwipingPanel.add(DislikeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, -1));

        LikeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/LikeButton.png"))); // NOI18N
        SwipingPanel.add(LikeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, -1, -1));

        upTri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/upTriangle.png"))); // NOI18N
        upTri.setPreferredSize(new java.awt.Dimension(100, 100));
        SwipingPanel.add(upTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 370, 400, 800));

        EventLocationLabel.setFont(new java.awt.Font("PingFang HK", 0, 16)); // NOI18N
        EventLocationLabel.setForeground(new java.awt.Color(255, 255, 255));
        EventLocationLabel.setText("8:00 a.m. April 6, 2024");
        SwipingPanel.add(EventLocationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, -1, 30));

        EventTitleLabel.setFont(new java.awt.Font("PingFang HK", 1, 36)); // NOI18N
        EventTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        EventTitleLabel.setText("Bird Watching");
        SwipingPanel.add(EventTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, 40));

        geoTagImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/geoTag.png"))); // NOI18N
        SwipingPanel.add(geoTagImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        EventTimeLabel.setFont(new java.awt.Font("PingFang HK", 0, 16)); // NOI18N
        EventTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        EventTimeLabel.setText("Botanical Gardens");
        SwipingPanel.add(EventTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, 40));

        timeIconImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/timeIcon.png"))); // NOI18N
        SwipingPanel.add(timeIconImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));

        gradient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/BlackGradient.png"))); // NOI18N
        SwipingPanel.add(gradient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        EventImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/BirdWatchEvent.png"))); // NOI18N
        SwipingPanel.add(EventImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 730));

        getContentPane().add(SwipingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 800));

        LikePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/LikePanel.png"))); // NOI18N
        getContentPane().add(LikePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 430, -1));

        DislikePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventr/images/DislikePanel.png"))); // NOI18N
        getContentPane().add(DislikePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void whereTextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whereTextInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whereTextInputActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void dateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboBoxActionPerformed
        
        String selectedMonth = (String)monthComboBox.getSelectedItem();
        Boolean isLeapYear = false;
        int year = (Integer)yearComboBox.getSelectedItem();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            isLeapYear = true;
        
        dateComboBox.removeAllItems();
        for (int i = 0; i < 28; ++i)
        {
           dateComboBox.addItem("" + i);
        }
        if (selectedMonth == "January" || selectedMonth == "March" ||selectedMonth == "May" ||selectedMonth == "July" || selectedMonth == "August" ||selectedMonth == "October" ||selectedMonth == "December")
        {
           dateComboBox.addItem("29");
           dateComboBox.addItem("30");
           dateComboBox.addItem("31");
        } else if (selectedMonth == "February" && isLeapYear)
        {
            dateComboBox.addItem("29");
        } else   
        {
           dateComboBox.addItem("29");
           dateComboBox.addItem("30");
        }
            
           
  
    }//GEN-LAST:event_dateComboBoxActionPerformed

    private void timeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(EventrEventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventrEventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventrEventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventrEventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventrEventsForm().setVisible(true);
            }
        });
    }
    
   

    private void slideEventPanel(boolean right)
    {
        int startX = SwipingPanel.getX();
        int endX = 300; // Ending x-coordinate of the panel
        int step = 5; // How much to move in each step
        int delay = 20; // Delay between steps in milliseconds
        
        DislikePanel.setVisible(true);
        LikePanel.setVisible(true);
       if (right)
       {
          DislikePanel.setVisible(false);
       } else
       {
           LikePanel.setVisible(false);
       }
           
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double x = 0;
           int extratime = 0;
          
          public void run()
          {
              extratime += 1;
              if (right)
              {
                x += 2.5;
              }else
              {
                  x -= 2.5;
              }
         
              x *= 1.045;
              
              if (startX + x >= 450 || startX + x < -450)
              {
                
               if (extratime >= 150)
               {
                  displayEvent();
                  timer.cancel();
                   
                  animateUp(); 
                    
               }
          
              } else
              {
                  
                  SwipingPanel.repaint();
                  SwipingPanel.setLocation((int)(startX + x), SwipingPanel.getY());
              
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
    }
    
    
    private void animateUp()
    {
        SwipingPanel.setLocation(0, 800);
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double y = 0;
           int extratime = 0;
          
          public void run()
          {
              extratime += 1;
              y += 2.5;
         
              y *= 1.045;
              
              if (800 - y <= 0)
              {
      
                  SwipingPanel.setLocation(0, 0);
                   timer.cancel();
                   inTransition = false;
                    
                   
              } else
              {
                 
                  SwipingPanel.repaint();
               
                 SwipingPanel.setLocation(0, (int)(800-y));
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
             
    }
    
    
    private void settingsPanelSlideRight(boolean right)
    {
        int startX = LeftSettingsPanel.getX();
        int endX = 300; // Ending x-coordinate of the panel
        int step = 5; // How much to move in each step
        int delay = 20; // Delay between steps in milliseconds
        
       
         
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double x = 0;
           int extratime = 0;
     
          public void run()
          {
              extratime += 1;
              if (extratime > 50){
              if (right)
              {
                x += 2.5;

              }else
              {
                  x -= 2.5;
              }
         
              x *= 1.045;
              
              if (startX + x >= 0 || startX + x < -400)
              {
       
                  timer.cancel();
                  inTransition = false;
                  if (right)
                  {
                      LeftSettingsPanel.setLocation(0, LeftSettingsPanel.getY());
                  }
           
                  
              } else
              {
             
                    LeftSettingsPanel.setLocation((int)(startX + x), LeftSettingsPanel.getY());
              
              }
          }}
         };
         timer.scheduleAtFixedRate(task, 0, 5);
    }
  
     private void settingsUp()
    {
        int yConstraint = 320;
   
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double y = 0;
    
          
          public void run()
          {
        
              y += 1;
         
              y *= 1.045;
              
          
              if (800 - y <= yConstraint)
              {
      
                  ExtraSettingsPanel.setLocation(0, yConstraint);
                   timer.cancel();
                   inTransition = false;
                   
              } else
              {
                 
                  ExtraSettingsPanel.repaint();
               
                 ExtraSettingsPanel.setLocation(0, (int)(800-y));
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
              
    }
     
     private void settingsDown()
    {
        int yConstraint = 800;
        
       
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double y = 0;
     int currentY = ExtraSettingsPanel.getY();
          
          public void run()
          {
           
              y += 1;
         
              y *= 1.045;
              
              if (currentY + y >= yConstraint)
              {
      
                  ExtraSettingsPanel.setLocation(0, yConstraint);
                   timer.cancel();
                   downTriangleImage.setVisible(false);
                    inTransition = false;
                   
              } else
              {
                 
                  ExtraSettingsPanel.repaint();
               
                 ExtraSettingsPanel.setLocation(0, (int)(currentY + y));
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
         
        
             
    }
    

    private void CreatePanelSlideUp() 
    {
         int yConstraint = 0;
   
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double y = 0;
    
          
          public void run()
          {
        
              y += 1;
         
              y *= 1.045;
              
          
              if (800 - y <= yConstraint)
              {
      
                  createPanel.setLocation(0, yConstraint);
                   timer.cancel();
                   inTransition = false;
                   settingsPanelSlideRight(false);
                   
                   AboutTextInput.setEditable(true);
                   
              
                   whereTextInput.setEditable(true);
                  
                   
              } else
              {
                 
                  createPanel.repaint();
               
                 createPanel.setLocation(0, (int)(800-y));
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
    }
    
    private void CreatePanelSlideDown() 
    {
       
        int yConstraint = 800;
   
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double y = 0;
    
          
          public void run()
          {
        
              y += 1;
         
              y *= 1.045;
              
          
              if (y >= yConstraint)
              {
      
                  createPanel.setLocation(0, 800);
                   timer.cancel();
                   inTransition = false;
                   settingsPanelSlideRight(false);
                   
                   AboutTextInput.setEditable(true);
    
                   whereTextInput.setEditable(true);
                   titleTextInput.setEditable(true);
                   
                   
                   
              } else
              {
                 
                  createPanel.repaint();
               
                 createPanel.setLocation(0, (int)(y));
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
    }
  
  
      private void AddedPanelSlideUp() 
    {
         int yConstraint = 0;
   
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double y = 0;
    
          
          public void run()
          {
        
              y += 1;
         
              y *= 1.045;
              
          
              if (800 - y <= yConstraint)
              {
      
                  AddedEvents.setLocation(0, yConstraint);
                   timer.cancel();
                   inTransition = false;
                   settingsPanelSlideRight(false);
                   
                   
                   
              } else
              {
                 
                  AddedEvents.repaint();
               
                 AddedEvents.setLocation(0, (int)(800-y));
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
    }
    
    
    
 private void AddedPanelSlideDown() 
    {
        int yConstraint = 800;
   
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double y = 0;
    
          
          public void run()
          {
        
              y += 1;
         
              y *= 1.045;
              
          
              if (y >= yConstraint)
              {
      
                  AddedEvents.setLocation(0, 800);
                   timer.cancel();
                   inTransition = false;
                   settingsPanelSlideRight(false);
                   
                   
                   
                   
              } else
              {
                 
                  AddedEvents.repaint();
               
                 AddedEvents.setLocation(0, (int)(y));
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
    }
  


private void TitleSlideDown() 
    {
        int yConstraint = 800;
   
        Timer timer = new Timer();
        
         TimerTask task = new TimerTask()
         {
           double y = 0;
    
          
          public void run()
          {
        
              y += 1;
         
              y *= 1.045;
              
          
              if (y >= yConstraint)
              {
      
                  titlePanel.setLocation(0, 800);
                   timer.cancel();
                   inTransition = false;
                   titlePanel.setVisible(false);
       titleBackground.setEnabled(false);
       titleBackground.setVisible(false);
       titleButton.setEnabled(false);
       titleButton.setVisible(false);
   
                 
                   
                   
                   
              } else
              {
                 
                  titlePanel.repaint();
               
                 titlePanel.setLocation(0, (int)(y));
              }
          }
         };
         timer.scheduleAtFixedRate(task, 0, 5);
    }
  


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AboutTextInput;
    private javax.swing.JTextArea AboutUsTextArea;
    private javax.swing.JPanel AddedEvents;
    private javax.swing.JLabel BannerImage;
    private javax.swing.JLabel DislikeButton;
    private javax.swing.JLabel DislikePanel;
    private javax.swing.JLabel EventImage;
    private javax.swing.JLabel EventLocationLabel;
    private javax.swing.JLabel EventTimeLabel;
    private javax.swing.JLabel EventTitleLabel;
    private javax.swing.JPanel EventsAddedPanel;
    private javax.swing.JLabel EventsAddedTitle;
    private javax.swing.JLayeredPane ExtraSettingsPanel;
    private javax.swing.JPanel LeftSettingsPanel;
    private javax.swing.JLabel LikeButton;
    private javax.swing.JLabel LikePanel;
    private javax.swing.JLabel SeeAddedEvents;
    private javax.swing.JLabel SeeEventsLabel;
    private javax.swing.JPanel SwipingPanel;
    private javax.swing.JTextArea WhenTextArea;
    private javax.swing.JTextArea WhereTextArea;
    private javax.swing.JLabel aboutUsLabel;
    private javax.swing.JLabel addEvent;
    private javax.swing.JPanel clickBlocker;
    private javax.swing.JLabel createBackgroundPanel;
    private javax.swing.JPanel createButton;
    private javax.swing.JPanel createPanel;
    private javax.swing.JComboBox<String> dateComboBox;
    private javax.swing.JLabel downTriangleImage;
    private javax.swing.JScrollPane eventScrollPane;
    private javax.swing.JLabel geoTagImage;
    private javax.swing.JLabel gradient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftSettingsTextTile;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JLabel settingsIcon;
    private javax.swing.JPanel settingsInnerPanel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel settingsLabel1;
    private javax.swing.JComboBox<String> timeComboBox;
    private javax.swing.JLabel timeIconImage;
    private javax.swing.JLabel titleBackground;
    private javax.swing.JLabel titleButton;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField titleTextInput;
    private javax.swing.JPanel upLoadButton;
    private javax.swing.JLabel upTri;
    private javax.swing.JLabel whenLabel1;
    private javax.swing.JLabel whereLabel;
    private javax.swing.JTextField whereTextInput;
    private javax.swing.JPanel whiteSpace;
    private javax.swing.JPanel whiteSpace2;
    private javax.swing.JPanel whiteSpace3;
    private javax.swing.JPanel whiteSpace4;
    private javax.swing.JPanel whitespace;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
   
   
    public void updateEventList()
    {
        EventsAddedPanel.removeAll();
         
       EventsAddedPanel.setPreferredSize(new Dimension(400, 0));
       
        
     
       int totalHeight = 0;
       
       for (int i = 0; i < eventList.size(); ++i)
       {
           if (eventList.get(i).getLiked())
           {
               
               totalHeight += 325;
               addEventToPanel(eventList.get(i));
           }
       }
       
     
     EventsAddedPanel.setPreferredSize(new Dimension(400, totalHeight));
               
      
    }
    
    
    
    private void addEventToPanel(Events addedEvent)
    {
       Font titleFont = new Font("PingFang HK",Font.BOLD, 35);
        Font dateFont = new Font("PingFang HK",Font.PLAIN, 20);
       
       javax.swing.JLabel eventTitle = new javax.swing.JLabel("");
       javax.swing.JLabel eventDate = new javax.swing.JLabel("");
       javax.swing.JLabel eventPhoto = new javax.swing.JLabel("");
       
       eventTitle.setText(addedEvent.getTitle());
       eventDate.setText(addedEvent.getWhen());
       eventPhoto.setIcon(new javax.swing.ImageIcon((addedEvent.getImage()))); 
       

       eventTitle.setPreferredSize(new Dimension(350,50));
       eventTitle.setFont(titleFont);
       eventTitle.setForeground(new Color(102,102,255));
       eventTitle.setVerticalAlignment(javax.swing.JLabel.TOP);
        
       eventDate.setPreferredSize(new Dimension(350,50));
       eventDate.setFont(dateFont);
       eventDate.setForeground(new Color(102,102,255));
       eventDate.setVerticalAlignment(javax.swing.JLabel.TOP);
       
       eventPhoto.setPreferredSize(new Dimension(350,200));
        
     
       EventsAddedPanel.add(eventPhoto);
       EventsAddedPanel.add(eventTitle);
       EventsAddedPanel.add(eventDate);
       
       
   
    }
          
    
    
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        
       
     
        if (inTransition)
        {
            
        }
        else if (e.getSource() == LikeButton) {
               
         
            
            eventList.get(eventIndex).setLiked(true);
            
            slideEventPanel(true);
               inTransition = true;
               
               
               eventIndex+= 1;
        if(eventIndex >= eventList.size())
        {
            eventIndex = 0;
        }
               
        updateEventList();
               
        } else if (e.getSource() == DislikeButton)
        {     
            
         
         eventList.get(eventIndex).setLiked(false);
         
         eventIndex+= 1;
        if(eventIndex >= eventList.size())
        {
            eventIndex = 0;
        }
        
        updateEventList();
        
         slideEventPanel(false);
         inTransition = true;
       
     
        } else if (e.getSource() == upTri)
        {
             downTriangleImage.setVisible(true);
              inTransition = true;
        settingsUp();
        } else if (e.getSource() == downTriangleImage)
        {
            inTransition = true;
            settingsDown();
        } else if (e.getSource() == settingsIcon)
        {
           inTransition = true;
           if (ExtraSettingsPanel.getY() < 650)
            {settingsDown();}
          
           if (LeftSettingsPanel.getX() > -10)
           {
                 settingsPanelSlideRight(false);
           }
           else
           {  
               settingsPanelSlideRight(true);
           }
           
         
           
           
           
        }
        else if (e.getSource() == leftSettingsTextTile)
        {
        
        inTransition = true;
        settingsPanelSlideRight(false);
         

          
        } else if( e.getSource() == addEvent)
   {
       
       if (createPanel.getY() > 600)
       {
           inTransition = true;
           CreatePanelSlideUp(); }
       
   } else if (e.getSource() == clickBlocker)
   {
       
   }
        else if (e.getSource() == createButton)
   {
       Events newEvent = new Events(titleTextInput.getText());
       
      
       newEvent.setTime((String)timeComboBox.getSelectedItem());
       newEvent.setDay((Integer)dateComboBox.getSelectedItem());
       newEvent.setYear((Integer)yearComboBox.getSelectedItem());
       newEvent.setMonth((String)monthComboBox.getSelectedItem());
       
       
       
       newEvent.setWhere(whereTextInput.getText());
       newEvent.setAbout(AboutTextInput.getText());
       newEvent.setImage(uploadedImagePath);
       
        titleTextInput.setText("Enter Here");
        whereTextInput.setText("Enter Here");
       
        AboutTextInput.setText("Enter Here");
       
       eventList.add(newEvent);
     
       
      inTransition = true;
      CreatePanelSlideDown();
       
       
   } else if (e.getSource() == upLoadButton)
   {  
       //Upload photo
       javax.swing.JFileChooser fileChooser = new JFileChooser();
      
       int result = fileChooser.showOpenDialog(this);
       
       File selectedFile = fileChooser.getSelectedFile();
        String filePath = selectedFile.getAbsolutePath();
        uploadedImagePath = filePath;
        
        
   }else if (e.getSource() == SeeEventsLabel)
   {
       
       if (createPanel.getY() < 600)
       {
         
           inTransition = true;
           CreatePanelSlideDown();
       } 
       if (AddedEvents.getY() < 600)
       {
         
           inTransition = true;
           AddedPanelSlideDown();
       }
       
       
       
    }else if (e.getSource() ==   SeeAddedEvents)
   {
      
       
       if (createPanel.getY() < 600)
       {
         
           inTransition = true;
           CreatePanelSlideDown();
       } 
       if (AddedEvents.getY() > 200)
       {
         
         inTransition = true;
         AddedPanelSlideUp(); 
       }
    
   } else if (e.getSource() ==    titleButton)
   {
       inTransition = true;
       TitleSlideDown();
       
   }

    }
    

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
       
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
     
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
