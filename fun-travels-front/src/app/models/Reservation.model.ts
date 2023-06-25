import { Utilisateur } from './Utilisateur.model';
import { Offre } from './Offre.model';
export class Reservation {
  id: number;
  date_arrivee: Date;
  date_depart: Date;
  nb_voyageurs: number;
  locataire: Utilisateur;
  offre: Offre;

  constructor(
    id: number,
    date_arrivee: Date,
    date_depart: Date,
    nb_voyageurs: number,
    locataire: Utilisateur,
    offre: Offre
  ) {
    this.id = id;
    this.date_arrivee = date_arrivee;
    this.date_depart = date_depart;
    this.nb_voyageurs = nb_voyageurs;
    this.locataire = locataire;
    this.offre = offre;
  }
}
