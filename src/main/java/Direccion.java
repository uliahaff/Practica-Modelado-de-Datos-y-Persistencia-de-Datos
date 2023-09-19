import jakarta.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "altura")
    private int altura;

    @Column(name = "calle")
    private String calle;

    @Column(name = "municipio_comuna")
    private String municipioComuna;

    @Column(name = "provincia")
    private String provincia;

    public String leyendaCompleta(){
        return "Leyenda completa";

    }
}
