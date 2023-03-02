import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class DetalleHistoriaClinicaService {
  private URL = 'http://localhost:8080/api/detalle/';
  constructor(private http: HttpClient) {}
  public getAll(): Observable<any> {
    return this.http.get(this.URL);
  }
  public save(detalle: any): Observable<any> {
    return this.http.post(this.URL, detalle);
  }
  public delete(id: string): Observable<any> {
    return this.http.delete(this.URL + id);
  }
  public update(id: string, detalle: any): Observable<any> {
    return this.http.put(this.URL + id, detalle);
  }
  public get(id: string): Observable<any> {
    return this.http.get(this.URL + id);
  }
}
