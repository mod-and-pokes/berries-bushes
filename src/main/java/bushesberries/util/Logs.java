package bushesberries.util;

import bushesberries.Reference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Willi on 7/6/2017.
 */
public class Logs
{
	private static org.apache.logging.log4j.Logger logger;

	public static Logger getLogger()
	{
		if (logger == null)
			logger = LogManager.getFormatterLogger(Reference.MOD_ID);
		return logger;
	}
}
