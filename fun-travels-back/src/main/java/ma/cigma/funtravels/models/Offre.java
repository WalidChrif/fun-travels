package ma.cigma.funtravels.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Offre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Le titre d'offre est obligatoire!")
	private String titre;

	@NotBlank(message = "La description d'offre est obligatoire!")
	private String description;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dispo_depuis;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dispo_jusque;
	
	private String type;

	@NotNull(message = "Le prix ne peut pas etre null")
	@Min(value = 0)
	private double prix_nuit;

	@Min(value = 0)
	private int nb_voyageurs;

	
	private boolean isApprouved;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emplacement_id", referencedColumnName = "id")
	private Emplacement emplacement;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "offre")
	@JsonIgnore
	private Set<Reservation> reservations = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "offre")
	private Set<Image> Images = new HashSet<>();
	
	@OneToMany
	@JoinTable(name = "offre_unite", joinColumns = { @JoinColumn(name = "unite_id") }, inverseJoinColumns = {
			@JoinColumn(name = "offre_id") })
	private Set<Unite> unites = new HashSet<Unite>();
	
	@ManyToOne
    @JoinColumn(name="proprietaire_id", nullable=false)
	private Utilisateur proprietaire;

	@ManyToMany
	@JoinTable(name = "offre_equipement", joinColumns = { @JoinColumn(name = "equipement_id") }, inverseJoinColumns = {
			@JoinColumn(name = "offre_id") })
	private Set<Equipement> equipements = new HashSet<Equipement>();
	
	@ManyToMany
	@JoinTable(name = "offre_condition", joinColumns = { @JoinColumn(name = "condition_id") }, inverseJoinColumns = {
			@JoinColumn(name = "offre_id") })
	private Set<Condition> conditions = new HashSet<Condition>();
	
	@PrePersist
	void preInsert() {
		if(this.isApprouved) {
			this.isApprouved = false;
		}
	}

}
