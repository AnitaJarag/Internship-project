import { Component } from '@angular/core';
import { Feedback } from '../models/feedback';
import { FeedbackService } from '../service/feedback.service';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-feedback',
  standalone: true,
  imports: [RouterLink, CommonModule, FormsModule],
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css'] // Corrected from styleUrl to styleUrls
})
export class FeedbackComponent {
  f: Feedback = new Feedback(); // Ensure 'Feedback' model includes 'name' and 'suggestion'

  constructor(private fServ: FeedbackService) {}

  submitdata() {
    this.f.name = localStorage.getItem("name") || this.f.name;
    console.log(JSON.stringify(this.f));
    this.fServ.newFeedback(this.f).subscribe((data: Feedback) => {
      if (data) {
        alert('Thank you for your feedback');
      }
    });
  }
}
