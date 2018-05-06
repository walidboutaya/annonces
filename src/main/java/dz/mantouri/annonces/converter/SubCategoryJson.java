package dz.mantouri.annonces.converter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import dz.mantouri.annonces.model.SubCategory;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.util.stream.Stream;

@JsonComponent
public class SubCategoryJson {

    public static class Serializer extends JsonSerializer<SubCategory> {
        @Override
        public void serialize(SubCategory subCategory, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

            String label = subCategory.getLabel();
            jsonGenerator.writeString(label);
        }
    }

    public static class Deserializer extends JsonDeserializer<SubCategory> {
        @Override
        public SubCategory deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            String s = jsonParser.getCodec().readValue(jsonParser, String.class);
            return Stream.of(SubCategory.values())
                    .filter(sub -> sub.name().equals(s) || sub.name().toLowerCase().equals(s))
                    .findFirst()
                    .orElse(null);
        }
    }
}
