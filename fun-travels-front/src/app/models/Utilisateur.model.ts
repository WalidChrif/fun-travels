import { Role } from './Role.model';
export class Utilisateur {
  id: number;
  nom: string;
  prenom: string;
  email: string;
  username: string;
  password: string;
  isActive: boolean;
  dateEnregistrement: Date;
  roles: Role[];

  constructor(
    id: number,
    nom: string,
    prenom: string,
    email: string,
    username: string,
    password: string,
    isActive: boolean,
    dateEnregistrement: Date,
    roles: Role[]
  ) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.password = password;
    this.username = username;
    this.isActive = isActive;
    this.dateEnregistrement = dateEnregistrement;
    this.roles = roles;
  }
}
