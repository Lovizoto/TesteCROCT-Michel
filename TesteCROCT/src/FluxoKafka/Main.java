package FluxoKafka;


import java.util.Date;

import java.util.Properties;
import java.util.Random;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import ExtractAPI.ClsDataByIp;
import ExtractAPI.WebServiceAbstractAPI;
import Model.ClsOutput;
import Serializer.OutputSerializer;

public class Main {

	private static Random rand = new Random();

	public static void main(String[] args) {

		/**
		 * Envio de Mensagens utilizei um localhost genérico para configuração de envio
		 * de mensagens
		 * 
		 * É possível passar fazer a própria conversão do json para bytes, como o output era algo específico,
		 * fiz um serializer convertendo minha classe ClsOutput em um json e depois para bytes para envio de
		 * mensagens no kafka
		 * 
		 */

		Properties prop = new Properties();
		prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, OutputSerializer.class.getName());

		try {

			KafkaProducer<String, ClsOutput> producer = new KafkaProducer<String, ClsOutput>(prop);
			
			//Iterador de 1 a 30, podendo ser utilizado um while true no caso
			for (int i = 1; i < 30; i++) {

				ClsOutput data = dataIp(i, unixTime(), IPgenerator());
				ProducerRecord<String, ClsOutput> record = new ProducerRecord<String, ClsOutput>("teste-croct", data);
				producer.send(record);
			}			
			producer.close();

		} catch (Exception e) {
			System.out.println("e = " + e);
		}

	}

	private static ClsOutput dataIp(int clientId, long timestamp, String ip) {

		WebServiceAbstractAPI dataIp = new WebServiceAbstractAPI();
		ClsDataByIp data = dataIp.getDataByIp("179.127.52.204");

		ClsOutput output = new ClsOutput(clientId, timestamp, ip, data.getLatitude(), data.getLongitude(),
				data.getCountry_name(), data.getRegion_name(), data.getCity());

		return output;

	}

	private static long unixTime() {
		return new Date().getTime() / 1000;
	}

	private static String IPgenerator() {

		int n1 = rand.nextInt() >> 24 & 0xff;
		int n2 = rand.nextInt() >> 16 & 0xff;
		int n3 = rand.nextInt() >> 8 & 0xff;
		int n4 = 0;

		String ip1 = Integer.toString(n1);
		String ip2 = Integer.toString(n2);
		String ip3 = Integer.toString(n3);
		String ip4 = Integer.toString(n4);

		StringBuilder str = new StringBuilder();
		str.append(ip1).append(".").append(ip2).append(".").append(ip3).append(".").append(ip4);

		return str.toString();

	}

}
