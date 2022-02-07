package music;

public class MusicInfo {
	String ip;
	String song;
	String singer;
	String path;

	public MusicInfo(String ip, String song, String singer, String path) {
		this.ip = ip;
		this.song = song;
		this.singer = singer;
		this.path = path;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return ip + ", " + song + ", " + singer + ", " + path;
	}

}
