import { Offre } from './Offre.model';
import { Ville } from './Ville.model';

export class Emplacement {
  id: number;
  longitude: string;
  lattitude: string;
  offre: Offre;
  ville: Ville;
  constructor(
    id: number,
    longitude: string,
    lattitude: string,
    offre: Offre,
    ville: Ville
  ) {
    this.id = id;
    this.longitude = longitude;
    this.lattitude = lattitude;
    this.offre = offre;
    this.ville = ville;
  }
}
