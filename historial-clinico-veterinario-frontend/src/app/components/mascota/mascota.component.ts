import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Location } from '@angular/common';
import { MascotaService } from 'src/app/services/mascota/mascota.service';

@Component({
  selector: 'app-mascota',
  templateUrl: './mascota.component.html',
  styleUrls: ['./mascota.component.css']
})
export class MascotaComponent implements OnInit {
  mascotaForm: FormGroup;
  mascota: any;
  mascotas: any;

  constructor(
    public fb: FormBuilder,
    public mascotaService: MascotaService,
    public _router: Router,
    public _location: Location
  ) { }

  refresh(): void {
    this._router.navigateByUrl("/refresh", { skipLocationChange: true }).then(() => {
      console.log(decodeURI(this._location.path()));
      this._router.navigate([decodeURI(this._location.path())]);
    });
  }

  ngOnInit(): void {
    this.mascotaForm = this.fb.group({
      id: [''],
      nombre: ['', Validators.required],
      raza: ['', Validators.required],
      sexo: ['', Validators.required],
    });

    this.mascotaService.getAll().subscribe(resp => {
      this.mascota = resp;
    },
      error => { console.error(error) }
    )

    this.mascotaService.getAll().subscribe(resp => {
      this.mascotas = resp;
    },
      error => { console.error(error) }
    )
  }

  save(): void {
    this.mascotaService.save(this.mascotaForm.value).subscribe(resp => {
      this.refresh();
    },
    )
  }

  delete(mascota: { id: string; }) {
    this.mascotaService.delete(mascota.id).subscribe(resp => {
      if (resp === true) {
        this.mascotas.pop(mascota);
      }
      this.refresh();
    },
    )
  }

  update(mascota: { id: any; nombre: any; raza: any; sexo: any; }) {
    this.mascotaForm.setValue({
      id: mascota.id,
      nombre: mascota.nombre,
      raza: mascota.raza,
      sexo: mascota.sexo,
    })
  }
}
