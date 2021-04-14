package com.sleeperresponder.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class Utils {

    public static Logger LOGGER;

    enum LOGTYPE{INFO,WARNING,ERROR}

    public static void initLogger(){
        LOGGER = LoggerFactory.getLogger(Utils.class);

        logInfo("Logger-ready");
    }

    public static void log(LOGTYPE type, String message) {
        switch (type){

            case INFO:
                logInfo(message);
                break;
            case WARNING:
                logWarning(message);
                break;
            case ERROR:
                logError(message);
                break;
            default:

        }
    }

    public static void logInfo(String message){
        LOGGER.info(message);
    }

    public static void logWarning(String message){
        LOGGER.warn(message);
    }

    public static void logError(String message){
        LOGGER.error(message);
    }




}

