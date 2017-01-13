package com.wills.MQTT;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wills.Constants;

/**
 * Created by qasim on 29/12/15.
 */
@Configuration
public class MqttConfiguration {
    @Bean
    public MqttTemplate mqttTemplate() throws MqttException {
        MqttTemplate mqttTemplate = new MqttTemplate(Constants.FD_MQTT_SERVER_URL);
        mqttTemplate.connect(MqttTemplate.defaultOptions());
        System.out.println("Mqtt connected with mqtt broker at url : "+Constants.FD_MQTT_SERVER_URL + "withid : "+  mqttTemplate.getClientId());
        mqttTemplate.setCallback(new TestCallBack());
        mqttTemplate.subscribe(Constants.FD_MQTT_WEB_TOPIC);
        System.out.println("Mqtt connected listening topic : "+Constants.FD_MQTT_WEB_TOPIC);
        return mqttTemplate;
    }
  
}
