import { IconDefinition } from '@fortawesome/free-solid-svg-icons';
export class Condition {
  id: number;
  contenu: string;
  icon: IconDefinition;

  constructor(id: number, contenu: string, icon: IconDefinition) {
    this.id = id;
    this.contenu = contenu;
    this.icon = icon;
  }
}
