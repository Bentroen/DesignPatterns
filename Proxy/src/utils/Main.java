package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Resampler resampler = new AudioResamplerProxy();
		
		int[] sound1 = new int[]{93487, 81236, 13894};
		int[] sound2 = new int[]{60485, 38482, 28134, 92305, 82384};
		int[] sound3 = new int[]{29485, 10485, 32768, 49240, 29458, 80394, 95024};
		
		List<int[]> sounds = new ArrayList<>();
		sounds.add(sound1);
		sounds.add(sound2);
		sounds.add(sound3);
		
		List<Double> sampleRates = new ArrayList<>();
		sampleRates.add(0.5);
		sampleRates.add(0.75);
		sampleRates.add(1.25);
		sampleRates.add(1.5);
		sampleRates.add(2.0);
		
	    for (int i = 0; i < 50; i++) {
	    	// Resample a random sound at a random sampling rate chosen from the list
		    Random rand = new Random();
		    int randomId = rand.nextInt(sounds.size());
		    int[] sound = sounds.get(randomId);
		    
		    int randomSampleRateId = rand.nextInt(sampleRates.size());
		    double sampleRate = sampleRates.get(randomSampleRateId);
		    
		    resampler.process(sound, sampleRate);
	    }
	    
	}
	
}
