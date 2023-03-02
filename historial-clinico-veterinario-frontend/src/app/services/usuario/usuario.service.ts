import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private URL = "http://localhost:8080/api/usuario/";
constructor(private http: HttpClient) { }
public getAll(): Observable<any> { return this.http.get(this.URL) }
public save(usuario : any):  Observable<any> { return this.http.get(this.URL, usuario) }
public delete(id : string):  Observable<any> { return this.http.get(this.URL+id) }
}
