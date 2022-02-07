package main;

import java.io.IOException;

import music.JSONMusicParser;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello World!");
		// System.out.println("Bye");

		// JSONMusicParser parser = new JSONMusicParser();
		try {
			new JSONMusicParser();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
