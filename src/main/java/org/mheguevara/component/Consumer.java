package org.mheguevara.component;

import com.rabbitmq.client.Channel;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 * Created with IntelliJ IDEA.
 * User: muhammet
 * Date: 11/30/12
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Consumer implements ChannelAwareMessageListener{

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        Msisdn msisdn = objectMapper.readValue(message.getBody(),Msisdn.class);
        System.out.println(msisdn);
        rabbitTemplate.send("",message.getMessageProperties().getReplyTo(),message);
    }
}
