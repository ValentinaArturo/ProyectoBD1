import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators';
import {HttpHeaders} from '@angular/common/http';
import {Viaje} from "../viaje";
import {Encomienda} from "../encomienda";

@Component({
  selector: 'app-encomiendas',
  templateUrl: './encomiendas.component.html',
  styleUrls: ['./encomiendas.component.css']
})
export class EncomiendasComponent implements OnInit {
  encomiendas: any = [];
  encomiendas01: any = [];
  encomiendas02: any = [];
  user: any = {};
  nameUser = ""
  chats: any = []
  allChats: any = []
  value = 0
  channel: any = {}
  newChannel: any = {}
  menus: any = []
  menu1: boolean = false
  menu2: boolean = false
  menu3: boolean = false
  menu4: boolean = false
  encomiendaModel = new Encomienda('', '', 0, 0, 0, 0, 0, 0, 0);


  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
    this.getChat()


    console.log(this.encomiendas01)
  }

  getChat() {

    this.user = localStorage.getItem("user");
    this.user = JSON.parse(this.user);
    this.nameUser = this.user[0].user;

    this.menus = this.user[0]
    this.menus = this.menus[0].rolUsuarioMenuList
    console.log(this.user)
    console.log(this.menus)

    /*if(){

    }*/

    for (let menu of this.menus) {
      console.log(menu)
      switch (menu.idMenu) {
        case 1:
          this.menu1 = true;
          break;
        case 2:
          this.menu2 = true;
          break
        case 3:
          this.menu3 = true;
          break
        case 4:
          this.menu4 = true;
          break
      }
    }

    this.findChat().subscribe(
      (respuesta: any) => this.formatChatOne(respuesta)
    )
  }

  findChat() {
    var httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'

      })
    }
    return this.http.get<any>("http://localhost:4042/encomiendas/consulta", httpOptions).pipe(
      catchError(e => "Error al realizar el el /findOne")
    )
  }

  formatChatOne(res: any) {
    localStorage.setItem("encomiendas", JSON.stringify(res))
    this.encomiendas = localStorage.getItem("encomiendas");
    this.encomiendas = JSON.parse(this.encomiendas);
    this.encomiendas01 = this.encomiendas[0];
    //location.href="http://localhost:4201/realizarreservaciones"
  }

  formatChat(res: any) {
    this.encomiendas = JSON.stringify(res)
    this.encomiendas = JSON.parse(this.encomiendas)
  }

  crearEncomienda() {
    this.crearEncomiendaRequest().subscribe(
      (respuesta: any) => this.crearEncomiendaResponse(respuesta)
    )
  }


  crearEncomiendaRequest() {
    let jsonObj = {
      "fragil": this.encomiendaModel.fragil,
      "descripcion": this.encomiendaModel.descripcion,
      "peso": this.encomiendaModel.peso,
      "idTarifaEncomienda": 1,
      "idTipoEncomienda": 1,
      "idRuta": 1,
      "idReservacionEncomienda": 1,
      "idRemitente": 2,
      "idPersona": 1,
    };
    console.log("Creacion de Encomienda")
    var httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    }
    return this.http.post<any>("http://localhost:4042/crear/encomienda", jsonObj, httpOptions).pipe(
      catchError(e => "e")
    )
  }

  crearEncomiendaResponse(res: any) {
    console.log(res + " aqui va el res ")

    if (res == "e" || res == null) {
      alert("No hay comunicación con el servidor!!")
    } else if (res != null) {
      // ok

      res = JSON.parse(JSON.stringify(res))
      console.log(res)
      alert("Se creo la encomienda: " + res.idEncomienda)
      this.getChat()
    }
  }
}
