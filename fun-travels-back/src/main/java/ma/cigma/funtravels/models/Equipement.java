package ma.cigma.funtravels.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Nom Equipement est obligatoire!")
	private String nom;
	
	private String icon;
	
	@NotBlank(message = "Saisissez une petite description sur l'equipement.")
	private String description;
	
	@ManyToMany(mappedBy="equipements")
	@JsonIgnore
    private Set<Offre> offres = new HashSet<Offre>();
	
}
