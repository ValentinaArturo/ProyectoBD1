export class Encomienda {
  constructor(
    public fragil: string,
    public descripcion: string,
    public peso: number,
    public idTarifaEncomienda: number,
    public idTipoEncomienda: number,
    public idRuta: number,
    public idReservacionEncomienda: number,
    public idRemitente: number,
    public idPersona: number,
  ) {
  }
}
