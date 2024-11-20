import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Apply } from '../models/apply';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ApplyService {
  private baseUrl: string = 'http://localhost:8081/internship/apply';

  constructor(private http: HttpClient) {}

  // Create a new application
  newApply(a: Apply): Observable<Apply> {
    return this.http.post<Apply>(this.baseUrl, a);
  }

  // Fetch all applications
  getAll(): Observable<Apply[]> {
    return this.http.get<Apply[]>(this.baseUrl);
  }
}
