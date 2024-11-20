// app.routes.ts
import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { InternshipsComponent } from './internships/internships.component';
import { ContactComponent } from './contact/contact.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { ViewFeedbackComponent } from './view-feedback/view-feedback.component';
import { ViewRegisterComponent } from './view-register/view-register.component';
import { ViewContactComponent } from './view-contact/view-contact.component';
import { ApplyComponent } from './apply/apply.component';
import { ViewapplyerComponent } from './viewapplyer/viewapplyer.component';
import { ResetPasswordComponent } from './resetpassword/resetpassword.component';



export const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'internships', component: InternshipsComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
  { path: 'feedback', component: FeedbackComponent },
  { path: 'adminlogin', component: AdminloginComponent },
  { path: 'viewfeedback', component: ViewFeedbackComponent},
  { path: 'viewregister', component:ViewRegisterComponent},
  { path: 'viewcontact', component:ViewContactComponent},
  { path: 'apply', component: ApplyComponent},
  { path: 'viewapplyer', component: ViewapplyerComponent},
  { path: 'resetpassword', component: ResetPasswordComponent},
  
 
];
