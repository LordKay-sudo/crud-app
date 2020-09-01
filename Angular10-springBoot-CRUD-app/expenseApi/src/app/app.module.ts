import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Injectable } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {RouterModule, Routes} from '@angular/router';

import { AppComponent } from './app.component';
import { ListExpensesComponent } from './compoments/list-expenses/list-expenses.component';
import { AddExpenseComponent } from './components/add-expense/add-expense.component';
import {FormsModule} from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGuardService } from './service/auth-guard.service';
import { FooterComponent } from './footer/footer.component';


const routers: Routes = [
  { path: 'expenses', component: ListExpensesComponent,canActivate:[AuthGuardService] },
  
  /**
  {path: 'expenses', component: ListExpensesComponent}, **/
  {path: 'addexpense', component: AddExpenseComponent, canActivate:[AuthGuardService]},
  {path: 'editexpense/:id', component: AddExpenseComponent, canActivate:[AuthGuardService]},
  {path: 'login', component: LoginComponent},
  {path: 'logout', component: LogoutComponent,canActivate:[AuthGuardService] },
  {path: '', redirectTo: '/expenses', pathMatch: 'full'}
];

@NgModule({
  declarations: [
    AppComponent,
    ListExpensesComponent,
    AddExpenseComponent,
    HeaderComponent,
    LoginComponent,
    LogoutComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routers),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

