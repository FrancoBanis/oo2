package ejercicio_3_.media_player;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MediaTest {
	
	Audio audio;
	VideoFile videoFile;
	VideoStream videoStream;
	VideoStreamAdapter videoStreamAdapter;
	@BeforeEach
	void setUp() throws Exception {
		audio = new Audio();
		videoFile = new VideoFile();
		videoStream = new VideoStream();
		videoStreamAdapter = new VideoStreamAdapter(videoStream);
	}
	
	@Test
	public void testAudio() {
		assertEquals("Reproduciendo audio...",audio.play());
	}
	@Test
	public void testVideoFile() {
		assertEquals("Reproduciendo video...",videoFile.play());
	}
	@Test
	public void testVideoStreamAdapter() {
		assertEquals("Reproduciendo VideoStream...",videoStreamAdapter.play());
	}
}
