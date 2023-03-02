import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuarioComponent } from './usuario/usuario.component';
import { MascotaComponent } from './mascota/mascota.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HistoriaComponent } from './historia/historia.component';
import { DetalleComponent } from './detalle/detalle.component';
import { ColaboradorComponent } from './colaborador/colaborador.component';
import { HomeComponent } from './home/home.component';
import { IndexComponent } from './index/index.component';


@NgModule({
  declarations: [
    UsuarioComponent,
    MascotaComponent,
    HistoriaComponent,
    DetalleComponent,
    ColaboradorComponent,
    HomeComponent,
    IndexComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
  ],
  exports: [
    UsuarioComponent,
    MascotaComponent,
    HistoriaComponent,
    DetalleComponent,
    ColaboradorComponent,
    HomeComponent
  ]
})
export class ComponentsModule { }
