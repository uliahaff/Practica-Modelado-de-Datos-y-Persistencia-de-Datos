import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "persona_juridica")
public class PersonaJuridica extends Persona {

    @ElementCollection
    @CollectionTable(name = "emails_de_contacto", joinColumns = @JoinColumn(name = "persona_juridica_id"))
    @Column(name = "email")
    private List<String> emailsDeContacto;

    @Column(name = "fecha_constitucion")
    private LocalDate fechaConstitucion;

    @Column(name = "razon_social")
    private String razonSocial;

    @ElementCollection
    @CollectionTable(name = "telefonos_de_contacto", joinColumns = @JoinColumn(name = "persona_juridica_id"))
    @Column(name = "telefono")
    private List<String> telefonosDeContacto;

    // getters y setters
}