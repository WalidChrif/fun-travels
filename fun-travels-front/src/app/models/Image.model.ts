export class Image {
  id: number;
  path: string;
  isPrincipal: boolean;

  constructor(id: number, path: string, isPrincipal: boolean) {
    this.id = id;
    this.path = path;
    this.isPrincipal = isPrincipal;
  }
}
