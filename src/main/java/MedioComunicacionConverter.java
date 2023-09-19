import jakarta.persistence.*;



@Converter(autoApply = true)
public class MedioComunicacionConverter implements AttributeConverter<MedioComunicacion, String>
{


    @Override
    public String convertToDatabaseColumn(MedioComunicacion medio) {
        if (medio instanceof Email) {
            return "EMAIL";
        } else if (medio instanceof WhatsApp) {
            return "WHATSAPP";
        } else if (medio instanceof Telegram) {
            return "TELEGRAM";
        }
        return null;
    }

    @Override
    public MedioComunicacion convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        if ("EMAIL".equals(dbData)) {
            return new Email();
        } else if ("WHATSAPP".equals(dbData)) {
            return new WhatsApp();
        } else if ("TELEGRAM".equals(dbData)) {
            return new Telegram();
        }
        return null;
    }
}

