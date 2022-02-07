package music;

import java.util.Scanner;

public class Game extends Thread {
	MusicInfo musicInfo;
	Scanner sc = new Scanner(System.in);
	int grade = 0; // 점수

	public Game(MusicInfo musicInfo) {
		this.musicInfo = musicInfo;
		gameStart();
	}

	public void gameStart() {
		System.out.println(musicInfo.songHint);
		System.out.println(musicInfo.singerHint);
		while (true) {
			String songName = sc.nextLine();
			if (musicInfo.song.equalsIgnoreCase(songName)) {
				grade++; // 점수
				System.out.print("점수올랐다 >>" + grade);
				
				break;
			}

		}
		System.out.println(musicInfo.path);
	}
}
