import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';

import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { ModalModule } from 'ngx-bootstrap/modal';
import { HomeComponent } from './home/home.component';
import { ContactCreateComponent } from './contact-create/contact-create.component';
import { ContactListComponent } from './contact-list/contact-list.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { StudentRegistrationComponent } from './student-registration/student-registration.component';
import { StudentEnquiryComponent } from './student-enquiry/student-enquiry.component';
import { AddPaymentComponent } from './add-payment/add-payment.component';
import { CandidateDetailsComponent } from './candidate-details/candidate-details.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpErrorHandler }     from './http-error-handler.service';
import {NgMultiSelectDropDownModule} from 'ng-multiselect-dropdown-angular7';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactCreateComponent,
    ContactListComponent,
    HeaderComponent,
    FooterComponent,
    StudentRegistrationComponent,
    StudentEnquiryComponent,
    AddPaymentComponent,
    CandidateDetailsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot(),
    FormsModule,
    NgMultiSelectDropDownModule.forRoot()
  ],
  exports: [BsDropdownModule, TooltipModule, ModalModule],
  providers: [HttpErrorHandler],
  bootstrap: [AppComponent]
})
export class AppModule { }
