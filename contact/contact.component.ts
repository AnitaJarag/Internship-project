import { Component } from '@angular/core';
import { Contact } from '../models/contact';
import { ContactService } from '../service/contact.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-contact',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']  // Corrected from 'styleUrl' to 'styleUrls'
})
export class ContactComponent {
  c: Contact = new Contact();  // Creating a new Contact object to bind with the form

  constructor(private cServ: ContactService) {}

  submitdata() {
    this.c.name = localStorage.getItem("name") || this.c.name; // If name exists in localStorage, use it
    console.log(JSON.stringify(this.c)); // For debugging, check if form data is correct

    // Call the service to save the contact data
    this.cServ.newContact(this.c).subscribe((data: Contact) => {
      if (data) {
        alert('Thank you for your Contact'); // Show success alert if data is saved successfully
      }
    });
  }
}
