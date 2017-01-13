package com.wills;

import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wills.MQTT.MqttTemplate;

/**
 * Created by qasim on 29/12/15.
 */

@RestController
@RequestMapping("/api/test")
public class MyController {

    @Autowired
    MqttTemplate mqttTemplate;
    

    @RequestMapping("/service")
    public String testService() throws MqttException {
        String mqttMsg = "Hello Web";
        MqttMessage message = new MqttMessage(mqttMsg.getBytes());
        message.setQos(Constants.FD_MQTT_QOS);
        message.setRetained(true);
        mqttTemplate.publish(Constants.FD_MQTT_NATIVE_TOPIC, message);
        
        return "success";
    }
    /*@RequestMapping("/query2")
    public String query2() throws MqttException {
    	//MqttTopic str = mqttTemplate.getTopic("4");
    	MqttTopic str2 = mqttTemplate.getTopic(Constants.FD_MQTT_TOPIC+2);
    	
    	mqttTemplate.sub
    	mqttTemplate.getTopic(Constants.FD_MQTT_TOPIC).;
		return str2==null?"blank":str2.getName();
        
    }*/
    
}
