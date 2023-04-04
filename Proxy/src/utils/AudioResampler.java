package utils;

public class AudioResampler implements Resampler {
	
	public int[] process(int[] samples, double sampleRate) {		
		// Resampling is an expensive operation
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return samples;
	}
	
}
