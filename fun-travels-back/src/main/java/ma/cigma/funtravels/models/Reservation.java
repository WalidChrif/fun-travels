package ma.cigma.funtravels.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date_arrivee;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date_depart;
	
	private int nb_voyageurs;
	
	@ManyToOne
    @JoinColumn(name="locataire_id", nullable=false)
	private Utilisateur locataire;
	
	@ManyToOne
    @JoinColumn(name="offre_id", nullable=false)
	private Offre offre;
	
}
