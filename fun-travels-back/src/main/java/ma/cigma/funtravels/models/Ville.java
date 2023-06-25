package ma.cigma.funtravels.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Nom ville est obligatoire!")
	private String nom;
	
	private String region;
	
	private String imageUrl;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "ville")
	@JsonIgnore
	private Set<Emplacement> emplacements = new HashSet<Emplacement>();
	
}
