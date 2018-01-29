import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';


import { Usuario }    from '../usuario';

interface UsuarioResponse {
  results: Usuario;
}  

@Component({
  selector: 'app-usuario-form',
  templateUrl: './usuario-form.component.html',
  styleUrls: ['./usuario-form.component.css']
})
  
export class UsuarioFormComponent implements OnInit {

 constructor(private http: HttpClient) {};
  
  submitted = false;
  model = new Usuario('', '', '', '', '', null, '', '', '', '');
  estadosCiviles = ['Soltero/a', 'Casado/a', 'Viudo/a', 'Divorciado/a', 'Union libre'];
  
  onSubmit() { 
    this.http.post('/usuarios/', this.model, {
    })
    .subscribe(
      data => {
        this.submitted = true;
      },
      (err: HttpErrorResponse) => {
        if (err.error instanceof Error) {
          //Error de cliente
          console.log('An error occurred:', err.error.message);
        } else {
          //Error de servidor
          if (400 == err.status) alert(err.error)
        }
      }
    );
  }
  
  ngOnInit() {}
  
  onBuscar() {
    this.http.get('/usuarios/' + this.model.cedula)
      .subscribe(
        data => {
          this.model.primerNombre = data['primerNombre'];
          this.model.segundoNombre = data['segundoNombre'];
          this.model.primerApellido = data['primerApellido'];
          this.model.segundoApellido = data['segundoApellido'];
          this.model.estadoCivil = data['estadoCivil'];
          this.model.direccion1 = data['direccion1'];
          this.model.direccion2 = data['direccion2'];
          this.model.telefono = data['telefono'];
          this.model.email = data['email'];
        },
        (err: HttpErrorResponse) => {
          if (err.error instanceof Error) {
            //Error de cliente
            console.log('An error occurred:', err.error.message);
            } else {
              //Error de servidor
              alert("No existe usuario con cedula: " + this.model.cedula); 
            }
        }
      );
  }

}
