export class Ville {
  id: number;
  nom: string;
  region: string;
  imageUrl: string;

  constructor(id: number, nom: string, region: string, imageUrl: string) {
    this.id = id;
    this.nom = nom;
    this.region = region;
    this.imageUrl = imageUrl;
  }
}
