import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators';
import {HttpHeaders} from '@angular/common/http';
import {Persona} from "../usuario";

@Component({
  selector: 'app-user-creation',
  templateUrl: './user-creation.component.html',
  styleUrls: ['./user-creation.component.css']
})
export class UserCreationComponent implements OnInit {
  users: any = {};

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
  }

  consult() {
    location.href = "/";
  }

  createAccount() {
    this.crearEncomiendaRequest().subscribe(
      (respuesta: any) => this.crearEncomiendaResponse(respuesta)
    )
  }


  crearEncomiendaRequest() {
    let jsonObj = {
      "idPersona": 1,
      "nombre": this.users.nombre,
      "apellido": this.users.apellido,
      "telefono": this.users.telefono,
      "correo": this.users.correo,
      "direccion": this.users.direccion,
      "nit": this.users.nit,
      "idTipoPersona": 2,
      "idDocumentoIdentificacion": 2,
      "clave": this.users.password
    };
    console.log("Creacion de persona")
    var httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    }
    return this.http.post<any>("http://localhost:4042/crear/persona", jsonObj, httpOptions).pipe(
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
      alert("Se creo la persona: " + res.idPersona)
    }
  }
}
