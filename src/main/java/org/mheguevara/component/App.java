package org.mheguevara.component;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: muhammet
 * Date: 11/30/12
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class App {

    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
    }
}
