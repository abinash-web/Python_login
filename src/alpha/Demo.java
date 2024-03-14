package alpha;

import org.apache.logging.log4j.*;


public class Demo {
	private static Logger log =LogManager.getLogger(Demo.class.getName());

	
	public static void main(String[] args)
	{
		
		log.debug("i  have clicked on button");
		log.info("Buttom is displayed");
		log.error("buttom is not displayed");
		log.fatal("buttom is missing");

       }
	}


