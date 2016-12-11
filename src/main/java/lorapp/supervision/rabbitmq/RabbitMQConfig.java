package lorapp.supervision.rabbitmq;

import java.util.Date;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@RabbitListener(queues = {"rawdata"})
@Component
public class RabbitMQConfig {
	
	@Value("${lora.rawdata.exchange}")
	private String exch;

	@Bean
	public TopicExchange myExchange() {
		return new TopicExchange(exch, true, false);
	}

	@Bean
	public Queue myQueue() {
		return new Queue("rawdata", true);
	}

	@Bean
	public Binding myExchangeBinding(TopicExchange exchange, Queue queue) {
		return BindingBuilder.bind(queue).to(exchange).with("#.#");
	}
	
	@RabbitHandler
	public void onMessage(@Payload String foo) {
		System.out.println(" >>> " + new Date() + ": " + foo);
	}

}
