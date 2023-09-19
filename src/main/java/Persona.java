import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column
    private String cuitCuil;
    @OneToOne
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;

    @Convert(converter = MedioComunicacionConverter.class)
    private MedioComunicacion medioPreferido;


}
