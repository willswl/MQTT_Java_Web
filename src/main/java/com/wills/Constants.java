package com.wills;

/**
 * Created by qasim on 29/12/15.
 */
public abstract class Constants {
    //public static final String FD_MQTT_SERVER_URL = "tcp://192.168.254.130:1883";
	//public static final String FD_MQTT_SERVER_URL = "tcp://10.120.10.49:1883";
	//public static final String FD_MQTT_SERVER_URL = "http://127.0.0.1:15674/stomp";
	public static final String FD_MQTT_SERVER_URL = "tcp://192.168.254.130:2883";
    public static final String FD_MQTT_WEB_TOPIC = "/World_Web";
    public static final String FD_MQTT_NATIVE_TOPIC = "/World_Native";
    public static final int FD_MQTT_QOS = 1;
}
