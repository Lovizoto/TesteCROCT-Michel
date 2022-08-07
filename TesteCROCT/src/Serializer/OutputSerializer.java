package Serializer;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import Model.ClsOutput;

public class OutputSerializer implements Serializer<ClsOutput> {

	@Override
	public byte[] serialize(String topic, ClsOutput data) {

		// transforma em Json e após isso em um array de bytes
		try {
			return new ObjectMapper().writeValueAsBytes(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;

	}

}
