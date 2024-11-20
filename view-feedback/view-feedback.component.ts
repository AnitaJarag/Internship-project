import { Component, OnInit } from '@angular/core';
import { Feedback } from '../models/feedback';
import { FeedbackService } from '../service/feedback.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-view-feedback',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './view-feedback.component.html',
  styleUrls: ['./view-feedback.component.css']
})
export class ViewFeedbackComponent implements OnInit {
  fd: Feedback[] = [];

  constructor(private fdServ: FeedbackService) {}

  ngOnInit(): void {
    this.fdServ.getAll().subscribe(
      (data: Feedback[]) => {
        console.log('Fetched feedback data:', data); // Log fetched data
        if (data != null) {
          this.fd = data;
        }
      },
      (error) => {
        console.error('Error fetching feedback:', error); // Log any error
      }
    );
  }
}
