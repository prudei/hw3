package serializer;



import model.Register;

import java.io.File;

public interface UserSerializer {

    File serialize (Register register, String fileName);
}
