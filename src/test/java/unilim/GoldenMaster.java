package unilim;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class GoldenMaster {
	
	
	public String getGameResult(long seed){
		ByteArrayOutputStream consoleStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(consoleStream);
		System.setOut(printStream);
		GameRunner.play(new Random(seed));
		
		return consoleStream.toString();
	}
	
	public void generateGoldenMaster() throws IOException {
		FileUtils.writeStringToFile(new File("goldenMasterData.txt"), getGameResult(0), "UTF-8");
	}

}
