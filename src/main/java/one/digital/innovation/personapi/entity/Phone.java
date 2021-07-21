package one.digital.innovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digital.innovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data  //Insere Getter e Setter
@Builder // Construção de objetos
@AllArgsConstructor //Insere os construtores
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Id automatico
    private Long id;

    @Enumerated(EnumType.STRING) //Tipo Enum String
    @Column(nullable = false) //Não permite nulo
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
