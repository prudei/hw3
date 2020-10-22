package serializer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import model.Register;

import java.io.File;
import java.io.IOException;

public class Converter {
    public void convertFromJsonToCsv (String fileName) {
        JsonNode jsonTree = null;
        try {
            jsonTree = new ObjectMapper().readTree(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        final CsvSchema.Builder csvSchemaBuilder = CsvSchema.builder();
        JsonNode firstObject = jsonTree.elements().next();
        firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);});
        CsvSchema csvSchema =csvSchemaBuilder.build().withHeader();

        CsvMapper csvMapper = new CsvMapper();
        try {
            csvMapper.writerFor(JsonNode.class)
                    .with(csvSchema)
                    .writeValue(new File("users.csv"), jsonTree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
