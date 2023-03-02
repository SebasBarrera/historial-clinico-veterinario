import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class HistoriaClinicaService {
  private URL = 'http://localhost:8080/api/historia/';
  constructor(private http: HttpClient) {}
  public getAll(): Observable<any> {
    return this.http.get(this.URL);
  }
  public save(historia: any): Observable<any> {
    return this.http.get(this.URL, historia);
  }
  public delete(id: string): Observable<any> {
    return this.http.get(this.URL + id);
  }
}
