package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest{

	@Test
	void testSerializeDto() throws JsonProcessingException {
		BeerDto beerDto = getDto();
		String jsonString = objectMapper.writeValueAsString(beerDto);
		System.out.println(jsonString);
	}
	@Test
	void testDeserialize() throws IOException {
		String json = "{\"beerId\":\"639c00ff-9993-4ec1-af12-8277c85f93bb\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2019-06-03T21:01:53-0400\",\"lastUpdatedDate\":\"2019-06-02T16:35:58.321872-04:00\",\"myLocalDate\":\"20190603\"}";
		BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
		System.out.println(beerDto);
	}
}