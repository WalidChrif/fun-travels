package ma.cigma.funtravels.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
public class Emplacement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String addresse;
	
	private String longitude;
	
	private String lattitude;
	
	@OneToOne(mappedBy = "emplacement")
	@JsonIgnore
	private Offre offre;
	
	@ManyToOne
    @JoinColumn(name="ville_id", nullable=false)
	private Ville ville;
}
