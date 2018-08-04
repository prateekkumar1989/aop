package runner;

import org.apache.commons.lang3.RandomUtils;

public class AopRunner {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(RandomUtils.nextInt() % 100);
		}

	}

}
