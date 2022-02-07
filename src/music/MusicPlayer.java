package music;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MusicPlayer {
	public static String musicjsonpath = "C:\\Users\\이름\\eclipse-workspace\\music\\src\\music\\song_json_data.json";
	Random random = new Random();
	int n = random.nextInt(10);
	MusicInfo musicPath;
	ArrayList<MusicInfo> listInfo = new ArrayList<>();
	ArrayList<Integer> songRandomIntList = new ArrayList<Integer>();
	int rand;

	MusicPlayer() {
		listInfo = initializeMusic();
		songRandom();
		randomNumber();
	}

	public void randomNumber() {
		for (int i = 0; i < songRandomIntList.size(); i++) {
			getMusicListInfo().get(songRandomIntList.get(i));
			musicPath = getMusicListInfo().get(songRandomIntList.get(i));
			// musicStart();
			musicStart();
			new Game(musicPath);
		}
		// 숫자 10개 돌면 게임 끝
		System.out.println("게임 끝");

	}

	public synchronized ArrayList<MusicInfo> initializeMusic() {
		JSONMusicParser parser = new JSONMusicParser();
		JSONArray array = parser.getJsonArray(musicjsonpath);
		ArrayList<MusicInfo> musicInfo = new ArrayList<MusicInfo>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject musicObject = (JSONObject) array.get(i);
			String ip = musicObject.get("ip").toString();
			String song = musicObject.get("song").toString();
			String singer = musicObject.get("singer").toString();
			String path = musicObject.get("path").toString();
			musicInfo.add(new MusicInfo(ip, song, singer, path));
		}
		return musicInfo;
	}

	public ArrayList<MusicInfo> getMusicListInfo() {
		if (listInfo == null) {
			listInfo = initializeMusic();
		}
		return listInfo;
	}

	public void restartMusic() {
		songRandomIntList.clear();
	}

	public void musicStart() {
		File musicFile = new File(musicPath.path);
		try {
			AudioInputStream b = AudioSystem.getAudioInputStream(musicFile);
			Clip c = AudioSystem.getClip();
			c.open(b);
			c.start();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void songRandom() {
		rand = getMusicListInfo().size();
		while (songRandomIntList.size() != 10) {
			int randomInt = (int) (Math.random() * rand);
			if (!songRandomIntList.contains(randomInt)) {
				songRandomIntList.add(randomInt);
			}
		}
	}
}