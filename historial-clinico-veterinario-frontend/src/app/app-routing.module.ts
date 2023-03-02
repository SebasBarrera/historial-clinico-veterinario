import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ColaboradorComponent } from './components/colaborador/colaborador.component';
import { DetalleComponent } from './components/detalle/detalle.component';
import { HistoriaComponent } from './components/historia/historia.component';
import { MascotaComponent } from './components/mascota/mascota.component';
import { UsuarioComponent } from './components/usuario/usuario.component';
import { IndexComponent } from './components/index/index.component';

const routes: Routes = [
  { path: 'index', component: IndexComponent },
  { path: 'usuario', component: UsuarioComponent },
  { path: 'usuario/**', component: UsuarioComponent },
  { path: 'mascota', component: MascotaComponent },
  { path: 'mascota/**', component: MascotaComponent },
  { path: 'historia', component: HistoriaComponent },
  { path: 'historia/**', component: HistoriaComponent },
  { path: 'detalle', component: DetalleComponent },
  { path: 'detalle/**', component: DetalleComponent },
  { path: 'colaborador', component: ColaboradorComponent },
  { path: 'colaborador/**', component: ColaboradorComponent },
  { path: '**', pathMatch: 'full', redirectTo: 'index' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
