import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';  // Import FormsModule
import { CommonModule } from '@angular/common';  // Import CommonModule

@Component({
  selector: 'app-reset-password',
  standalone: true,  // Make the component standalone
  imports: [FormsModule, CommonModule],  // Import necessary modules for the component
  templateUrl: './resetpassword.component.html',
  styleUrls: ['./resetpassword.component.css']
})
export class ResetPasswordComponent {
  resetData = {
    email: '',
    newPassword: '',
    confirmPassword: ''
  };

  // Check if the passwords match
  get passwordsMismatch() {
    return this.resetData.newPassword && this.resetData.confirmPassword && this.resetData.newPassword !== this.resetData.confirmPassword;
  }

  constructor() {}

  // Submit function for resetting the password
  resetPassword() {
    // Check if the passwords match before sending a request
    if (this.resetData.newPassword === this.resetData.confirmPassword) {
      // Proceed with password reset logic (e.g., call a service to reset password)
      console.log('Password reset successful');
      // Call your service to reset the password here
    } else {
      // Handle error if passwords do not match
      alert('Passwords do not match!');
    }
  }
}
