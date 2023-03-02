import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class ColaboradorService {
  private URL = 'http://localhost:8080/api/colaborador/';

  constructor(private http: HttpClient) {}

  public getAll(): Observable<any> {
    return this.http.get(this.URL);
  }
  public save(colaborador: any): Observable<any> {
    return this.http.post(this.URL, colaborador);
  }
  public delete(id: string): Observable<any> {
    return this.http.delete(this.URL + id);
  }
  public update(id: string, colaborador: any): Observable<any> {
    return this.http.put(this.URL + id, colaborador);
  }
  public get(id: string): Observable<any> {
    return this.http.get(this.URL + id);
  }
}
