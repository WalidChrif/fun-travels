package ma.cigma.funtravels.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;

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
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Nom est obligatoire!")
	private String nom;

	@NotBlank(message = "Prenom est obligatoire!")
	private String prenom;

	@NotBlank(message = "Email est obligatoire!")
	private String email;

	@NotBlank(message = "Username est obligatoire!")
	@Column(unique = true, updatable = false)
	private String username;

	@NotBlank(message = "mot-de-passe est obligatoire!")
	@Column(name = "mot_de_passe")
	private String password;

	private boolean isActive;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateEnregistrement;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "utilisateur_role", joinColumns = @JoinColumn(name = "utilisateur_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "locataire")
	@JsonIgnore
	private Set<Reservation> reservations = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "proprietaire")
	@JsonIgnore
	private Set<Offre> Offres = new HashSet<>();

	@PrePersist
	protected void onCreate() {
		this.dateEnregistrement = new Date();
	}

}
