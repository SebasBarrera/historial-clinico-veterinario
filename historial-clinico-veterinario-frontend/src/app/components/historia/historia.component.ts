import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Location } from '@angular/common';
import { HistoriaClinicaService } from 'src/app/services/historia-clinica/historia-clinica.service';
import { MascotaService } from 'src/app/services/mascota/mascota.service';

@Component({
  selector: 'app-historia',
  templateUrl: './historia.component.html',
  styleUrls: ['./historia.component.css']
})
export class HistoriaComponent implements OnInit {
  historiaForm: FormGroup;
  historia: any;
  historias: any
  mascotas: any

  constructor(
    public fb: FormBuilder,
    public historiaClinicaService: HistoriaClinicaService,
    public mascotasService: MascotaService,
    public _router: Router,
    public _location: Location
  ) { }

  refresh(): void {
    this._router.navigateByUrl("/refresh", { skipLocationChange: true }).then(() => {
      this._router.navigate([decodeURI(this._location.path())]);
    });
  }

  ngOnInit(): void {
    this.historiaForm = this.fb.group({
      id: [''],
      fecha_creacion: ['', Validators.required],
      mascota: ['', Validators.required],
    });

    this.mascotasService.getAll().subscribe(resp => {
      this.mascotas = resp;
    })

    this.historiaClinicaService.getAll().subscribe(resp => {
      this.historia = resp;
    },
      error => { console.error(error) }
    );

    this.historiaClinicaService.getAll().subscribe(resp => {
      this.historias = resp;
    },
      error => { console.error(error) }
    );
  }

  save(): void {
    this.historiaClinicaService.save(this.historiaForm.value).subscribe(resp => {
      this.refresh();
    },
    )
  }

  delete(historia: { id: string; }) {
    this.historiaClinicaService.delete(historia.id).subscribe(resp => {
      if (resp === true) {
        this.historia.mascota = null;
        this.historias.pop(historia);
      }
      this.refresh();
    },
    )
  }

  update(historia: {
    mascota: any; id: any; fecha_creacion: any;
  }) {
    this.historiaForm.setValue({
      id: historia.id,
      fecha_creacion: historia.fecha_creacion,
      mascota: historia.mascota.nombre,
    })
  }

}
