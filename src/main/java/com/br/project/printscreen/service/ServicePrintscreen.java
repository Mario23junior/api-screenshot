package com.br.project.printscreen.service;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

@Service
public class ServicePrintscreen {

	public void printscreean(Integer x, Integer y, Integer f, Integer t, String format) {
		try {
			Robot robot = new Robot();
			BufferedImage img = robot.createScreenCapture(new Rectangle(f, t, x, y));
			ImageIO.write(img, format, new File("img/imgnew"));
		} catch (Exception e) {
		}

	}
}
