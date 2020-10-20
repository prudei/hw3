package serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Register;


import java.io.File;
import java.io.IOException;

public class JsonSerializer implements UserSerializer {
    public File serialize(Register register, String fileName) {

        ObjectMapper mapper = new ObjectMapper();
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
