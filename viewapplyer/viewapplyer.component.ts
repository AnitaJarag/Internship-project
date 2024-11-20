import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Apply } from '../models/apply';
import { ApplyService } from '../service/apply.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-viewapplyer',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './viewapplyer.component.html',
  styleUrls: ['./viewapplyer.component.css'],
})
export class ViewapplyerComponent implements OnInit {
  applications: Apply[] = []; // Updated variable name for better clarity

  constructor(private applyService: ApplyService) {}

  ngOnInit(): void {
    this.fetchApplications();
  }

  // Fetch applications from the backend
  private fetchApplications(): void {
    this.applyService.getAll().subscribe(
      (data: Apply[]) => {
        console.log('Fetched applications:', data);
        this.applications = data;
      },
      (error) => {
        console.error('Error fetching applications:', error);
      }
    );
  }
}
