import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule  } from '@angular/forms';
import { UsuarioService } from './services/usuario/usuario.service';
import { MascotaService } from './services/mascota/mascota.service';
import { HistorialService } from './services/historial/historial.service';
import { DetalleService } from './services/detalle/detalle.service';
import { ColaboradorService } from './services/colaborador/colaborador.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  
  usuarioForm: FormGroup;

  constructor (
    public rfm: ReactiveFormsModule,
    public fb: FormBuilder,
    public usuarioService: UsuarioService,
    public mascotaService: MascotaService,
    public historialService: HistorialService,
    public detalleService: DetalleService,
    public colaboradorService: ColaboradorService
  ){


  }

  ngOnInit(): void {
    this.usuarioForm = this.fb.group ({
       id : ['', Validators.required],
       nombre : ['', Validators.required],
       apellido : ['', Validators.required],
       tipo_documento : ['', Validators.required],
       documento_identificacion : ['', Validators.required],
       estado : ['', Validators.required],
       sexo : ['', Validators.required],
       mascotas :  ['', Validators.required],
    })
  }

  guardar():void{
    
  }

}
