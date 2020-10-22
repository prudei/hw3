package serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import model.Register;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvSerializer {
    public File serialize(String fileName, Register register) {

        CsvMapper mapper = new CsvMapper();
        //mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
        File file = new File(fileName);
        CsvSchema schema = mapper.schemaFor(Register.class);
        try {
            mapper.writer(schema.withUseHeader(true)).writeValue(file, register);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;


        /*CsvSchema schema = CsvSchema.builder().setUseHeader(true)
                .addColumn("id")
                .addColumn("name")
                .addColumn("email")
                .build();
        schema = schema.withColumnSeparator(';');

        ObjectWriter writer = mapper.writerFor(Register.class).with(schema);
        List<Register> list = new ArrayList<>(Arrays.asList(a));
        try {
            writer.writeValue(file, list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;*/




        /*CsvMapper mapper = new CsvMapper();
        CsvSchema schema = mapper.schemaFor(Register.class);
        schema = schema.withColumnSeparator('\t');
        ObjectWriter objectWriter = mapper.writer(schema);
        File file = new File(fileName);

        FileOutputStream tempFileOutputStream = null;
        try {
            tempFileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(tempFileOutputStream);
        OutputStreamWriter writer = new OutputStreamWriter(bufferedOutputStream);
        try {
            objectWriter.writeValue(writer,register);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;*/
    }
}
