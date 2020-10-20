package serializer;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.Register;

import java.io.File;
import java.io.IOException;

public class XmlSerializer implements UserSerializer {
    public File serialize(Register register, String fileName) {
        XmlMapper mapper = new XmlMapper();
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

