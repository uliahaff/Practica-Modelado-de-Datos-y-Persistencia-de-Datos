import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "persona_fisica")
public class PersonaFisica extends Persona {

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "mail")
    private String mail;

    @Column(name = "fecha_de_nacimiento")
    private LocalDate fechaDeNacimiento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private String telefono;

    // getters y setters
}