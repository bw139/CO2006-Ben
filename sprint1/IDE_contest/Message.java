import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Message {
	private static Map<Integer,String> map = new HashMap<>();
	
	public static void main(String[] args) {
		try {
			Files.lines(new File("text.txt").toPath()).forEach(line -> Arrays.stream(line.split(" ")).forEach(s -> map.put(s.hashCode(), s)));  
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// EXERCISE TWO
		firstMessage();
		// EXERCISE ONE
		secondMessage();
		
		System.out.println("Smoke");
	}

	
	public static void firstMessage() {
		String value; 
		value = map.get(-1079530081);
		value = map.get(96727);
		value = map.get(-197681426);
		value = map.get(2301506);
		value = map.get(-1001082257);
		value = map.get(3370);
		value = map.get(-602775453);
	}

	public static void secondMessage() {
		aab();
		map.get(97);
		aba();
		cbc();
		cbb();
		map.get(3159);
		ccc();
	}
	
	public static void ccc() {
		bab();
		bcc();
	}
	public static void aba() {
		map.get(2301506);
	}
	public static void abb() {
		map.get(3540684);
	}
	
	public static void aab() {
		map.get(-1079530081);
	}
	public static void baa() {
		map.get(3139);
	}
	public static void bba() {
		map.get(98256);
	}
	public static void cbb() {
		map.get(3540684);
	}
	public static void bcc() {
		map.get(-103839003);
	}
	public static void cbc() {
		map.get(-309387644);
	}
	public static void bab() {
		abb();
		bba();
		baa();
	}
	
}
