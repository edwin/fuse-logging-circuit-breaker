package com.edw.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *     com.edw.handler.LogHandler
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 10 Jul 2020 00:06
 */
@Component("logHandler")
public class LogHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void logTimestamp(long timestamp) {
        logger.debug("time needed {} ms", System.currentTimeMillis() - timestamp);
    }

    public void logError(String error) {
        logger.debug("error at {}", error);
    }

}
