import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Location } from '@angular/common';
import { ColaboradorService } from 'src/app/services/colaborador/colaborador.service';

@Component({
  selector: 'app-colaborador',
  templateUrl: './colaborador.component.html',
  styleUrls: ['./colaborador.component.css'],
})
export class ColaboradorComponent implements OnInit {
  colaboradorForm: FormGroup;
  colaborador: any;
  colaboradores: any;

  constructor(
    public fb: FormBuilder,
    public colaboradorService: ColaboradorService,
    public _router: Router,
    public _location: Location
  ) {}

  refresh(): void {
    this._router
      .navigateByUrl('/refresh', { skipLocationChange: true })
      .then(() => {
        console.log(decodeURI(this._location.path()));
        this._router.navigate([decodeURI(this._location.path())]);
      });
  }

  ngOnInit(): void {
    this.colaboradorForm = this.fb.group({
      id: [''],
      nombre: ['', Validators.required],
      apellido: ['', Validators.required],
      cargo: ['', Validators.required],
      especialidad: ['', Validators.required],
      tipo_documento: ['', Validators.required],
      documento_identificacion: ['', Validators.required],
    });

    this.colaboradorService.getAll().subscribe(
      (resp) => {
        this.colaboradores = resp;
      },
      (error) => {
        console.error(error);
      }
    );
  }

  save(): void {
    this.colaboradorService
      .save(this.colaboradorForm.value)
      .subscribe((resp) => {
        this.refresh();
      });
  }

  delete(colaborador: any) {
    this.colaboradorService.delete(colaborador.id).subscribe((resp) => {
      if (resp === true) {
        this.colaboradores.pop(colaborador);
      }
      this.refresh();
    });
  }

  update(colaborador: {
    id: any;
    nombre: any;
    apellido: any;
    cargo: any;
    especialidad: any;
    tipo_documento: any;
    documento_identificacion: any;
  }) {
    this.colaboradorForm.setValue({
      id: colaborador.id,
      nombre: colaborador.nombre,
      apellido: colaborador.apellido,
      cargo: colaborador.cargo,
      especialidad: colaborador.especialidad,
      tipo_documento: colaborador.tipo_documento,
      documento_identificacion: colaborador.documento_identificacion,
    });
  }
}
