package com.donghai.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 游戏主类
 */
public class Game implements ActionListener 
{
	private static final int SCREEN_W = 600;
	private static final int SCREEN_H = 600;
	private JFrame frame;
	private int game_delay = 60;
	private Rander rander;
	private BomMan man;
	
	public Game() 
	{
		setUpWindow();
		start();
	}
	
	/**
	 * 游戏启动
	 */
	public void start()
	{
		init();
		
		System.out.println("Game start...");
		//启动游戏线程
		new Timer(game_delay,this).start();
	}
	
	/**
	 * 游戏初始化
	 */
	public void init()
	{
		System.out.println("Game init...");
		
		
	}
	
	public void setUpWindow()
	{
		frame = new JFrame("BomMan");
		frame.setSize(SCREEN_W, SCREEN_H);
		frame.setDefaultCloseOperation(3);
		rander = new Rander();
		frame.add(rander);
		frame.setVisible(true);
	}

	/**
	 * 游戏逻辑
	 */
	private void deal() 
	{
		
	}
	
	/**
	 * 游戏绘画
	 * @param g 画笔对象
	 */
	private void draw(Graphics2D g)
	{
		//绘画背景
		Color c = g.getColor();
		g.setColor(Color.GREEN.darker());
		g.fillRect(0, 0, SCREEN_W, SCREEN_H);
		g.setColor(c);
		
	}
	
	/**
	 * 游戏主线程
	 * 负责更新逻辑绘画
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		deal();
		rander.repaint();
	}
	
	
	
	private class Rander extends JPanel
	{
		@Override
		public void paint(Graphics g) 
		{
			super.paint(g);
			draw((Graphics2D) g);
		}
	}
}
