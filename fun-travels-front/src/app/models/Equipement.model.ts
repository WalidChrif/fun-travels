import { IconDefinition } from '@fortawesome/free-solid-svg-icons';

export class Equipement {
  id: number;
  icon: IconDefinition;
  titre: string;
  description: string;

  constructor(
    id: number,
    icon: IconDefinition,
    titre: string,
    description: string
  ) {
    this.id = id;
    this.icon = icon;
    this.titre = titre;
    this.description = description;
  }
}
