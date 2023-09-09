package com.gpcoder.patterns.behavioral.strategy.compression;

import java.io.File;
import java.util.List;

public interface CompressionStrategy {
	
	void compressFiles(List<File> files);
}
