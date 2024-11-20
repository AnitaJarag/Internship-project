import { Component, OnInit } from '@angular/core';
import { ContactService } from '../service/contact.service';
import { Contact } from '../models/contact';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-view-contact',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './view-contact.component.html',
  styleUrls: ['./view-contact.component.css']  // Corrected from 'styleUrl' to 'styleUrls'
})
export class ViewContactComponent implements OnInit {
  c: Contact[] = []; // Declare 'c' as an array of Contact

  constructor(private cServ: ContactService) {}

  ngOnInit(): void {
    this.cServ.getAll().subscribe(
      (data: Contact[]) => {
        console.log('Fetched Contact data:', data); // Log fetched data
        if (data) {
          this.c = data;
        }
      },
      (error) => {
        console.error('Error fetching Contact:', error); // Log any error
      }
    );
  }
}
