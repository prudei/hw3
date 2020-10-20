package serializer;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;

import java.io.File;
import java.io.IOException;

public class CsvSerializer implements UserSerializer {
    public File serialize(Register register, String fileName) {
        CsvMapper mapper = new CsvMapper();
        ObjectWriter objectWriter = mapper.writerFor(Register.class);
        File file = new File(fileName);
        try {
            objectWriter.writeValue(file, register);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
