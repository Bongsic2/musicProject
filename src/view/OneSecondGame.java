package view;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OneSecondGame extends JFrame{
	private Image screenImage;
	private Graphics screenGraphic;
	private Image background = new ImageIcon(GameMain.class.getResource("playBackground.jpg")).getImage();
	
	private ImageIcon ExitBtn = new ImageIcon(GameMain.class.getResource("ExitButton.png"));
	private ImageIcon ExitBtnMouseOver = new ImageIcon(GameMain.class.getResource("ExitButtonMouseOver.png"));
	private JLabel menuBar = new JLabel(new ImageIcon(GameMain.class.getResource("MenuBar.png")));
	private JButton exitButton = new JButton(ExitBtn);
	private int mouseX, mouseY;
	
	private ImageIcon NextBtn = new ImageIcon(GameMain.class.getResource("NextButton.png"));
	private ImageIcon NextBtnMouseOver = new ImageIcon(GameMain.class.getResource("NextButtonMouseOver.png"));
	private ImageIcon PlayMusicBtn = new ImageIcon(GameMain.class.getResource("PlayMusicBtn.png"));
	private ImageIcon PlayMusicBtnMouseOver = new ImageIcon(GameMain.class.getResource("PlayMusicBtnMouseOver.png"));
	private ImageIcon SingerHintBtn = new ImageIcon(GameMain.class.getResource("SingerHintBtn.png"));
	private ImageIcon SingerHintBtnMouseOver = new ImageIcon(GameMain.class.getResource("SingerHintBtnMouseOver.png"));
	private ImageIcon SongHintBtn = new ImageIcon(GameMain.class.getResource("SongHintBtn.png"));
	private ImageIcon SongHintBtnMouseOver = new ImageIcon(GameMain.class.getResource("SongHintBtnMouseOver.png"));
	
	private JButton NextButton = new JButton(NextBtn);
	private JButton PlayMusicButton = new JButton(PlayMusicBtn);
	private JButton SingerHintButton = new JButton(SingerHintBtn);
	private JButton SongHintButton = new JButton(SongHintBtn);

	private JTextField Enter = new JTextField(10);
	private JLabel label = new JLabel();
	
	public OneSecondGame() {
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(GameMain.SCREEN_WIDTH, GameMain.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
				try {
					Thread.sleep(100);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(ExitBtnMouseOver);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(ExitBtn);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		add(exitButton);

		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);
		
		NextButton.setBounds(1100, 570, 120, 120);
		NextButton.setBorderPainted(false);
		NextButton.setContentAreaFilled(false);
		NextButton.setFocusPainted(false);
		NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
				NextButton.setIcon(NextBtnMouseOver);
				NextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				NextButton.setIcon(NextBtn);
				NextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		PlayMusicButton.setBounds(80, 60, 120, 120);
		PlayMusicButton.setBorderPainted(false);
		PlayMusicButton.setContentAreaFilled(false);
		PlayMusicButton.setFocusPainted(false);
		PlayMusicButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
				PlayMusicButton.setIcon(PlayMusicBtnMouseOver);
				PlayMusicButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PlayMusicButton.setIcon(PlayMusicBtn);
				PlayMusicButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		SingerHintButton.setBounds(50, 250, 300, 81);
		SingerHintButton.setBorderPainted(false);
		SingerHintButton.setContentAreaFilled(false);
		SingerHintButton.setFocusPainted(false);
		SingerHintButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
				SingerHintButton.setIcon(SingerHintBtnMouseOver);
				SingerHintButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SingerHintButton.setIcon(SingerHintBtn);
				SingerHintButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		SongHintButton.setBounds(50, 350, 300, 81);
		SongHintButton.setBorderPainted(false);
		SongHintButton.setContentAreaFilled(false);
		SongHintButton.setFocusPainted(false);
		SongHintButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Music buttonSound = new Music("ButtonSound.mp3", false);
				buttonSound.start();
				SongHintButton.setIcon(SongHintBtnMouseOver);
				SongHintButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SongHintButton.setIcon(SongHintBtn);
				SongHintButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		
		Enter.setBounds(500, 500, 300, 81);
		Font font = new Font("Courier", Font.BOLD,25);
		Enter.setFont(font);
		
		add(NextButton);
		add(PlayMusicButton);
		add(SongHintButton);
		add(SingerHintButton);
		add(label);
		add(Enter);
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(GameMain.SCREEN_WIDTH, GameMain.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
}
