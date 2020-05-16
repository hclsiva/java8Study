package study.logger.util;

public class LOG {
	public static enum LEVEL {INFO, DEBUG,WARN};
	public static LEVEL CURRENT_LEVEL =LEVEL.INFO;
	
	public static void log(Object o) {
		if(o instanceof Throwable) {
			((Throwable)o).printStackTrace();
		}else {
			System.out.println(o);
		}
	}
	

}
