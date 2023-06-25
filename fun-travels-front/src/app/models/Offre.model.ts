import { Condition } from './Condition.model';
import { Unite } from './Unite.model';
import { Utilisateur } from './Utilisateur.model';
import { Equipement } from './Equipement.model';
import { Image } from './Image.model';
import { Emplacement } from './Emplacement.model';
export class Offre {
  id: number;
  titre: string;
  description: string;
  dispo_depuis: Date;
  dispo_jusque: Date;
  type: string;
  prix_nuit: number;
  nb_voyageurs: number;
  emplacement: Emplacement;
  conditions: Condition[];
  images: Image[];
  proprietaire: Utilisateur;
  equipements: Equipement[];
  unites: Unite[];

  constructor(
    id: number,
    titre: string,
    description: string,
    dispo_depuis: Date,
    dispo_jusque: Date,
    type: string,
    prix_nuit: number,
    nb_voyageurs: number,
    emplacement: Emplacement,
    images: Image[],
    conditions: Condition[],
    proprietaire: Utilisateur,
    equipements: Equipement[],
    unites: Unite[]
  ) {
    this.id = id;
    this.titre = titre;
    this.description = description;
    this.dispo_depuis = dispo_depuis;
    this.dispo_jusque = dispo_jusque;
    this.type = type;
    this.prix_nuit = prix_nuit;
    this.nb_voyageurs = nb_voyageurs;
    this.emplacement = emplacement;
    this.conditions = conditions;
    this.images = images;
    this.proprietaire = proprietaire;
    this.equipements = equipements;
    this.unites = unites;
  }
}
