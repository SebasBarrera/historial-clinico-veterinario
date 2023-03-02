import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class MascotaService {
  private URL = 'http://localhost:8080/api/mascota/';
  constructor(private http: HttpClient) {}
  public getAll(): Observable<any> {
    return this.http.get(this.URL);
  }
  public save(mascota: any): Observable<any> {
    return this.http.post(this.URL, mascota);
  }
  public delete(id: string): Observable<any> {
    return this.http.delete(this.URL + id);
  }
  public update(id: string, mascota: any): Observable<any> {
    return this.http.put(this.URL + id, mascota);
  }
  public get(id: string): Observable<any> {
    return this.http.get(this.URL + id);
  }
}
