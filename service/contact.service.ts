import { Injectable } from '@angular/core';
import { Contact } from '../models/contact';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ContactService {
  private baseUrl: string = "http://localhost:8081/internship/contact";  // Update to the correct API endpoint

  constructor(private http: HttpClient) {}

  newContact(c: Contact): Observable<Contact> {
    return this.http.post<Contact>(`${this.baseUrl}`, c);
  }

  getAll(): Observable<Contact[]> {
    return this.http.get<Contact[]>(this.baseUrl);
  }
}
