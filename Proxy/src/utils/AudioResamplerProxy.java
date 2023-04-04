package utils;

import java.util.HashMap;
import java.util.Map;

public class AudioResamplerProxy implements Resampler {

	private Map<String, int[]> resamplingCache = new HashMap<>();
	private AudioResampler resampler = new AudioResampler();

	@Override
	public int[] process(int[] samples, double sampleRate) {
		String cacheKey = getCacheKey(samples, sampleRate);
		int[] cachedSamples = this.resamplingCache.get(cacheKey);
		
		if (cachedSamples != null) {
			System.out.println("Pulling entry " + cacheKey + " from the cache");
			return cachedSamples;
		} else {
			System.out.println("Resampling entry " + cacheKey);
			int[] resampledSamples = resampler.process(samples, sampleRate);
			this.resamplingCache.put(cacheKey, resampledSamples);
			return resampledSamples;
		}
	}
	
	private String getCacheKey(int[] samples, double sampleRate) {
		// Use sum of samples and sample rate as cache key
		int sum = 0;
		for (int i = 0; i < samples.length; i++) {
			sum += samples[i];
		}
		return sum + "_" + sampleRate;
	}

}
