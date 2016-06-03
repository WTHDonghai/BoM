package com.donghai.game;

import java.awt.Rectangle;

public class BomMan extends Rectangle
{
	/**
	 * 制定行和列初始化英雄
	 * @param row
	 * @param col
	 */
	public BomMan(int row,int col)
	{
		//英雄所在的宽和高
		this.width = 32;
		this.height = 32;
		//初始化英雄所在地图的x,y坐标
		this.x = row*height;
		this.y = col*row;
	}
	
	
	
	

}
