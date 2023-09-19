import jakarta.persistence.AttributeConverter;

import javax.swing.text.AbstractDocument;

public class medioComunicacionConverter implements AttributeConverter <MedioComunicacion, String> {

    @Override
    public String convertToDatabaseColumn(MedioComunicacion medio){
        if(medio == null){
            return null;
        }


    }
}
