export class Usuario {
  constructor(
    public cedula: string,
    public primerNombre: string,
    public segundoNombre: string,
    public primerApellido: string,
    public segundoApellido: string,
    public estadoCivil: string,
    public direccion1: string,
    public direccion2: string,
    public telefono: string,
    public email: string
  ) {  }
}
