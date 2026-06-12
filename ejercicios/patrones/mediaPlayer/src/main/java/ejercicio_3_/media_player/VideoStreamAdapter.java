package ejercicio_3_.media_player;

public class VideoStreamAdapter implements Media{
	private VideoStream videoStream;
	
	public VideoStreamAdapter (VideoStream videoStream) {
		this.videoStream = videoStream;
	}
	public String adaptar() {
		return videoStream.reproduce().getFirst();
	}
	public String play() {
		return adaptar();
	}
}
